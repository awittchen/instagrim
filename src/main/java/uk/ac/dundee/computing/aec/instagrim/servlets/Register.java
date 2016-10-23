/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.dundee.computing.aec.instagrim.servlets;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.Session;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uk.ac.dundee.computing.aec.instagrim.lib.CassandraHosts;
import uk.ac.dundee.computing.aec.instagrim.models.User;
import uk.ac.dundee.computing.aec.instagrim.stores.*;
import uk.ac.dundee.computing.aec.instagrim.stores.Pic;


/*
 *
 * @author Administrator
 */
@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {
    Cluster cluster=null;
    public void init(ServletConfig config) throws ServletException {
        // TODO Auto-generated method stub
        cluster = CassandraHosts.getCluster();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
      User us=new User();
      request.setAttribute("User", us);
      rd.forward(request, response);

    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first_name=request.getParameter("first_name");
        
        String last_name=request.getParameter("last_name");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String email=request.getParameter("email");
        
        User us=new User();
        us.setCluster(cluster);
        us.RegisterUser(first_name,last_name,username, password,email);
         HttpSession session=request.getSession();
        System.out.println("Session in servlet "+session);
        
            LoggedIn lg= new LoggedIn();
            lg.setFirst_Name("select first_name from userprofiles");
           // lg.setLast_Name(last_name);
           // lg.setUsername(username);
          //  lg.setPassword(password);
          //  lg.setEmail(email);

            request.setAttribute("LoggedIn", lg);
            session.setAttribute("LoggedIn", lg);
        
        
            System.out.println("Session in servlet "+session);
        
            
         // Session session = cluster.connect("instagrim");
        //  PreparedStatement ps = session.prepare("select first_name from userprofiles");
         /* String StoredPass = row.getString("first_name");
             */
	response.sendRedirect("/Instagrim/index");
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
