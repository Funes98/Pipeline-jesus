<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Saludo</title>
</head>
<body>
    <h1>¡Hola, <%= session.getAttribute("nombre") %>!</h1>
</body>
</html>