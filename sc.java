import java.util.Scanner;

class sc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        String name = s.nextLine();
        int age = s.nextInt();
        long phoneno = s.nextLong();
        s.nextLine();
        String rollno = s.nextLine();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone number: " + phoneno);
        System.out.println("Roll number: " + rollno);

    }
}