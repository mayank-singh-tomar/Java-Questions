public class IsLeapYear {
    public boolean isLeapYear(int year){
        if(year%400==0){
            return true;
        }
        if(year%100==0){
            return false;
        }
        if(year%4==0){
            return true;
        }

    return false;
    }
    public static void main(String[] args) {
        IsLeapYear ob = new IsLeapYear();
        System.out.println(ob.isLeapYear(2100));

    }
    
}
