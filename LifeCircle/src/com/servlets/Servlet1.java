package com.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "这是我的第一个Servlet", urlPatterns = { "/Servlet1" })

public class Servlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Servlet1() {
        System.out.println("Servlet的构造方法执行");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet的初始化方法执行");
    }

    public void destroy() {
        System.out.println("Servlet的销毁方法执行");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet的 doGet()方法执行");
     }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
