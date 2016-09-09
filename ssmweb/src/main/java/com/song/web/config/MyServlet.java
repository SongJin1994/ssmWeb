package com.song.web.config;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sj124 on 2016/9/1.
 */
@WebServlet(name = "myServlet" ,urlPatterns = "/toIndex")
public class MyServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt( req.getParameter("id"));
        String name = (String) req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        System.out.println("打印信息:"+id+name+age);
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req,resp);
    }

    /*@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = (Integer) req.getAttribute("id");
        String name = (String) req.getAttribute("name");
        int age = (Integer)req.getAttribute("age");
        System.out.println("打印信息:"+id+name+age);
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req,resp);
    }*/
}
