package vendingmachine;

import java.text.DecimalFormat;

/**
 * The VendingMachineModel represents the business layer of the vending machine factory and
 * the individual vending machines that will be created. It contains methods for creating
 * two different types of vending machines - regular and special, testing features, and
 * handling other related functionalities.
 */
public class VendingMachineModel{
    RegularVendingMachine rvm;
    SpecialVendingMachine svm;

    /**
     * Constructs a VendingMachineModel regular and special vending machines created, each 
     * with 8 item slots.
     */
    public VendingMachineModel(){
        this.rvm = new RegularVendingMachine(8);
        this.svm = new SpecialVendingMachine(8);
    }

    /**
     * Creates a new instance of a RegularVendingMachine with 8 item slots.
     */
    public void createRVM(){
        RegularVendingMachine rvm = new RegularVendingMachine(8);
    }

    /**
     * Creates a new instance of a SpecialVendingMachine with 8 item slots.
     */
    public void createSVM(){
        SpecialVendingMachine svm = new SpecialVendingMachine(8);
    }

    /**
     * Displays a greeting message for the vending machine factory.
     * @return the greeting message as a string
     */
    public String displayGreeting(){
        return
        "Welcome to the Vending Machine Factory.\n";
    }

    /**
     * Provides an error message for invalid input during user interactions.
     * @return the error message as a string
     */
    public String errorMessage(){
        return
        "Invalid input. Please select from the options only.";
    }

    /**
     * Generates a factory menu that allows the user to select between a regular
     * or special vending machine.
     * @return the factory menu as a string
     */
    public String factoryMenu(){ // stage 1
        return
        "Which Vending Machine would you like to work with?\n" +
        "1. Regular Vending Machine\n" +
        "2. Special Vending Machine\n";
    }

    /**
     * Generates the options for either creating or testing a vending machine.
     * @return the main option menu as a string
     */
    public String mainMenu(){ // stage 2
        return "How may we help you today?\n" +
        "1. Create a vending machine\n" +
        "2. Test a vending machine\n";
    }

    /**
     * Generates the test features menu for testing either vending or maintenance
     * features.
     * @return the test features menu as a string
     */
    public String testMenu(){ // stage 2 -> choice 2
        return "Would you like to: \n" +
        "1. Test Vending Features\n" +
        "2. Test Maintenance Features";
        //"3. End Testing of Features\n"; remove bec may back button
    }

    /**
     * Generates the instruction for selecting an item from the vending machine.
     * @return The instruction as a string
     */
    public String indvItemsMenu() {
        return "---------- Buy an Item ----------\n" +
                "Select an item from the machine.\n";
    }

    /**
     * Generates the menu options for the different maintenance tasks available.
     * @return the maintenance menu as a string
     */
    public String maintenanceMenu() {
        return "----- Vending Machine Maintenance -----\n" +
            "Select an option from below: \n" +
            "1. Add an item\n"+
            "2. Restock an item\n" +
            "3. Edit price of an item\n" +
            "4. Collect money\n" +
            "5. Replenish denominations\n" +
            "6. Print Summary\n" ;
    }

    /**
     * Generates a message containing the list of items available for addition to the inventory
     * based on the input parameters.
     *
     * @param bought  The choice of items for addition to the inventory in the first type (e.g., type 0).
     * @return A formatted message listing the items available for addition to the inventory.
     */
    public String addItemMenu(int bought) {
        StringBuilder temp = new StringBuilder();

        //if (type = 0) {
            if (bought == 0) {
                temp.append("-------- Add an Item --------\n" +
                        "Select an item to add to inventory: \n" +
                        "Item 1: Coca-Cola\n" +
                        "Item 2: Coffee\n");
            }
            else if (bought == 1) {
                temp.append("-------- Add an Item --------\n" +
                        "Select an item to add to inventory: \n" +
                        "Item 2: Coffee\n");
            }
            else if (bought == 2) {
                temp.append("-------- Add an Item --------\n" +
                        "Select an item to add to inventory: \n" +
                        "Item 1: Coca-Cola\n");
            }
            
            else {
                temp.append("-------- Add an Item --------\n" +
                        "No items available to add to inventory.\n" +
                        "Press back to go back.\n");
            }
        return temp.toString();
    }

