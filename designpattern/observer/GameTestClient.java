package net.media.training.designpattern.observer;

import java.util.ArrayList;

public class GameTestClient {
    public Person person;
    public Sun sun;
    public Dog dog;
    public Cat cat;
    public Robot robot;
    public Game game;
    private ArrayList<Entity> observer = new ArrayList<Entity>();

    public void setup() {
        person = new Person();
        dog = new Dog();
        cat = new Cat();
        robot = new Robot();
        observer.add(robot);
        observer.add(dog);
        observer.add(person);
        observer.add(cat);
        sun = new Sun(robot, person, dog, cat);
        game = new Game(sun);
    }

    public void everyoneGoesOut() {
        for(Entity element: observer){
            element.goOutdoors();
        }
    }

    public void everyoneOutdoorsComesIn() {
        for(Entity element: observer){
            if(element.isOutdoors())
                element.goIndoors();
        }
    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {
        for(Entity element: observer){
            if (element.isOutdoors() && !element.isFeelingWarm())
                return false;
            if (!element.isOutdoors() && element.isFeelingWarm())
                return false;

        }

        return true;
    }

    public boolean allFeelCold() {
        boolean isFeelingWarm = false;
        for (Entity element : observer) {
            isFeelingWarm =!isFeelingWarm && !element.isFeelingWarm();
        }
        return isFeelingWarm;
    }
}