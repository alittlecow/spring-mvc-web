package com.little.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Properties;

/**
 * @author pengx
 * @date 2016/10/28
 */
public class TestServlet extends HttpServlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
        String contextConfigLocation = config.getInitParameter("contextConfigLocation");
        ServletContext context = config.getServletContext();
        InputStream inputStream = context.getResourceAsStream(contextConfigLocation);
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.println("little.jdbc.username=" + properties.getProperty("little.jdbc.username"));
        System.out.println("little.jdbc.password=" + properties.getProperty("little.jdbc.password"));
        //使用类加载器读取资源文件 容易导致jvm溢出
       // this.getClass().getClassLoader().getResourceAsStream();
      //  out.print("name="+contextConfigLocation+"</br>");
       // out.print("hello");
        String data = "中国";
        OutputStream outputStream = resp.getOutputStream();
        resp.setHeader("content-type", "text/html;charset=UTF-8");
        byte[] dataBytes = data.getBytes("UTF-8");
        outputStream.write(dataBytes);
       // downFile(resp,context);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        doGet(req, resp);
    }

    /**
     * 下载文件
     * @param response
     * @throws IOException
     */
    private void downFile(HttpServletResponse response, ServletContext context) throws IOException {
        String pp = context.getRealPath("/");
        System.out.println(pp);
        String realPath = context.getRealPath("/img/avatar3.jpg");
        System.out.println("RealPath="+realPath);
        String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
        //3.设置content-disposition响应头控制浏览器以下载的形式打开文件
        response.setHeader("content-disposition", "attachment;filename=" + fileName);
        InputStream inputStream = new FileInputStream(realPath);
        OutputStream outputStream = response.getOutputStream();
        int len = 0;
        byte[] buffer = new byte[1024];

        while ((len = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer,0,len);
        }
        inputStream.close();
    }
}
