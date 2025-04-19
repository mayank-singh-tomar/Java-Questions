public class SlopeIntercept {
    public double slope(double x1, double y1, double x2, double y2){
        double m= (y2-y1)/(x2-x1);
        double c=  y1-m*x1;

        System.out.println(c);
        return m;
    }
   
    public static void main(String[] args) {
        SlopeIntercept ob = new SlopeIntercept();
        System.out.println(ob.slope(7,2,9,6));
    }
}
