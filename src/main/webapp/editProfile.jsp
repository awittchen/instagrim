<%-- 
    Document   : editProfile
    Created on : Oct 23, 2016, 10:08:52 PM
    Author     : Asha Wittchen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.dundee.computing.aec.instagrim.stores.*" %>
<%@page import="uk.ac.dundee.computing.aec.instagrim.models.*" %>
<%@page import="uk.ac.dundee.computing.aec.instagrim.servlets.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Instagrim</title>
        <link rel="stylesheet" type="text/css" href="Styles.css" />
    </head>
    <body>
        <header>
        <h1>InstaGrim ! </h1>
        <h2>Your world in Black and White</h2>
        </header>
        <nav>
            <ul>
                
               <li><a href="upload.jsp">Upload</a></li>
                   <%
                        
                        LoggedIn lg = (LoggedIn) session.getAttribute("LoggedIn");
                        
                    %>
                  
                <li><a href="/Instagrim/Images/<%=lg.getUsername()%>">Your Images</a></li>
            </ul>
        </nav>
       
        <article>
            <h3>Update profile</h3>
            <form method="POST"  action="Register">
                <ul>
                    
                    <li>User Name <input type="text" name="username"></li>
                    <li>Password <input type="password" name="password"></li>
                      
                </ul>
                <br/>
                <input type="submit" value="Update"> 
            </form>
          <form method="POST"  action="Logout">
               
                <input type="submit" value="Logout"> 
                </form>            
        </article>
        <footer>
            <ul>
                <li class="footer"><a href="/Instagrim">Home</a></li>
            </ul>
        </footer>
    </body>
</html>
