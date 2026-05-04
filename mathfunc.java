import java.util.*;
class mathfunc{
    public static void main(String[] args){
        float n = 3.7f;
        System.out.println(Math.round(n)); // round func
        float n = 3.7f;
        System.out.println(Math.ceil(n)); // ceil func (round up)
        float n = 4.9f;
        System.out.println(Math.floor(n));  // floor func (round down)
        int n = 5;
        System.out.println(Math.abs(n));   // absolute
        int a = 45;
        int b=79;
        System.out.println(Math.max(a,b));   
        int c= 67;
        int d = 43;
        int e = 66;
        System.out.println(Math.min(c,Math.min(d,e)));   // Min using nested .. beacuse we comapare 3 values
        int a = 7;
        int b = 9;
        System.out.println(Math.pow(a,b)); 
        int g = 81;
        System.out.println(Math.sqrt(g));
        int f = 27;
        System.out.println(Math.cbrt(f));
        double n = 55;
        double angle = Math.toRadians(n);
       //Sine
       System.out.println(Math.sin(angle));
       // cos
       System.out.println(Math.cos(angle));
       //tan 
       System.out.println(Math.tan(angle));
    }

}