package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q5 implements JavaQuestion {
	@Override
	public String solve() {
		String[] strs = Util.io().ask("Write something: ").trim().split(" ");
		long tot = 0;
		for(int i=0;i<strs.length;i++)
			tot += strs[i].length();
		return (tot/strs.length)+"";
	}
	
	@Override
	public byte getId() {return 5;}
	
	@Override
	public String getName() {return "Question 5";}
}
