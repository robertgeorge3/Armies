package app.TYPES;

import app.DTO.User;

public class Land extends Type {
    int productionRate = 1;
    int cost = 0;
    User user;

    String color = "beige";
    String name = "LAND";

    public Land() {
        super.productionRate = productionRate;
        super.name = name;
        super.cost = cost;
        super.color = color;
    }
}
