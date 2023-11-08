package com.integer;


import java.util.ResourceBundle;


public class Operations {
	
	public float addition(float a,float b)
	{
		
		ResourceBundle rb= ResourceBundle.getBundle("config");
		
		Float val1=Float.parseFloat(rb.getString("add"));
		
		float c=a+b;
	
		
		if(a<0 && b<0)
		{
			c=c*-1;
		
		}
		
		if(c==val1) 
		{
			return 1;
		
		}
		else
		{
			return 0;
		}
	
	}
	
	public float subtraction(float a,float b)
	{
		
		ResourceBundle rb= ResourceBundle.getBundle("config");
		
		Float val1=Float.parseFloat(rb.getString("sub"));
		
		float c=a-b;

		if(a<0 && b<0)
		{
			c=c*-1;
		
		}
		
		if(c==val1) 
		{
			return 1;
		
		}
		else
		{
			return 0;
		}
	
	}
	

	public float multiplication(float a,float b)
	{
		
		ResourceBundle rb= ResourceBundle.getBundle("config");
		
		Float val1=Float.parseFloat(rb.getString("mul"));
		
		float c=a*b;
		
		
		if((a<0 && b>0) || (a<0 && b<0))
		{
			c=c*-1;
		
		}
		
		
		
		if(c==val1) 
		{
			return 1;
		
		}
		else
		{
			return 0;
		}
	}
	
	
	public float Division(float a,float b)
	{
		
		ResourceBundle rb= ResourceBundle.getBundle("config");
		
		Float val1=Float.parseFloat(rb.getString("div"));
		
		float c=a/b;
		
		
		if((a<0 && b>0) || (a<0 && b<0))
		{
			c=c*-1;
		
		}
		
		if(c==val1) 
		{
			return 1;
		
		}
		else
		{
			return 0;
		}
	
	}
}
