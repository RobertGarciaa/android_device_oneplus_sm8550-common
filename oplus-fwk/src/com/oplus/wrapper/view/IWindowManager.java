package com.oplus.wrapper.view;

import android.app.IAssistDataReceiver;
import android.content.ComponentName;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.IRemoteCallback;
import android.os.RemoteException;
import android.view.IAppTransitionAnimationSpecsFuture;
import android.view.ICrossWindowBlurEnabledListener;
import android.view.IDisplayChangeWindowController;
import android.view.IDisplayFoldListener;
import android.view.IDisplayWindowInsetsController;
import android.view.IDisplayWindowListener;
import android.view.IOnKeyguardExitResult;
import android.view.IPinnedTaskListener;
import android.view.IRotationWatcher;
import android.view.IScrollCaptureResponseListener;
import android.view.ISystemGestureExclusionListener;
import android.view.IWallpaperVisibilityListener;
import android.view.IWindow;
import android.view.IWindowSession;
import android.view.IWindowSessionCallback;
import android.view.InputChannel;
import android.view.InsetsState;
import android.view.TaskTransitionSpec;
import android.view.WindowContentFrameStats;
import android.view.displayhash.DisplayHash;
import android.view.displayhash.VerifiedDisplayHash;
import android.window.AddToSurfaceSyncGroupResult;
import android.window.ISurfaceSyncGroupCompletedListener;
import android.window.ITaskFpsCallback;
import android.window.ScreenCapture;
import com.android.internal.os.IResultReceiver;
import com.android.internal.policy.IKeyguardDismissCallback;
import com.android.internal.policy.IKeyguardLockedStateListener;
import com.android.internal.policy.IShortcutService;
import com.oplus.wrapper.view.IWindowManager;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* loaded from: classes.dex */
public interface IWindowManager {
    int getBaseDisplayDensity(int i) throws RemoteException;

    void getBaseDisplaySize(int i, Point point) throws RemoteException;

    int getDockedStackSide() throws RemoteException;

    int getInitialDisplayDensity(int i) throws RemoteException;

    boolean hasNavigationBar(int i) throws RemoteException;

    void removeRotationWatcher(IRotationWatcher iRotationWatcher) throws RemoteException;

    void setForcedDisplayDensityForUser(int i, int i2, int i3) throws RemoteException;

    int watchRotation(IRotationWatcher iRotationWatcher, int i) throws RemoteException;

