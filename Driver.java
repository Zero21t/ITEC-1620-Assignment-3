// Aman Toor - 219323724

package Assingment3;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//array//
		customer[] arr;
		arr = new customer[6];
		arr[0] = new customer("empty",0);
		arr[1] = new customer("empty",0);
		arr[2] = new customer("empty",0);
		arr[3] = new customer("empty",0);
		arr[4] = new customer("empty",0);
		arr[5] = new customer("empty",0);
		//output//
		System.out.println("For 6 Customers enter the name and in the next line the balance ");
		//input names and balance 6 times each *//
		int r = 0;
		String Name;
		double Balance =0;	
		while(r<6) {
			Name = input.next();
			Balance = input.nextDouble();
			arr[r]= new customer(Name, Balance);
			r++;
		}
			//sort less then 150//
		r =0;
		System.out.println("Search for all customers who have less then $150");
		while(r<6) {
			if(arr[r].GetBalance()<150) {
				System.out.println(arr[r].GetName());
			}
			r++;
		}
		
		//average balance//
		r =0;
		double average =0, total =0;
		while(r<6) {
			total += arr[r].GetBalance();
			r++;
		}
		average = total/6;
		System.out.println("\n The Average Balance is: "+average);
		
		//find highest and lowest//
		r=0;
		String N1 = arr[0].GetName(), N2 =arr[0].GetName();
		double B1 = arr[0].GetBalance(), B2 =arr[0].GetBalance();
		while(r<6) {
			if(arr[r].GetBalance()>B1) {
				N1 = arr[r].GetName();
				B1 = arr[r].GetBalance();
			}r++;
		}r=0;
		//finds lowest
		while(r<6) {
			if(arr[r].GetBalance()<B2) {
				N2 = arr[r].GetName();
				B2 = arr[r].GetBalance();
			}r++;
		}
		
		System.out.println("\n The customer with the Highest balance is: "+N1);
		System.out.println("\n The customer with the lowest balance is: "+N2);
		
		//percent increase//
		r=0;
		System.out.println("\n Show all acounts after a 15% balance increase");
		while(r<6) {
			arr[r].addpercentage();
			System.out.println(arr[r].toString());
			r++;
		}
		
		
	}
		
}


