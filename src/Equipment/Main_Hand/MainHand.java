package Equipment.Main_Hand;

import Equipment.Item;

public abstract class MainHand implements Item {
    private int att, weight;

    public MainHand(int a, int w) {
        att = a;
        weight = w;
    }

    public int getAtt() {
        return att;
    }

    public int getWeight() {
        return weight;
    }
}
