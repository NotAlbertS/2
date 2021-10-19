package f;

import com.x.schoolhelper.Question;

public class Main {
	public static void main(String[] args) {
		Question.registerQuestion(new Q1());
		Question.registerQuestion(new Q2());
		Question.registerQuestion(new Q3());
		Question.registerQuestion(new Q4());
		Question.registerQuestion(new Q5());
		Question.registerQuestion(new Q6());
		Question.registerQuestion(new Q7());
		Question.registerQuestion(new Q8());
		Question.registerQuestion(new Q9());
		Question.registerQuestion(new Q10());
		Question.registerQuestion(new Q11());
		Question.registerQuestion(new Q12());
		
		Question.printAsk();
	}
}
