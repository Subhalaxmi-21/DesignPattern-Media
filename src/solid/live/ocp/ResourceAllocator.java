package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;

    public int allocate(Slots resourceType) {

        int resourceId;
        resourceId=resourceType.availableSlots();
        resourceType.markSlotBusy(resourceId);
//        switch (resourceType) {
//            case TIME_SLOT:
//                Timeslot time = new Timeslot();
//                resourceId = time.availableSlots();
//                time.markSlotBusy(resourceId);
//                break;
//            case SPACE_SLOT:
//                Spaceslot space = new Spaceslot();
//                resourceId = space.availableSlots();
//                space.markSlotBusy(resourceId);
//                break;
//            default:
//                System.out.println("ERROR: Attempted to allocate invalid resource");
//                resourceId = INVALID_RESOURCE_ID;
//                break;
//        }
//        return resourceId;
    }

    public void free(Slots resourceType, int resourceId) {

        resourceType.markSlotFree(resourceId);
//        switch (resourceType) {
//            case TIME_SLOT:
//                Timeslot time = new Timeslot();
//                time.markSlotFree(resourceId);
//                break;
//            case SPACE_SLOT:
//                Spaceslot space = new Spaceslot();
//                space.markSlotFree(resourceId);
//                break;
//
//            default:
//                System.out.println("ERROR: attempted to free invalid resource");
//                break;
//        }
    }
}


