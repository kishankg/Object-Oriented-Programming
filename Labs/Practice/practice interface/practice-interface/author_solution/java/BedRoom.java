/**
 * This class simulates a bedroom.
 *
 * @author Shreyas Bhat
 */
public class BedRoom extends Room implements IOperatingCost {

    /**
     * Bed for the room.
     */
    private Bed bed;

    /**
     * To keep track whether the AC is on or not. True if AC is on else false.
     */
    private boolean acState;

    /**
     * To track whether the occupant is sleeping or not. True if occupant is asleep else false.
     */
    private boolean sleepState;

    /**
     * To keep track of the electricity bill for the bedroom.
     */
    private int electricityBill;


    /**
     * Initialize all fields of the class.
     * <ul>
     * <li>Set electricityBill as 0.</li>
     * <li>Set default values for sleepState and acState as false.</li>
     * </ul>
     *
     * @param roomLength Length of the bedroom.
     * @param roomWidth  Width of the bedroom.
     * @param roomHeight Height of the bedroom.
     * @param bed Bed in the bedroom.
     */
    public BedRoom(int roomLength, int roomWidth, int roomHeight, Bed bed) {
        super(roomLength, roomWidth, roomHeight);
        this.electricityBill = 0;
        this.sleepState = false;
        this.acState = false;
        this.bed = bed;
    }

    /**
     * Return the sleep state of the bedroom
     *
     * @return sleepState
     */
    public boolean getSleepState() {
        return sleepState;
    }
    
    /**
     * Return the ac state of the bedroom
     *
     * @return acState
     */
    public boolean getAcState() {
        return acState;
    }

    /**
     * Returns the cost of the room given by the cost of bed.
     * @return Cost of the bed in the bedroom. 
     */
    @Override
    public int maintenanceCost() {
        return this.bed.getCost();
    }

    /**
     * Returns the electricity bill for the room.
     * @return The electricity bill.
     */
    public int getBill() {
        return this.electricityBill;
    }
    
    /**
     * In a bed room, you can use the appliance "<b>AC</b>" and furniture "<b>Bed</b>". Using the AC will lead to increase in the electricity bill, while using the 
     * Bed will allow the occupant to sleep. <br>
     * Usage for this method is:
     * 1. For AC:
     * <ul>
     * <li> If the AC is off, turn it on and increment the electricity by 10 * volume of the room. </li>
     * <li> Otherwise if the AC was on, turn it off. </li>
     * </ul>
     * 2. For Bed:
     * <ul>
     * <li> If the occupant is awake, then make the occupant sleep.
     * <li> Otherwise if the occupant is already asleep, then wake up. 
     * </ul>
     * No other appliances / furnitures can be used in the bed room. 
     * @param name Name of the appliance / furniture.
     */
    @Override
    public void use(String name){
        if(name.equals("Bed")){
            this.sleepState = !this.sleepState;
        } else if (name.equals("AC")){
            if (!this.acState) {
                this.electricityBill += 10 * this.getVolume();
            }
            this.acState = ! this.acState;
        }         
    }
}