    /**
     * Provides a message indicating the successful creation of a new RegularVendingMachine.
     * @return the creation message as a string
     */
    public String rvmMessage(){
        return "New Regular Vending Machine with 8 item slots has been created.";
    }

    /**
     * Provides a message indicating the successful creation of a new SpecialVendingMachine.
     * @return the creation message as a string
     */
    public String svmMessage(){
        return "New Special Vending Machine with 8 item slots has been created.";
    }

     /**
     * Terminates the Java Virtual Machine with a status code of 0, indicating successful
     * termination.
     */
    public void exitProgram(){
        System.exit(0);
    }

    /**
     * Adds an item to a specific slot in the vending machine.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param salesTracker the number of sales for each item in the the vending machine
     * @param startingInventory the initial inventory of the vending machine
     * @param slotNumber the slot number where the item will be added 
     * @param item item to be added
     * @throws NullPointerException if the item is null
     */
    public void addItem(Item itemSlots[], int salesTracker[], int startingInventory[], int slotNumber, Item item) {
        itemSlots[slotNumber] = item;
        salesTracker[slotNumber] = 0;
        startingInventory[slotNumber] = item.getQuantity();
    }

    /**
     * Checks if a slot in the vending machine is empty.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param slotNumber the slot number to check
     * @return true if the slot is empty, false otherwise
     */
    public boolean isEmpty(Item itemSlots[], int slotNumber) {
        boolean res = false;
        if (itemSlots[slotNumber] == null)
            res = true;
        return res;
    }

    /**
     * Checks if a slot in the vending machine is occupied.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param slotNumber the slot number to check
     * @return true if occupied, false otherwise
     */
    public boolean isOccupied(Item itemSlots[], int slotNumber) {
        try {
            if (itemSlots[slotNumber] != null) {
                Item item = itemSlots[slotNumber];
                //System.out.println("You successfully selected Slot " + slotNumber + " - " + item.getName());
                return true;
            } else {
                //System.out.println("Slot " + slotNumber + " is empty. Please try again.\n");
                return false;
            }
        } catch (IllegalArgumentException e) {
            //System.out.println(e.getMessage() + "\n");
            return false;
        }
    }

    /**
     * Finds the closest smaller denomination relative to the given amount. This
     * method takes a parameter 'n' and iterates through the 'banknotes' array to 
     * find a denomination closely smaller than or equal to n. The loop begins from
     * the highest denomination at the last index and moves down until it finds an 
     * element that meets this criteria. That element is then returned. 
     * @param banknote the array representing the denomination of banknotes
     * @param n the given number
     * @return the index of the closest denomination
     */
    public int findClosestDenominationIndex(int banknote[], double n){
        int i = 8;
        while(n < banknote[i]){
            i--;
        }
        return i;
    }

     /**
     * Checks if there are sufficient banknote denominations in the machine to generate change.
     * This method iteratively calls the 'findClosestDenominationIndex()' method and calculates
     * the quantity of banknotes required for generating change. If there is enough quantity of 
     * banknotes, it subtracts the deducted change from the original change due and this process 
     * repeats until the remaining change to dispense is 0. Otherwise, it returns false.
     * @param banknote the array representing the denomination of banknotes
     * @param banknoteCounter the array that stores how much of each denomination is available
     * @param change the amount of change due
     * @return true if there is enough change, false otherwise
     * @throws IllegalArgumentException if the 'banknote' and 'banknoteCounter'arrays have different 
     *                                  lengths
     */
    public boolean isChangeEnough(int banknote[], int banknoteCounter[], int change){
        boolean valid;
        int temp, quantity, i;

        while(change > 0){
            valid = false;
            temp = findClosestDenominationIndex(banknote,change);
            quantity = change/banknote[temp];

            if(quantity > banknoteCounter[temp]){
                i = temp - 1;
                while(i >= 0 && valid != true){
                    quantity = change/banknote[i];
                    if(quantity > banknoteCounter[i])
                        i--;
                    else{
                        valid = true;
                        change -= banknote[i]*quantity;
                        banknoteCounter[i] -= quantity;
                    }
                }
                if(valid == false)
                    return false;
            }
            else{
                change -= banknote[temp]*quantity;
                banknoteCounter[temp] -= quantity;
            }
        }
        return true;
    }

