import menu.Menu;
import menu.impl.MainMenu;

public class App {
    public static void main(String[] args) throws Exception {
        Menu mainMenu = new MainMenu();
        mainMenu.start();
    }
}
