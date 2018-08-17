package com.servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "�����ҵĵ�һ��Servlet", urlPatterns = { "/Servlet1" })

public class Servlet1 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Servlet1() {
        System.out.println("Servlet�Ĺ��췽��ִ��");
    }

    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet�ĳ�ʼ������ִ��");
    }

    public void destroy() {
        System.out.println("Servlet�����ٷ���ִ��");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet�� doGet()����ִ��");
     }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}
