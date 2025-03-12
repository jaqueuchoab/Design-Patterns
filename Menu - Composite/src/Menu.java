import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void addComponent(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    public void removeComponent(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }
    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("------------------------");
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
