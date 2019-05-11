import Creatures.Animals.Wolf;
import Creatures.Hero;
import Equipment.Armor.Armor;
import Equipment.Main_Hand.ShortSword;
import Locations.Fight;
import Locations.Location;
import Locations.Village;
import Mechanics.Combat;

import java.util.Scanner;

public class Game {
    private static Hero mc;
    private static Combat combat = new Combat();
    private static Location location = new Village();
    private static Location newLocation;
    public static void main(String[] args) {
        createCharacter();
        System.out.print(location.entryMessage());
        while (true){
            newLocation = location.options();
            if (newLocation instanceof Fight){
                combat.soloFight(mc, ((Fight) newLocation).getCreature());
            } else {
                location = newLocation;
            }
        }
    }

    private static void createCharacter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select class: \n 1: Bandit \n 2: Soldier \n 3: Warrior \n 4: Paladin\n" +
                " 5: Cleric \n 6: Mage \n 7: Druid \n 8: Ranger");
        int clas = scanner.nextInt();
        if (clas == 1) {
            mc = new Hero(Hero.Classes.BANDIT);
            mc.setMainHand(new ShortSword());
            mc.setArmor(Armor.Armors.REINFORCED_LEATHER);
        } else if (clas == 2) {
            mc = new Hero(Hero.Classes.SOLDIER);
        } else if (clas == 3) {
            mc = new Hero(Hero.Classes.WARRIOR);
        } else if (clas == 4) {
            mc = new Hero(Hero.Classes.PALADIN);
        } else if (clas == 5) {
            mc = new Hero(Hero.Classes.CLERIC);
        } else if (clas == 6) {
            mc = new Hero(Hero.Classes.MAGE);
        } else if (clas == 7) {
            mc = new Hero(Hero.Classes.DRUID);
        } else  {
            mc = new Hero(Hero.Classes.RANGER);
        }

        System.out.println("What is your name?\n");
        mc.setName(scanner.next());
    }
}
