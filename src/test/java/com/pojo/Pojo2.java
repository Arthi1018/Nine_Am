package com.pojo;

public class Pojo2 {

	public static void main(String[] args) {
		
		Pojo1 obj=new Pojo1();
		
		obj.setName("Arthiha");
		obj.setAge(12);
		
		String name = obj.getName();
		System.out.println(name);
		
		int age = obj.getAge();
		System.out.println(age);
		
		System.out.println(obj.getName());
	}
}
