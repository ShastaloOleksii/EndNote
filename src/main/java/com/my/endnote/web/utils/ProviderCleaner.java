package com.my.endnote.web.utils;

public class ProviderCleaner {
    public static void cleanUp() {
        DriverProvider.cleanUp();
        PagesProvider.cleanUp();
        WaitUtils.cleanUp();
    }
}
