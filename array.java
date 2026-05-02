public class array {
    public static void main(String[] args) {

        
        int arr[] = new int[5];
        System.out.println("Array created with size 5");

       
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.print("Elements added: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        
        System.out.println("\nTraversing the array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

       
        System.out.println("\nModifying elements...");
        arr[3] = 100;
        arr[2] = 200;
        arr[4] = 300;

      
        System.out.print("Final array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}