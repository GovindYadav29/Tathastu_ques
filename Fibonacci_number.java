package com.company;

import java.util.*;

class Fibonacci_number
{
    public static void main(String args[])
    {
        int i,c=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate fibonacci series upto nth term");
        System.out.println();
        n=sc.nextInt();
        int a=0;
        int b=1;

        System.out.println("Fibonacci series upto "+n+" is :-");
        while(c<=n)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}