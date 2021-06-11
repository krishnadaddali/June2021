package com.java.interviewquestions;

/*
 Q1 -  Explain static blocks
 
 Q2 - How can we run a java program without making any Object?
 
 Q3 - Similarity and DIff b/w static & Static method
 
 Q4 - how can we create objects if we make the constructor as private
 
 Q5 - Is it possible to compile and run the java a java program without writing main()
 
 Q6 - Can we intialize member varible within static block

*/

public class StaticBlockQuestions {

	static {                                         //Q1
		System.out.println(" Static Block 1");
	}

	static {
		System.out.println(" Static Block 2");
	}

	static {
		System.out.println(" Static Block 3");
	}

	static {                                    //   Q3
		System.out.println(" Static Block 4");
	}
	
	public static void test(){                  //    Q3
		System.out.println(" Test method ");
	}
	
	public static void cover(){
		System.out.println(" cover method ");
		test();
	}
	


	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" main method ");        
		test();                                   //Q2
		cover();

		
		StaticBlockQuestions obj = new StaticBlockQuestions();
		
		
	}

}
