package stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator { 

	public static int add(String in) {
		if(in == "")
			return 0;
		
		String delim = ",|\n";
		if(in.matches("^(//.\n)(.)+$")) {
			delim = Character.toString(in.charAt(2));
			in = in.substring(4);
		}
		String[] temp = in.split(delim);
		ArrayList<Integer> negatives = new ArrayList<Integer>();
		int sum = 0;
		for(int i = 0; i < temp.length; i++) {
			int tempint = Integer.parseInt(temp[i]);
			if(tempint < 0) {
				negatives.add(tempint);
			}
			else
				if(tempint <= 1000)
					sum += tempint;
		}
		if(negatives.size() != 0) {
			throw new IllegalArgumentException("Negatives not allowed: " + negatives);
		}
		return sum;
	}

}
