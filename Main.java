// Write a java program to accept a number from user and count zero, odd and even digits of entered number.

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zerocount = 0,oddcount = 0, evencount = 0;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("You entered "+n);
        
        while (n>0) {
        	if((n % 10) ==0) {
        		zerocount++;
        	}
        	else if (n % 2 == 0 ) {
        		evencount++;
        	}
        	else {
        		oddcount++;
        	}
        	n = n / 10;
        }
        System.out.println("Even:"+evencount+" Odd:"+oddcount+" Zero:"+zerocount);
        
        sc.close();
	}

}
