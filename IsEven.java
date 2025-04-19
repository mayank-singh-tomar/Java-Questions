public class IsEven{
    public boolean isEven(int val){    //It is not a constructor,constructor name should be same as class name
        if(val%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        IsEven ob = new IsEven();
        boolean result=ob.isEven(-4);        //Put value here to check 
        System.out.println(result);
    }
}