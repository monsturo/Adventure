package Locations.Areas;

import Creatures.Hero;
import Locations.Location;

import java.util.Scanner;

public class Village implements Location {
    private Hero hero;
    public Village(){}

    @Override
    public String entryMessage() {
        return "You stand in your home village, feeling up for adventure. Where do you go? \n";
    }

    @Override
    public Location options() {
        Location location = null;
        System.out.print("Places to go:\n 1: Roads\n 2: Cave\n 3: Forest\n");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1){
            return null;
        } else if (i == 2) {
            return null;
        } else {
            Forest forest = new Forest();
            forest.setHero(hero);
            return forest;
        }

    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
