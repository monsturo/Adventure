package Equipment.Off_Hand;

import Equipment.Item;

public abstract class OffHand implements Item {
    private int def, weight;

    public OffHand(int d, int w) {
        def = d;
        weight = w;
    }

    public int getDef() {
        return def;
    }

    public int getWeight() {
        return weight;
    }
}
