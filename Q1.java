package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q1 implements JavaQuestion {
	@Override
	public String solve() {
		String hms = Util.io().ask("hh:mm:ss: ");
		byte h = Byte.valueOf(hms.split(":")[0]);
		byte m = Byte.valueOf(hms.split(":")[1]);
		return (h>12 ? h-12 : h) + ":" + m + (h>12 ? " PM" : " AM");
	}
	
	@Override
	public byte getId() {return 1;}
	
	@Override
	public String getName() {return "Question 1";}
}
