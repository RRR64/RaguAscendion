package StringOperations;

public class StringBufferOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer bf = new StringBuffer("Ragu");
		
		System.out.println(bf.capacity());
		
		System.out.println(bf.append("Ram"));
		
		bf.reverse();
		
		System.out.println(bf);
		
		bf.replace(0, 4, "Shiva");
		System.out.println(bf);
		
		bf.insert(4, "Karan");
		System.out.println(bf);
		bf.delete(0, 3);
		System.out.println(bf);
		
		//String Buffer - String Builder
		
		//Synchronised and Thread Safe - Non- Synchronised
		
		//Less Efficient - More Efficient
		
	}

}
