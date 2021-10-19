package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q6 implements JavaQuestion {
	@Override
	public String solve() {
		String word = Util.io().ask("Word to watch for: ");
		String[] strs = Util.io().ask("Write something: ").trim().split(" ");
		byte count = 0;
		for(int i=0;i<strs.length;i++)
			if(strs[i].equalsIgnoreCase(word))
				count++;
		return count+"";
	}
	
	@Override
	public byte getId() {return 6;}
	
	@Override
	public String getName() {return "Question 6";}
}
