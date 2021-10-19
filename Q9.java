package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q9 implements JavaQuestion {
	@Override
	public String solve() {
		String str =  Util.io().ask("Write something: ").trim();
		char[] chars = {};
		short[] counts = {};
		for(int i=0;i<str.length();i++) {
			char t = str.charAt(i);
			int ind = indexOf(chars, t);
			if(ind==-1) {
				chars = Util.arrays().addToArray(chars, t);
				counts = Util.arrays().addToArray(counts, (short) 1);
			} else {
				counts[ind]++;
			}
		}
		for(int i=0;i<chars.length;i++)
			Util.io().print(chars[i]+": "+counts[i], true);
		return "";
	}
	
	@Override
	public byte getId() {return 9;}
	
	@Override
	public String getName() {return "Question 9";}
	
	public int indexOf(char[] arr, char chr) {
		for(int i=0;i<arr.length;i++)
			if(arr[i]==chr)
				return i;
		return -1;
	}
}
