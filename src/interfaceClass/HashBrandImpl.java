package interfaceClass;

public class HashBrandImpl implements HashBrand {
    private String brandName;
    private Integer price;

    public HashBrandImpl(String brandName, Integer price) {
        this.brandName = brandName;
        this.price = price;
    }

    @Override
    public String getBrand() {
        return this.brandName;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }
}
