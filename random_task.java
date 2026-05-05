import java.util.Random;

class random_task {
    public static void main(String[] args) {
        String[] customers = {"Arun", "Bala", "Cathy", "Divya", "Eshan"};
        Random r = new Random();
        int index = r.nextInt(customers.length);
        String winner = customers[index];
        System.out.println("Winner is: " + winner);
    }
}