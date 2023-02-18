
//importing scanner and i/o packages
import java.util.Scanner;
import java.io.*;
public class UserInput 
{
    Scanner sn=new Scanner(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //array to store 2 input numbers for operators
    double [] numbers=new double[2];
    
   
    

    public double[] insertNo()
    {
        //asking user for 2 input no and storing them in no array.
        System.out.println("Enter first number");
        numbers[0]=sn.nextDouble();
        
        System.out.println("Enter second number");
        numbers[1]=sn.nextDouble();
        return numbers;
    }
    public double[] inputMultiplenumbers() throws IOException
    {
        // input and store no of array elements
        System.out.print("enter size");
        int n=sn.nextInt();
        //input array elements
        double array[]=new double[n];
        String str =br.readLine();
        String[] array_numbers=str.trim().split("\\s+");
        // storing array elements
        for(int i=0;i<n;i++)
        {
            array[i]=Double.parseDouble(array_numbers[i]);
        }
        return array;
    }
}