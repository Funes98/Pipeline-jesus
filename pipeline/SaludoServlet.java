package com.ejemplo.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/saludo")
public class SaludoServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        if (nombre != null && !nombre.isEmpty()) {
            HttpSession session = request.getSession();
            session.setAttribute("nombre", nombre);
        }
        response.sendRedirect("WEB-INF/vistas/saludo.jsp");
    }
}
