package advance_concepts_assignments.assignment_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Dish> menuList = Menu.getMenuList();

        while (true) {
            System.out.println("Press 1 to display Dishes.");
            System.out.println("Press 2 to search Dish.");
            System.out.println("Press 0 to exit.");



            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank you for visiting!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Menu:");

                    for (Dish dish : menuList) {
                        System.out.println(dish.getDishName());
                    }

                    break;
                case 2:
                    System.out.println("Enter the id of the dish:");

                    Integer dishID = scanner.nextInt();
                    boolean dishFound = false;

                    for (Dish dish : menuList) {
                        if (dish.getDishID() == dishID) {
                            System.out.println("Dish Found:");
                            System.out.println(dish.toString());
                            dishFound = true;
                            break;
                        }
                    }

                    if (!dishFound) {
                        System.out.println("Dish not found.");
                    }

                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
