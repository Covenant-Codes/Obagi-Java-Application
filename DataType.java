public class DataType{
	public static void main(String[] args) {
		//Integer type (byte, short, int, long)
		byte age = 50;
		System.out.printf("You are %d years old years old %n",age);
		
		short quantity = 20000;
		System.out.printf("I bought %d quantity of bags for business %n",quantity);
		
		int populationInNigeria = 1000000000;
		System.out.printf("The population in Nigeria is %d %n",populationInNigeria);
		
		long worldPopulation = 80000000000L;
		System.out.printf("The world population in Nigeria is %d %n",worldPopulation);
		
		//float-point numbers (float, double)
		float weight = 5.6F;
		System.out.printf("The Bag of Rice was %.1fkg %n",weight);
		
		double acctBalance = 487575.94747;
		System.out.printf("your account balance is %c%.2f %n",'$',acctBalance);
		
		//Boolean (boolean)
		boolean isJavaFun = true;
		System.out.printf("Is Java Fun? %b",isJavaFun);
		
		//Character (char)
		char alpha = '@';
		System.out.printf("My email is azubuikecovenant999%cgmail",alpha);
	}
}