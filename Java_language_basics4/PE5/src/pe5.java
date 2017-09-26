import java.util.HashMap;
import java.util.Map;

public class pe5 {

	public pe5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

	}
	public static Map<String,String> f(Map<String,String> h )
	{
	if(h.get("val1") != null)
		{
			h.put("val2", h.get("val1"));
			h.put("val1", "");
		}
		return h;
	}

}
