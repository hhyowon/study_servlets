package com.example.study_servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/helloWorldServlet") //내부에서는 클래스이름으로 접속 가능 ,외부에서 클래스이름으로 인지x , url방식의 이름으로 인식함
public class HelloWorldServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    System.out.println("HelloWorldServlet - doget()");  
    try {
         PrintWriter printWriter = response.getWriter();
         //String contents ="Yoju Lab !";
         String contents ="<!DOCTYPE html>\r\n" + //
                 "<html lang=\"en\">\r\n" + //
                 "<head>\r\n" + //
                 "    <meta charset=\"UTF-8\">\r\n" + //
                 "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + //
                 "    <title>Hello World</title>\r\n" + //
                 "</head>\r\n" + //
                 "<body>\r\n" + //
                 "    <div>first Name : yoju</div>\r\n" + //
                 "    <div>sexond Name : lab</div>\r\n" + //
                 "</body>\r\n" + //
                 "</html>";
         printWriter.println(contents); 
         printWriter.close();  
        } catch (Exception e) {
        System.out.println(e.getMessage()); // TODO: handle exception
        }
          System.out.println("HelloWorldServlet - doget() done");  
    }
    
}
