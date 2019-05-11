package Equipment.Accessory;

import Equipment.Item;

public abstract class Accessory implements Item {
    private int def, weight;

    public Accessory(int def, int weight){
        this.def = def;
        this.weight = weight;
    }

    public int getDef() {
        return def;
    }

    public int getWeight() {
        return weight;
    }
}
