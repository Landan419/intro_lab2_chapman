package HelloWorld;

import java.util.Scanner;

public class Za_Worldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scnr = new Scanner(System.in);
			
		boolean[] chptList = new boolean[16];
		int includeChpt;
		int i,j;
		
		// Get the chapter selections
		for (i = 1; i <= 15; ++i) {
			includeChpt = scnr.nextInt();
			if (includeChpt==1) {
				chptList[i] = true;
			}
			else {
				chptList[i] = false;
			}
		}
		/* Type your code here. */
	}

}
