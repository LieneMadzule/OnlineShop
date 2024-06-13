import java.util.ArrayList;

public class Shop {

  // Shop functionality
  // AddItemToCart -> done
  // Get the items list -> done
  // RemoveItemFromCart -> future
  // Checkout (get the totalPrice)
  private ArrayList<Item> cart = new ArrayList<Item>();

  public void addItemToCart(Item item) {
    // items list, it would contain the amount of available items
    // Before we add item to the cart, we would check whether or not it is available
    cart.add(item);
  }

  public int checkout() { // get the total cost
    int sum = 0;
    for (var item : cart) {
      sum += item.getCost();
    }
    return sum;
  }

}
