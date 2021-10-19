package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q4 implements JavaQuestion {

	@Override
	public byte getId() {return 4;}

	@Override
	public String getName() {return "Question 4";}

	@Override
	public String solve() {
		String str =  Util.io().ask("Write something: ").trim();
		short count = 1;
		for(int i=0;i<str.length();i++) {
			char t = str.charAt(i);
			if(t==' ')
				count++;
		}
		return count+"";
	}

}
