public class PointOnQuadrant {
    public int pointOnQuadrant(double x, double y){
        if(x==0 && y==0){
            return 0;
        }
        else if(x>0 && y>0){
            return 1;
        }
        else if(x<0 && y>0){
            return 2;
        }
        else if(x<0 && y<0){
            return 3;
        }
        else if(x>0 && y<0){
            return 4;
        }
        else if(x>0 && y==0){
            return 41;
        }
        else if(x<0 && y==0){
            return 23;
        }
        else if(x==0 && y>0){
            return 12;
        }
        else {
            return 34;
        }
    }
    public static void main(String[] args) {
        PointOnQuadrant ob = new PointOnQuadrant();
        System.out.println(ob.pointOnQuadrant(-2, 0));

    }
    
}
