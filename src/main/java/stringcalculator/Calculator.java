package stringcalculator;

public class Calculator {
	public static int add(String in) {
		if(in == "")
			return 0;
		return Integer.parseInt(in);
	}
}