    /**
     * Checks if an item slot in the vending machine has a quantity of 0.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param selectedSlot the index of the slot to check
     * @return true if the selected slot is out of stock, false otherwise
     * @throws IndexOutOfBoundsException if the 'selectedSlot' is invalid
     */
    public boolean checkOutofStock(Item itemSlots[], int selectedSlot){
        boolean res = false;

        if(itemSlots[selectedSlot].getQuantity() == 0){
            return true;
        }

        return res;
    }

    /**
     * Retrieves the name of an item in the vending machine.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param selectedSlot the index of the slot from which to get name
     * @return the name of the item in the specified slot
     * @throws IndexOutOfBoundsException if the 'selectedSlot' is invalid
     * 
     */
    public String getItemName(Item itemSlots[], int selectedSlot) {
        return itemSlots[selectedSlot].getName();
    }

    /**
     * Retrieves the price of an item in the vending machine.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param selectedSlot the index of the slot from which to get name
     * @return the price of the item in the specified slot
     * @throws IndexOutOfBoundsException if the 'selectedSlot' is invalid
     */
    public double getItemPrice(Item itemSlots[], int selectedSlot) {
        return itemSlots[selectedSlot].getPrice();
    }

    /**
     * Retrieves the quantity of an item in the vending machine.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param selectedSlot the index of the slot from which to get name
     * @return the quantity of the item in the specified slot
     * @throws IndexOutOfBoundsException if the 'selectedSlot' is invalid
     */
     public int getItemQuantity(Item itemSlots[], int selectedSlot) {
        return itemSlots[selectedSlot].getQuantity();
    }

    /**
     * Retrieves the calories of an item in the vending machine.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param selectedSlot the index of the slot from which to get name
     * @return the calories of the item in the specified slot
     * @throws IndexOutOfBoundsException if the 'selectedSlot' is invalid
     */
    public double getItemCalories(Item itemSlots[], int selectedSlot) {
        return itemSlots[selectedSlot].getCalories();
    }

    /**
     * Assigns an int to a specified index in the array.
     * @param list the array where the int is to be placed
     * @param n the int to be assigned
     * @param index the index where the int will be assigned
     * @throws IndexOutOfBoundsException if the index is invalid
     */
    public void assignElemtoArray(int list[], int n, int index){
        list[index] = n;
    }

    /**
     * Accesses the element at the specified index in the given array.
     *
     * @param list  the array of integers from which to access the element
     * @param index the index of the element to be accessed
     * @return the integer value at the specified index in the array
     * @throws ArrayIndexOutOfBoundsException if the index is out of the valid range of the array
     */
    public int accessElemOfArray(int list[], int index){
        return list[index];
    }

