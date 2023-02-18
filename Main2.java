//Name: Shivangi Singh
//AIML-B1
//21070126085


//importing scanner and i/o packages
import java.util.Scanner;
import java.io.*;

public class Main3
{
    //arrays to store input no and result
    static double[] numbers;
    static double[] result;
    static double[] result2;
    public static void main(String args[])
    {
        //object of two different files
        UserInput input=new UserInput();
        Calculator calculator=new Calculator();
        
        Scanner sn=new Scanner(System.in);
        // asking the user for operator
        System.out.println("enter operator for operation");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("* for multiplication");
        //storing the operator entered by the user
        char operator = sn.next().charAt(0);
        
        //switch case to perform operations based on the input given by the user.
        // in each case we take two no perform the given operation and print the result.
        switch(operator)
        
        {
            case '+':
                numbers=input.insertNo();
                result=calculator.performAdditionOperation(numbers);
                System.out.print("Value is" + result[0]);
                break;
            case '-':
                numbers=input.insertNo();
                result=calculator.performSubstractionOperation(numbers);
                System.out.print("Value is" + result[0]);
                break;
            case '/':
                numbers=input.insertNo();
                result=calculator.performDivisionOperation(numbers);
                System.out.print("Value is"+result[0]);
                break;
            case '*':
                numbers=input.insertNo();
                result=calculator.performMultiplicationOperation(numbers);
                System.out.print("Value is"+result[0]);
                break;
            case '!':
                try{
                    
                
                numbers=input.inputMultiplenumbers();
                result=calculator.performArrayOperation(numbers);
                System.out.print("Sum of array"+result[0]);
                System.out.print("Standard deviation is"+result[1]);
                System.out.print("variance is"+result[2]);
            }
            catch(IOException e)
            {
                System.out.println("array empty");
                
            }
                break;
            }
    }
}