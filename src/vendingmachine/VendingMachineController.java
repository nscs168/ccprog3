package vendingmachine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

 /**
 * The VendingMachineController class handles the user interactions with the vending machine.
 * It receives input from the user through the view and communicates with the model to perform various operations.
 */
public class VendingMachineController {

    private int choice, type= -1, stage=1, features = -1, custom = 0, multiple_digits = 0, coke = 0, coffee = 0, bought = 0,
                addedCustom = 0, purchase = 0, dispense = 0, cstm = 0;
    private int tempInt1, tempInt2;
    private double amount = 0, change = 0, total = 0;
    private int[] payment;
    private String digits = "";
    private VendingMachineModel model;
    private VendingMachineView view;

        /**
     * Constructs a new VendingMachineController with the given model and view.
     *
     * @param model the VendingMachineModel that holds the data and logic for the vending machine
     * @param view  the VendingMachineView that displays the user interface of the vending machine
     */
    public VendingMachineController(VendingMachineModel model, VendingMachineView view){
        this.model = model;
        this.view = view;
        this.payment = new int[]{0, 0, 0, 0, 0, 0, 0 ,0, 0};
        
        view.displayTxtA.setText(model.displayGreeting());
        view.displayTxtA.append(model.factoryMenu());

        /**
         * ActionListener for the 1 button in the VendingMachineView.
         * When the 1 button is pressed, this ActionListener appends "1" to the input text field.
         * If multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "1".
         */
        view.setOBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "1"
                String displayText = "1";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "1"
                    view.setInputTf(displayText);
                }
            }
        });

        /**
         * ActionListener for the 2 button in the VendingMachineView.
         * When the 2 button is pressed, this ActionListener appends "2" to the input text field.
         * If multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "2".
         */
        view.setTwBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "2"
                String displayText = "2";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "2"
                    view.setInputTf(displayText);
                }
            }
        });


        /**
         * ActionListener for the 3 button in the VendingMachineView.
         * When the 3 button is pressed, this ActionListener appends "3" to the input text field.
         * If multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "3".
         */
        view.setThBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "3"
                String displayText = "3";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "3"
                    view.setInputTf(displayText);
                }
            }
        });


        /**
         * ActionListener for the 4 button in the VendingMachineView.
         * When the 4 button is pressed, this ActionListener appends "4" to the input text field.
         * If the multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "4".
         */
        view.setFrBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "4"
                String displayText = "4";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "4"
                    view.setInputTf(displayText);
                }
            }
        });


        /**
         * ActionListener for the 5 button in the VendingMachineView.
         * When the 5 button is pressed, this ActionListener appends "5" to the input text field.
         * If the multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "5".
         */
        view.setFvBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "5"
                String displayText = "5";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "5"
                    view.setInputTf(displayText);
                }
            }
        });

        
        /**
         * ActionListener for the 6 button in the VendingMachineView.
         * When the 6 button is pressed, this ActionListener appends "6" to the input text field.
         * If the multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "6".
         */
        view.setSxBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "6"
                String displayText = "6";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "6"
                    view.setInputTf(displayText);
                }
            }
        });

        /**
         * ActionListener for the 7 button in the VendingMachineView.
         * When the 7 button is pressed, this ActionListener appends "7" to the input text field.
         * If the multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "7".
         */
        view.setSvBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "7"
                String displayText = "7";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "7"
                    view.setInputTf(displayText);
                }
            }
        });

        /**
         * ActionListener for the 8 button in the VendingMachineView.
         * When the 8 button is pressed, this ActionListener appends "8" to the input text field.
         * If the multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "8".
         */
        view.setEthBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "8"
                String displayText = "8";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "8"
                    view.setInputTf(displayText);
                }
            }
        });

        /**
         * ActionListener for the 9 button in the VendingMachineView.
         * When the 9 button is pressed, this ActionListener appends "9" to the input text field.
         * If the multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "9".
         */
        view.setNnBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "9"
                String displayText = "9";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "9"
                    view.setInputTf(displayText);
                }
            }
        });

        /**
         * ActionListener for the 0 button in the VendingMachineView.
         * When the 0 button is pressed, this ActionListener appends "0" to the input text field.
         * If the multiple_digits flag is set to 1, the ActionListener appends the digit to the existing input.
         * Otherwise, it replaces the existing input with "0".
         */
        view.setZBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Construct a string with the digit "0"
                String displayText = "0";
                
                // Check if multiple_digits flag is set to 1
                if (multiple_digits == 1) {
                    // Append the digit to the existing input text field
                    view.appendInputTf(displayText);
                } else {
                    // Replace the existing input with the digit "0"
                    view.setInputTf(displayText);
                }
            }
        });


        /**
         * ActionListener for the "exit" button in the VendingMachineView.
         * When the "exit" button is pressed, this ActionListener terminates the program by calling System.exit(0).
         * The program exits with a status code of 0, indicating a successful termination.
         */
        view.setExitBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Terminate the program
                System.exit(0);
            }
        });

        /**
         * ActionListener for the "back" button in the VendingMachineView.
         * When the "back" button is pressed, this ActionListener resets the input fields and adjusts the stage value accordingly.
         * If the current stage is less than 6, it decrements the stage value by 1.
         * If the current stage is 6 or greater, it calculates the difference (temp) between the current stage and 4 and then decrements the stage by temp.
         * Depending on the updated stage value, the corresponding action is taken to display the appropriate menu or message.
         * The view components such as the main frame and panels (items, special items, custom items, coins frame) are also hidden.
         */
        view.setBackBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset input fields
                view.resetFields();

                // Temporary variable to store the current stage value
                int tempStage = stage;

                // Adjust the stage value based on the current stage
                if (tempStage < 6) {
                    stage -= 1;
                } else {
                    int temp = tempStage -= 4;
                    stage -= temp;
                }

                // Display the appropriate menu or message based on the updated stage value
                if (stage == 1) {
                    view.resetChangeTf();
                    view.removeAddedPanels();
                    bought = 0;
                    coke = 0;
                    coffee = 0;
                    view.displayTxtA.setText(model.factoryMenu());
                } else if (stage == 2) {
                    view.resetChangeTf();
                    view.displayTxtA.setText(model.mainMenu());
                } else if (stage == 3) {
                    view.resetChangeTf();
                    view.displayTxtA.setText(model.testMenu());
                } else if (stage == 4) {
                    view.resetChangeTf();
                    if (features == 0) {
                        view.displayTxtA.setText(model.testMenu());
                    }
                    else {
                        view.displayTxtA.setText(model.maintenanceMenu());
                    }
                } else {
                    view.resetChangeTf();
                    view.displayTxtA.setText("You reached the limit.\nEnter a new option.\n");
                    stage = 1;
                    view.displayTxtA.setText(model.factoryMenu());
                }

                // Hide view components
                view.getMainFrame().setVisible(false);
                view.setItemsPanelVisible(false);
                view.setSpecialPanelVisible(false);
                view.setCustomPanelVisible(false);
                view.setCoinsFrameVisible(false);
            }
        });

        /**
         * ActionListener for the "clear" button in the VendingMachineView.
         * When the "clear" button is pressed, this ActionListener resets all input fields to their default state, clearing any existing input.
         */
        view.setClearBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reset all input fields
                view.resetFields();
            }
        });

        /**
         * ActionListener for the "confirm" button in the VendingMachineView.
         * When the "confirm" button is pressed, this ActionListener executes various actions based on the current stage of the program.
         * The program flow depends on the value of the 'stage' variable, which represents different stages of the vending machine operation.
         * The actionPerformed() method handles the logic for each stage, including menu selection, item addition, restocking, editing prices, collecting payments,
         * replenishing money, and printing summaries.
         * Additionally, it handles the purchasing process, where the user can buy items, make custom orders, and dispense change when applicable.
         * This ActionListener also communicates with the VendingMachineModel to perform the necessary operations, such as adding items, restocking,
         * editing prices, handling payments, and maintaining records.
         *
         * The actionPerformed() method contains a series of if-else statements to handle different cases based on the 'stage' variable:
         * - Stage 1: Selecting between regular or special vending machine.
         * - Stage 2: Creating a new VendingMachine (VM) or accessing testing features.
         * - Stage 3: Navigating the VM's vending features or maintenance/testing features.
         * - Stage 4: Executing vending features (buying items) or maintenance/testing features (adding items, restocking, editing prices, collecting payments, replenishing money, printing summaries).
         * - Stage 5: Adding Coca-Cola or Coffee items to the VM's inventory during maintenance.
         * - Stage 6: Inputting the slot number of an item to restock during maintenance.
         * - Stage 7: Inputting the quantity to restock during maintenance.
         * - Stage 8: Inputting the slot number of an item to edit its price during maintenance.
         * - Stage 9: Inputting the new price for an item during maintenance.
         * - Stage 10: Inputting the denomination and quantity to replenish money during maintenance.
         * - Stage 11: Confirming the replenishment of money during maintenance.
         *
         * Depending on the user's choices, the actionPerformed() method updates the VendingMachineView to display appropriate messages, menus,
         * and user prompts. It also interacts with the VendingMachineModel to perform the requested operations on the VM's inventory, sales tracker,
         * earnings, and banknote counter.
         *
         * The actionPerformed() method also uses 'digits' and 'tempInt' variables to gather and parse user input for various operations.
         * 'type' and 'features' variables determine whether the user is interacting with a regular vending machine (0) or a special vending machine (1),
         * and whether the user is accessing vending features (0) or maintenance/testing features (1).
         * Other variables, such as 'choice', 'total', 'amount', 'change', 'purchase', 'dispense', 'bought', 'coke', 'coffee', 'addedCustom',
         * 'tempInt1', and 'tempInt2', are used to track and handle different aspects of the vending machine operation.
         *
         * After performing each operation, the actionPerformed() method updates the VendingMachineView and resets input fields as needed.
         * The method also updates the 'stage' variable to navigate between different stages of the vending machine program.
         *
         * The JavaDoc provides a detailed explanation of the actions taken by the ActionListener when the "confirm" button is pressed.
         * It covers the program flow, user input, interactions with the model, and the stages of the vending machine operation.
         * Furthermore, it clarifies the purpose of the variables used in the actionPerformed() method and the resulting changes in the view.
         */
        view.setConfirmBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Item item1 = new Item("Ricotta Cheese", 75, 4, 174);
                Item item2 = new Item("Pepperoni", 120, 4, 494);
                Item item3 = new Item("Bacon", 150, 1, 275);
                Item item4 = new Item("Mozzarella Cheese",100, 2, 280);
                Item item5 = new Item("Parmesan Cheese", 90, 3, 431);
                Item item6 = new Item("Water", 30,1, 0);

                Item thinCrust = new Item("thin crust", 30, 7, 1092);
                Item thickCrust = new Item("thick crust", 30, 4, 1092);
                Item gfCrust = new Item("gluten-free crust", 95, 7, 1092);
                Item bp = new Item("bell pepper", 30, 3,20 );
                Item mushroom = new Item("mushroom", 60, 2,3);
                Item olives = new Item("olives", 40, 7,59 );
                Item chicken = new Item("chicken", 50, 6,191 );

                if(stage == 1){ // options: Regular or Special
                    addedCustom = 0;
                    choice = Integer.parseInt(view.getInputTf());
                        if (choice < 1 || choice > 2){  // show error message when choice input is not 1 or 2
                            view.displayTxtA.append("\n" + model.errorMessage()+ "\n");
                            view.resetFields();
                        }

                        else if(choice == 1){   // when user chooses 1, items will be added to rvm
                            view.resetChangeTf();
                            view.displayTxtA.setText(model.mainMenu());
                            type = 0;   // rvm
                            stage += 1; // goes to stage 2
                            model.addItem(model.rvm.getItemSlots(), model.rvm.getSalesTracker(), model.rvm.getStartingInventory(), 0, item1);
                            model.addItem(model.rvm.getItemSlots(), model.rvm.getSalesTracker(), model.rvm.getStartingInventory(), 1, item2);
                            model.addItem(model.rvm.getItemSlots(), model.rvm.getSalesTracker(), model.rvm.getStartingInventory(), 2, item3);
                            model.addItem(model.rvm.getItemSlots(), model.rvm.getSalesTracker(), model.rvm.getStartingInventory(), 3, item4);
                            model.addItem(model.rvm.getItemSlots(), model.rvm.getSalesTracker(), model.rvm.getStartingInventory(), 4, item5);
                            model.addItem(model.rvm.getItemSlots(), model.rvm.getSalesTracker(), model.rvm.getStartingInventory(), 5, item6);

                            model.replenishMoney(model.rvm.getBanknoteCounter(), 1, 20);
                            model.replenishMoney(model.rvm.getBanknoteCounter(), 5, 10);
                            model.replenishMoney(model.rvm.getBanknoteCounter(), 10, 10);
                            model.replenishMoney(model.rvm.getBanknoteCounter(), 20, 5);
                            model.replenishMoney(model.rvm.getBanknoteCounter(), 50, 5);
                            model.replenishMoney(model.rvm.getBanknoteCounter(), 100, 7);
                            model.replenishMoney(model.rvm.getBanknoteCounter(), 500, 5);
                    

                            model.copyRecords(model.rvm.getTempInventory(), model.rvm.getStartingInventory(), model.rvm.getTempSalesTracker(),
                                            model.rvm.getSalesTracker(), model.rvm.getTempCollected(), model.rvm.getTotalCollected(), model.rvm.getItemSlots() );
                            view.resetFields();
                        }

                        else{   // when user chooses 1, items will be added to svm
                            view.resetChangeTf();
                            view.displayTxtA.setText(model.mainMenu());
                            type = 1;   // svm
                            stage += 1; // goes to stage 2
                            model.addItem(model.svm.getItemSlots(), model.svm.getSalesTracker(), model.svm.getStartingInventory(), 0, item1);
                            model.addItem(model.svm.getItemSlots(), model.svm.getSalesTracker(), model.svm.getStartingInventory(), 1, item2);
                            model.addItem(model.svm.getItemSlots(), model.svm.getSalesTracker(), model.svm.getStartingInventory(), 2, item3);
                            model.addItem(model.svm.getItemSlots(), model.svm.getSalesTracker(), model.svm.getStartingInventory(), 3, item4);
                            model.addItem(model.svm.getItemSlots(), model.svm.getSalesTracker(), model.svm.getStartingInventory(), 4, item5);
                            model.addItem(model.svm.getItemSlots(), model.svm.getSalesTracker(), model.svm.getStartingInventory(), 5, item6);

                            model.addItem(model.svm.getIngredients(), model.svm.getSpecialItemsTracker(), model.svm.getSpecialItemsInventory(), 0, thinCrust);
                            model.addItem(model.svm.getIngredients(), model.svm.getSpecialItemsTracker(), model.svm.getSpecialItemsInventory(), 1, thickCrust);
                            model.addItem(model.svm.getIngredients(), model.svm.getSpecialItemsTracker(), model.svm.getSpecialItemsInventory(), 2, gfCrust);
                            model.addItem(model.svm.getIngredients(), model.svm.getSpecialItemsTracker(), model.svm.getSpecialItemsInventory(), 3, bp);
                            model.addItem(model.svm.getIngredients(), model.svm.getSpecialItemsTracker(), model.svm.getSpecialItemsInventory(), 4, mushroom);
                            model.addItem(model.svm.getIngredients(), model.svm.getSpecialItemsTracker(), model.svm.getSpecialItemsInventory(), 5, olives);
                            model.addItem(model.svm.getIngredients(), model.svm.getSpecialItemsTracker(), model.svm.getSpecialItemsInventory(), 6, chicken);

                            model.replenishMoney(model.svm.getBanknoteCounter(), 1, 20);
                            model.replenishMoney(model.svm.getBanknoteCounter(), 5, 10);
                            model.replenishMoney(model.svm.getBanknoteCounter(), 10, 10);
                            model.replenishMoney(model.svm.getBanknoteCounter(), 20, 5);
                            model.replenishMoney(model.svm.getBanknoteCounter(), 50, 5);
                            model.replenishMoney(model.svm.getBanknoteCounter(), 100, 7);
                            model.replenishMoney(model.svm.getBanknoteCounter(), 500, 5);

                            

                            model.copyRecords(model.svm.getTempInventory(), model.svm.getStartingInventory(), model.svm.getTempSalesTracker(),
                                            model.svm.getSalesTracker(), model.svm.getTempCollected(), model.svm.getTotalCollected(), model.svm.getItemSlots() );
                            view.resetFields();
                        }
                }

                else if(stage == 2){ // Create a VM or Test Features
                    custom  = 0;
                    view.resetChangeTf();
                    view.displayTxtA.setText(model.mainMenu());
                    choice = Integer.parseInt(view.getInputTf());
                        if(choice < 1 || choice > 2){   // show error message when choice input is not 1 or 2
                            view.displayTxtA.append("\n" + model.errorMessage() + "\n");
                            view.resetFields();
                        }
                        else if(choice == 1){   // Create a VM
                            view.resetChangeTf();
                            view.displayTxtA.setText(model.mainMenu());
                            if (type == 0){ // for rvm
                                model.createRVM();
                                view.displayTxtA.setText(model.rvmMessage());
                                view.resetFields();
                            }
                            else{   // for svm
                                model.createSVM();
                                view.displayTxtA.setText(model.svmMessage());
                                view.resetFields();
                            }
                            view.displayTxtA.append("\nReturning to Main Menu...\n");
                            view.displayTxtA.append("\n" + model.mainMenu() + "\n");
                            view.resetChangeTf();
                        }
                        else if (choice == 2){
                            //test features
                            view.displayTxtA.setText(model.testMenu());
                            view.resetFields();
                            stage += 1;
                        }
                }

                else if (stage == 3) { // vending features & testing features
                    choice = Integer.parseInt(view.getInputTf());
                    if(choice < 1 || choice > 2){ // shows error message when choice input is not 1 or 2
                        view.displayTxtA.append("\n" + model.errorMessage() + "\n");
                        view.resetFields();
                    }
                    else if (choice == 1) { // vending features
                        if (type == 0) { // if rvm
                            view.setItemsPanelVisible(true); //  shows the vending machine individual items
                        }
                        else if (type == 1) {
                            view.setSpecialPanelVisible(true);  //  shows the vending machine special items
                        }
                        view.displayTxtA.setText(model.indvItemsMenu());
                        view.resetFields();
                        total = 0;
                        amount = 0;
                        change = 0;
                        
                        for(int i = 0; i < 9; i++){
                            payment[i] = 0;
                        }
                        stage += 1;
                        features = 0;
                    }
                    else if (choice == 2) { // testing features
                        view.displayTxtA.setText(model.maintenanceMenu());
                        view.resetFields();
                        features = 1;
                        stage += 1;
                    }
                }
                else if (stage == 4) { // vending & maintenance features
                    if (features == 0) { // buying
                        if(type == 0){  //rvm
                            view.setItemsPanelVisible(false);   // hides the VM individual items
                            if (model.checkOutofStock(model.rvm.getItemSlots(), model.rvm.getSelectedSlot())) {
                                view.displayTxtA.append("\n Item is out of stock!");
                            }
                            else{
                                view.setCoinsFrameVisible(true);    // shows the insert coins window
                                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                                total = model.getItemPrice(model.rvm.getItemSlots(), model.rvm.getSelectedSlot());  // gets the price of the selected item
                                String formattedTotal = decimalFormat.format(total);
                                view.displayTxtA.setText("\nYour total is \u20B1 " + formattedTotal + "\nPlease enter your payment.");
                                view.displayTxtA.append("\nOnce finished inserting, press purchase.");
                                purchase = 1;
                                dispense=0;
                            }
                        }
                        else{   // svm
                            view.setSpecialPanelVisible(false); // hides the VM special items
                            view.setCustomPanelVisible(false);  // hides the VM custom items
                            if (model.checkOutofStock(model.svm.getItemSlots(), model.svm.getSelectedSlot())) {
                                view.displayTxtA.append("\n Item is out of stock!");
                            }
                            else{   // when item is in stock
                                view.setCoinsFrameVisible(true);    // shows the insert coins window
                                DecimalFormat decimalFormat = new DecimalFormat("#.00");
                                total = model.getItemPrice(model.svm.getItemSlots(), model.svm.getSelectedSlot());
                                String formattedTotal = decimalFormat.format(total);
                                view.displayTxtA.setText("\nYour total is \u20B1 " + formattedTotal + "\nPlease enter your payment.");
                                view.displayTxtA.append("\nOnce finished inserting, press purchase.");
                                purchase = 1;
                                dispense =0;
                            }
                        }
                    }
                    else if (features == 1) { // maintenance
                        choice = Integer.parseInt(view.getInputTf());
                        if(choice < 1 || choice > 7){
                            view.displayTxtA.append("\n" + model.errorMessage() + "\n");
                            view.resetFields();
                        }
                        else if(choice == 1){
                            view.resetFields();
                            //Add an item
                            if (coke == 0 && coffee == 0) { // none are added
                                view.displayTxtA.setText(model.addItemMenu(bought));
                                stage += 1; //stage 5
                            }
                            else if (coke == 1 && coffee == 0) {// if coke is added
                                bought = 1;
                                view.displayTxtA.setText(model.addItemMenu(bought));
                                stage += 1; //stage 5
                            }
                            else if (coke == 0 && coffee == 1) { // if coffee is added
                                bought = 2;
                                view.displayTxtA.setText(model.addItemMenu(bought));
                                stage += 1; //stage 5
                            }
                            else if (coke == 1 && coffee == 1){ // if both is added
                                bought = 3;
                                view.displayTxtA.setText(model.addItemMenu(bought));
                            }
                        }
                        else if(choice == 2){
                            //Restock
                            multiple_digits = 1;
                            digits = "";
                            view.resetFields();
                            view.displayTxtA.setText("----------- Restock an Item -----------\n" +
                                                    "Enter slot number of item to restock: ");
                            stage += 2; //stage 6
                        }
                        else if(choice == 3){
                            //edit price
                            multiple_digits = 1;
                            digits = "";
                            view.resetFields();
                            view.displayTxtA.setText("--------- Edit Price of an Item ---------\n" +
                                                    "Enter slot number of item to edit price: ");
                            stage += 4; //stage 8
                        }
                        else if(choice == 4){
                            //collect payment

                            boolean res = false;
                            if(type == 0){
                                if(model.collectPayment(model.rvm.getEarnings(), model.rvm.getBanknote(), model.rvm.getTotalCollected())){
                                    res = true;
                                }
                            }
                            else if(type == 1){
                                if(model.collectPayment(model.svm.getEarnings(), model.svm.getBanknote(), model.svm.getTotalCollected()));
                                    res = true;
                            }

                            if(res == true){
                                view.displayTxtA.setText("\nPayment collected!\n");
                            }
                            else{
                                view.displayTxtA.setText("\nNo money to collect.\n\n");
                            }
                            view.resetChangeTf();
                            view.displayTxtA.append(model.testMenu());
                            stage -= 1;
                        }
                        else if(choice == 5){
                            //replenish money
                            view.resetFields();
                            multiple_digits = 1;
                            digits = "";
                            view.displayTxtA.setText("------- Replenish Denomination -------\n" +
                                                    "Enter denomination to replenish: ");
                            stage += 6; // stage 10
                        }
                        else if(choice == 6){
                            //print summary
                            if(type == 0){
                                view.displayTxtA.setText(model.printSummary(model.rvm.getItemSlots(), model.rvm.getStartingInventory(),
                                            model.rvm.getSalesTracker(), model.rvm.getTotalCollected()));
                            }
                            if(type == 1){
                                view.displayTxtA.setText(model.printSummary(model.svm.getItemSlots(), model.svm.getStartingInventory(),
                                            model.svm.getSalesTracker(), model.svm.getTotalCollected()));
                                if(addedCustom != 0){
                                    view.displayTxtA.append("\nADDITIONAL ITEMS:\n");
                                    view.displayTxtA.append(model.printSummary(model.svm.getIngredients(), model.svm.getSpecialItemsInventory(),
                                            model.svm.getSpecialItemsTracker(), model.svm.getTotalCollected()));
                                }
                            }
                            view.resetFields();
                        }
                    }
                }
                else if(stage == 5){
                    choice = Integer.parseInt(view.getInputTf());
                    if(choice < 1 || choice > 2){
                        view.displayTxtA.append("\n" + model.errorMessage() + "\n");
                    }
                    else if(choice== 1){
                        view.displayTxtA.setText("Coca-Cola added to inventory.\n");
                        Item item7 = new Item("Coca-Cola", 40, 6, 150);
                        if(type == 0){
                            model.addItem(model.rvm.getItemSlots(), model.rvm.getSalesTracker(), model.rvm.getStartingInventory(), 6, item7);
                            view.updateCokeItem();
                            coke = 1; // coke added
                        }
                        else if(type == 1){
                            model.addItem(model.svm.getItemSlots(), model.svm.getSalesTracker(), model.svm.getStartingInventory(), 6, item7);
                            view.updateCokeItem();
                            coke = 1; // coke added

                        }
                        
                        view.resetFields();
                    }
                    else if(choice == 2){
                        view.displayTxtA.setText("Coffee added to inventory.\n");
                        Item item8 = new Item("Coffee", 35, 0, 5);
                        if(type == 0){
                            model.addItem(model.rvm.getItemSlots(), model.rvm.getSalesTracker(), model.rvm.getStartingInventory(), 7, item8);
                        }
                        else if(type == 1){
                            model.addItem(model.svm.getItemSlots(), model.svm.getSalesTracker(), model.svm.getStartingInventory(), 7, item8);
                        }
                        view.updateCoffeeItem();

                        coffee = 1; // coffee added
                        view.resetFields();
                    }

                    stage -= 1;
                    view.displayTxtA.append("\n" + model.maintenanceMenu());
                }
                else if(stage == 6){
                    view.displayTxtA.append(view.getInputTf() + "\n");
                    digits += view.getInputTf();
                    tempInt1 = Integer.parseInt(digits);
                    digits = "";
                    view.displayTxtA.append("Enter quantity to restock: ");
                    tempInt1 = Integer.parseInt(view.getInputTf());
                    stage += 1;
                    view.resetFields();
                }

                else if(stage == 7){
                    view.displayTxtA.append(view.getInputTf() + "\n");
                    digits += view.getInputTf();
                    tempInt2 = Integer.parseInt(digits);

                    int oldQuantity = 0, newQuantity = 0;
                    
                                                
                    // Directly assign rvm or svm without using an abstract type
                    RegularVendingMachine machine = (type == 0) ? model.rvm : model.svm;

                    oldQuantity = model.getItemQuantity(machine.getItemSlots(), tempInt1);

                    // Restock the item
                    model.restockItem(tempInt1, tempInt2, machine.getStartingInventory(), machine.getSalesTracker(), machine.getItemSlots());

                    // Reset sales data after restocking
                    model.resetSalesData(machine.getSalesTracker(), machine.getTotalCollected());

                    newQuantity = model.getItemQuantity(machine.getItemSlots(), tempInt1);


                    view.displayTxtA.setText("Restock successful!\n");
                    view.displayTxtA.append("Old Quantity of : " + oldQuantity + "\n");
                    view.displayTxtA.append("New Quantity: " + newQuantity + "\n");

                    stage -= 3;
                    view.displayTxtA.append("\n" + model.maintenanceMenu());
                    multiple_digits = 0;
                }

                else if(stage == 8){
                    view.displayTxtA.append(view.getInputTf() + "\n");
                    digits += view.getInputTf();
                    tempInt1 = Integer.parseInt(digits);
                    stage += 1;
                    view.resetFields();
                    digits = "";

                    view.displayTxtA.append("Enter new price: ");
                }
                
                else if(stage == 9){
                    digits += view.getInputTf();
                    tempInt2 = Integer.parseInt(digits);
                    double oldPrice = 0, newPrice = 0;

                    if(type == 0){
                        oldPrice = model.getItemPrice(model.rvm.getItemSlots(), tempInt1);
                        model.editPrice(model.rvm.getItemSlots(), tempInt1, tempInt2);
                        newPrice = model.getItemPrice(model.rvm.getItemSlots(), tempInt1);
                        view.updatePriceLabel(newPrice, tempInt1);
                    }
                    else if(type == 1){
                        oldPrice = model.getItemPrice(model.svm.getItemSlots(), tempInt1);
                        model.editPrice(model.svm.getItemSlots(), tempInt1, tempInt2);
                        view.displayTxtA.setText("Price successfully changed.\n");
                        newPrice = model.getItemPrice(model.svm.getItemSlots(), tempInt1);
                    }

                    view.displayTxtA.setText("Price successfully changed.\n");
                    view.displayTxtA.append("Old Price: \u20B1" + oldPrice + "0\n");
                    view.displayTxtA.append("New Price: \u20B1" + newPrice + "0\n");

                    stage -= 5;
                    view.resetFields();
                    view.displayTxtA.append("\n" + model.maintenanceMenu());
                    multiple_digits = 0;
                }

                else if(stage == 10){
                    view.displayTxtA.append(view.getInputTf() + "\n");
                    int num = Integer.parseInt(view.getInputTf());
                    // checks if denomination valid
                    if(num == 1 || num == 5 || num == 10 |num == 20 || num == 50 || num == 100 || num == 200 || num == 500 || num == 1000) {
                        digits += view.getInputTf();
                        tempInt1 = Integer.parseInt(digits);
                        stage += 1;
                        view.resetFields();
                        digits = "";
                        view.displayTxtA.append("Enter quantity to replenish: ");
                    }
                    else {
                        view.resetFields();
                        view.displayTxtA.append("Incorrect denomination.\nReturning to maintenance menu.\n\n");
                        view.displayTxtA.append(model.maintenanceMenu());
                        stage = 4;
                    }
                }

                else if(stage == 11){
                    digits += view.getInputTf();
                    tempInt2 = Integer.parseInt(digits);

                    if(type == 0){
                        model.replenishMoney(model.rvm.getBanknoteCounter(), tempInt1, tempInt2);
                    }
                    else if(type == 1){
                        model.replenishMoney(model.svm.getBanknoteCounter(), tempInt1, tempInt2);
                    }
                    view.displayTxtA.setText("You successfully replenished " + tempInt2 + " pieces of \u20B1" + tempInt1 + ".\n");

                    stage -= 7;
                    view.displayTxtA.append("\n" + model.maintenanceMenu());
                    multiple_digits = 0;
                    view.resetFields();
                }
            }
        });


        /**
         * ActionListener for the "Ricotta Cheese" button in the vending machine view.
         * This method displays the information for Ricotta Cheese and sets it as the selected item.
         * If the vending machine type is regular (type == 0), it displays the calories from RVM.
         * If the vending machine type is special (type != 0), it displays the calories from SVM.
         */
        view.setItem1BtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0) {
                    view.displayTxtA.append("\nYou selected Ricotta Cheese!\nCalories: " + model.getItemCalories(model.rvm.getItemSlots(), 0) + "\n");
                    model.rvm.setSelectedSlot(0);
                } else {
                    view.displayTxtA.append("\nYou selected Ricotta Cheese!\nCalories: " + model.getItemCalories(model.svm.getItemSlots(), 0) + "\n");
                    model.svm.setSelectedSlot(0);
                }
                view.displayTxtA.append("\nWould you like to proceed with your transaction?");
            }
        });


        /**
         * ActionListener for the "Pepperoni" button in the vending machine view.
         * This method displays the information for Pepperoni and sets it as the selected item.
         * If the vending machine type is regular (type == 0), it displays the calories from RVM.
         * If the vending machine type is special (type != 0), it displays the calories from SVM.
         */
        view.setItem2BtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0) {
                    view.displayTxtA.append("\nYou selected Pepperoni!\nCalories: " + model.getItemCalories(model.rvm.getItemSlots(), 1) + "\n");
                    model.rvm.setSelectedSlot(1);
                } else {
                    view.displayTxtA.append("\nYou selected Pepperoni!\nCalories: " + model.getItemCalories(model.svm.getItemSlots(), 1) + "\n");
                    model.svm.setSelectedSlot(1);
                }
                view.displayTxtA.append("\nWould you like to proceed with your transaction?");
            }
        });


        /**
         * ActionListener for the "Bacon" button in the vending machine view.
         * This method displays the information for Bacon and sets it as the selected item.
         * If the vending machine type is regular (type == 0), it displays the calories from RVM.
         * If the vending machine type is special (type != 0), it displays the calories from SVM.
         */
        view.setItem3BtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0) {
                    view.displayTxtA.append("\nYou selected Bacon!\nCalories: " + model.getItemCalories(model.rvm.getItemSlots(), 2) + "\n");
                    model.rvm.setSelectedSlot(2);
                } else {
                    view.displayTxtA.append("\nYou selected Bacon!\nCalories: " + model.getItemCalories(model.svm.getItemSlots(), 2) + "\n");
                    model.svm.setSelectedSlot(2);
                }
                view.displayTxtA.append("\nWould you like to proceed with your transaction?");
            }
        });


        /**
         * ActionListener for the "Mozarella Cheese" button in the vending machine view.
         * This method displays the information for Mozarella Cheese and sets it as the selected item.
         * If the vending machine type is regular (type == 0), it displays the calories from RVM.
         * If the vending machine type is special (type != 0), it displays the calories from SVM.
         */
        view.setItem4BtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0) {
                    view.displayTxtA.append("\nYou selected Mozarella Cheese!\nCalories: " + model.getItemCalories(model.rvm.getItemSlots(), 3) + "\n");
                    model.rvm.setSelectedSlot(3);
                } else {
                    view.displayTxtA.append("\nYou selected Mozarella Cheese!\nCalories: " + model.getItemCalories(model.svm.getItemSlots(), 3) + "\n");
                    model.svm.setSelectedSlot(3);
                }
                view.displayTxtA.append("\nWould you like to proceed with your transaction?");
            }
        });


        /**
         * ActionListener for the "Parmesan Cheese" button in the vending machine view.
         * This method displays the information for Parmesan Cheese and sets it as the selected item.
         * If the vending machine type is regular (type == 0), it displays the calories from RVM.
         * If the vending machine type is special (type != 0), it displays the calories from SVM.
         */
        view.setItem5BtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0) {
                    view.displayTxtA.append("\nYou selected Parmesan Cheese!\nCalories: " + model.getItemCalories(model.rvm.getItemSlots(), 4) + "\n");
                    model.rvm.setSelectedSlot(4);
                } else {
                    view.displayTxtA.append("\nYou selected Parmesan Cheese!\nCalories: " + model.getItemCalories(model.svm.getItemSlots(), 4) + "\n");
                    model.svm.setSelectedSlot(4);
                }
                view.displayTxtA.append("\nWould you like to proceed with your transaction?");
            }
        });


        /**
         * ActionListener for the "Water" button in the vending machine view.
         * This method displays the information for Water and sets it as the selected item.
         * If the vending machine type is regular (type == 0), it displays the calories from RVM.
         * If the vending machine type is special (type != 0), it displays the calories from SVM.
         */
        view.setItem6BtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0) {
                    view.displayTxtA.append("\nYou selected water!\nCalories: " + model.getItemCalories(model.rvm.getItemSlots(), 5) + "\n");
                    model.rvm.setSelectedSlot(5);
                } else {
                    view.displayTxtA.append("\nYou selected water!\nCalories: " + model.getItemCalories(model.svm.getItemSlots(), 5) + "\n");
                    model.svm.setSelectedSlot(5);
                }
                view.displayTxtA.append("\nWould you like to proceed with your transaction?");
            }
        });


        /**
         * ActionListener for the "Coca-Cola" button in the vending machine view.
         * This method displays the information for Coca-Cola and sets it as the selected item.
         * If the vending machine type is regular (type == 0), it displays the calories from RVM.
         * If the vending machine type is special (type != 0), it displays the calories from SVM.
         */
        view.setItem7BtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0) {
                    view.displayTxtA.append("\nYou selected Coca-Cola!\nCalories: " + model.getItemCalories(model.rvm.getItemSlots(), 6) + "\n");
                    model.rvm.setSelectedSlot(6);
                } else {
                    view.displayTxtA.append("\nYou selected Coca-Cola!\nCalories: " + model.getItemCalories(model.svm.getItemSlots(), 6) + "\n");
                    model.svm.setSelectedSlot(6);
                }
                view.displayTxtA.append("\nWould you like to proceed with your transaction?");
            }
        });


        /**
         * ActionListener for the "Coffee" button in the vending machine view.
         * This method displays the information for Coffee and sets it as the selected item.
         * If the vending machine type is regular (type == 0), it displays the calories from RVM.
         * If the vending machine type is special (type != 0), it displays the calories from SVM.
         */
        view.setItem8BtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (type == 0) {
                    view.displayTxtA.append("\nYou selected Coffee!\nCalories: " + model.getItemCalories(model.rvm.getItemSlots(), 7) + "\n");
                    model.rvm.setSelectedSlot(7);
                } else {
                    view.displayTxtA.append("\nYou selected Coffee!\nCalories: " + model.getItemCalories(model.svm.getItemSlots(), 7) + "\n");
                    model.svm.setSelectedSlot(7);
                }
                view.displayTxtA.append("\nWould you like to proceed with your transaction?");
            }
        });


        /**
         * ActionListener for the "1 peso" button in the vending machine view.
         * This method adds 1 peso to the payment and updates the amount inserted.
         * It calculates the change if any and updates the change display accordingly.
         */
        view.setOneBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment[0] += 1;
                amount += 1;
                view.setInsertedCoinsTf(Double.toString(amount) + "0");
                change = amount - total;
                if (change > 0) {
                    view.setChangeTf(Double.toString(change) + "0");
                }
            }
        });


        /**
         * ActionListener for the "5 peso" button in the vending machine view.
         * This method adds 5 pesos to the payment and updates the amount inserted.
         * It calculates the change if any and updates the change display accordingly.
         */
        view.setFiveBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment[1] += 1;
                amount += 5;
                view.setInsertedCoinsTf(Double.toString(amount) + "0");
                change = amount - total;
                if (change > 0) {
                    view.setChangeTf(Double.toString(change) + "0");
                }
            }
        });


        /**
         * ActionListener for the "10 peso" button in the vending machine view.
         * This method adds 10 pesos to the payment and updates the amount inserted.
         * It calculates the change if any and updates the change display accordingly.
         */
        view.setTenBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment[2] += 1;
                amount += 10;
                view.setInsertedCoinsTf(Double.toString(amount) + "0");
                change = amount - total;
                if (change > 0) {
                    view.setChangeTf(Double.toString(change) + "0");
                }
            }
        });


        /**
         * ActionListener for the "20 pesos" button in the vending machine view.
         * This method adds 20 pesos to the payment and updates the amount inserted.
         * It calculates the change if any and updates the change display accordingly.
         */
        view.setTwentyBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment[3] += 1;
                amount += 20;
                view.setInsertedCoinsTf(Double.toString(amount) + "0");
                change = amount - total;
                if (change > 0) {
                    view.setChangeTf(Double.toString(change) + "0");
                }
            }
        });


        /**
         * ActionListener for the "50 pesos" button in the vending machine view.
         * This method adds 50 pesos to the payment and updates the amount inserted.
         * It calculates the change if any and updates the change display accordingly.
         */
        view.setFiftyBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment[4] += 1;
                amount += 50;
                view.setInsertedCoinsTf(Double.toString(amount) + "0");
                change = amount - total;
                if (change > 0) {
                    view.setChangeTf(Double.toString(change) + "0");
                }
            }
        });


        /**
         * ActionListener for the "100 pesos" button in the vending machine view.
         * This method adds 100 pesos to the payment and updates the amount inserted.
         * It calculates the change if any and updates the change display accordingly.
         */
        view.setOneHndBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment[5] += 1;
                amount += 100;
                view.setInsertedCoinsTf(Double.toString(amount) + "0");
                change = amount - total;
                if (change > 0) {
                    view.setChangeTf(Double.toString(change) + "0");
                }
            }
        });


        /**
         * ActionListener for the "200 pesos" button in the vending machine view.
         * This method adds 200 pesos to the payment and updates the amount inserted.
         * It calculates the change if any and updates the change display accordingly.
         */
        view.setTwoHndBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment[6] += 1;
                amount += 200;
                view.setInsertedCoinsTf(Double.toString(amount) + "0");
                change = amount - total;
                if (change > 0) {
                    view.setChangeTf(Double.toString(change) + "0");
                }
            }
        });


        /**
         * ActionListener for the "500 pesos" button in the vending machine view.
         * This method adds 500 pesos to the payment and updates the amount inserted.
         * It calculates the change if any and updates the change display accordingly.
         */
        view.setFiveHndBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment[7] += 1;
                amount += 500;
                change = amount - total;
                view.setInsertedCoinsTf(Double.toString(amount) + "0");
                if (change > 0) {
                    view.setChangeTf(Double.toString(change) + "0");
                }
            }
        });


        /**
         * ActionListener for the "1000 pesos" button in the vending machine view.
         * This method adds 1000 pesos to the payment and updates the amount inserted.
         * It calculates the change if any and updates the change display accordingly.
         */
        view.setOneTndBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                payment[8] += 1;
                amount += 1000;
                change = amount - total;
                view.setInsertedCoinsTf(Double.toString(amount) + "0");
                if (change > 0) {
                    view.setChangeTf(Double.toString(change) + "0");
                }
            }
        });


        /**
         * ActionListener for the "Purchase" button in the vending machine view.
         * This method handles the purchase process when the button is clicked.
         * If the purchase is valid or the custom pizza process is in the second step,
         * it calculates the total price and displays the amount to be paid.
         * If the custom pizza process is in the first step, it prepares the customized pizza
         * and prompts the user to insert the payment.
         * If the payment is sufficient, it calculates the change and dispenses the item.
         * If the payment is insufficient, it cancels the transaction and refunds the payment.
         */
        view.setPurchaseBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (purchase == 1 || cstm == 4) {
                    if (custom == 1) {
                        // Custom Pizza - Step 1: Prepare and display customized pizza details
                        view.resetInsertedCoinsTf();
                        view.resetChangeTf();
                        view.setCustomPanelVisible(false);
                        total = model.computeSpecialPrice(model.svm.getItemSlots(), model.svm.getIngredients(),
                                model.svm.getSelectedRegularItems(), model.svm.getSelectedIngredients());
                        view.displayTxtA.setText(model.prepCustomizedPizza(model.svm.getItemSlots(), model.svm.getIngredients(),
                                model.svm.getAllSelectedItems()));
                        DecimalFormat decimalFormat = new DecimalFormat("#.00");
                        String formattedTotal = decimalFormat.format(total);
                        view.displayTxtA.append("Your total is " + formattedTotal + ". \nPlease insert your payment.\n");
                        view.displayTxtA.append("Total calories of pizza: " + model.computeSpecialCalories(model.svm.getItemSlots(),
                                model.svm.getIngredients(), model.svm.getSelectedRegularItems(), model.svm.getSelectedIngredients()) + "\n");
                        custom += 1; // custom == 2
                        view.displayTxtA.append("Once finished, click purchase again.");
                        dispense = 0;
                    } else { // custom == 2
                        // Regular Purchase Process
                        if (type == 0) {
                            amount = model.computePayment(payment, model.rvm.getBanknoteCounter(), model.rvm.getEarnings());
                        } else {
                            amount = model.computePayment(payment, model.svm.getBanknoteCounter(), model.svm.getEarnings());
                        }
                        change = amount - total;

                        if (change < 0) {
                            view.displayTxtA.append("\nTransaction cancelled due to insufficient payment inserted.\n");
                        } else {
                            DecimalFormat decimalFormat = new DecimalFormat("#.00");
                            if (type == 0) {
                                if (model.isChangeEnough(model.rvm.getBanknote(), model.rvm.getBanknoteCounter(), (int) change)) {
                                    model.rvm.setTotalCollected(model.rvm.getTotalCollected() + total);
                                    String formattedChange = decimalFormat.format(change);
                                    view.displayTxtA.append("\nYour change of \u20B1" + formattedChange +
                                            " and your item are now ready. Click dispense to collect.\n");
                                    dispense = 1;
                                } else {
                                    view.displayTxtA.append("Transaction cancelled due to insufficient change. " +
                                            "Click dispense to collect your refund.\n");
                                    model.refundPayment(model.rvm.getBanknoteCounter(), payment);
                                    dispense = 1;
                                }
                            } else if (type == 1) {
                                if (model.isChangeEnough(model.svm.getBanknote(), model.svm.getBanknoteCounter(), (int) change)) {
                                    model.svm.setTotalCollected(model.svm.getTotalCollected() + total);
                                    String formattedChange = decimalFormat.format(change);
                                    view.displayTxtA.append("\nYour change of \u20B1" + formattedChange +
                                            " and your item are now ready. Click dispense to collect.\n");
                                    if (custom != 0) {
                                        addedCustom = 1;
                                    }
                                    dispense = 1;
                                } else {
                                    view.displayTxtA.append("\nTransaction cancelled due to insufficient change. " +
                                            "Click dispense to collect your refund.\n");
                                    model.refundPayment(model.svm.getBanknoteCounter(), payment);
                                    dispense = 1;
                                }
                            }
                        }
                        purchase = 0; // set to default
                    }
                } else {
                    view.displayTxtA.append("\nInvalid button.\nPlease press the correct one.");
                }
            }
        });


        /**
         * ActionListener for the "Dispense" button in the vending machine view.
         * This method handles the dispensing process when the button is clicked.
         * If the dispense is valid, it dispenses the item and returns the change (if any).
         * If the dispense is invalid, it displays an error message to the user.
         * The method also resets the inserted coins and change fields.
         */
        view.setDispenseBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.resetInsertedCoinsTf();
                view.resetChangeTf();
                if (dispense == 1) {
                    if (type == 0) {
                        model.dispenseItem(model.rvm.getItemSlots(), model.rvm.getSalesTracker(),
                                model.rvm.getSelectedSlot(), total, model.rvm.getTotalCollected());
                    }
                    else if (type == 1) {
                        if (custom != 2) { // Regular Purchase Dispense
                            model.dispenseItem(model.svm.getItemSlots(), model.svm.getSalesTracker(),
                                    model.svm.getSelectedSlot(), total, model.svm.getTotalCollected());
                        }
                        else { // Custom Pizza Dispense
                            for (int i = 0; i < 8; i++) {
                                if (model.accessElemOfArray(model.svm.getSelectedRegularItems(), i) == 1) {
                                    model.dispenseItem(model.svm.getItemSlots(), model.svm.getSalesTracker(), i, total,
                                            model.svm.getTotalCollected());
                                }
                            }

                            for (int i = 0; i < 7; i++) {
                                if (model.accessElemOfArray(model.svm.getSelectedIngredients(), i) == 1) {
                                    model.dispenseItem(model.svm.getIngredients(), model.svm.getSpecialItemsTracker(), i, total,
                                            model.svm.getTotalCollected());
                                }
                            }
                        }
                    }
                    dispense = 0;
                    view.setCoinsFrameVisible(false);
                    view.displayTxtA.setText("\nTransaction completed. Dispensing item/refund...");
                    view.displayTxtA.append("\nReturning to testing features menu...\n\n");
                    view.resetChangeTf();
                    view.displayTxtA.append(model.testMenu());
                    stage -= 1;
                }
                else {
                    view.displayTxtA.append("\nInvalid button.\nPlease press the correct one.");
                }
            }
        });


        /**
         * ActionListener for the "Clear" button in the vending machine view.
         * This method handles the action when the "Clear" button is clicked.
         * It resets the inserted coins and change fields to zero.
         */
        view.setClrBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.resetInsertedCoinsTf();
                view.resetChangeTf();
                change = 0;
                amount = 0;
            }
        });


        /**
         * ActionListener for the "Pizza" button in the vending machine view.
         * This method handles the action when the "Pizza" button is clicked.
         * It loads the pizza customization, allowing the user to create a custom pizza
         * by selecting ingredients from the menu. Once the customization is finished,
         * the user can click "Purchase" to proceed with the transaction.
         */
        view.setPizzaBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.displayTxtA.setText("Pizza Customization loaded.\nCreate your pizza by selecting from the ingredients menu.\n");
                view.displayTxtA.append("Once finished customizing, click Purchase.\n");

                // Reset to 0
                for (int i = 0; i < 8; i++) {
                    model.assignElemtoArray(model.svm.getSelectedRegularItems(), 0, i);
                }

                for (int i = 0; i < 7; i++) {
                    model.assignElemtoArray(model.svm.getSelectedIngredients(), 0, i);
                }

                for (int i = 0; i < 12; i++) {
                    model.assignElemtoArray(model.svm.getAllSelectedItems(), 0, i);
                }

                view.setSpecialPanelVisible(false);
                view.setCustomPanelVisible(true);
                view.setCoinsFrameVisible(true);
                custom = 1;
            }
        });


        /**
         * ActionListener for the "Thin Crust" button in the pizza customization view.
         * This method handles the action when the "Thin Crust" button is clicked.
         * It selects the thin crust for the custom pizza and updates the calorie count.
         */
        view.setThinCBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedIngredients(), 1, 0);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 0);
                view.displayTxtA.append("\nThin crust selected! Calories: 1092\n");
                view.setCrustPanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Thick Crust" button in the pizza customization view.
         * This method handles the action when the "Thick Crust" button is clicked.
         * It selects the thick crust for the custom pizza and updates the calorie count.
         */
        view.setsThickCBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedIngredients(), 1, 1);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 1);
                view.displayTxtA.append("\nThick crust selected!\nCalories: 1092\n");
                view.setCrustPanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Gluten-Free Crust" button in the pizza customization view.
         * This method handles the action when the "Gluten-Free Crust" button is clicked.
         * It selects the gluten-free crust for the custom pizza and updates the calorie count.
         */
        view.setgfCBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedIngredients(), 1, 2);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 2);
                view.displayTxtA.append("\nGluten-free crust selected!\nCalories: 1092\n");
                view.setCrustPanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Mozzarella Cheese" button in the pizza customization view.
         * This method handles the action when the "Mozzarella Cheese" button is clicked.
         * It selects Mozzarella cheese for the custom pizza and updates the calorie count.
         */
        view.setsMozzaBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedRegularItems(), 1, 3);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 3);
                view.displayTxtA.append("\nMozzarella cheese selected!\nCalories: 72\n");
                view.setCheesePanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Parmesan Cheese" button in the pizza customization view.
         * This method handles the action when the "Parmesan Cheese" button is clicked.
         * It selects Parmesan cheese for the custom pizza and updates the calorie count.
         */
        view.setParmBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedRegularItems(), 1, 4);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 4);
                view.displayTxtA.append("\nParmesan cheese selected!\nCalories: 111\n");
                view.setCheesePanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Ricotta Cheese" button in the pizza customization view.
         * This method handles the action when the "Ricotta Cheese" button is clicked.
         * It selects Ricotta cheese for the custom pizza and updates the calorie count.
         */
        view.setRicottaBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedRegularItems(), 1, 0);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 5);
                view.displayTxtA.append("\nRicotta cheese selected!\nCalories: 156\n");
                view.setCheesePanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Bell Pepper" button in the pizza customization view.
         * This method handles the action when the "Bell Pepper" button is clicked.
         * It selects Bell Pepper for the custom pizza and updates the calorie count.
         */
        view.setBPBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedIngredients(), 1, 3);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 6);
                view.displayTxtA.append("\nBell pepper selected!\nCalories: 20\n");
                view.setVeggiesPanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Mushroom" button in the pizza customization view.
         * This method handles the action when the "Mushroom" button is clicked.
         * It selects Mushroom for the custom pizza and updates the calorie count.
         */
        view.setMushroomBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedIngredients(), 1, 4);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 7);
                view.displayTxtA.append("\nMushroom selected!\nCalories: 3\n");
                view.setVeggiesPanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Olives" button in the pizza customization view.
         * This method handles the action when the "Olives" button is clicked.
         * It selects Olives for the custom pizza and updates the calorie count.
         */
        view.setOlivesBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedIngredients(), 1, 5);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 8);
                view.displayTxtA.append("\nOlives selected!\nCalories: 59\n");
                view.setVeggiesPanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Pepperoni" button in the pizza customization view.
         * This method handles the action when the "Pepperoni" button is clicked.
         * It selects Pepperoni for the custom pizza and updates the calorie count.
         */
        view.setPepperroniBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedRegularItems(), 1, 1);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 9);
                view.displayTxtA.append("\nPepperoni selected!\nCalories: 270\n");
                view.setMeatPanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "Bacon" button in the pizza customization view.
         * This method handles the action when the "Bacon" button is clicked.
         * It selects Bacon for the custom pizza and updates the calorie count.
         */
        view.setBaconBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedRegularItems(), 1, 2);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 10);
                view.displayTxtA.append("\nBacon selected!\nCalories: 275\n");
                view.setMeatPanelVisible(false);
                cstm += 1;
            }
        });


        /**
         * ActionListener for the "All-Natural Chicken" button in the pizza customization view.
         * This method handles the action when the "All-Natural Chicken" button is clicked.
         * It selects All-Natural Chicken for the custom pizza and updates the calorie count.
         */
        view.setChickenBtnListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.assignElemtoArray(model.svm.getSelectedIngredients(), 1, 6);
                model.assignElemtoArray(model.svm.getAllSelectedItems(), 1, 11);
                view.displayTxtA.append("\nAll-natural chicken selected!\nCalories: 191\n");
                view.setMeatPanelVisible(false);
                cstm += 1;
            }
        });

    }
    
    /**
     * The main entry point for the Vending Machine application.
     * Initializes the VendingMachineModel, VendingMachineView, and VendingMachineController,
    * and starts the application.
    *
    * @param args The command-line arguments (not used in this application).
    */
    
    public static void main(String[] args) {
        // Create an instance of the VendingMachineModel
        VendingMachineModel model = new VendingMachineModel();

        // Create an instance of the VendingMachineView
        VendingMachineView view = new VendingMachineView();

        // Create an instance of the VendingMachineController and pass in the model and view
        VendingMachineController controller = new VendingMachineController(model, view);
    }

}