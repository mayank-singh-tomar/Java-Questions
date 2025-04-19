public class Division {
    public double divide(double a, double b){
        if(b==0){
            System.out.println("Can't divide by Zero");
            return Double.NaN;
        }
        else{
            return a/b;
        }
    }
    public static void main(String[] args) {
        Division ob = new Division();
        System.out.println(ob.divide(6.8,0));

    }
    
}
