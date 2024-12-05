package com.xworkz.table.servlet;

import com.sun.xml.internal.ws.addressing.ProblemHeaderQName;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(urlPatterns = "/ajay",loadOnStartup = 1)
public class FirstServlet extends HttpServlet {
    public FirstServlet() {


        System.out.print("running no arg");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.print("running service method");
        String url= req.getRequestURL().toString();
                System.out.println("Url :"+url);
        Enumeration<String> enumeration=req.getHeaderNames();
        while (enumeration.hasMoreElements())
        {
           String headerName=enumeration.nextElement();
           String value= req.getHeader(headerName);
           System.out.println(headerName+":"+value);
        }
        PrintWriter respWriter =resp.getWriter();
        respWriter.println("service response is working");
    }
}