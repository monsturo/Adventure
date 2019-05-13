package Creatures;

import java.util.Scanner;

public class Hero extends Creature {
    private Classes classes;

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public enum Classes {
        BANDIT(4, 3, 2, 7), SOLDIER(4, 5, 2, 5),
        WARRIOR(6, 4, 2, 4), PALADIN(4, 4, 4, 4),
        CLERIC(3, 4, 5, 3), MAGE(2, 2, 8, 4),
        DRUID(2, 3, 7, 4), RANGER(4, 4, 3, 5);

        private final int str, inti, con, spd;

        Classes(int s, int c, int in, int sp) {
            str = s;
            inti = in;
            con = c;
            spd = sp;
        }
    }

    public Hero(Classes classes) {
        super(classes.str, classes.con, classes.inti, classes.spd);
        this.classes = classes;
        setExp(0);
        setLvl(1);
    }


}
