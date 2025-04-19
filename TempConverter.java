public class TempConverter {
    public boolean tempConvert(double C){          //temperature in celsius
        double F = (C * 1.8)+32;
        if(F>90){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        TempConverter ob =new TempConverter();
        boolean result = ob.tempConvert(90);         //Input is in celsius
        System.out.println(result);
    }
}
