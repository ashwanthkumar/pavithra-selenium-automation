package in.pavithra.selenium.utils;

import org.apache.commons.exec.OS;

public class Utils {
    public static OperationSystem osName() {
        if (OS.isFamilyMac()) return OperationSystem.MAC;
        else if (OS.isFamilyWindows()) return OperationSystem.WINDOWS;
        else return OperationSystem.UNKNOWN;
    }

    public static String webdriverSuffix() {
        switch (osName()) {
            case MAC:
                return "mac";
            case WINDOWS:
                return "windows.exe";
            default:
                return "unknown";
        }
    }
}
