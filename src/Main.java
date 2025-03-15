import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    HashMap<String, ArrayList<String>> menu = new HashMap<>();
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.screen();// Создаем экземпляр класса Main
    }

    public void screen(){
        while (true) {
            System.out.println("Вы попали в меню криэйтор");
            System.out.println("Если хотите создать меню, нажмите 1");
            System.out.println("Если хотите закрыть криэйтор, нажмите 2");

            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    createMenu();
                    break;
                case "2":
                    return;

            }

        }
    }
    public void createMenu() {
        System.out.println("Добро пожаловать в программу подбора меню на 1600 ккал");
    System.out.println("Введи его тип блюда");
    String dishType = scanner.nextLine();
    System.out.println("Введи его название блюда");
    String dishName = scanner.nextLine();
        if (!menu.containsKey(dishType)) {
            menu.put(dishType, new ArrayList<>());
        }
        menu.get(dishType).add(dishName);
            System.out.println(menu);}

}
