<%-- 
    Document   : index
    Created on : Mar 27, 2019, 1:04:59 PM
    Author     : Hallur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Mario's Pizza Website</h1>

        <form>
            <input type="radio" name="pizza" id="margerita"/>Margerita 50 $<br/>
            <input type="radio" name="pizza" id="pepperoni"/>Pepperoni 55 $<br/>
            <input type="radio" name="pizza" id="hawaii"/>Hawaii 60$<br/>
        </form>
        <button id="orderBtn">order pizza</button><p style="color:green;"id="oStatus"></p>
        <button id="deleteOrderBtn">remove order</button><p style="color:green;"id="eStatus">change this...</p>
        <script>
            document.getElementById("orderBtn").onclick = () => {
                document.getElementById("oStatus").innerHTML = "order has been made : pepperoni pizza";

            }
            document.getElementById("deleteOrderBtn").onclick = () => {        
        setTimeout(function() { document.getElementById("eStatus").innerHTML = "order has been deleted : pepperoni pizza" }, 2000);  
            }
        </script>
    </body>
</html>
