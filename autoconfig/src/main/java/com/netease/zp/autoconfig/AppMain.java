package com.netease.zp.autoconfig;

import java.util.ResourceBundle;

/**
 * @description:
 * @date: 2017/7/24
 * @author: zhangpan01
 * @email: zhangpan01@corp.netease.com
 */
public class AppMain {
    public static void main(String[] args){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("conf/property/netease");
        String entry = resourceBundle.getString("netease.entry");
        String position = resourceBundle.getString("netease.position");
        String environment = resourceBundle.getString("current.environment");

        System.out.println(entry + ":" + position + "->" + environment);
    }
}
