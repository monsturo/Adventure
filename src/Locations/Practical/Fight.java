package Locations.Practical;

import Creatures.Creature;
import Creatures.Hero;
import Locations.Location;

public class Fight implements Location {
    public Creature creature;
    public Fight(Creature creature){
        this.creature = creature;
    }
    @Override
    public String entryMessage() {
        return "You are about to fight" + creature.getName() + "!\n";
    }

    @Override
    public Location options() {
        return null;
    }

    @Override
    public void setHero(Hero hero) {

    }

    public Creature getCreature() {
        return creature;
    }
}
