package f;

import com.x.schoolhelper.JavaQuestion;
import com.x.schoolhelper.util.Util;

public class Q11 implements JavaQuestion {
	@Override
	public String solve() {
		String text = Util.io().ask("Write something: ").trim();
		int words = text.split(" ").length;
		int sentences = text.split("\\.").length;
		int syllables = getSyllables(text.split(" "));
		return String.valueOf(getReadability(words, sentences, syllables));
	}
	
	@Override
	public byte getId() {return 11;}
	
	@Override
	public String getName() {return "Question 11";}
	
	public float getReadability(int words, int sentences, int syllables) {
		return (float) ((0.4*(words/sentences)) + (12*(syllables/words)) - 16);
	}
	
	public int getSyllables(String[] words) {
		int syl = 0;
		boolean wasSyl = false;
		for(int i=0;i<words.length;i++)
			for(int j=0;j<words[i].length();j++) {
				char t = words[i].charAt(j);
				if((t=='a'||t=='e'||t=='i'||t=='o'||t=='u')&&!wasSyl) {
					syl++;
					wasSyl = true;
				} else
					wasSyl = false;
			}
		return syl;
	}
}
