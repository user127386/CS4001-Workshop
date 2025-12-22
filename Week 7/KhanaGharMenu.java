class MenuItem {
    String itemName;
    double price;
    String category;
    boolean isVegetarian;
    boolean isAvailable;
    MenuItem(String itemName, double price, String category, boolean isVegetarian, boolean isAvailable) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.isAvailable = isAvailable;
    }
    void display() {
        System.out.println(itemName + "       Rs. " + price + "      " + category + "        " + (isVegetarian ? "veg" : "non-veg") + "  " + (isAvailable ? "available" : "not available"));
    }
}
public class KhanaGharMenu {
    public static void main(String[] x) {
        MenuItem[] menu = new MenuItem[4];
        menu[0] = new MenuItem("Dal-Bhat Set", 120, "Dal-Bhat", true, true);
        menu[1] = new MenuItem("Masala Chiya", 15, "Chiya-Nasta", true, true);
        menu[2] = new MenuItem("Dharane Kalo Bangur", 400, "Special", false, true);
        menu[3] = new MenuItem("Sekuwa", 200, "BBQ", false, true);
        System.out.println("==========================KHANA GHAR MENU================================");
        System.out.println("Item Name           Price        Category        Type        Availability");
        for (int i = 0; i < menu.length; i++) {
            menu[i].display();
        }
        System.out.println("================vegetarian items====================");
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].isVegetarian) {
                menu[i].display();
            }
        }
        System.out.println("=================non veg items=========================");
        for (int i = 0; i < menu.length; i++) {
            if (!menu[i].isVegetarian) {
                menu[i].display();
            }
        }
        System.out.println("non vegetarian items price above 100 and available");
        for (int i = 0; i < menu.length; i++) {
            if (!menu[i].isVegetarian && menu[i].price > 100 && menu[i].isAvailable) {
                menu[i].display();
            }
        }
    }
}