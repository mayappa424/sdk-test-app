package com.connectm.sdk_test_ms;

import androidx.core.content.pm.PermissionInfoCompat;

public class CalculateTest {
    @PermissionInfoCompat.Protection
    public static int addMe(int a, int b) {
        return a + b;
    }
}
