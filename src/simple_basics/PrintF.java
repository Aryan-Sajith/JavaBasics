package simple_basics;

public class PrintF {
	public static void main(String[] args) {
	// printf() = A method we can use to format console output
	// 			  two arguments = format string + (object/variable/value)
	//			  Format Specifier <--% [flags] [precision] [width] [conversion-character]
		boolean myBoolean = true;
		char myChar = '$';
		String myString = "Aryan";
		int myInt = 30;
		double myDouble = 3.14156;
		
		//[conversion-character] = Specifies the particular value we're formatting to string
		System.out.printf("%b",myBoolean);
		System.out.printf("%c",myChar);
		//System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		//System.out.printf("%f",myDouble);
		
		// [width] = Sets the minimum number of characters to be written as output
		System.out.printf("Hello %10s",myString);
		
		// [precision] = Sets the number of digits of precision when outputting 
		// floating point values
		//System.out.printf("The number pi is %.4f",myDouble);
		
		// [flags] = Effects the output based on specific flag
		// - : left-justify
		// , : comma grouping separator if numbers > 1000
		// + : output a plus(+) or minus(-) sign for a numeric value
		// 0 : numeric values are zero-padded
		System.out.printf("The number pi is %,f",myDouble);	
	}
}
