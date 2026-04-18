public class List {
    public static void main(String[] args) {
        double[] price = {20.0, 30.5, 25.0};
        double[] discountPrice = new double[price.length];
        for (int i = 0; i < price.length; i++) {
            discountPrice[i] = price[i] - price[i] * 0.1; // Apply 10% discount
        }
        System.out.println("Original prices:");
        for (double p : price) {
            System.out.printf("%.2f ", p);
        }
        System.out.println();
        System.out.println("Discounted prices:");
        for (double p : discountPrice) {
            System.out.printf("%.2f ", p);
        }
        System.out.println();
    }
}