package Locations.Practical;

import Creatures.Hero;
import Locations.Location;

public class StatPage implements Location {
    Location location;
    Hero hero;
    @Override
    public String entryMessage() {
        return "List of stats";
    }

    @Override
    public Location options() {
        String print = " Name: " + hero.getName() + "\n Class: " + hero.getClasses().name() + "\n";
        print += " Level: " + hero.getLvl() + "\n EXP: " + hero.getExp() + "/" + hero.getLvl()*100;
        print += "\n HP: " + hero.getHp() + "\n Str: " + hero.getStr() + "\n Spd: " + hero.getSpd();
        print += "\n Int: " + hero.getInti() + "\n Con: " + hero.getCon() + "\n Spd: " + hero.getSpd();
        System.out.println(print);
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
