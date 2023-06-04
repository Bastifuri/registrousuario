package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Usuario;

import java.io.IOException;


public class RegistroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        int edad = Integer.parseInt(request.getParameter("edad"));
        String rut = request.getParameter("rut");

        // Validar si el rut ya existe en la base de datos
        if (existeRutEnBaseDeDatos(rut)) {
            response.sendRedirect("registro.html"); // Redirigir al formulario con un mensaje de error
        } else {
            // Crear un objeto Usuario con los datos ingresados
            Usuario usuario = new Usuario(nombre, edad);

            // Guardar los datos en la base de datos
            guardarEnBaseDeDatos(usuario, rut);
            response.sendRedirect("registro_exitoso.jsp");
        }
    }

    private boolean existeRutEnBaseDeDatos(String rut) {

        return false;
    }

    private void guardarEnBaseDeDatos(Usuario usuario, String rut) {

    }
}
