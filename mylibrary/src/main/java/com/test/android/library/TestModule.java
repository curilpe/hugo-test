package com.test.android.library;

import hugo.weaving.DebugLog;

public class TestModule {

    @DebugLog
    public void test() {
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {

        }
    }
}
