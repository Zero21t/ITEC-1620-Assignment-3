// Aman Toor - 219323724

package Assignment3;

import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//array//
		int[] number = new int[9];
		//inputs//
		System.out.println("The array length is: 8");
		int x = 1;
		while(x<=8) {
			int z;
			System.out.println("Please enter value for the array: ");
			z = input.nextInt();
			if(z<0) {
				System.out.println("Please enter a psotive value: ");
				z = input.nextInt();
			}else {
				number[x] = z;
				x++;
			}
		
		}
		//out in order//
		System.out.println("Before swappping the min max, the array is");
		System.out.println(number[1]+ " " + number[2]+ " " + number[3] +" "+ number[4]+ " " +number[5]+ " " +number[6]+ " " +number[7]+ " " +number[8]+ " \n" );
		
		//finding max//
		int c =1;
		int A1 = 0,A2 =0,A3 =0,A4 =0,A5 =0,A6=0,A7=0,A8=0;
		while(c<8) {
			if(number[1]>=number[c]) {
				A1++;
			}if(number[2]>=number[c]) {
				A2++;
			}if(number[3]>=number[c]) {
				A3++;
			}if(number[4]>=number[c]) {
				A4++;
			}if(number[5]>=number[c]) {
				A5++;
			}if(number[6]>=number[c]) {
				A6++;
			}if(number[7]>=number[c]) {
				A7++;
			}if(number[8]>=number[c]) {
				A8++;
			}
			c++;
		}//finds greatest number//
		int max = 0, min, m1 = 0;
			if(number[1]>number[2] && number[1]>number[3]&& number[1]>number[4]&& number[1]>number[5]&& number[1]>number[6]&& number[1]>number[7]&& number[1]>number[8] ) {
				System.out.println("The max is "+number[1]+" and its location is 1");
				max = number[1];
				m1 =1;
			}if(number[2]>number[1] && number[2]>number[3]&& number[2]>number[4]&& number[2]>number[5]&& number[2]>number[6]&& number[2]>number[7]&& number[2]>number[8] ) {
				System.out.println("The max is "+number[2]+" and its location is 2");
				max = number[2];
				m1 =2;
			}if(number[3]>number[1] && number[3]>=number[3]&& number[3]>number[4]&& number[3]>number[5]&& number[3]>number[6]&& number[3]>number[7]&& number[3]>number[8] ) {
				System.out.println("The max is "+number[3]+" and its location is 3");
				max = number[3];
				m1 =3;
			}if(number[4]>number[1] && number[4]>number[3]&& number[4]>=number[4]&& number[4]>number[5]&& number[4]>number[6]&& number[4]>number[7]&& number[4]>number[8] ) {
				System.out.println("The max is "+number[4]+" and its location is 4");
				max = number[4];
				m1=4;
			}if(number[5]>number[1] && number[5]>number[3]&& number[5]>number[4]&& number[5]>=number[5]&& number[5]>number[6]&& number[5]>number[7]&& number[5]>number[8] ) {
				System.out.println("The max is "+number[5]+" and its location is 5");
				max = number[5];
				m1=5;
			}if(number[6]>number[1] && number[6]>number[3]&& number[6]>number[4]&& number[6]>number[5]&& number[6]>=number[6]&& number[6]>number[7]&& number[6]>number[8] ) {
				System.out.println("The max is "+number[6]+" and its location is 6");
				max = number[6];
				m1=6;
			}if(number[7]>number[1] && number[7]>number[3]&& number[7]>number[4]&& number[7]>number[5]&& number[7]>number[6]&& number[7]>=number[7]&& number[7]>number[8] ) {
				System.out.println("The max is "+number[7]+" and its location is 7");
				max = number[7];
				m1=7;
			}if(number[8]>number[1] && number[8]>number[3]&& number[8]>number[4]&& number[8]>number[5]&& number[8]>number[6]&& number[8]>number[7]&& number[8]>=number[8] ) {
				System.out.println("The max is "+number[8]+" and its location is 8");
				max = number[8];
				m1=8;
			}//finds smallest number//
			if(number[1]<number[2] && number[1]<number[3]&& number[1]<number[4]&& number[1]<number[5]&& number[1]<number[6]&& number[1]<number[7]&& number[1]<number[8] ) {
				System.out.println("The min is "+number[1]+" and its location is 1");
			}if(number[2]<number[1] && number[2]<number[3]&& number[2]<number[4]&& number[2]<number[5]&& number[2]<number[6]&& number[2]<number[7]&& number[2]<number[8] ) {
				System.out.println("The min is "+number[2]+" and its location is 2");
			}if(number[3]<number[1] && number[3]<=number[3]&& number[3]<number[4]&& number[3]<number[5]&& number[3]<number[6]&& number[3]<number[7]&& number[3]<number[8] ) {
				System.out.println("The min is "+number[3]+" and its location is 3");
			}if(number[4]<number[1] && number[4]<number[3]&& number[4]<=number[4]&& number[4]<number[5]&& number[4]<number[6]&& number[4]<number[7]&& number[4]<number[8] ) {
				System.out.println("The min is "+number[4]+" and its location is 4");
			}if(number[5]<number[1] && number[5]<number[3]&& number[5]<number[4]&& number[5]<=number[5]&& number[5]<number[6]&& number[5]<number[7]&& number[5]<number[8] ) {
				System.out.println("The min is "+number[5]+" and its location is 5");
			}if(number[6]<number[1] && number[6]<number[3]&& number[6]<number[4]&& number[6]<number[5]&& number[6]<=number[6]&& number[6]<number[7]&& number[6]<number[8] ) {
				System.out.println("The min is "+number[6]+" and its location is 6");
			}if(number[7]<number[1] && number[7]<number[3]&& number[7]<number[4]&& number[7]<number[5]&& number[7]<number[6]&& number[7]<=number[7]&& number[7]<number[8] ) {
				System.out.println("The min is "+number[7]+" and its location is 7");
			}if(number[8]<number[1] && number[8]<number[3]&& number[8]<number[4]&& number[8]<number[5]&& number[8]<number[6]&& number[8]<number[7]&& number[8]<=number[8] ) {
				System.out.println("The min is "+number[8]+" and its location is 8");
			}//swap//
			if(A1<A2 && A1<A3 && A1<A4 && A1<A5 && A1<A6 && A1<A7 && A1<A8){
				min = number[1];
				number[1]= max;
				number[m1] = min;
			}if(A2<A1 && A2<A3 && A2<A4 && A2<A5 && A2<A6 && A2<A7 && A2<A8){
				min = number[2];
				number[2]= max;
				number[m1] = min;
			}if(A3<A2 && A3<A1 && A3<A4 && A3<A5 && A3<A6 && A3<A7 && A3<A8){
				min = number[3];
				number[3]= max;
				number[m1] = min;
			}if(A4<A2 && A4<A3 && A4<A1 && A4<A5 && A4<A6 && A4<A7 && A4<A8){
				min = number[4];
				number[4]= max;
				number[m1] = min;
			}if(A5<A2 && A5<A3 && A5<A4 && A5<A1 && A5<A6 && A5<A7 && A5<A8){
				min = number[5];
				number[5]= max;
				number[m1] = min;
			}if(A6<A2 && A6<A3 && A6<A4 && A6<A5 && A6<A1 && A6<A7 && A6<A8){
				min = number[6];
				number[6]= max;
				number[m1] = min;
			}if(A7<A2 && A7<A3 && A7<A4 && A7<A5 && A7<A6 && A7<A1 && A7<A8){
				min = number[1];
				number[1]= max;
				number[m1] = min;
			}if(A8<A2 && A8<A3 && A8<A4 && A8<A5 && A8<A6 && A8<A7 && A8<A1){
				min = number[8];
				number[8]= max;
				number[m1] = min;
			}
			//out in order//
			System.out.println("\n after swappping the min max, the array is");
			System.out.println(number[1]+ " " + number[2]+ " " + number[3] +" "+ number[4]+ " " +number[5]+ " " +number[6]+ " " +number[7]+ " " +number[8]+ " \n" );
			//order//
			int hold;
			for (int pass=1; pass<number.length; pass++)
			for (int i=0; i<number.length-1; i++)
			if (number[i] > number[i+1]) {
			hold=number[i];
			number[i]=number[i+1];
			number[i+1]=hold;
			}
			System.out.println("The array sorted in Ascending order: "+number[1]+ " " + number[2]+ " " + number[3] +" "+ number[4]+ " " +number[5]+ " " +number[6]+ " " +number[7]+ " " +number[8]+ " \n" );
			
			//calculating median //
			double median;
			median =(number[1]+number[2]+number[3]+number[4]+number[5]+number[6]+number[7]+number[8])/8;
			System.out.println(" The median is : "+median);
	}

}
