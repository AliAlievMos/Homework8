import java.util.HashMap;
import java.util.Scanner;

public class Item {
    public static HashMap<String, String> nItem;


    public static void addItem() {
        Scanner sc1 = new Scanner(System.in);
        HashMap<String, String> nItem = new HashMap<>();
        System.out.println("Введите название товара.");
        String name = sc1.next();
        nItem.put("name", name);
        System.out.println("Введите стоимость товара (руб).");
        String cost = sc1.next();
        nItem.put("cost", cost);
        System.out.println("Введите количество товара.");
        String quantity = sc1.next();
        nItem.put("quantity", quantity);
        System.out.println("Вы добавили " + nItem.get("name") + " на склад");
        Shop.shop.add(nItem);

    }

    public static void deleteItem() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите название товара, который хотите удалить");
        String name = sc2.next();
        int a = Shop.shop.size();
        for (int i = 0; i < a; i++) {
            String b = (Shop.shop.get(i)).get("name");
            if (name.equals(b)) {
                System.out.println(b + " удален");
                Shop.shop.remove(i);
            } else {
                continue;
            }


        }

    }

    public static void changeQuantityItem() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите название товара, колличество которого хотите изменить");
        String name = sc3.next();
        System.out.println("Введите актуально колличество товара");
        String quantity = sc3.next();
        int a = Shop.shop.size();
        for (int i = 0; i < a; i++) {
            String b = (Shop.shop.get(i)).get("name");
            if (name.equals(b)) {
                System.out.println("Колличество " + b + " изменено");
                (Shop.shop.get(i)).put("quantity", quantity);
            } else {
                continue;
            }

        }
    }
}
