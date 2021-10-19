package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q2 implements JavaQuestion {

	@Override
	public byte getId() {return 2;}

	@Override
	public String getName() {return "Question 2";}

	@Override
	public String solve() {
		String str =  Util.io().ask("Write something: ").toLowerCase();
		short count = 0;
		for(int i=0;i<str.length();i++) {
			char t = str.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
				count++;
		}
		return count+"";
	}

}
