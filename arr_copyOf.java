import java.util.Arrays;
public class arr_copyOf{
    public static void main(String[] args){
        int a[]= {1,2,3,4,5};
        int b[] = new int[5];
        //System.arraycopy(a,0,b,0,5);


        //b = Arrays.copyOf(a,3);
        b=a.clone();
        System.out.println(Arrays.toString(b));
        for (int i =0; i<b.length;i++){
            System.out.println(b[i]);}
    }
}