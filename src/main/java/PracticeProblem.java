/**

        * File: Lesson 4.5

        * Author: Peter

        * Date Created: April 29, 2026

        * Date Last Modified: April 29, 2026

        */


public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String triangle(int num){

		String result = "";

		for (int s = 1; s <= num; s++) {
			for (int i = 0; i < s; i++){
				result = result + "*";
			}
		
		result = result + "\n";
		
	}
		return result;
	}


	public static String pyramid(int num){
		String result = "";
		
		for (int s = 1; s <= num; s++){																					
			for (int i = 0; i < num - s; i++){
				result = result + " ";
			}
		

		for (int i = 0; i < s; i++){
			result = result + "*";

			if  (i < s - 1){
				result = result + " ";
			}
		}
		result = result + "\n";
	}
		return result;

	}


	public static String multiplicationTable(int num){
		String result = "";
		for (int i = 1; i <= num; i++){
			for (int a = 1; a <= num; a++){
				result = result + (i * a);

				if (a < num){
					result = result + " ";
				}
			}
			result = result + "\n";
		}
		return result;




	}
}
