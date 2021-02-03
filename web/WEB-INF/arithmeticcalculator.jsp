<%-- 
    Document   : arithmeticcalculator
    Created on : Feb 1, 2021, 1:27:09 PM
    Author     : 585594
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmetic">
            <label>First: </label>
            <input type="text" name="num1" value="${enum1}"> 
            <br>
            <label>Second: </label>
            <input type="text" name="num2" value="${enum2}">
            <br>
            <input type="submit" value="+" name="calc">
            <input type="submit" value="-" name="calc">
            <input type="submit" value="*" name="calc">
            <input type="submit" value="%" name="calc">
            <br>
            <div>Result: ${result}</div>
            <div>${message}</div>
            <a href="./age">Age Calculator</a> 
        </form>
    </body>
</html>
