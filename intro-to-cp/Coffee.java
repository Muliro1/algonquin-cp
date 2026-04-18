public class Coffee {
    String size;
    double price;

    // Constructor (no return type!)
    public Coffee(String size, double price) {
        this.size = size.toUpperCase();
        this.price = price;
    }

    public String printReport(double tax) {
        String msg = String.format("order: %s $%.2f", size, price * tax);
        return msg;
    }

    public static void main(String[] args) {
        Coffee pickMeUp = new Coffee("small", 1.00);
        System.out.print(pickMeUp.printReport(0.1));
    }
}