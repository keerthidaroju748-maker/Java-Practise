import java.util.*;

class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] foodNames = {"Pizza", "Burger", "Pasta", "Coffee"," Veg Biryani"," Biryani"};
        int[] foodPrices = {150, 100, 120, 80,279,300};
        List<Integer> order = new ArrayList<>();

        while (true) {
            System.out.println("\n--- MENU ---");
            for (int i = 0; i < foodNames.length; i++) {
                System.out.println((i+1) + ". " + foodNames[i] + " - Rs." + foodPrices[i]);
            }
            System.out.println("7. Finish Order");
            System.out.print("Choose item number: ");
            int choice = sc.nextInt();
            if (choice == 7) break; 
            if (choice >= 1 && choice <= foodNames.length) {
                order.add(foodPrices[choice-1]);
                System.out.println(foodNames[choice-1] + " added to your order.");
            } else {
                System.out.println("Invalid choice!");
            }
        }
        int total = 0;
        for (int price : order) total += price;

        System.out.println("\nYour final bill Thank you And visit Again : Rs." + total );
        sc.close();
    }
}