    /**
     * Breaks down payment into denomination and finds total.
     * @param payment the arrays that stores the quantity of each denomination that was 
     *                recevied as payment
     * @param banknoteCounter the array that stores how much of each denomination is available
     * @param earnings the array that stores the amount of each denomination received from transactions
     * @return the total payment
     * @throws IllegalArgumentException if the 'payment' array has a length different from 9
     */
    public double computePayment(int payment[], int banknoteCounter[], int earnings[]){
        double amount = 0;
        for (int i = 0; i < 9; i++) {
                switch (i) {
                    case 0:
                        amount += (1 * payment[i]);
                        banknoteCounter[i] += payment[i];
                        earnings[i] += payment[i];
                        break;
                    case 1:
                        amount += (5 * payment[i]);
                        banknoteCounter[i] += payment[i];
                        earnings[i] += payment[i];
                        break;
                    case 2:
                        amount += (10 * payment[i]);
                        banknoteCounter[i] += payment[i];
                        earnings[i] += payment[i];
                        break;
                    case 3:
                        amount += (20 * payment[i]);
                        banknoteCounter[i] += payment[i];
                        earnings[i] += payment[i];
                        break;
                    case 4:
                        amount += (50 * payment[i]);
                        banknoteCounter[i] += payment[i];
                        earnings[i] += payment[i];
                        break;
                    case 5:
                        amount += (100 * payment[i]);
                        banknoteCounter[i] += payment[i];
                        earnings[i] += payment[i];
                        break;
                    case 6:
                        amount += (200 * payment[i]);
                        banknoteCounter[i] += payment[i];
                        earnings[i] += payment[i];
                        break;
                    case 7:
                        amount += (500 * payment[i]);
                        banknoteCounter[i] += payment[i];
                        earnings[i] += payment[i];
                        break;
                    case 8:
                        amount += (1000 * payment[i]);
                        banknoteCounter[i] += payment[i];
                        earnings[i] += payment[i];
                        break;
                }
        }
        return amount;
    }

    /**
     * Dispenses the item from the vending machine and updates the quantity, sales tracker, and
     * totalAmountCollected after successful transaction.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param salesTracker the number of sales for each item in the the vending machine
     * @param selectedSlot the index of the slot from which to dispense item
     * @param total the total of the current transaction being processed
     * @param totalAmountCollected the total sales accumulated by the vending machine
     * @throws IndexOutOfBoundsException if the 'selectedSlot' is invalid
     */
    public void dispenseItem(Item itemSlots[],int salesTracker[], int selectedSlot, double total, double totalAmountCollected){
        int updatedQuantity;

        updatedQuantity = itemSlots[selectedSlot].getQuantity() - 1;
        itemSlots[selectedSlot].setQuantity(updatedQuantity);
        salesTracker[selectedSlot]++;
        totalAmountCollected += total;
    }

    /**
     * Refunds payment back to the customer by adjusting the 'banknoteCounter' array.
     * @param banknoteCounter the array that stores how much of each denomination is available
     * @param payment the arrays that stores the quantity of each denomination that was 
     *                recevied as payment
     * @throws IllegalArgumentException if the 'payment' array has a length different from 9.
    * @throws ArithmeticException if any of the quantities in the 'payment' array exceeds the 
                                  corresponding quantities in the 'banknoteCounter' array.
    */
    public void refundPayment(int banknoteCounter[], int payment[]){
        for(int i = 0; i < 9; i++){
            banknoteCounter[i] -= payment[i];
        }
    }

    /**
     * Edits the price of an item in the vending machine.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param selectedSlot the index in item slots whose price is to be edited
     * @param newPrice the new price for the selected item
     * @throws IndexOutOfBoundsException if the 'selectedSlot' is invalid
     */
    public void editPrice(Item itemSlots[], int selectedSlot, double newPrice) {
            double oldPrice;

            oldPrice = itemSlots[selectedSlot].getPrice();
            itemSlots[selectedSlot].setPrice(newPrice);
    }

