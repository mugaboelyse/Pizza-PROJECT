/*
 * Name: Elyse Uwiringiye
 * Reg Number: 20046/2022
 * Class: Test 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        List<Pizza> orderedPizzas = new ArrayList<>();
 
        Pizza randomPizza = new Pizza();
        System.out.println("Randomly Generated Pizza: " + randomPizza);
        orderedPizzas.add(randomPizza);  
        System.out.print("Enter the number of pizzas to order: ");
        int n = scanner.nextInt();
 
        for (int i = 0; i < n; i++) {
            try {
                System.out.println("\nOrdering Pizza " + (i + 1));
                System.out.print("Enter number of slices: ");
                int slices = scanner.nextInt();

                System.out.print("Choose a meat (CHICKEN, BEEF, PEPPERONI): ");
                MeatChoice meatChoice = MeatChoice.valueOf(scanner.next().toUpperCase());

                System.out.print("Choose a vegetable (ONIONS, PEPPERS, OLIVES, MUSHROOMS, SPINACH): ");
                VegChoice vegChoice = VegChoice.valueOf(scanner.next().toUpperCase());
 
                Pizza customPizza = new Pizza(slices, meatChoice, vegChoice);
                orderedPizzas.add(customPizza);
                System.out.println("Custom Pizza: " + customPizza);

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close(); 
        System.out.println("\nAll Ordered Pizzas:");
        for (int i = 0; i < orderedPizzas.size(); i++) {
            System.out.println("Pizza " + (i + 1) + ": " + orderedPizzas.get(i));
        }
    }
}
