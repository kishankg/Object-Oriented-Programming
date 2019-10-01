/**
 * This class simulates a Living Room.
 *
 * @author Shreyas Bhat
 */
public class LivingRoom extends Room implements IOperatingCost {
    /**
     * A boolean to keep track whether the TV is on or not.
     * Set to True if on.
     */
    private boolean tvState;

    /**
     * Stores the electricity bill for the livingroom.
     */
    private int electricityBill;

    /**
     * Initialize all fields of the class.
     * <ul>
     * <li> Set electricityBill as 0 </li>
     * <li> Set tvState as false </li>
     * </ul>
     *
     * @param roomLength Length of the livingroom.
     * @param roomWidth  Width of the livingroom.
     * @param roomHeight Height of the livingroom.
     */
    public LivingRoom(int roomLength, int roomWidth, int roomHeight) {
        super(roomLength, roomWidth, roomHeight);
        this.tvState = false;
        this.electricityBill = 0;
    }

    /**
     * Fetches the electricity bill amount.
     * @return Electricity bill for a Living Room.
     */
    public int getBill() {
        return electricityBill;
    }

    /**
     * Fetches the tvState.
     * @return tvState of the room
     */
    public boolean getTvState() {
        return tvState;
    }

    /**
     * In a living room, you can use the appliance "<b>TV</b>". Using this appliance will lead to increase in the electricity bill. <br>
     * Usage for this method is:
     * <ul>
     * <li> If the TV is off, switch it on and increment electricity bill by 10. </li>
     * <li> Otherwise, if the TV was already on, switch it off. </li>
     * </ul>
     * No other appliances can be used in the living room. 
     * @param name Name of the appliance.
     */
    public void use(String name){
        if (name.equals("TV")) {
            if(!this.tvState){
                this.electricityBill += 10;
            }
            tvState = ! tvState;
        }    
    }
}