    /**
     * Restocks an item in the vending machine.
     * @param selectedSlot the index in item slots to be restocked
     * @param restockQuantity the quantity to restock for the selected item
     * @param startingInventory the initial inventory of the vending machine
     * @param salesTracker the number of sales for each item in the the vending machine
     * @param itemSlots the array representing the item slots in the vending machine
     * @param totalAmountCollected the total sales accumulated by the vending machine
     * @throws IndexOutOfBoundsException if the 'selectedSlot' is invalid
     
    public void restockItem(int selectedSlot, int restockQuantity, int startingInventory[], int salesTracker[],
                            Item itemSlots[], double totalAmountCollected) {
        int oldQuantity, newQuantity;
        int difference[] = new int[8];
        boolean res = false;

        while (!res) {
            // Compute for stock quantity remaining and set this as new startingInventory
            for (int slot = 0; slot < itemSlots.length; slot++) {
                difference[slot] = startingInventory[slot] - salesTracker[slot];
            }

            for (int slot = 0; slot < itemSlots.length; slot++) {
                startingInventory[slot] = difference[slot];
            }

            // Set salesTracker back to zero
            for (int slot = 0; slot < itemSlots.length; slot++) {
                salesTracker[slot] = 0;
            }

            // Set totalAmountCollected back to zero
            totalAmountCollected = 0;

            oldQuantity = itemSlots[selectedSlot].getQuantity();
            newQuantity = itemSlots[selectedSlot].getQuantity() + restockQuantity;

            itemSlots[selectedSlot].setQuantity(newQuantity);
            startingInventory[selectedSlot] = newQuantity;
            res = true;
        }
    }

    */

    public void restockItem(int selectedSlot, int restockQuantity, int[] startingInventory, int[] salesTracker,
                        Item[] itemSlots, double totalAmountCollected) {
    
        // Compute remaining stock
        startingInventory = InventoryUtility.computeRemainingStock(startingInventory, salesTracker);

        // Reset sales tracker and total sales
        InventoryUtility.resetSalesTracker(salesTracker);
        totalAmountCollected = InventoryUtility.resetTotalAmountCollected();

        // Restock the item
        InventoryUtility.restock(itemSlots, selectedSlot, restockQuantity, startingInventory);
}



    /**
     * Copies the records of the vending machine to temporary storage including
     * the 'startingInventory', 'salesTracker', and totalAmountCollected.
     * @param tempInventory the array that stores a copy of the starting inventory
     * @param startingInventory the initial inventory of the vending machine
     * @param tempSalesTracker the array that stores a temporary copy of sales tracker
     * @param salesTracker the number of sales for each item in the the vending machine
     * @param tempAmountCollected double that temporarily stores the totalAmountCollected
     * @param totalAmountCollected the total sales accumulated by the vending machine
     * @param itemSlots the array representing the item slots in the vending machine
     * @throws IndexOutOfBoundsException if the length of 'tempInventory' or 'tempSalesTracker' 
     *                                   is different from the length of 'itemSlots'.
     */
    public void copyRecords(int tempInventory[], int startingInventory[], int tempSalesTracker[],
                            int salesTracker[], double tempAmountCollected, double totalAmountCollected,
                            Item itemSlots[]){
        //copy startingInventory to tempInventory
        for(int slot = 0; slot < itemSlots.length; slot++){
            tempInventory[slot] = startingInventory[slot];
        }

        //copy salesTracker to tempSalesTracker
        for(int slot = 0; slot < itemSlots.length; slot++){
            tempSalesTracker[slot] = salesTracker[slot];
        }

        tempAmountCollected = totalAmountCollected;

    }

    /**
     * Collects or dispenses earnings from the machine.
     * @param earnings the array that stores the amount of each denomination received from transactions
     * @param banknote the array representing the denomination of banknotes
     * @param totalAmountCollected the total sales accumulated by the vending machine
     * @return true if there are earnings, false otherwise.
     * @throws IndexOutOfBoundsException if the length of 'earnings' or 'banknote' is different from the 
     *                                   number of banknote denominations.
     */
    public boolean collectPayment(int earnings[], int banknote[], double totalAmountCollected) {
        double totalAmount = 0;
        boolean res = false;

        for(int i = 0; i < 9; i++){
            if(earnings[i] == 0)
                totalAmount += banknote[i]*earnings[i];
        }
        if (totalAmount > 0) {
            for(int i = 0; i < 9; i++){
                earnings[i] -= earnings[i];
            }
            res = true;
        }

        return res;
    }
    
