package Locations;

import Creatures.Creature;

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

    public Creature getCreature() {
        return creature;
    }
}
