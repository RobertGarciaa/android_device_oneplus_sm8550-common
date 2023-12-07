/*
 * Copyright (C) 2022-2023 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

#include <android-base/logging.h>
#include <android-base/properties.h>
#include <vector>

#define _REALLY_INCLUDE_SYS__SYSTEM_PROPERTIES_H_
#include <sys/_system_properties.h>

using android::base::GetProperty;

std::vector<std::string> ro_props_default_source_order = {
    "",
    "boot.",
    "bootimage.",
    "odm.",
    "odm_dlkm.",
    "product.",
    "system.",
    "system_dlkm.",
    "system_ext.",
    "vendor.",
    "vendor_dlkm."
};

/*
 * SetProperty does not allow updating read only properties and as a result
 * does not work for our use case. Write "OverrideProperty" to do practically
 * the same thing as "SetProperty" without this restriction.
 */
void OverrideProperty(const char* name, const char* value) {
    size_t valuelen = strlen(value);

    prop_info* pi = (prop_info*)__system_property_find(name);
    if (pi != nullptr) {
        __system_property_update(pi, value, valuelen);
    } else {
        __system_property_add(name, strlen(name), value, valuelen);
    }
}

void set_ro_build_prop(const std::string &prop, const std::string &value, bool product = true) {
    std::string prop_name;

    for (const auto &source : ro_props_default_source_order) {
        if (product) {
            prop_name = "ro.product." + source + prop;
        } else {
            prop_name = "ro." + source + "build." + prop;
        }

        OverrideProperty(prop_name.c_str(), value.c_str());
    }
}

/*
 * Only for read-only properties. Properties that can be wrote to more
 * than once should be set in a typical init script (e.g. init.oplus.hw.rc)
 * after the original property has been set.
 */
void vendor_load_properties() {
    std::string model;
    std::string device;
    std::string name;

    auto hw_region_id = std::stoi(GetProperty("ro.boot.hw_region_id", "0"));
    auto prjname = std::stoi(GetProperty("ro.boot.prjname", "0"));

    switch (hw_region_id) {
        case 21: // CN_IN
            if (prjname == 22811) { // CN
                device = "OP591BL1";
                name = "PHB110";
                model = "PHB110";
                OverrideProperty("persist.vendor.display.pxlw.iris_feature", "0x407f0780");
                OverrideProperty("persist.sys.oplus.region", "CN");
                OverrideProperty("ro.vendor.oplus.regionmark", "CN");
                OverrideProperty("ro.vendor.oplus.radio.sar_regionmark", "CN");
            } else if (prjname == 22861) { // IN
                device = "OP594DL1";
                name = "CPH2447";
                model = "CPH2447";
                OverrideProperty("persist.sys.oplus.region", "IN");
                OverrideProperty("ro.vendor.oplus.regionmark", "IN");
                OverrideProperty("ro.vendor.oplus.radio.sar_regionmark", "IN");
            }
            break;
        case 22: // EU
            device = "OP594DL1";
            name = "CPH2449";
            model = "CPH2449";
            break;
        case 23: // NA
            device = "OP594DL1";
            name = "CPH2451";
            model = "CPH2451";
            OverrideProperty("persist.sys.oplus.region", "NA");
            OverrideProperty("ro.vendor.oplus.regionmark", "NA");
            OverrideProperty("ro.vendor.oplus.radio.sar_regionmark", "NA");
            break;
        default:
            LOG(ERROR) << "Unexpected region ID: " << hw_region_id;
    }
    set_ro_build_prop("device", device);
    set_ro_build_prop("model", model);
    set_ro_build_prop("name", name);
    set_ro_build_prop("product", model, false);
    set_ro_build_prop("marketname", "OnePlus 11 5G");
}
