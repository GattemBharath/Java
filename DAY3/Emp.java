package Bharath;

import java.util.Scanner;
public class Emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String DOB = s.nextLine();
		String MOB = s.nextLine();
		int BY = s.nextInt();
		int salary = s.nextInt();
		int age = s.nextInt();
		if(salary == 500000)
		{
			int tax = 20;
			System.out.println("Name: "+name+" Age: "+ age+" Annual salary: "+salary+" Tax amount: "+tax+"%");
		}
		else if(salary == 400000)
		{
			int tax = 15;
			System.out.println("Name: "+name+" Age: "+ age+" Annual salary: "+salary+" Tax amount: "+tax+"%");
		}
		else if(salary == 300000)
		{
			int tax = 10;
			System.out.println("Name: "+name+" Age: "+ age+" Annual salary: "+salary+" Tax amount: "+tax+"%");
		}
		else if(salary == 200000)
		{
			int tax = 5;
			System.out.println("Name: "+name+" Age: "+ age+" Annual salary: "+salary+" Tax amount: "+tax+"%");
		}
	}

}
