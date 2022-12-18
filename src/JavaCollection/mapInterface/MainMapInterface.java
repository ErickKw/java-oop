package JavaCollection.mapInterface;

import java.util.HashMap;
import java.util.Map;

public class MainMapInterface {
    public static void main(String[] args) {
        Map<String, mapCountry> map = new HashMap<>();

//        mapCountry country = new mapCountry(1, "USA", "America");
        map.put("Ind", new mapCountry(1, "ID","Indonesia"));
        map.put("AF", new mapCountry(2, "AF","Afghanistan"));
        map.put("AR", new mapCountry(3, "AR","Argentina"));
        map.put("AU", new mapCountry(4, "AU","Australia"));
        map.put("BR", new mapCountry(5, "BR","Brazil"));

        for (Map.Entry<String, mapCountry> entry : map.entrySet()){
            mapCountry country = entry.getValue();
            System.out.println("Country: "+ country.getCountryName());
        }
        System.out.println(map.get("Ind").getCountryName());
//        System.out.println(map.get("dua").getName());
    }
}