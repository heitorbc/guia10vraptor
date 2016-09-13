<%-- 
    Document   : lista
    Created on : 12/09/2016, 23:29:53
    Author     : Heitor
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    
            
        <div id="myMenu">

            <ul>
                <c:forEach items="${produtoList}" var="produto">
                    <li> ${produto.nome} - ${produto.descricao} </li>
                </c:forEach>
            </ul>
        </div>
            
    </body>
</html>
