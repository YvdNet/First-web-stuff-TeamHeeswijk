
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Beans.User" %>
<% // Retrieve values from Request object using getAttribute methods
   User usr = (User) request.getAttribute("userdata");
   String remarks = (String) request.getAttribute("remarks");
%>

<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact</title>
    </head>
    
        <h1>Bedankt <% out.print( usr.getFirstname() + " " + usr.getLastname() ); %> voor het opgeven voor een activiteit!</h1>
        
        <p>Je hebt de volgende gegevens ingevoerd: </p>
        <p><strong>Naam: </strong> <% out.print( usr.getFirstname() + " " + usr.getLastname() ); %> </p>
        <p><strong>Email: </strong> <%= usr.getEmail() %> </p>
        <p><strong>Geboortedatum: </strong><br> <%= usr.getAge() %> </p>
        <p><strong>Opgeven voor activiteit: </strong><br> <%= usr.getActiviteit() %> </p>
        <p><strong>Opmerkingen: </strong><br> <%= remarks %> </p>
        
        
        <div><a href="index.html">Go to home-page</a></div>

    

