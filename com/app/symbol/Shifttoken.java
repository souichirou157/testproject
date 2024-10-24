package com.app.symbol;

import java.util.ArrayList;
import java.util.List;

public class Shifttoken {
	
	List <Character>tokens = new ArrayList<>();
	List<Integer> decoder = new ArrayList<>();
	
	
	
	
	
	private void settoken(){
		for(char i = 'A'; i <='Z';i++) {
			tokens.add(i);
			decoder.add((int)i);
		}
		
	}
	
	public void print() {

		tokens.forEach(System.out::println);
		
		System.out.println("数字化");
		decoder.forEach(System.out::println);
		
	}
	
	public void test() {

		for(int i =0; i < tokens.size();i++) if((int)tokens.get(i) % 3 ==0) tokens.remove(i);		
		
	}
}
