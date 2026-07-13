package Cart;

public class Cart {
    String items[] = new String[10];
    double prices[] = new double[10];
    int cartcount = 0;
    String cartname;

    public void create_cart(int n) {
        this.cartname = "cart" + n;

    }

    public void addItem(String items, double prices) {
        this.items[cartcount] = items;
        this.prices[cartcount] = prices;
        System.out.println(items + " added to" + cartname);
        cartcount++;
    }

    public void cartDetails() {
        System.out.println("Cart Name: " + cartname);
        double total = 0;
        for (int i = 0; i < cartcount; i++) {
            System.out.println(items[i] + " - " + prices[i]);
            total += prices[i];
        }
        System.out.println("Total: " + total);
    }

    public void giveDiscount(double percent) {
        for (int i = 0; i < cartcount; i++) {
            prices[i] -= prices[i] * percent / 100;
        }
    }

}
