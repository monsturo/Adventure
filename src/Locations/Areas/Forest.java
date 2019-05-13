package Locations.Areas;

import Creatures.Animals.Wolf;
import Creatures.Hero;
import Locations.Location;
import Locations.Menu;
import Locations.Practical.Fight;

import java.util.Scanner;

public class Forest implements Location {
    private Hero hero;
    @Override
    public String entryMessage() {
        return "You stand in the forest, what will you do?";
    }

    @Override
    public Location options() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Places to go: \n 1: Village \n 2: Forest Cave \n 3: Forest Lake\n 4: Forest Tower \n 5: Fight in forest\n 0: Menu\n");
        int i = scanner.nextInt();
        if (i == 1){

        } else if (i == 2) {

        }else if (i == 3) {

        }else if (i == 4) {

        }else if (i == 5) {
            return new Fight(new Wolf());
        } else {
            Menu menu = new Menu();
            menu.setHero(hero);
            menu.setLoc(this);
            return menu;
        }
        return null;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
