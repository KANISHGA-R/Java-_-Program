import java.util.Scanner;
public class length1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if(text.length() < 5 ){
            System.out.println("Short");
        }
        else{
            System.out.println("Long");
        }
    }
}