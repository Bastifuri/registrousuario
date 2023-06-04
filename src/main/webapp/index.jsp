<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="estilos.css">
    <title>Registro de Personas</title>
</head>
<body>
<h1 class="encabezado">Registro de Personas</h1>
<form action="RegistroServlet" method="POST">
    <div class="centrado">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required><br><br>

    <label for="edad">Edad:</label>
    <input type="number" id="edad" name="edad" required><br><br>

    <label for="rut">RUT:</label>
    <input type="text" id="rut" name="rut" required><br><br>

    <input type="submit" value="Enviar" class="boton">
    </div>
</form>
</body>
</html>
