/*create a class avenger with
properties (name,age,power,weapon,planet) and with
functions-getDetails() and displayDetails().
create 5 objects as an array in the main method and call.*/

package Bharath;

public class Avenger {
	String n,w,pt;
	int a, p;
	
	void getDetails(String name,int age,int power,String weapon,String planet)
	{
	    a = age;
	    n = name;
		pt = planet;
		p = power;
		w = weapon;
	}
	void displayDetails()
	{
		System.out.println(a+" "+n+" "+pt+" "+p+" "+w);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Avenger[] arr = new Avenger[5];
        arr[0] = new Avenger();
        arr[1] = new Avenger();
        arr[2] = new Avenger();
        arr[3] = new Avenger();
        arr[4] = new Avenger();
        arr[0].getDetails("Bharath", 20, 56, "Axe", "Earth");
        arr[0].displayDetails();
        arr[1].getDetails("Iron Man", 25, 67, "Suit", "Earth");
        arr[1].displayDetails();
        arr[2].getDetails("Captain America", 29, 34, "Shield", "Earth");
        arr[2].displayDetails();
        arr[3].getDetails("Hulk", 45, 57, "Hand", "Earth");
        arr[3].displayDetails();
        arr[4].getDetails("Simha", 35, 85, "Mouth", "Earth");
        arr[4].displayDetails();
        
        
	}

}
