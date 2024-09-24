import java.util.Scanner;

public class StationaryShop {
  public static void main(String[] args) {
    // Initialize variables
    String[] products = {"Pens", "Pencils", "Notebooks", "Staplers", "Glue"};
    double[] prices = {5, 5, 50, 100, 15};
    int[] quantities = {100, 200, 50, 20, 30};
    double totalSales = 0.0;

    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Display menu
    System.out.println("Welcome to the Stationary Shop!");
    System.out.println("-------------------------------");
    for (int i = 0; i < products.length; i++) {
      System.out.println((i + 1) + ". " + products[i] + " - $" + prices[i]);
    }
    System.out.println("-------------------------------");

    // Loop until user chooses to exit
    while (true) {
      System.out.print("Enter the number of the product you'd like to purchase (or 0 to exit): ");
      int choice = scanner.nextInt();

      if (choice == 0) {
        break;
      } else if (choice > 0 && choice <= products.length) {
        System.out.print("Enter the quantity you'd like to purchase: ");
        int quantity = scanner.nextInt();

        if (quantity > 0 && quantity <= quantities[choice - 1]) {
          double subtotal = prices[choice - 1] * quantity;
          totalSales += subtotal;
          quantities[choice - 1] -= quantity;
          System.out.println("You purchased " + quantity + " " + products[choice - 1] + "(s) for $" + subtotal);
        } else {
          System.out.println("Sorry, we don't have enough stock.");
        }
      } else {
        System.out.println("Invalid choice. Please try again.");
      }
    }

    System.out.println("Thank you for shopping at the Stationary Shop!");
    System.out.println("Total sales: $" + totalSales);
  }
} 
