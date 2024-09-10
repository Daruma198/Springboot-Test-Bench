package dev.local.springboot_test_bench.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AppUtil {
    private static final byte[] linebreak = new byte[0];
    public static final String ZONE_ASIA_JAKARTA = "Asia/Jakarta";

    public AppUtil() {
    }

    public static String dateToString(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        return dateFormat.format(date);
    }
}