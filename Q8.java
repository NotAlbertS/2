package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q8 implements JavaQuestion {

	@Override
	public byte getId() {return 8;}

	@Override
	public String getName() {return "Question 8";}

	@Override
	public String solve() {
		String str =  Util.io().ask("Write something: ").trim();
		short vowels = 0;
		short digits = 0;
		short whitespaces = 0;
		for(int i=0;i<str.length();i++) {
			char t = str.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
				vowels++;
			else if(number(t))
				digits++;
			else if(t==' ')
				whitespaces++;
		}
		return "Vowels: "+vowels+"\nDigits: "+digits+"\nWhitespaces: "+whitespaces+"\nOther: "+(str.length()-vowels-digits-whitespaces);
	}
	
	public boolean number(char c) {
		try {
			Byte.valueOf(c+"");
			return true;
		} catch (Exception e) {return false;}
	}

}
