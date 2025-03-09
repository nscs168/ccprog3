package vendingmachine;

import java.util.Arrays;

public class InventoryUtility {

    /**
     * Computes the remaining stock for each slot after sales.
     */
    public static int computeRemainingStock(int startingInventory, int salesTracker) {
        int difference = 0;

        difference = startingInventory - salesTracker;
   
        return difference;
    }

    /**
     * Resets the sales tracker to zero for all slots.
     */
    public static void resetSalesTracker(int[] salesTracker) {
        Arrays.fill(salesTracker, 0);
    }

    /**
     * Resets the total amount collected in the vending machine.
     */
    public static double resetTotalAmountCollected() {
        return 0;
    }

    /**
     * Restocks an item by updating its quantity in the vending machine.
     */
    public static void restock(Item[] itemSlots, int selectedSlot, int restockQuantity, int[] startingInventory) {
        int newQuantity = itemSlots[selectedSlot].getQuantity() + restockQuantity;
        itemSlots[selectedSlot].setQuantity(newQuantity);
        startingInventory[selectedSlot] = newQuantity;
    }
}