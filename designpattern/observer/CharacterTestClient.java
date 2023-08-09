package net.media.training.designpattern.observer;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 12:26:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class CharacterTestClient{
    private ArrayList<Entity> observer = new ArrayList<Entity>();
    private Cat cat;
    private Person person;
    private Dog dog;
    private Robot robot;

    public CharacterTestClient() {
        observer.add(new Robot());
        observer.add(new Dog());
        observer.add(new Person());
        observer.add(new Cat());

    }

    public boolean testOutdoors() {
        boolean isOutdoor=true;
        for(Entity element: observer){
            element.goOutdoors();
            isOutdoor = isOutdoor && element.isOutdoors();
        }
        return isOutdoor;
    }

    public boolean testSunRose() {
        boolean isFeelingWarm=true;
        for(Entity element: observer){
            element.notifySunRose();
            isFeelingWarm = isFeelingWarm && element.isFeelingWarm();
        }
        return isFeelingWarm;
}

    public boolean testSunSet() {

        boolean isFeelingWarm=false;
        for(Entity element: observer){
            element.notifySunSet();
            isFeelingWarm = !isFeelingWarm && !element.isFeelingWarm();
        }
        return isFeelingWarm;


         }

    public boolean testIndoors() {
        boolean isOutdoors=false;
        for(Entity element: observer){
            element.goIndoors();
            isOutdoors = !isOutdoors && !element.isOutdoors();
        }
        return isOutdoors;

         }
}
