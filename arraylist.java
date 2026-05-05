import java.util.ArrayList;
import java.util.Collections;
class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(8);
        arr.add(2);
        System.out.println(arr);
        arr.set(2,10);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        System.out.println(arr.contains(8));
        System.out.println(arr.get(0));
        
        System.out.println(arr.indexOf(1));
        Collections.sort(arr);
        System.out.println(arr);

    }
}