    /* loaded from: classes.dex */
    public static abstract class Stub implements android.os.IInterface, android.view.IWindowManager {
        private final android.view.IWindowManager mIWindowManager = new android.view.IWindowManager.Stub() { // from class: com.oplus.wrapper.view.IWindowManager.Stub.1
            public boolean startViewServer(int i) throws RemoteException {
                return false;
            }

            public boolean stopViewServer() throws RemoteException {
                return false;
            }

            public boolean isViewServerRunning() throws RemoteException {
                return false;
            }

            public IWindowSession openSession(IWindowSessionCallback iWindowSessionCallback) throws RemoteException {
                return null;
            }

            public boolean useBLAST() throws RemoteException {
                return false;
            }

            public void getInitialDisplaySize(int i, Point point) throws RemoteException {
            }

            public void getBaseDisplaySize(int displayId, Point size) throws RemoteException {
                getBaseDisplaySize(displayId, size);
            }

            public void setForcedDisplaySize(int i, int i1, int i2) throws RemoteException {
            }

            public void clearForcedDisplaySize(int i) throws RemoteException {
            }

            public int getInitialDisplayDensity(int displayId) throws RemoteException {
                return getInitialDisplayDensity(displayId);
            }

            public int getBaseDisplayDensity(int displayId) throws RemoteException {
                return getBaseDisplayDensity(displayId);
            }

            public void setForcedDisplayDensityForUser(int i, int i1, int i2) throws RemoteException {
                setForcedDisplayDensityForUser(i, i1, i2);
            }

            public void clearForcedDisplayDensityForUser(int i, int i1) throws RemoteException {
            }

            public void setForcedDisplayScalingMode(int i, int i1) throws RemoteException {
            }

            public void setEventDispatching(boolean b) throws RemoteException {
            }

            public boolean isWindowToken(IBinder iBinder) throws RemoteException {
                return false;
            }

            public void addWindowToken(IBinder iBinder, int i, int i1, Bundle bundle) throws RemoteException {
            }

            public void removeWindowToken(IBinder iBinder, int i) throws RemoteException {
            }

            public void setDisplayChangeWindowController(IDisplayChangeWindowController controller) throws RemoteException {
            }

            public android.view.SurfaceControl addShellRoot(int i, IWindow iWindow, int i1) throws RemoteException {
                return null;
            }

            public void setShellRootAccessibilityWindow(int i, int i1, IWindow iWindow) throws RemoteException {
            }

            public void overridePendingAppTransitionMultiThumbFuture(IAppTransitionAnimationSpecsFuture iAppTransitionAnimationSpecsFuture, IRemoteCallback iRemoteCallback, boolean b, int i) throws RemoteException {
            }

            public void overridePendingAppTransitionRemote(android.view.RemoteAnimationAdapter remoteAnimationAdapter, int i) throws RemoteException {
            }

            public void endProlongedAnimations() throws RemoteException {
            }

            public void startFreezingScreen(int i, int i1) throws RemoteException {
            }

            public void stopFreezingScreen() throws RemoteException {
            }

            public void disableKeyguard(IBinder iBinder, String s, int i) throws RemoteException {
            }

            public void reenableKeyguard(IBinder iBinder, int i) throws RemoteException {
            }

            public void exitKeyguardSecurely(IOnKeyguardExitResult iOnKeyguardExitResult) throws RemoteException {
            }

            public boolean isKeyguardLocked() throws RemoteException {
                return false;
            }

            public boolean isKeyguardSecure(int i) throws RemoteException {
                return false;
            }

            public void dismissKeyguard(IKeyguardDismissCallback iKeyguardDismissCallback, CharSequence charSequence) throws RemoteException {
            }

            public void addKeyguardLockedStateListener(IKeyguardLockedStateListener iKeyguardLockedStateListener) throws RemoteException {
            }

            public void removeKeyguardLockedStateListener(IKeyguardLockedStateListener iKeyguardLockedStateListener) throws RemoteException {
            }

            public void setSwitchingUser(boolean b) throws RemoteException {
            }

            public void closeSystemDialogs(String s) throws RemoteException {
            }

            public float getAnimationScale(int i) throws RemoteException {
                return 0.0f;
            }

            public float[] getAnimationScales() throws RemoteException {
                return new float[0];
            }

            public void setAnimationScale(int i, float v) throws RemoteException {
            }

            public void setAnimationScales(float[] floats) throws RemoteException {
            }

            public float getCurrentAnimatorScale() throws RemoteException {
                return 0.0f;
            }

            public void setInTouchMode(boolean b, int displayId) throws RemoteException {
            }

            public void setInTouchModeOnAllDisplays(boolean inTouch) throws RemoteException {
            }

            public boolean isInTouchMode(int displayId) throws RemoteException {
                return false;
            }

            public void showStrictModeViolation(boolean b) throws RemoteException {
            }

            public void setStrictModeVisualIndicatorPreference(String s) throws RemoteException {
            }

            public void refreshScreenCaptureDisabled() throws RemoteException {
            }

            public int getDefaultDisplayRotation() throws RemoteException {
                return 0;
            }

            public int watchRotation(final android.view.IRotationWatcher watcher, int displayId) throws RemoteException {
                return 0;
            }

            public void removeRotationWatcher(android.view.IRotationWatcher iRotationWatcher) throws RemoteException {
            }

            public int registerProposedRotationListener(IBinder contextToken, android.view.IRotationWatcher listener) throws RemoteException {
                return 0;
            }

            public int getPreferredOptionsPanelGravity(int i) throws RemoteException {
                return 0;
            }

            public void freezeRotation(int i) throws RemoteException {
            }

            public void thawRotation() throws RemoteException {
            }

            public boolean isRotationFrozen() throws RemoteException {
                return false;
            }

            public void freezeDisplayRotation(int i, int i1) throws RemoteException {
            }

            public void thawDisplayRotation(int i) throws RemoteException {
            }

            public boolean isDisplayRotationFrozen(int i) throws RemoteException {
                return false;
            }

            public void setFixedToUserRotation(int i, int i1) throws RemoteException {
            }

            public void setIgnoreOrientationRequest(int i, boolean b) throws RemoteException {
            }

            public Bitmap screenshotWallpaper() throws RemoteException {
                return null;
            }

            public android.view.SurfaceControl mirrorWallpaperSurface(int i) throws RemoteException {
                return null;
            }

            public boolean registerWallpaperVisibilityListener(IWallpaperVisibilityListener iWallpaperVisibilityListener, int i) throws RemoteException {
                return false;
            }

            public void unregisterWallpaperVisibilityListener(IWallpaperVisibilityListener iWallpaperVisibilityListener, int i) throws RemoteException {
            }

            public void registerSystemGestureExclusionListener(ISystemGestureExclusionListener iSystemGestureExclusionListener, int i) throws RemoteException {
            }

            public void unregisterSystemGestureExclusionListener(ISystemGestureExclusionListener iSystemGestureExclusionListener, int i) throws RemoteException {
            }

            public boolean requestAssistScreenshot(IAssistDataReceiver iAssistDataReceiver) throws RemoteException {
                return false;
            }

            public void hideTransientBars(int i) throws RemoteException {
            }

            public void setRecentsVisibility(boolean b) throws RemoteException {
            }

            public void updateStaticPrivacyIndicatorBounds(int i, Rect[] rects) throws RemoteException {
            }

            public void setNavBarVirtualKeyHapticFeedbackEnabled(boolean b) throws RemoteException {
            }

            public boolean hasNavigationBar(int displayId) throws RemoteException {
                return hasNavigationBar(displayId);
            }

            public void lockNow(Bundle bundle) throws RemoteException {
            }

            public boolean isSafeModeEnabled() throws RemoteException {
                return false;
            }

            public boolean clearWindowContentFrameStats(IBinder iBinder) throws RemoteException {
                return false;
            }

            public WindowContentFrameStats getWindowContentFrameStats(IBinder iBinder) throws RemoteException {
                return null;
            }

            public int getDockedStackSide() throws RemoteException {
                return getDockedStackSide();
            }

            public void registerPinnedTaskListener(int i, IPinnedTaskListener iPinnedTaskListener) throws RemoteException {
            }

            public void requestAppKeyboardShortcuts(IResultReceiver iResultReceiver, int i) throws RemoteException {
            }

            public void requestImeKeyboardShortcuts(IResultReceiver iRsultReceiver, int i) throws RemoteException {

            }

            public void getStableInsets(int i, Rect rect) throws RemoteException {
            }

            public void registerShortcutKey(long l, IShortcutService iShortcutService) throws RemoteException {
            }

            public void createInputConsumer(IBinder iBinder, String s, int i, InputChannel inputChannel) throws RemoteException {
            }

            public boolean destroyInputConsumer(String s, int i) throws RemoteException {
                return false;
            }

            public Region getCurrentImeTouchRegion() throws RemoteException {
                return null;
            }

            public void registerDisplayFoldListener(IDisplayFoldListener iDisplayFoldListener) throws RemoteException {
            }

            public void unregisterDisplayFoldListener(IDisplayFoldListener iDisplayFoldListener) throws RemoteException {
            }

            public int[] registerDisplayWindowListener(IDisplayWindowListener iDisplayWindowListener) throws RemoteException {
                return new int[0];
            }

            public void unregisterDisplayWindowListener(IDisplayWindowListener iDisplayWindowListener) throws RemoteException {
            }

            public void startWindowTrace() throws RemoteException {
            }

            public void stopWindowTrace() throws RemoteException {
            }

            public void saveWindowTraceToFile() throws RemoteException {
            }

            public void startTransitionTrace() throws RemoteException {
            }

            public void stopTransitionTrace() throws RemoteException {
            }

            public boolean isWindowTraceEnabled() throws RemoteException {
                return false;
            }

            public boolean isTransitionTraceEnabled() throws RemoteException {
                return false;
            }

            public int getWindowingMode(int i) throws RemoteException {
                return 0;
            }

            public void setWindowingMode(int i, int i1) throws RemoteException {
            }

            public int getRemoveContentMode(int i) throws RemoteException {
                return 0;
            }

            public void setRemoveContentMode(int i, int i1) throws RemoteException {
            }

            public boolean shouldShowWithInsecureKeyguard(int i) throws RemoteException {
                return false;
            }

            public void setShouldShowWithInsecureKeyguard(int i, boolean b) throws RemoteException {
            }

            public boolean shouldShowSystemDecors(int i) throws RemoteException {
                return false;
            }

            public void setShouldShowSystemDecors(int i, boolean b) throws RemoteException {
            }

            public int getDisplayImePolicy(int i) throws RemoteException {
                return 0;
            }

            public void setDisplayImePolicy(int i, int i1) throws RemoteException {
            }

            public void syncInputTransactions(boolean b) throws RemoteException {
            }

            public boolean isLayerTracing() throws RemoteException {
                return false;
            }

            public void setLayerTracing(boolean b) throws RemoteException {
            }

            public boolean mirrorDisplay(int i, android.view.SurfaceControl surfaceControl) throws RemoteException {
                return false;
            }

            public void setDisplayWindowInsetsController(int i, IDisplayWindowInsetsController iDisplayWindowInsetsController) throws RemoteException {
            }

            public void updateDisplayWindowRequestedVisibleTypes(int displayId, int requestedVisibleTypes) throws RemoteException {
            }

            public boolean getWindowInsets(int displayId, IBinder token, InsetsState insetsState) throws RemoteException {
                return false;
            }

            public List<android.view.DisplayInfo> getPossibleDisplayInfo(int displayId) throws RemoteException {
                return null;
            }

            public int getDisplayIdByUniqueId(String uniqueId) throws RemoteException {
                return -1;
            }

            public void showGlobalActions() throws RemoteException {
            }

            public void setLayerTracingFlags(int i) throws RemoteException {
            }

            public void setActiveTransactionTracing(boolean active) throws RemoteException {
            }

            public void requestScrollCapture(int i, IBinder iBinder, int i1, IScrollCaptureResponseListener iScrollCaptureResponseListener) throws RemoteException {
            }

            public void holdLock(IBinder iBinder, int i) throws RemoteException {
            }

            public String[] getSupportedDisplayHashAlgorithms() throws RemoteException {
                return new String[0];
            }

            public VerifiedDisplayHash verifyDisplayHash(DisplayHash displayHash) throws RemoteException {
                return null;
            }

            public void setDisplayHashThrottlingEnabled(boolean b) throws RemoteException {
            }

            public Configuration attachWindowContextToDisplayArea(IBinder iBinder, int i, int i1, Bundle bundle) throws RemoteException {
                return null;
            }

            public void attachWindowContextToWindowToken(IBinder iBinder, IBinder iBinder1) throws RemoteException {
            }

            public Configuration attachToDisplayContent(IBinder iBinder, int i) throws RemoteException {
                return null;
            }

            public void detachWindowContextFromWindowContainer(IBinder iBinder) throws RemoteException {
            }

            public boolean registerCrossWindowBlurEnabledListener(ICrossWindowBlurEnabledListener iCrossWindowBlurEnabledListener) throws RemoteException {
                return false;
            }

            public void unregisterCrossWindowBlurEnabledListener(ICrossWindowBlurEnabledListener iCrossWindowBlurEnabledListener) throws RemoteException {
            }

            public boolean isTaskSnapshotSupported() throws RemoteException {
                return false;
            }

            public int getImeDisplayId() throws RemoteException {
                return 0;
            }

            public void setTaskSnapshotEnabled(boolean b) throws RemoteException {
            }

            public void setTaskTransitionSpec(TaskTransitionSpec taskTransitionSpec) throws RemoteException {
            }

            public void clearTaskTransitionSpec() throws RemoteException {
            }

            public void registerTaskFpsCallback(int i, ITaskFpsCallback iTaskFpsCallback) throws RemoteException {
            }

            public void unregisterTaskFpsCallback(ITaskFpsCallback iTaskFpsCallback) throws RemoteException {
            }

            public Bitmap snapshotTaskForRecents(int i) throws RemoteException {
                return null;
            }

            public void setRecentsAppBehindSystemBars(boolean b) throws RemoteException {
            }

            public int getLetterboxBackgroundColorInArgb() {
                return -1;
            }

            public boolean isLetterboxBackgroundMultiColored() {
                return false;
            }

            public void captureDisplay(int displayId, ScreenCapture.CaptureArgs captureArgs, ScreenCapture.ScreenCaptureListener listener) {
            }

            public boolean isGlobalKey(int keyCode) throws RemoteException {
                return false;
            }

            public boolean addToSurfaceSyncGroup(IBinder syncGroupToken, boolean parentSyncGroupMerge, ISurfaceSyncGroupCompletedListener completedListener, AddToSurfaceSyncGroupResult addToSurfaceSyncGroupResult) {
                return false;
            }

            public void markSurfaceSyncGroupReady(IBinder syncGroupToken) {
            }

            public List<ComponentName> notifyScreenshotListeners(int displayId) {
                return null;
            }

            @Override
            public void onOverlayChanged() {
            }
        };

