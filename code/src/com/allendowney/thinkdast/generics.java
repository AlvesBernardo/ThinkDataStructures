package com.allendowney.thinkdast;

public class generics
{
	public static void main(String[] args){
		print(1);
		print("40");
		print(3.4);
	}

	public static <T> void print(T element){
		System.out.println(element);
	}
}
