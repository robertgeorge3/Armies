package app.TYPES;

import app.DTO.User;
import app.TYPES.Type;

public class Wall extends Type {
    int productionRate = 0;
    int cost = 2;
    User user;
    String name = "WALL";
    String color = "brown";

    public Wall() {
        super.productionRate = productionRate;
        super.name = name;
        super.cost = cost;
        super.color = color;

    }
}
