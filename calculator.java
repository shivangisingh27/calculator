import java.lang.Math.*;
import java.util.*;
public class Calculator
{
    double [] result= new double[1];
 
    public double[] performAdditionOperation(double[] numbers)
    {
        result[0]=numbers[0]+numbers[1]; //adding 2 elements of number array
        return result;
    }
    public double [] performSubstractionOperation(double[] numbers)
    {
        result[0]=numbers[0]-numbers[1];//subtracting 2 elements of number array
        return result;
        
    }
    public double[] performDivisionOperation(double[] numbers)
    {
        result[0]=numbers[0]/numbers[1];//dividing 2 elements of number array
        return result;
    }
    public double[] performMultiplicationOperation(double[] numbers)
    {
        result[0]=numbers[0]*numbers[1];//multiplying 2 elements of number array
        return result;
    } 
    public double[] performArrayOperation(double[] multiplenumbers)
    {
        double[]result=new double[4];
        double sum=0;
        double std=0.0;
        double summ=0.0;
        for(int i=0;i<multiplenumbers.length;i++)
        {
            //adding all elements of number array
            sum+=multiplenumbers[i];
        }
        result[0]=sum;
        //calculating standard deviation
        double mean=sum/multiplenumbers.length;
        for(int i=0;i<multiplenumbers.length;i++)
        {
            summ=summ+Math.pow((multiplenumbers[i]-mean),2);
            std=Math.sqrt(summ/multiplenumbers.length);
            
        }
        result[1]=std;
        //calculating variance
        double variance = Math.pow(std,2);
        result[2]=variance;
        return result;
        
        
        
    }
}