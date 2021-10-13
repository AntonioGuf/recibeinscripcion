package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaInscripcion", urlPatterns = {"/ProcesaInscripcion"})
public class ProcesaInscripcion extends HttpServlet {   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Recibimos los datos del formulario index.jsp
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String curso = request.getParameter("curso");
        //Instanciamos un objeto a partir de la clase Persona
        Persona per=new Persona();
        //Encapsulamos los datos recibidos en el objeto per
        per.setNombre(nombre);
        per.setApellido(apellido);
        per.setCurso(curso);
        //Colocar al objeto per como atributo de request
        request.setAttribute("persona", per);
        //Enviamos al formulario salida.jsp
        request.getRequestDispatcher("salida.jsp").forward(request, response);
    }
   
}
