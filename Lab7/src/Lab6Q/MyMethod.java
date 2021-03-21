package Lab6Q;
// this is My method class that calculate the sin, cos pow and has the printheader and printfooter methods inside it.
public class MyMethod {
    public static double myPow(double x, int y) { // function to calculate the pow | replaces the Math.pow(x,y)
        double powedValue = x;
        for (int i = 1; i < y; i++) {
            powedValue *= x;
        }
        return (powedValue);
    }
    public static double mySin(double x) { // function to calculate the sin | replaces the Math.sin(x)
        int n = 0;
        int N = 20;
        double y = 0;
        for (; n <= N; n++) {
            double p1 = 1;
            for (int i = 1; i <= n; i++) {
                p1 *= (-1);
            }
            double p2 = 1;
            for (int i = 1; i <= (2 * n + 1); i++){
                p2*=i;
            }
            double p3 = 1;
            for (int i = 1; i <= (2 * n + 1); i++){
                p3*=x;
            }
            y = y + (p1/p2)*p3;
        }
        return y;
    }
    public static double myCos(double x) { // function to calculate the cos | replaces the Math.cos(x)
        int n = 0;
        int N = 20;
        double y = 0;
        for (; n <= N; n++) {
            double p1 = 1;
            for (int i = 1; i <= n; i++) {
                p1 *= (-1);
            }
            double p2 = 1;
            for (int i = 1; i <= (2 * n); i++){
                p2*=i;
            }
            double p3 = 1;
            for (int i = 1; i <= (2 * n); i++){
                p3*=x;
            }
            y = y + (p1/p2)*p3;
        }
        return y;
    }
    //This function prints out the my name, the lab # and the question # in a nice border.
    public static void printHeader(int labNum, int quesNum){
        System.out.println("****************************************");
        System.out.println("\tKanav Gupta");
        System.out.printf("\tLab #%s Question #%s%n",labNum,quesNum);
        System.out.println("****************************************\n");
    }
    // this prints the custom good bye message.
    public static void printFooter(String anyValidName){
        System.out.println("\n*** " + anyValidName+ " ***");
    }
}
