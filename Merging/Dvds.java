public class Dvds {
    int id;
    String title;
    String type;
    int quantity;

    public Dvds(int id, String title, String type, int quantity) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Dvd: " + "I.D. = " + id + ", Title = " + title + ", Type = " + type + ", Quantity = " + quantity;
    }
    
    
    
}
