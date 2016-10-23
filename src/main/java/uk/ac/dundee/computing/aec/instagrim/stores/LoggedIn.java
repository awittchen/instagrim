/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.dundee.computing.aec.instagrim.stores;

/**
 *
 * @author Administrator
 */
public class LoggedIn {
    boolean logedin=false;
    String Username=null;
    String Password=null;
    String First_Name=null;
    String Last_Name=null;
    String Email;
    public void LogedIn(){
        
    }
    
    public void setUsername(String name){
        this.Username=name;
    }
    public String getUsername(){
        return Username;
    }
    public void setLogedin(){
        logedin=true;
    }
    public void setLogedout(){
        logedin=false;
    }
    
    public void setPassword(String password)
    {
        this.Password=password;
    }
    
    public String getPassword(){
        return Password;
    }
    public void setLoginState(boolean logedin){
        this.logedin=logedin;
    }
    public boolean getlogedin(){
        return logedin;
    }
   
    
    
     public void setFirst_Name(String first_name){
        this.First_Name=first_name;
    }
    public String getFirst_Name(){
        return First_Name;
    }
    
    public void setLast_Name(String last_name){
        this.Last_Name=last_name;
    }
    public String getLast_Name(){
        return Last_Name;
    }
    
    public void setEmail(String email){
        this.Email=email;
    }
    public String getEmail(){
        return Email;
    }
    
}
