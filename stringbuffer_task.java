import java.util.*;
class stringbuffer_task{
    public static void main(String[] args){
        StringBuffer s = new StringBuffer("Order Placed");
        s.append("-> Packed");
        s.append("-> Slipped");
        s.append("-> Delivered");
        System.out.println(s);
    }
}