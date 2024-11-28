package StringOperations;

public class StringBufferPrograms {

	public static void main(String[] args) {
		
		String sb1 = new String("Raguram");
		
		
		StringBuffer sb = new StringBuffer("Raguram");
		
		sb.append("Dass");
		
		System.out.println(sb);
		
		sb.replace(0, 4, "Sri");
		System.out.println(sb); //SriramDass
		
		//System.out.println(sb.reverse());
		
		//sb.delete(0, 7);
		
	System.out.println(sb.insert(0, "akar"));
	
	StringBuilder sd = new StringBuilder("asd");
	

		
		
		

	}

}
