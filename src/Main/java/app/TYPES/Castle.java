package app.TYPES;

import app.DTO.User;

public class Castle extends Type {
    int productionRate = 5;
    int cost = 20;
    User user;
    String color = "Orange";
    String name = "CASTLE";

    public Castle() {
        super.productionRate = productionRate;
        super.name = name;
        super.cost = cost;
        super.color = color;
    }
}
