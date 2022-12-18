package JavaCollection.mapInterface;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
public class identityHashMap {
    public static void main(String[] args) {
        Map<mapCountry, String> map = new IdentityHashMap<>();

        mapCountry ID = new mapCountry(1, "ID", "Indonesia");
        mapCountry AF = new mapCountry(2, "AF", "Afghanistan");
        map.put(ID, "Jakarta");
        map.put(AF, "Robbin");
        System.out.println(map);
    }
}
