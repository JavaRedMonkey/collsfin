package pasha.edu;

/*
@USER: Java02
@DATE: 24.04.2021
@NAME: OrderLunch
*/
public class OrderLunch implements IBill{
    private  String salatName;
    private Integer salatPrice;
    private String firstDish;
    private Integer firstDishPrice;
    private String secondDish;
    private Integer secondDishPrice;
    private String desert;
    private Integer desertPrice;

    public OrderLunch() {
    }

    public OrderLunch(String salatName, Integer salatPrice, String firstDish, Integer firstDishPrice, String secondDish, Integer secondDishPrice, String desert, Integer desertPrice) {
        this.salatName = salatName;
        this.salatPrice = salatPrice;
        this.firstDish = firstDish;
        this.firstDishPrice = firstDishPrice;
        this.secondDish = secondDish;
        this.secondDishPrice = secondDishPrice;
        this.desert = desert;
        this.desertPrice = desertPrice;
    }

    public String getSalatName() {
        return salatName;
    }

    public void setSalatName(String salatName) {
        this.salatName = salatName;
    }

    public Integer getSalatPrice() {
        return salatPrice;
    }

    public void setSalatPrice(Integer salatPrice) {
        this.salatPrice = salatPrice;
    }

    public String getFirstDish() {
        return firstDish;
    }

    public void setFirstDish(String firstDish) {
        this.firstDish = firstDish;
    }

    public Integer getFirstDishPrice() {
        return firstDishPrice;
    }

    public void setFirstDishPrice(Integer firstDishPrice) {
        this.firstDishPrice = firstDishPrice;
    }

    public String getSecondDish() {
        return secondDish;
    }

    public void setSecondDish(String secondDish) {
        this.secondDish = secondDish;
    }

    public Integer getSecondDishPrice() {
        return secondDishPrice;
    }

    public void setSecondDishPrice(Integer secondDishPrice) {
        this.secondDishPrice = secondDishPrice;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public Integer getDesertPrice() {
        return desertPrice;
    }

    public void setDesertPrice(Integer desertPrice) {
        this.desertPrice = desertPrice;
    }

    @Override
    public String toString() {
        return "OrderLunch{" +
                "Салатик ='" + salatName + '\'' +
                ", salatPrice=" + salatPrice +
                ", firstDish='" + firstDish + '\'' +
                ", firstDishPrice=" + firstDishPrice +
                ", secondDish='" + secondDish + '\'' +
                ", secondDishPrice=" + secondDishPrice +
                ", desert='" + desert + '\'' +
                ", desertPrice=" + desertPrice;
    }

    @Override
    public Integer getBill() {
        return this.getDesertPrice()
                + this.getSalatPrice()
                + this.getFirstDishPrice()
                + this.getSecondDishPrice()
                + 200;
    }
}
