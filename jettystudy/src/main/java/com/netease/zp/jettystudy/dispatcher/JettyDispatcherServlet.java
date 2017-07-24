package com.netease.zp.jettystudy.dispatcher;

import freemarker.template.Configuration;
import freemarker.template.Template;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * @description:
 * @date: 2017/7/24
 * @author: zhangpan01
 * @email: zhangpan01@corp.netease.com
 */
public class JettyDispatcherServlet extends HttpServlet{
    /**
     * 配置资源
     */
    ResourceBundle resourceBundle = ResourceBundle.getBundle("conf/property/netease");

    public String getProperty(String key){
        return resourceBundle.getString(key);
    }
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        OutputStreamWriter osw = new OutputStreamWriter(resp.getOutputStream(), "UTF-8");

        try {
            fk(null, new HashMap<>(), osw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fk(String name, Map<String, Object> map, Writer writer) throws  Exception{
        Template template = null;
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(getClass(), "/pages/demo/fk/");
        template = configuration.getTemplate("hello-fk.ftl");

        template.process(map, writer);
    }
}
