import java.util.*;
class login{
    public static void main(String[] args){
    String username = "kanishka";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the username: ");
    String a = sc.nextLine();
    sample o = new sample();
    if (a.equals(username) ){
        System.out.println("Enter your password: ");
        int b = sc.nextInt();
        if (b==o.getPassword()){
            System.out.println("Password verified successfully");
        }
        else{
            System.out.println("Invalid password");
        }
    }
    else{
        System.out.println("Enter valid username");
    }
    
    }
}
class sample{
  
    int password = 12345;

    int getPassword(){
        return password;
    }
}