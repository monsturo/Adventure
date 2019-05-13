package Locations;

import Creatures.Hero;

public interface Location {


    public String entryMessage();

    public Location options();

    public void setHero(Hero hero);
}
