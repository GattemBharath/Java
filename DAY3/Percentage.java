package Bharath;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sub1 = s.nextInt();
		int sub2 = s.nextInt();
		int sub3 = s.nextInt();
		int sub4 = s.nextInt();
		int sub5 = s.nextInt();
		float percentage = (float) (((sub1+sub2+sub3+sub4+sub5)/500.0)*100.0);
	    if(percentage>=90)
		 {
                System.out.println(percentage+" percentage "+"A Grade");
	     }
	    else if(percentage>=80 && percentage<90)
		 {
            System.out.println(percentage+" percentage "+"B Grade");
          }
	    else if(percentage>=70 && percentage<80)
		 {
               System.out.println(percentage+" percentage "+"C Grade");
	     }
	    else if(percentage>=50 && percentage<70)
		 {
               System.out.println(percentage+" percentage "+"D Grade");
	     }
	    else if(percentage>=40 && percentage<50)
		 {
               System.out.println(percentage+" percentage "+"E Grade");
	     }
	    else
	    {
	    	
	    	System.out.println(percentage+" percentage "+"You are failed");
	     }
	    
	}
	
}
