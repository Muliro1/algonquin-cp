public class Meat {
    private String meatType;
    private double weight;
    private int pricePerKg;

    public Meat() {
        this.meatType = null;
        this.weight = 0.0;
        this.pricePerKg = 0;
    }

    public String getMeatType() {
        return meatType;
    }

    public void setMeatType(String meatType) {
        this.meatType = meatType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

	@Override
	public String toString() {
		return "Meat [meatType=" + meatType + ", weight=" + weight + ", pricePerKg=" + pricePerKg + "]";
	}
    
}
