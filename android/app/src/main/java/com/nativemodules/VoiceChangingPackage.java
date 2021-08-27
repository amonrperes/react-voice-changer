package com.nativemodules;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VoiceChangingPackage implements ReactPackage {

    public List<ViewManager> createViewManager(ReactApplicationContext reactContext){
        return Collections.emptyList();
    }

    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new VoiceChangingModule(reactContext));

        return modules;
    }
}