    /**
     * finds the index of a given denomination in the 'banknote[]' array
     * @param banknote the array representing the denomination of banknotes
     * @param denomination the denomination whose index is to be searched 
     * @return the index of the denomination
     */
    public int findDenominationIndex(int banknote[], int denomination){
        int res = -1;
        for(int i = 0; i<9; i++){
            if (denomination == banknote[i]){
                res = i;
            }
        }
        return res;
    }

    /**
     * Replenishes the denominations of banknotes in the vending machine with the specified
     * number of pieces.
     * @param banknoteCounter the array that stores how much of each denomination is available
     * @param denomination the denomination to be replenished
     * @param pieces the amount to replenish
     * 
     */
    public void replenishMoney(int banknoteCounter[], int denomination, int pieces) {
        switch (denomination) {
            case 1:
                banknoteCounter[0] += pieces;
                break;
            case 5:
                banknoteCounter[1] += pieces;
                break;
            case 10:
                banknoteCounter[2] += pieces;
                break;
            case 20:
                banknoteCounter[3] += pieces;
                break;
            case 50:
                banknoteCounter[4] += pieces;
                break;
            case 100:
                banknoteCounter[5] += pieces;
                break;
            case 200:
                banknoteCounter[6] += pieces;
                break;
            case 500:
                banknoteCounter[7] += pieces;
                break;
            case 1000:
                banknoteCounter[8] += pieces;
                break;
        }
    }

    /**
     * Computes the price of the customized product in the special vending machine
     * based on its ingredients.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param ingredients an array that contains the ingredients of the pizza that are not
     *                    individually sold
     * @param tempRegularItems an array that stores whether any of the regular items were selected 
     *                          by the user
     * @param tempSpecialItems an array that stores whether any of the regular items were selected 
     *                          by the user
     * @return the total price of the special product
     */
    public double computeSpecialPrice(Item[] itemSlots, Item [] ingredients, int[] tempRegularItems,
                                      int[] tempSpecialItems){
		double total = 0;

        //regular items
		for(int i = 0; i < 8; i++) 
            if(tempRegularItems[i] == 1){
                total += itemSlots[i].getPrice();
            }
        
        //items that cannot be sold
        for(int i = 0; i < 7; i++){
            if(tempSpecialItems[i] == 1){
                total += ingredients[i].getPrice();
            }
        }
		return total;
	}


    /**
     * Computes the calories of the customized product in the special vending machine
     * based on its ingredients.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param ingredients an array that contains the ingredients of the pizza that are not
     *                    individually sold
     * @param tempRegularItems an array that stores whether any of the regular items were selected 
     *                          by the user
     * @param tempSpecialItems an array that stores whether any of the regular items were selected 
     *                          by the user
     * @return the total calories of the special product
     */
    public double computeSpecialCalories(Item[] itemSlots, Item [] ingredients, int[] tempRegularItems,
                                      int[] tempSpecialItems){
		double total = 0;

        //regular items
		for(int i = 0; i < 8; i++) 
            if(tempRegularItems[i] == 1){
                total += itemSlots[i].getCalories();
            }
        
        
        //items that cannot be sold
        for(int i = 0; i < 7; i++){
            if(tempSpecialItems[i] == 1){
                total += ingredients[i].getCalories();
            }
        }
		return total;
	}

    /** 
     * Generates a formatted string to print the starting inventory.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param startingInventory the initial inventory of the vending machine
     * @return the starting inventory as a formatted string 
     */
    public String printStartInventory(Item itemSlots[], int startingInventory[]){
        String text = "";
        for (int slot = 0; slot < itemSlots.length; slot++){
            Item item = itemSlots[slot];
            if (item != null){
                text += item.getName() + ": " + startingInventory[slot] + "\n";
            }
        }
        return text;
    }

