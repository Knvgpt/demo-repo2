package Q1;
import Lab6Q.*;
import java.util.*;
public class DemoNumberByKanav {

    public static void populateArray(double[] ar){
        Scanner in = new Scanner(System.in);
      for (int c =0;c<ar.length;c++){
        System.out.printf("Enter value for arr[%d]: ",c);
          ar[c] = in.nextDouble();
      }
    }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      MyMethod.printHeader(7,1);
      System.out.println("Enter the size of the array");
      int size = in.nextInt();
      double[] arr = new double [size];
      populateArray(arr);
      Number num1 = new Number(arr);
      num1.printArray();
      System.out.printf("Maximum value in array = %.2f%n",num1.getMax());
      System.out.printf("Minimum value in array = %.2f%n",num1.getMin());
      System.out.printf("Average of values in array = %.2f%n%n",num1.getAverage());
      MyMethod.printFooter("Goodbye from Kanav");
    }
}
