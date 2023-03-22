package advance_concepts_assignments.assignment_1;

import java.util.ArrayList;

public class Menu {
    private static ArrayList<Dish> menuList = new ArrayList<>();

    static {
        // Add some sample dishes to the menu list
        menuList.add(new Dish(1, "Razmana chawal"));
        menuList.add(new Dish(2, "Daal chawal"));
        menuList.add(new Dish(3, "Burger"));
        menuList.add(new Dish(4, "biryani"));
        menuList.add(new Dish(5, "sabzi chawal"));
    }

    public static ArrayList<Dish> getMenuList() {
        return menuList;
    }
}
