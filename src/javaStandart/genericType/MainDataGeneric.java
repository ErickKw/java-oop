package genericType;

import java.sql.SQLOutput;

public class MainDataGeneric {
    public static void main(String[] args) {
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Ahmad Roni");
        System.out.println("data1 Value "+ data1.getData());

        //data1.setData(1234567); => error

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(1234567);
        System.out.println("data2 Value "+ data2.getData());

        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("data2 Value "+ data3.getData());

        DataGeneric<Product> data4 = new DataGeneric<Product>();
        //data4.setData(new Product("Ajinomoto",2500.00));
        Product product = new Product("Obat Awet Muda",1000000.0);
        data4.setData(product);
        System.out.println("data4 Value "+ data4.getData());


        DataGeneric<String> data5 = new DataGeneric<String>();
        data5.setData("Pajero");
        System.out.println("Nama kendaraan anda adalah " + data5.getData());

        DataGeneric<Car> data6 = new DataGeneric<Car>();
        Car car = new Car("Pajero", 20.3, 1);
        data6.setData(car);
        System.out.println("Data ke 6" + data6.getData());
    }
}

