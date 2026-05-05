import java.util.Scanner;
public class startswith{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        if(text.startsWith("Java")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}