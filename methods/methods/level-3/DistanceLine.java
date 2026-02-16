import java.util.*;

public class DistanceLine {

    public static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }

    public static double[] line(int x1,int y1,int x2,int y2){
        double m=(double)(y2-y1)/(x2-x1);
        double b=y1-m*x1;
        return new double[]{m,b};
    }

    public static void main(String[] args){
        double[] eq=line(1,2,3,4);
        System.out.println("Slope:"+eq[0]+" Intercept:"+eq[1]);
    }
}