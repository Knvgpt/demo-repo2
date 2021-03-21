package Q1;
import java.util.Scanner;
import java.util.Arrays;
public class Number {
    private double[] arr;
    Number (double[] a){
        arr = a;
    }
    public double getMax(){
        double max = arr[0];
        for(double a : arr){
            if (a>max) max = a;
        }
        return max;
    }
    public double getMin(){
        double min = arr[0];
        for(double a : arr){
            if (a<min) min = a;
        }
        return min;
    }
    public double getAverage(){
      double avg;
      double sum=0;
      for(int c = 0; c<arr.length;c++){
        sum +=arr[c];
      }
      avg = sum/arr.length;
      return avg;
    }
    public void printArray(){
      System.out.printf("\nPrinting the Array %n");
      for (int c = 0;c<arr.length;c++){
        System.out.printf("arr[%d] = %.2f%n%n",c,arr[c]);
      }
    }









}
