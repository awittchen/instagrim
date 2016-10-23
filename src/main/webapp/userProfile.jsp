<%-- 
    Document   : UserProfile
    Created on : Oct 19, 2016, 4:12:01 PM
    Author     : Asha Wittchen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="uk.ac.dundee.computing.aec.instagrim.stores.*" %>
<%@page import="uk.ac.dundee.computing.aec.instagrim.models.*" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Instagrim</title>
        <link rel="stylesheet" type="text/css" href="Styles.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                        if (lg != null) {
                            String UserName = lg.getUsername();
                            if (lg.getlogedin()) {
                    %>
                  
                <li><a href="/Instagrim/Images/<%=lg.getUsername()%>">Your Images</a></li>
                <li><a href="editProfile.jsp">Edit profile</a></li>  
                    </ul>
                    <p>Username: <%=lg.getUsername()%></p>
                    <p>Password:<%=lg.getPassword()%></p>
                    <p>First Name:<%=lg.getFirst_Name()%></p> 
                    <p>Last Name:<%=lg.getLast_Name()%></p> 
                    <p>Email:<%=lg.getEmail()%></p> 
                  
                  <form method="POST"  action="Logout">
               
                <input type="submit" value="Logout"> 
                </form>  
               
                 
                    <%}      
                            }else{
                                %>
                
             <ul>  
                <li><a href="/Instagrim/Register">Register</a></li>
                <li><a href="/Instagrim/Login">Login</a></li>
                
                <%
                                        
                            
                    }%>
        
            </ul>        
        </nav>
                    
        <footer>
            <ul>
                <li class="footer"><a href="/Instagrim">Home</a></li>
                <li>&COPY; Andy C & Asha Wittchen</li>
            </ul>
        </footer>
    </body>
</html>
