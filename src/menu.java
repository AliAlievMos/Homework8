import java.util.Scanner;

public class menu {


    public static void passMenu(){
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext("1")  == true){
            Item.addItem();
            menu.menu();
        }if (sc.hasNext("2")  == true){
            Shop.showALL();
            menu.menu();
        }if (sc.hasNext("3")  == true){
            Item.deleteItem();
            menu.menu();
        }if (sc.hasNext("4")  == true){
            Item.changeQuantityItem();
            menu.menu();
        }if (sc.hasNext("5")  == true){
            System.out.println("Выхожу...");
        }

    }
    public static void showMenu(){
        System.out.println("   МЕНЮ");
        System.out.println("1. Добавить товар");
        System.out.println("2. Вывести все товары");
        System.out.println("3. Удалить товар");
        System.out.println("4. Измнеить кол-во товара");
        System.out.println("5. Выход");

    }
    public static void menu(){
        showMenu();
        passMenu();
    }

}
