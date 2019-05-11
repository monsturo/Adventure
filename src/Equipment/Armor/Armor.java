package Equipment.Armor;

import Equipment.Item;

public abstract class Armor implements Item {
    public enum Armors implements Item {
        UNARMORED(0,1,false),
        LEATHER(1,1,false),
        REINFORCED_LEATHER(2, 1, false),
        CHAIN(3, 0.95, false),
        SCALE(4, 0.9, true),
        PLATE(5, 0.85, true),
        FULL_PLATE(7, 0.75, true);
        private int def;
        private double weight;
        private boolean heavyArmor;

        Armors(int d, double w, boolean h) {
            def = d;
            weight = w;
            heavyArmor = h;
        }

        public int getDef() {
            return def;
        }

        public double getWeight() {
            return weight;
        }

        public boolean isHeavyArmor() {
            return heavyArmor;
        }
    }
    private int def;
    private double weight;
    private boolean heavyArmor;

    public Armor(int d, double w, boolean h) {
        def = d;
        weight = w;
        heavyArmor = h;
    }

    public int getDef() {
        return def;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isHeavyArmor() {
        return heavyArmor;
    }
}
