package JavaCollection.mapInterface;

import java.util.EnumMap;

public class MainEnumMap {

    public static enum Level{
        FREE, STANDART, VIP, PREMIUM
    }

    public static void main(String[] args) {
        EnumMap<Level, String> map = new EnumMap<>(Level.class);
        map.put(Level.FREE, "Gratis");
        map.put(Level.STANDART, "Bayar");

        System.out.println(Level.FREE);
        System.out.println(Level.STANDART);
    }
}
