import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ItemService itemService = new ItemService();
    public static void main(String[] args) {
        while(true){
            System.out.println("Press 1 to add an item");
            System.out.println("Press 2 to print all items");
            System.out.println("Press 3 to remove an item");
            System.out.println("Press 4 to update an item");
            int action = scanner.nextInt();
            if(action == 1){
                addItem();
            } else if(action == 2){
                printItems();
            } else if(action == 3){
                removeItem();            
            }else if(action == 4){
                updateItem();            
            }else{
                break;
            }
        }
        
            //If the user chooses 4, then we call update item


            //Create a function that remove items
            //Create a function that update items

    }

    public static void addItem(){
        System.out.println("Provide an item id: ");
        int id = scanner.nextInt();
        System.out.println("Provide an item name: ");
        String name = scanner.next();
        System.out.println("Provide an item cost: ");
        int cost = scanner.nextInt();

        var item = new Item(id, name, cost);
        itemService.addItem(item);

    }

    public static void printItems(){
        System.out.println("These are the items in the storage: ");
        var items = itemService.getItems();
        for (var item : items){
            System.out.println(item.getId() + ". " + item.getName() + " - " + item.getCost() + " EUR");
        }
    }

    public static void removeItem(){
        printItems();
        System.out.println("Which item do you want to remove? Enter the id: ");
        var removed = scanner.nextInt();
        itemService.removeItem(removed);
        System.out.println("Item with id " + removed + " removed successfully");
    }

    public static void updateItem(){
        printItems();
        System.out.println("Which item do you want to update? Enter the id: ");
        var updated = scanner.nextInt();
        System.out.println("Provide an item name: ");
        String name = scanner.next();
        System.out.println("Provide an item cost: ");
        int cost = scanner.nextInt();

        itemService.updateItem(updated, name, cost);
        System.out.println("Item with id " + updated + " updated successfully");
    }
}
