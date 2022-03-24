<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <h1>
    INDICE
     has escrito  ${texto.toUpperCase()}  y tiene  ${texto.length()} letras</h1>
     <h1>Eres el visitante numero ${contador}</h1>
     <h1>Has venido a verme ${visitas} veces</h1>
       <h1 style="color: red;">${sessionScope.visitas}</h1>

    </body>
</html>
