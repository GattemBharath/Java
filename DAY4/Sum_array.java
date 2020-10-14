//Create an int array of size 5, take all the values from the user, add all the values and print the sum.

package Bharath;
import java.util.Scanner;
public class Sum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
        	arr[i] = s.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
        	sum += arr[i];
        }
        System.out.println(sum);
	}

}
