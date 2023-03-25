package memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    int money;
    ArrayList fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        return (List) fruits.clone();
    }

}
