package Locations;

import Creatures.Animals.Wolf;
import Creatures.Hero;
import Locations.Practical.Fight;
import Locations.Practical.StatPage;

import java.util.Scanner;

public class Menu implements Location {
    private Location location;
    private Hero hero;
    public void setLoc(Location loc) {
        location = loc;
    }
    @Override
    public String entryMessage() {
        return "What would you like to check?";
    }

    @Override
    public Location options() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Options: \n 1: Stats \n 2: Skills \n 3: Inventory\n 4: Quests\n 5: Return\n");
        int i = scanner.nextInt();
        if (i == 1){
            StatPage statPage = new StatPage();
            statPage.setHero(hero);
            statPage.setLocation(location);
            return statPage;
        } else if (i == 2) {

        }else if (i == 3) {

        }else if (i == 4) {

        }else if (i == 5) {
            return new Fight(new Wolf());
        }
        return null;    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
