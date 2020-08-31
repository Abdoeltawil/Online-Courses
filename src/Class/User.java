/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.*;
/**
 *
 * class User which is abstract
 */
public abstract class User {
    
    String name,User_name ,Password ;
/**
 * public constructor
 */
    public User() {
    }
/**
 * gets the name of the user
 * @return name the name of the user
 */
    public String getName() {
        return name;
    }
/**
 * sets the name of the user
 */

    public void setName(String name) {
        this.name = name;
    }
/**
 * gets User_name
 * @return User_name is the User_name 
 */
    public String getUser_name() {
        return User_name;
    }
/**
 * sets User_name
 */
    public void setUser_name(String User_name) {
        this.User_name = User_name;
    }
/**
 * gets Password
 * @return Password is the Password of the user class 
 */
    public String getPassword() {
        return Password;
    }
/**
 * sets Password
 */
    public void setPassword(String Password) {
        this.Password = Password;
    }
      /**
 void method which register for a new user
 * @param name is the name of the user
 * @param username is the username of the user
 * @param password is the password number of the user
 * @throws IOException thrown
 * in case an error happened in the file
 */ 
      public void register(String name ,String username , String password) throws IOException
    {
         File file = new File("Data.txt");
        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.write(name+"*"+username+"*"+password+"/");
        pw.close();
    }
       /**
        * public method makes an object of class user and 
        * sets the name of the user and his password
 * @param currentuser is the name of the user
 * @param currentpass is the username of the user
 * @return u returns an object of class User

 */
   
    
}
