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

    //--QUESTION 1--
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
            //take left digits and isolate right digit, add to previous right digit
            return digitalSum(left) + right;
        }
    }

    //--QUESTION 2--
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
    }
}
