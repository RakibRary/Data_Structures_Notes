package CHAPTER_2;

import java.util.Scanner;

public class Main {
    //2 RECURSION & BACKTRACKING

    //Format
    //if(test for some base case){
    //return some base case value
    //else if (test for another base case)
    //return some other base case
    //the recursive case
    //else
    //return(some work and then a recursive call)

    //2.5 Recursion & Memory

    //2.6 Recursion vs iteration
    //Recursion
    //~ Terminates when a base case is reached
    //~Each recursive call requires extra space on the stack frame(memory)
    //~if we get infinite recursion, the program may run out of memory
    //~solutions to some problems are easier to formulate recursively
    //Iteration
    //~Terminates when a condition is proven to be false
    //~Each iteration does not require extra space
    //~An infinite loop could loop forever since there is no extra memory being created
    //~iterative solutions to a problem may not always be as obvious as a recursive solution

    //2.7 NOTES ON RECURSION
    //~recursive algoreithms  have two types(recursive case & base case)
    //~every recursive function case must terminate at a base case
    //~generally, iterative solutions are more efficient than recursive solutions[due to the overhead of function calls]
    //~recursive algorithm can be implemented without a recursive call(stack) more trouble
    //~any problem than be solved recursively can be solved iteratively
    //~Some problems are best solved recursively while other not


    public static int fact(int n) {
        int FACTORIAL = 0;
        if (n == 1) return 1;
        else if (n == 0) return 1;
        else
            FACTORIAL = n * fact(n - 1);
        System.out.println(n + " " +FACTORIAL);
        return FACTORIAL;
    }

    public static void main(String[] args) {
        System.out.println("Please enter inout for factorial: ");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println(fact(userInput));

    }







}
