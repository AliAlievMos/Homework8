import java.util.ArrayList;
import java.util.HashMap;

public interface Shop {
    ArrayList<HashMap<String, String>> shop = new ArrayList<>();
    static void showALL(){
        System.out.println(" НАИМЕНОВАНИЕ "+  " СТОИМОСТЬ "+ " КОЛ-ВО ШТУК ");
        int a = shop.size();
        for (int i = 0; i < a; i++){
           System.out.println ((shop.get(i)).get("name")+ "              "
                   +(shop.get(i)).get("cost")+ "              " +
                   (shop.get(i)).get("quantity"));
        }
    }
}
