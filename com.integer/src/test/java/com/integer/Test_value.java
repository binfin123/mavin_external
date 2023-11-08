package com.integer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_value {
	
	
	@Test
	public void test1()
	{
		
		
		float a = 5;
		float b = 10;
		Operations l=new Operations();
		Assert.assertEquals(1,l.addition(a,b));	
	}
	
	
	@Test
	public void test2()
	{
		
		
		float a = -5;
		float b = -10;
		Operations l=new Operations();
		Assert.assertEquals(1,l.subtraction(a,b));	
	}
	
	@Test
	public void test3()
	{
		
		
		float a = -5;
		float b = 10;
		Operations l=new Operations();
		Assert.assertEquals(1,l.multiplication(a,b));	
	}

	@Test
	public void test4()
	{
		
		
		float a = 5;
		float b = -10;
		Operations l=new Operations();
		Assert.assertEquals(1,l.Division(a,b));	
	}
	
	
	
	

}
