package com.einherjar.mango.common.utils;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author :    einherjar
 * @date :    2019-09-18 23:10
 */
public class IOUtils {
    public static void closeQuietly(final Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (final IOException ioe) {

        }
    }
}
