public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.addComponent(pancakeHouseMenu);
        allMenus.addComponent(dinerMenu);

        dinerMenu.addComponent(new MenuItem("Pasta", "Spaghetti with Marinara Sauce", true, 3.89));
        dinerMenu.addComponent(dessertMenu);

        dessertMenu.addComponent(new MenuItem("Apple Pie", "Apple pie with a flaky crust", true, 1.59));

        allMenus.print();
    }
}