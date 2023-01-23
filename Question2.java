// Aman Toor - 219323724

package Assignment3;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//array//
		String[][] Queen = {{"*","*","*","*","*","*","*","*","*","*"},
							{"*","*","*","*","*","*","*","*","*","*"},
							{"*","*","*","*","*","*","*","*","*","*"},
							{"*","*","*","*","*","*","*","*","*","*"},
							{"*","*","*","*","*","*","*","*","*","*"},
							{"*","*","*","*","*","*","*","*","*","*"},
							{"*","*","*","*","*","*","*","*","*","*"},
							{"*","*","*","*","*","*","*","*","*","*"},
							{"*","*","*","*","*","*","*","*","*","*"},
							{"*","*","*","*","*","*","*","*","*","*"},};
		
		//input//
		int r=0;
		int c =0;
		while(r<10) {
			System.out.println("please enter columns to put queen");
			c=input.nextInt();
			Queen[r][c] = "Q";//adds to postion//
			r++;
		}
		r=0;//resets row counter//
		//prints//
		while(r<10) {
			System.out.println(Queen[r][0]+" "+Queen[r][1]+" "+Queen[r][2]+" "+Queen[r][3]+" "+Queen[r][4]+" "+Queen[r][5]+" "+Queen[r][6]+" "+Queen[r][7]+" "+Queen[r][8]+" "+Queen[r][9]+" ");
			r++;
		}
		
	}

}
