package com.tnsif.lambdaexpressiondemo;
import java.util.ArrayList;

//collections

public class Lambdaexpression {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(3);
		li.add(7);
		li.add(9);
		li.add(8);
		
		li.forEach(ele->System.out.println(ele));
	}

}
