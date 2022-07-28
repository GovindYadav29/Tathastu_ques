package com.company;


import java.util.*;
public class Permutation_and_Combination{
    static int fact(int number) {
        int f = 1;
        int j = 1;
        while(j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }
    public static void main(String args[]) {

        List<Integer> numbers = new ArrayList<Integer>();
         Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number of elements for combinations");
         int number= scanner.nextInt();
        for (int i = 0; i <number ; i++) {
            System.out.println("enter the number");
            numbers.add(scanner.nextInt());

        }


        int n = numbers.size();
        int r = 2;
        int result;

        result = fact(n) / (fact(r) * fact(n-r));
        System.out.println("The combination value for the numbers list is: " + result);
    }
}
