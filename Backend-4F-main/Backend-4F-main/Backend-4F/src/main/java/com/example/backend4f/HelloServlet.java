package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "home", value = "/home")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //2.1
        System.out.println("User Agent:" + request.getHeader("User-Agent"));
        //2.2
        String Username = request.getParameter("Username");
        String Password = request.getParameter("Password");
        //2.3
        if(Username.equals("Gino") && Password.equals("Pasquale")){
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + BENVENUTI + "</h1>");
            out.println("</body></html>");
        }else{
            HttpSession session = request.getSession(true);
            session.setAttribute("messaggio","Username o Password sbagliata");
            response.sendRedirect("/Errore");
        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + Buongiorno Galvani! + "</h1>");
        out.println("</body></html>");

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
            //3.1
            System.out.println("Host:" + request.getHeader("Host"));
            System.out.println("Accept-Encoding:" + request.getHeader("Accept-Encoding"));
            System.out.println("If-None-Match:" + request.getHeader("If-None-Match"));
            //3.2

        }
    }



    public void destroy() {
    }
}