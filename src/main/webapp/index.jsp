<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inscripcion en curso</h1>
        <form action="ProcesaInscripcion" method="post">
            <table>
                <tr>
            <td>Nombre:</td>
            <td><input type="text" name="nombre" value=""></td>
                </tr>
                <tr>
            <td>Apellido:</td>
            <td><input type="text" name="apellido" value=""></td>
               </tr>
               <tr>
            <td>Curso:</td>
            <td><input type="text" name="curso" value=""></td>
              </tr> 
              <tr>
                  <td><input type="submit" value="Registrar"></td>
              </tr>
            </table>
        </form>
    </body>
</html>
