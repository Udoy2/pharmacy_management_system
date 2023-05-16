package pages.Model;
public class Med {
    private int id;
    private String name;
    private String manufacturer;
    private int stock;

    public Med(int id, String name, String manufacturer, int stock) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}