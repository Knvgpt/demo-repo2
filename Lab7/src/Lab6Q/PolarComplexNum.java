package Lab6Q;
// PolarComplexNum class
public class PolarComplexNum {
    private double magnitude,angle;
    public double getMagnitude(){
      return magnitude;
    }
    public double getAngle(){
      return angle;
    }
    public PolarComplexNum (){ // default constructor assigns 0.
        magnitude=0;
        angle=0;
    }
    public PolarComplexNum(double mangitude,double angle){  // constructor gets the arguments and assigns them
        this.magnitude = mangitude;
        this.angle = angle;
    }
    public RecComplexNum getRecFromPolar(){  // method that converts polar to rec and return an an object of the class RecComplexNum
       double a = this.magnitude*MyMethod.myCos(Math.toRadians(this.angle));
       double b = this.magnitude*MyMethod.mySin(Math.toRadians(this.angle));
       System.out.println(a+" "+b);
       RecComplexNum num2 = new RecComplexNum(a,b);
       return num2;
    }
    public void displayPolarForm(){  // displays in the Polar form
        System.out.printf(" Magnitude: %.2f, Angle: %.2f degrees.%n",this.magnitude,this.angle);// print the result.

    }
}
