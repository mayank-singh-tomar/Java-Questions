public class MaxInteger {
    public int maxInteger(int val1, int val2){
        int maxx=val1;
        if(val2>maxx){
            maxx=val2;
        }
        return maxx;
    }
    public static void main(String[] args) {
        MaxInteger ob = new MaxInteger();
        int result=ob.maxInteger(3,-9);     
        System.out.println(result);
    }
    
}
