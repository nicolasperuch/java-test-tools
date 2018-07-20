package food;

public class Cookies {

    private int quantity;

    public Cookies(int quantity) {
        this.quantity = quantity;
    }

    public void eat(int quantity){
        this.quantity -= quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

