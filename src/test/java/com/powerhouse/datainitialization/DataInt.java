package com.powerhouse.datainitialization;

import java.io.Serializable;

/**
 * Unit test for simple App.
 */
public class DataInt implements Serializable
    
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8709856611068480301L;
	
	public String Email = "";
	
	public String Password = "";
	
	public String Ufname ="";
	
	public String Ulname ="";
	
	public String Uemail ="";
	
	public String Upwd ="";
	
	public String Ucpwd ="";
	
	
    //----Login Getter and  Setters-------//		
	
	   public String getEmail() {
		   return Email;
		   
	   }
	   
	   public void setEmail(String email) {
		   Email = email;
	   }
	   
	   public String getPassword() {
		   return Password;
	   }
	   
	   public void setPassword(String password) {
		   Password = password;
	   }
	   
	   
	 //----Signup Getter and  Setters-------//
	   
	   public String getUfname() {
		   return Ufname;
		   
	   }
	   
	   public void setUfname(String ufname) {
		   Ufname = ufname;
	   }
    
	   public String getUlname() {
		   return Ulname;
		   
	   }
	   
	   public void setUlname(String ulname) {
		   Ulname = ulname;
	   }
}
