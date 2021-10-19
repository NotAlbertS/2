package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q3 implements JavaQuestion {

	@Override
	public byte getId() {return 3;}

	@Override
	public String getName() {return "Question 3";}

	@Override
	public String solve() {
		String str =  Util.io().ask("Write something: ");
		short count = 0;
		for(int i=0;i<str.length();i++) {
			try {Byte.valueOf(str.substring(i, i+1)); count++;}
			catch (Exception e) {}
		}
		return count+"";
	}

}
