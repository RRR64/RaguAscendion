package StringOperations;

public class ArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * //Arrays - Collection of elements of similiar datatype
		 * 
		 * // int , boolean , string , float , double
		 * 
		 * //1-D Array
		 * 
		 * //Approach 1 String [] data = new String [5];
		 * 
		 * data [0] = "Ragu";
		 * 
		 * data [1] = "Ram";
		 * 
		 * data [2] = "Thilaga";
		 * 
		 * data [3] = "Nachal";
		 * 
		 * data [4] = "Sushma";
		 * 
		 * for (int i =0;i<5;i++) { if(data[i]=="Nachal") { break; } }
		 * //System.out.println(data[i]);
		 * 
		 * //Approach 2
		 * 
		 * String [] data1 = {"Ragu","Ajay","Vishal","Arjun"};
		 * 
		 * System.out.println(data1.toString());
		 */
		
		//2D Array
		
		String [] [] user = new String [2][2];
		
		user [0] [0] = "Icertis";
		
		user [0] [1] = "WellCare";
		
		user [1] [0] = "InBound";
		
		user [1] [1] = "Valerian";
		
		for(int m = 0;m<2;m++)
		{
		for(int n =0;n<2;n++)
		{
		System.out.println(user[m][n]);
		}
		}
		
		
		
		
		
		
				}

}