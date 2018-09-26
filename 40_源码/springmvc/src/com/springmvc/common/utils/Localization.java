/*
 * @(#)Localization.java 2018-8-9下午1:54:41 springmvc Copyright 2018 Thuisoft,
 * Inc. All rights reserved. THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject
 * to license terms.
 */
package com.springmvc.common.utils;

/**
 * Localization
 * @author Administrator
 * @version 1.0
 * 
 */
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by tcr on 2018/08/08.
 */
public class Localization {
    private static final String L_STRING_FILE = "lStrings.properties";

    private static final Logger logger = LoggerFactory.getLogger(Localization.class);

    private static Properties prop = new Properties();

    public static String getString(String key) {
        try {
            if (prop.isEmpty()) {
                prop.load(Localization.class.getClassLoader().getResourceAsStream(L_STRING_FILE));
            }
            return prop.getProperty(key);
        } catch (Exception ex) {
            logger.error("Load localization file error.", ex);
            return "";
        }
    }
}
