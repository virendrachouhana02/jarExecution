package com.example;

public class helloWorld {
	
	public static void main(String[] args){
		
		while(true)
		{
			System.out.println("HelloWorld");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
