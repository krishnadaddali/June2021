package com.java.interviewquestions.june;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCBank hdfc = new HDFCBank();
		
		hdfc.credit();
		hdfc.debit();
		hdfc.loan();
		hdfc.funds();
		
		Bank b = new HDFCBank(); // Dynamic Polymophism
		
		b.credit();
		b.debit();
		b.loan();
		

	}

}
