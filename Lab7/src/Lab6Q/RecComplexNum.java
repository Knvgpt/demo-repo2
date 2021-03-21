package Lab6Q;
// RecComplexNum class
public class RecComplexNum {
    private double real,imaginary;
    public double getReal(){
      return real;
    }
    public double getImaginary(){
      return imaginary;
    }
    public RecComplexNum(){ // default constructor assigns 0.
        real =0;
        imaginary=0;
    }
    public RecComplexNum(double real,double imaginary){ // constructor gets the arguments and assigns them
        this.real = real;
        this.imaginary=imaginary;
    }
    public PolarComplexNum getPolarFromRec(){ // method that converts rec to polar and return an an object of the class PolarComplexNum
       double a = (Math.sqrt(MyMethod.myPow(this.real,2)+MyMethod.myPow(this.imaginary,2)));
       double b = (Math.toDegrees(Math.atan((this.imaginary/this.real))));
       PolarComplexNum num1 = new PolarComplexNum(a,b);
       return num1;

    }
    public void displayRecForm(){ //   displays in the Rec form
        if (this.imaginary<0) { // if statement to check the sign (+,-).
            //this changed the sign to positive, cause we need space between the negative and the number as per the output sample.
            Double tempNum = this.imaginary *(-1);
            System.out.printf(" %.2f - %.2fi%n",this.real, tempNum);// print the result.
        } else { // if the sign was positive then it would print it with a positive.
            System.out.printf(" %.2f + %.2fi%n",this.real, this.imaginary);// print the result.
        }
    }
}
