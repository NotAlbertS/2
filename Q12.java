package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q12 implements JavaQuestion {
	@Override
	public String solve() {
		short count = Util.io().askShort("How many units: ");
		String seq = "1?";
		for(int i=0;i<count;i++) {
			char o = ' ';
			short c = 0;
			String next = "";
			for(int j=0;j<seq.length();j++) {
				if(seq.charAt(j)==o) {
					c++;
				} else if(o==' ') {
					o = seq.charAt(j);
					c = 1;
				} else {
					next += c + "" + o;
					o = seq.charAt(j);
					c = 1;
				}
			}
			Util.io().print(seq.substring(0, seq.length()-1), true);
			seq = next + "?";
		}
		
		return "";
	}
	
	@Override
	public byte getId() {return 12;}
	
	@Override
	public String getName() {return "Question 12";}
}
