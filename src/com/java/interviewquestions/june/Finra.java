package com.java.interviewquestions.june;

public class Finra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.out.println(SSNorNot("111-11-1111")); ;

	}
	
	
	public static String SSNorNot(String str){
	     if(str.length()>11){
	       return "not a SSN";
	     }
	     else{
	    	
	       if(str.charAt(3)!=45||str.charAt(7)!=45){
	    	   
	    	
	         int j=str.charAt(9);
	         return j+"";
	       }
	       else{
	         for(int i=0;i<str.length();i++){
	         if((i==3)||(i==7)){
	           continue;
	         }
	         if(str.charAt(i)<0||str.charAt(i)>9){
	              return "not a SSN";
	           
	         }
	       }
	       }
	     }
	     return "this is SSN";
	   }

}
