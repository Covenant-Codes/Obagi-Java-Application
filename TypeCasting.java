public class TypeCasting{
	public static void main(String[] args) {
		//Widening Type casting
		double weight = 678;
		System.out.printf("your weight is %f %n",weight);
		
		//Narrowing Type Casting
		char alpha = '?';
		
		int asciiCode = (char)alpha;
		System.out.printf("The ASCII code for ? is %d %n",asciiCode);
		
		double height = 5.8;
		
		int myHeight = (int)height;
		System.out.printf("My faculty's height is %d",myHeight);
	}
}