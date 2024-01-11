package com.logical_practice.recursion;
import java.util.*;

public class GeekOnacciSeries {
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    for(int i = 0; i < T; i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        int n = sc.nextInt();
    	    System.out.println(geekOnacciSeries(a, b, c, n));
	    }
	}
	
	static int geekOnacciSeries(int a, int b, int c, int n){
	    if(n == 1){
	        return a;
	    }
	    if(n == 2){
	        return b;
	    }
	    if(n == 3){
	        return c;
	    }else
	        return geekOnacciSeries(a, b, c, n - 1) + geekOnacciSeries(a, b, c, n - 2) + geekOnacciSeries(a, b, c, n - 3);
	}
}