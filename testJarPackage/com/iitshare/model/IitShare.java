package com.iitshare.model;
 
/**
 *
 *TODO
 *
 * @author ZhangYQ 2012-8-18 下午10:34:49
 * @version V1.0
 */
public class IitShare {
 
    private static String siteName = "iitshare";
 
    public static String getSiteInfo(String userName) {
        return userName + "hello, hello, welcome you to " + siteName
                + " website";
    }
 
}