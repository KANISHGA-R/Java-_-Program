import java.util.Scanner;
public class untilzero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        todolist t = new todolist();
        int total=0;

        while (true){
        System.out.println("Name of the item: ");
        String name = sc.nextLine();

        System.out.println("Price of the item: ");
        int price = sc.nextInt();
        sc.nextLine();

        if(price ==0) {
            System.out.println("Stopped");
            break;}
        total = total+price;
        t.todo(name,price); 
        
        }
        System.out.println("Total: " + total);
    }
}
class todolist{
    void todo(String name,int price){
        if(name.isBlank()){
            System.out.println("invalid item");
            return;
    
        }
        else{
       
            System.out.println("Item: " + name);
            System.out.println("Price: " + price);
        }
    }
    
}
        
        