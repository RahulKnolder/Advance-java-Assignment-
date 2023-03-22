package advance_concepts_assignments.assignment_1;

import java.time.LocalDateTime;

public class Dish {
    private int dishID;
    private String dishName;
    private LocalDateTime creationTime;


    //consructor of Dish class
    public Dish(int dishID, String dishName) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.creationTime = LocalDateTime.now();
    }

    //getteer methods
    public int getDishID() {
        return dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    @Override
    public String toString() {
        return "Dish ID: " + dishID + "\n" +
                       "Dish Name: " + dishName + "\n" +
                       "Creation Time: " + creationTime;
    }
}