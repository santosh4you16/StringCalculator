package com.stringCalculator;

public class StringCalculator {

	public int add(String numbers) {
	
		if(numbers.equals(""))
			return 0;
		if(numbers.length() == 1)
			return Integer.parseInt(String.valueOf(numbers.charAt(0)));

		if(numbers.length() > 1 ){
			String s[] = numbers.split("[\n ,]+");
			int sum = 0;
			for(int i=0;i<s.length;i++){
				sum += Integer.parseInt(s[i]);
			}
			return sum;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		StringCalculator s = new StringCalculator();
		System.out.println(s.add("1,2,3\n6"));
	}
}
