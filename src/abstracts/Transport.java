package abstracts;

import subjects.Hero;
import subjects.Point;

import java.util.ArrayList;

public abstract class Transport implements CanChangeLocation {
    private String name;
    private Point point;
    private Location location;
    private ArrayList<Hero> passengers;
    public Transport(String name, Point point, Location location, Hero ... heroes) {
        this.name = name;
        this.point = point;
        this.location = location;
        this.joinToStory();
        System.out.println("Transport - " + name + " is situated in location " + this.location.getLocationName());
        this.passengers = new ArrayList<>(heroes.length);
        this.addPassenger(heroes);
    }
    public String getName() {
        return name;
    }
    private void joinToStory() {
        System.out.println("Transport " + name + " join to story");
    }
    public void addPassenger(Hero hero) {
        this.passengers.add(hero);
    }
    public void addPassenger(Hero ... heroes) {
        for (Hero hero: heroes) {
            this.passengers.add(hero);
            System.out.println(hero.getName() + " is situated in the Transport " + this.name);
        }
    }
    public void subPassenger(Hero hero) {
        for (Hero passenger: passengers) {
            if (passenger.getName().equals(hero.getName())) {
                passengers.remove(passenger);
                System.out.println(passenger.getName() + " exit transport " + name);
                break;
            }
        }
    }
    public void showPassengerList() {
        for (Hero passenger: passengers) {
            System.out.print(passenger.getName() + " ");
        }
    }
    @Override
    public void setLocation(Location location) {
        this.location = location;
    }
}
