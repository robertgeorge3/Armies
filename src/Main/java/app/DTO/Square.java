package app.DTO;

import app.TYPES.Type;

public class Square {
    String name ="";
    int army = 0;
    Type type;

    public int getArmy() {
        return army;
    }

    public void setArmy(int army) {
        this.army = army;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Square(Type type, int num) {
        this.type = type;
        this.name = Integer.toString(num);
    }
}
