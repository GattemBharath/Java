//Create an int array with 5 values and print only odd values.

package Bharath;

public class Print_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[]  arr = {1,2,3,4,5};
        for(int i = 0;i<arr.length;i++)
        {
        	if(arr[i] %2 != 0)
        		System.out.println(arr[i]);
        }
	}

}
