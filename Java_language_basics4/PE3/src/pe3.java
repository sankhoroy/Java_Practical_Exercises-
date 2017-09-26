import java.util.HashMap;

public class pe3 {

	public pe3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] s = {"a","b","c","d","a","c","c"};
		HashMap<String, Boolean> h = new HashMap<String,Boolean>();
		//HashMap<String, Integer> hn = new HashMap<String,Integer>();
		for(int i = 0;i<s.length;i++)
		{
			if(!h.containsKey(s[i]))
			{
				//hn.put(s[i], 1);
				h.put(s[i], false);
			}
			else
			{
				//if(hn.get(s[i]) )
					h.put(s[i], true);
			}
		}
		System.out.println(h.entrySet());

	}

}
