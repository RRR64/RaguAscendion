import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, String> hmp = new HashMap();
		
		hmp.put("name", "Ragu");
		hmp.put("Role", "Tester");
		hmp.put("Company", "CTS");
		
		System.out.println(hmp.entrySet());
		
	Set<Entry<String,String>> set	=hmp.entrySet();
	
	for (Entry<String, String> entry : set) {
		
		System.out.println(entry.getKey() + " : " + entry.getValue() );
		
		
	}
		
		
	}

}
