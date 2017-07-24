package com.netease.zp.jettystudy.dispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ResourceBundle;

/**
 * @description:
 * @date: 2017/7/24
 * @author: zhangpan01
 * @email: zhangpan01@corp.netease.com
 */
public class JettyDispatcherServlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("conf/property/netease");
        String entry = resourceBundle.getString("netease.entry");
        String position = resourceBundle.getString("netease.position");
        String environment = resourceBundle.getString("current.environment");

        System.out.println(entry + ":" + position + "->" + environment);
    }
}
