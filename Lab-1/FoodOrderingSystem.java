// food ordering system using java, for Task 4
import java.util.ArrayList;
import java.util.Scanner;

class MenuItem {
    // class for defining menu categories
    public String itemName;
    public ArrayList<MenuItemOption> itemOptions;
    
    MenuItem(String Name, ArrayList<MenuItemOption> Options) {
        this.itemName = Name;
        this.itemOptions = Options;
    }
    
    public ArrayList<MenuItemOption> getOptions(){
        return itemOptions;
    }
}
class MenuItemOption {
    // class for defining items in individual categories
    public String optionName;
    public double optionPrice;
    
    MenuItemOption(String Name, double Price) {
        this.optionName = Name;
        this.optionPrice = Price;
    }
}
public class FoodOrderingSystem {
    public static void main(String[] args) {
        // create the scanner and the menu
        Scanner scanner = new Scanner(System.in);
        ArrayList<MenuItem> menu = new ArrayList<>();
        // create sub-menu for pizza
        ArrayList<MenuItemOption> pizzaOptions = new ArrayList<>();
        pizzaOptions.add(new MenuItemOption("Paperoni Pizza", 5.99));
        pizzaOptions.add(new MenuItemOption("King Crust Pizza", 6.49));
        pizzaOptions.add(new MenuItemOption("Margarita Pizza", 5.99));
        menu.add(new MenuItem("Pizza", pizzaOptions));
        // create sub-menu for drinks
        ArrayList<MenuItemOption> drinkOption = new ArrayList<>();
        drinkOption.add(new MenuItemOption("Coke", 1.49));
        drinkOption.add(new MenuItemOption("Cofee", 1.49));
        drinkOption.add(new MenuItemOption("Lemonade", 1.99));
        menu.add(new MenuItem("Drinks", drinkOption));
        // create sub-menu for burgers
        ArrayList<MenuItemOption> burgerOption = new ArrayList<>();
        burgerOption.add(new MenuItemOption("Zinger Burger", 4.99));
        burgerOption.add(new MenuItemOption("Tower Burger", 5.99));
        burgerOption.add(new MenuItemOption("Cheese Burger", 4.49));
        menu.add(new MenuItem("Burger", burgerOption));
        
        System.out.println("----- FOOD ORDERING SYSTEM -----");
        while (true) {
            System.out.println("Select a category (or type exit to quit):");
            for (MenuItem item: menu){
                System.out.println("- " + item.itemName);
            }
            System.out.print("Enter the item name to select it: ");
            String category = scanner.nextLine();
            
            // use equalsIgnoreCase() to compare the strings regardless of letter case
            if (category.equalsIgnoreCase("exit")) {
                break;
            }
            MenuItem selectedCategory = null;
            for (MenuItem item: menu) {
                if (item.itemName.equalsIgnoreCase(category)) {
                    selectedCategory = item;
                    break;
                }
            }
            if (selectedCategory != null) {
                System.out.println("Available items in " + selectedCategory.itemName + ":");
                for (MenuItemOption option: selectedCategory.getOptions()) {
                    System.out.println("- " + option.optionName);
                }

                System.out.print("Enter the item name to select it: ");
                String itemName = scanner.nextLine();
                
                MenuItemOption selectedOption = null;
                for (MenuItemOption option: selectedCategory.getOptions()) {
                    if (itemName.equalsIgnoreCase(option.optionName)) {
                        selectedOption = option;
                    }
                }
                if (selectedOption != null) {
                    System.out.println("You Selected " + 
                        selectedCategory.itemName + " - " +
                            selectedOption.optionName + " - $" + selectedOption.optionPrice + "\n");
                } else {
                    System.out.println("Please select an item from the menu only.\n");
                }
            } else {
                System.out.println("Please select a category from the menu only.\n");
            }
        }
        // reaches here when the user types in 'exit'
        scanner.close();
        System.out.println("----- THANK YOU -----");
    }
}
