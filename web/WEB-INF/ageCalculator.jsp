<%-- 
    Document   : ageCalculator
    Created on : Jan 30, 2021, 6:29:58 PM
    Author     : 585594
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="POST" action="age">
            <label>Enter your age:</label>
            <input type="text" name="userAge" value=""> 
            <br>
            <input type="submit" value="Age next birthday">
            <div>${messAge}</div>
            <div>${message}</div>
            <div>${messsage}</div>
            <a href="./arithmetic">Arithmetic Calculator</a> 
        </form>
    </body>
</html>
