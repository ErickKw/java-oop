package JavaCollection.mapInterface;

import java.util.Map;
import java.util.*;

public class LinkedHashMap {
    public static void main(String[] args) {
//        Map<mapCountry, String> map = new java.util.LinkedHashMap<>();
//        map.put("ID", new mapCountry(1, "ID", "Indonesia"));
//        for (var key : map.keySet()){
//            System.out.println(key);
//        }
        Map<String, String> map = new java.util.LinkedHashMap<>();
        map.put("Er", "Erick");
        map.put("Kus", "Kusuma");
        map.put("War", "Wardani");
        for (var key : map.keySet()){
            System.out.println(key);
        }
    }
}
