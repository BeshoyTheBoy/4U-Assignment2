/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_2;

/**
 *
 * @author awadb3223
 */
public class Assignment_2 {

    //---QUESTION 1---
    public int digitalSum(int n) {
        //if n is negative, make it positive
        if (n < 0) {
            n = (n * n) / n;
        }
        //recursion
        //Base case - if n is a single digit
        if (n < 10) {
            return n;
        } else {
            //isolate right digit
            int right = n % 10;
            //isolate left digits
            int left = n / 10;
//            //take left digits and isolate right digit, add to previous right digit
            return digitalSum(left) + right;
        }
    }

    //---QUESTION 2---
    public int digitalRoot(int n) {
        ////if n is negative, make it positive
        if (n < 0) {
            n = (n * n) / n;
        }
        //Recursion
        //BASE CASE - if n is a single digit, return n
        if (n < 10) {
            return n;
        } else {
            //isolate right digit
            int right = n % 10;
            //isolate left digits
            int left = n / 10;
            //Find the first digital sum using the first method and store it in variable
            int digSum = digitalSum(left) + right;
            //return
            return digitalRoot(digSum);
        }
    }

    //---QUESTION 3---
    public int triangle(int n) {
        //n represents the number of rows
        //BASE CASE - if n is 0, return n
        if (n == 0) {
            return n;
        } else {
            //previous row integer
            int prev = n - 1;
            //the number of total blocks = the number of blocks in row n plus the blocks in the previous row (n-1)
            int blocks = n + triangle(prev);
            //return total blocks
            return blocks;
        }
    }

    //---QUESTION 4---
    public int hailstone(int n) {
        //BASE CASE - if n equals 1, the last digit in the sequence
        if (n == 1) {
            return 1;
            //else if n is even (has no remained when divided by 2)
        } else {
            if (n % 2 == 0) {
                //divide n by 2
                n = n / 2;
                System.out.println(n);
            } else {
                //else if n is odd, multiply by 3 and add 1
                n = (3 * n) + 1;
                System.out.println(n);
            }
            return hailstone(n);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Assignment_2 test = new Assignment_2();

        //Question 1 TEST
        System.out.println("---QUESTION 1---");
        int digitalSum = test.digitalSum(333);
        System.out.println("Digital sum of 333 is " + digitalSum);
        System.out.println("");

        //Question 2 TEST
        System.out.println("---QUESTION 2---");
        int digitalRoot = test.digitalRoot(4678);
        System.out.println("Digital Root of 4678 is " + digitalRoot);
        System.out.println("");

        //Question 3 TEST
        System.out.println("---QUESTION 3---");
        int triangle = test.triangle(3);
        System.out.println("The total blocks in 3 rows is " + triangle);
        System.out.println("");

        //Question 4 TEST
        System.out.println("---QUESTION 4---");
        System.out.println("Hailstone 12: ");
        int hailstone = test.hailstone(12);      
        System.out.println("");
        
    }
}
