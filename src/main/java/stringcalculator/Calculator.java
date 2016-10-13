package stringcalculator;

public class Calculator { 

	public static int add(String in) {
		if(in == "")
			return 0;
		if(in.contains(",")) {
			String[] temp = in.split(",");
			int sum = 0;
			for(int i = 0; i < temp.length; i++) {
				sum += Integer.parseInt(temp[i]);
			}
			return sum;
		}
		return Integer.parseInt(in);
	}

}