        public static IWindowManager asInterface(IBinder obj) {
            return new Proxy(android.view.IWindowManager.Stub.asInterface(obj));
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.mIWindowManager.asBinder();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static class Proxy implements IWindowManager {
            private static Map<IRotationWatcher, android.view.IRotationWatcher> sRotationWatcherMap = new ConcurrentHashMap();
            private final android.view.IWindowManager mIWindowManager;

            Proxy(android.view.IWindowManager iWindowManager) {
                this.mIWindowManager = iWindowManager;
            }

            @Override // com.oplus.wrapper.view.IWindowManager
            public int getDockedStackSide() throws RemoteException {
                return this.mIWindowManager.getDockedStackSide();
            }

            @Override // com.oplus.wrapper.view.IWindowManager
            public int getInitialDisplayDensity(int displayId) throws RemoteException {
                return this.mIWindowManager.getInitialDisplayDensity(displayId);
            }

            @Override // com.oplus.wrapper.view.IWindowManager
            public boolean hasNavigationBar(int displayId) throws RemoteException {
                return this.mIWindowManager.hasNavigationBar(displayId);
            }

            @Override // com.oplus.wrapper.view.IWindowManager
            public int watchRotation(IRotationWatcher watcher, int displayId) throws RemoteException {
                android.view.IRotationWatcher rotationWatcher = sRotationWatcherMap.computeIfAbsent(watcher, new Function() { // from class: com.oplus.wrapper.view.IWindowManager$Stub$Proxy$$ExternalSyntheticLambda0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        android.view.IRotationWatcher lambda$watchRotation$0;
                        lambda$watchRotation$0 = IWindowManager.Stub.Proxy.this.lambda$watchRotation$0((IRotationWatcher) obj);
                        return lambda$watchRotation$0;
                    }
                });
                return this.mIWindowManager.watchRotation(rotationWatcher, displayId);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ android.view.IRotationWatcher lambda$watchRotation$0(final IRotationWatcher observer) {
                return new IRotationWatcher.Stub() { // from class: com.oplus.wrapper.view.IWindowManager.Stub.Proxy.1
                    public void onRotationChanged(int rotation) throws RemoteException {
                        observer.onRotationChanged(rotation);
                    }
                };
            }

            @Override // com.oplus.wrapper.view.IWindowManager
            public void removeRotationWatcher(IRotationWatcher watcher) throws RemoteException {
                android.view.IRotationWatcher rotationWatcher = sRotationWatcherMap.get(watcher);
                if (rotationWatcher == null) {
                    return;
                }
                sRotationWatcherMap.remove(watcher);
                this.mIWindowManager.removeRotationWatcher(rotationWatcher);
            }

            @Override // com.oplus.wrapper.view.IWindowManager
            public void setForcedDisplayDensityForUser(int displayId, int density, int userId) throws RemoteException {
                this.mIWindowManager.setForcedDisplayDensityForUser(displayId, density, userId);
            }

            @Override // com.oplus.wrapper.view.IWindowManager
            public int getBaseDisplayDensity(int displayId) throws RemoteException {
                return this.mIWindowManager.getBaseDisplayDensity(displayId);
            }

            @Override // com.oplus.wrapper.view.IWindowManager
            public void getBaseDisplaySize(int displayId, Point size) throws RemoteException {
                this.mIWindowManager.getBaseDisplaySize(displayId, size);
            }
        }
    }
}

