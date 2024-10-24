package com.app.statement;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StatementParser {
	
	private String statement;
	private String cols=" ";
	private  ArrayList <String> array = new ArrayList<>();
	
	public StatementParser() {}
	
	public StatementParser(String statement) {
		setStatement(statement);
		escape(); 
		Molding();
		perser_get_attributename(statement);
		
	}
	
	public String getStatement() { return this.statement;}
	
	private void setStatement(String statement) { this.statement = statement;}
	
	
	public void escape() {

		for(int i =0; i < this.statement.length();i++) {
			 if(this.statement.charAt(i) == '#') this.statement = statement.replace(",", "#");
            if(this.statement.charAt(i)=='!') this.statement = statement.replace(" ", "!");
		 }
		
		
	}
	
	public void Molding() {
		 
		for(int i =0; i < this.statement.length();i++) {
			 if(this.statement.charAt(i) == '#') this.statement = statement.replace("#", " ,");
             if(this.statement.charAt(i)=='!') this.statement = statement.replace("!", " ");
		 }
		
	}
	
	
	
	public void perser_get_attributename(String stdIn) {
		
		 this.setStatement(stdIn);
		
		int stateEntoryTable =  this.getStatement().indexOf("from");
		int stateEntoryTableUpper =  this.getStatement().indexOf("FROM");
		
	
		
		
		StringTokenizer  s = new StringTokenizer(this.getStatement()," ");
		
		
		
		for(int j = this.getStatement().indexOf("select"); j < stateEntoryTable ;j++) {
			
			if(this.getStatement().charAt(j)==',')   continue;
				
//			this.cols += String.valueOf(this.getStatement().charAt(j));
		}
//		
		
		
		
		System.out.println(this.getStatement().indexOf("select"));
		
		
		while(s.hasMoreTokens()) array.add(s.nextToken());
		

		array.forEach(System.out::print);

			
	}
	

	
	
	
		
	
	
	
	

}
