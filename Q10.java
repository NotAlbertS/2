package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q10 implements JavaQuestion {
	@Override
	public String solve() {
		String[] words = Util.io().ask("Write something: ").trim().split(" ");
		String out = "";
		for(int i=0;i<words.length;i++)
			out += words[i].substring(1) + words[i].substring(0, 1) + "a ";
		return out;
	}
	
	@Override
	public byte getId() {return 10;}
	
	@Override
	public String getName() {return "Question 10";}
}