    /**
     * Generates a formatted string to print the quantity sold.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param salesTracker the number of sales for each item in the the vending machine
     * @return the ending inventory as a formatted string
     */
    public String printQuantitySold(Item itemSlots[], int salesTracker[]){
        String text = "";

        for(int slot = 0; slot < itemSlots.length; slot++){
            Item item = itemSlots[slot];
            if (item != null) {
                text += item.getName() + ": " + salesTracker[slot] + " sold\n";
            }
        }

        return text;
    }

    /**
     * Generates a formatted string to print the ending inventory.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param startingInventory the initial inventory of the vending machine
     * @param salesTracker the number of sales for each item in the the vending machine
     * @return the quantity sold as a formatted string
     */
    public String printEndingInventory(Item itemSlots[], int startingInventory[], int salesTracker[]){
        String text = "";
        for (int slot = 0; slot < itemSlots.length; slot++){
            Item item = itemSlots[slot];
            if (item != null){
                int end = startingInventory[slot]-salesTracker[slot];
                text += item.getName() + ": " + end + "\n";
            }
        }
        return text;
    }
    /**
     * Generates a formatted string to print a summary of sales beginning from the last restock.
     * The summary includes the starting inventory, quantity sold for each item, and the current
     * or ending inventory.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param startingInventory the initial inventory of the vending machine
     * @param salesTracker the number of sales for each item in the the vending machine
     * @param totalAmountCollected the total sales accumulated by the vending machine
     * @return the sales summary as a formatted string
     */
    public String printSummary(Item itemSlots[], int startingInventory[], int salesTracker[], double totalAmountCollected){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String formattedTotalAmountCollected = decimalFormat.format(totalAmountCollected);
        
        return "---------- Sales Summary----------\n\n" +
        "Starting Inventory: \n" +
        printStartInventory(itemSlots, startingInventory) + "\nQuantity Sold\n" +
        printQuantitySold(itemSlots, salesTracker) + "\nEnding Inventory\n" +
        printEndingInventory(itemSlots, startingInventory, salesTracker) + "\nTotal amount collected in sales: \u20B1" +
        formattedTotalAmountCollected;
    }

    /**
     * Generates a formatted string detailing the preparation of the customized pizza.
     * @param itemSlots the array representing the item slots in the vending machine
     * @param ingredients an array that contains the ingredients of the pizza that are not
     *                    individually sold
     * @param allSelectedItems an array representing that stores both the regular and special
     *                         items chosen
     * @return the step-by-step preparation as a formatted string
     */
    public String prepCustomizedPizza(Item itemSlots[], Item ingredients[], int allSelectedItems[]){
        String text = "";
        String crust = "", cheese = "", veggie = "", meat = "";

        for(int index = 0; index < 3; index++){
            if(allSelectedItems[index] == 1){
                crust = ingredients[index].getName();
            }
        }

        if(allSelectedItems[3] == 1){
            cheese = itemSlots[4].getName();
        }

        if(allSelectedItems[4] == 1){
            cheese = itemSlots[4].getName();
        }

        if(allSelectedItems[5] == 1){
            cheese = itemSlots[0].getName();
        }

        if(allSelectedItems[6] == 1){
            veggie = ingredients[3].getName();
        }

        if(allSelectedItems[7] == 1){
            veggie = ingredients[4].getName();
        }

        if(allSelectedItems[8] == 1){
            veggie = ingredients[5].getName();
        }

        if(allSelectedItems[9] == 1){
            meat= itemSlots[1].getName();
        }

        if(allSelectedItems[10] == 1){
            meat = itemSlots[2].getName();
        }

        if(allSelectedItems[11] == 1){
            meat = ingredients[6].getName();
        }

        text += "\nKneading dough into " + crust + "....\n";
        text += "Spreading tomato sauce...\n";
        text += "Topping with " + meat + "...\n";
        text += "Topping with " + veggie + "...\n";
        text += "Layering with " + cheese + "...\n";
        text += "Baking pizza in oven..\n";
		text += "Cutting pizza into slices...\n";
		text += "Placing pizza in box...\n";
		text += "Pizza Ready!\n\n";

        return text;
    }
}
