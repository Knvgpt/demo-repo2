package Q2;
import java.util.*;
import Lab6Q.*;
import java.io.*;
public class DemoFileByKanav {
    public static PolarComplexNum[]  returnPolarForm(RecComplexNum[] recArray){
      PolarComplexNum[] polarArray = new PolarComplexNum[3];
      for (int c = 0;c<polarArray.length;c++) {
        polarArray[c] = recArray[c].getPolarFromRec();
      }
      return polarArray;
    }
    public static void main(String[] args) throws IOException {
      Scanner in = new Scanner(System.in);
      MyMethod.printHeader(7,2);
      RecComplexNum[] recArr = new RecComplexNum[3];
      PolarComplexNum[] polarArr;
      double[] reAndIm = new double[6];
      int count = 0;
      for (int c=0; c<6;c+=2){
        for (int i = c; i < c+1; i++ ) {
        System.out.printf("Enter real part for RecArr[%d]:  ",count);
        reAndIm[i] = in.nextDouble();
        System.out.printf("Enter imaginary part for RecArr[%d]:  ",count);
        reAndIm[i+1] = in.nextDouble();
        recArr[count] = new RecComplexNum(reAndIm[i],reAndIm[i+1]);
        count++;
        }
      }
      System.out.println("\nArray of Rectangular Complex numbers is:");
      for (int c = 0;c<recArr.length;c++){
        System.out.printf("recArr[%d]:",c);
        recArr[c].displayRecForm();
      }
      polarArr = returnPolarForm(recArr);
      System.out.println("\nCorresponding Array of Polar Complex numbers is:");
      for(int c = 0;c<polarArr.length;c++){
        System.out.printf("polarArr[%d]:",c);
        polarArr[c].displayPolarForm();
      }
    PrintWriter writer = new PrintWriter(new FileWriter("/Users/kanavgupta/desktop/DataFileKanav.txt", true));
  //PrintWriter writer =  new PrintWriter(new File("/Users/kanavgupta/desktop/DataFileKanav.txt"));
    writer.write("yoyoyo");





      MyMethod.printFooter("Goodbye from Kanav Gupta");
    }
}
