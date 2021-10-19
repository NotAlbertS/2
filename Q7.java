package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q7 implements JavaQuestion {
	@Override
	public String solve() {
		String str = Util.io().ask("Write something: ");
		short half = (short) Math.floor(str.length()/2);
		for(int i=0;i<half;i++)
			if(!str.substring(i, i+1).equals(str.substring(str.length()-i, str.length()-(i+1))))
				return "No";
		return "Yes";
	}
	
	@Override
	public byte getId() {return 7;}
	
	@Override
	public String getName() {return "Question 7";}
}
