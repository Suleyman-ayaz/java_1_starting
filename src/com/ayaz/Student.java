package com.ayaz;

public class Student {
	
	
	private int age;
	 private String name;
	 
	 
	 

	public void setAge(int age) {
		if(age<0)
		{
			System.out.println("Age must be greater than 0");
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	
	 
	 
	

	
	
	
	

	

}
