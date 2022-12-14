package encapsulation;

public class MainCategory {
  public static void main(String[] args) {
    Category category = new Category();
    category.setId(1);
    category.setName("Obat Kepala");
    category.setDesc("Obat");
    System.out.println(category);

    // constructor
    System.out.println(new Category(2, "Steak", "makanan mahal"));
  }
}
