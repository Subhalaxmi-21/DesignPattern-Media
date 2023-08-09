package net.media.training.designpattern.observer;

public interface Entity {
    public boolean isFeelingWarm();

    public void goOutdoors();

    public void goIndoors();

    public boolean isOutdoors();

    public void notifySunRose();

    public void notifySunSet();

    public boolean isFeelingTired();
}


