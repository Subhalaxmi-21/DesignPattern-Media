    package solid.live.ocp;

    public interface Slots {
        public int availableSlots();
        public void markSlotBusy(int resource );

        public void markSlotFree(int resource);
    }
