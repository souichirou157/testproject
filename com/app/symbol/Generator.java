package com.app.symbol;

import java.util.ArrayList;

public class Generator {
	ArrayList<Object> tokens=   new ArrayList<>();
	int index;
	private String gettoken ="";
	private String symbol = "@*\\\"\'$&=%-/?";
	private String resulttoken ="";
	char []carray;
	public Generator() {
		this.setAlphabet();
		this.setNumbers();
	}
	
	private void setAlphabet() {
		int j =0;
		for(char i = 'A'; i <='Z'; i++) {
			this.tokens.add(i);
		}
	}
	
	private void setNumbers() {
		for(int i = 1; i < 10;i++) {
			
			this.tokens.add(i);

		}
	}
	
	private void setSymbols() {
		for(int i =0; i < symbol.length();i++) {
			this.tokens.add(symbol.charAt(i));
		}
	}
	
	public void PasswordGenerater() {
		this.resulttoken="";

		
		for(int i = 0; i < this.tokens.size()-5;i++) {
			this.index = (int)(Math.random()*this.tokens.size());
			gettoken+=tokens.get(index);
			tokens.remove(index);
		}
		
		//ランダムな２個が入る
		for(int i =0; i < symbol.length();i++) {
			this.index = (int)(Math.random()*symbol.length());
			gettoken+=symbol.charAt(index);
		}
		
		
		for(int i=0; i < gettoken.length();i++) {
			
			resulttoken+=gettoken.charAt((int)(Math.random()*gettoken.length()));
			
		}
		
	}
	
	
	public String getResultToken() {
		
		for(int  i =1; i < gettoken.length();i++) {
			
			if(resulttoken.charAt(i-1)==resulttoken.charAt(i)) {
				 
				PasswordGenerater() ;
			}
		}
		System.out.println(this.resulttoken.length());
		
		return this.resulttoken;
	}
}
