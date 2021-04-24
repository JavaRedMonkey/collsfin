package pasha.edu;

/*
@USER: Java02
@DATE: 24.04.2021
@NAME: ComplexLunch
*/
public class ComplexLunch implements IBill{
    private String name;
    private Integer price;

    public ComplexLunch() {
    }

    public ComplexLunch(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ComplexLunch " +
                "Имя ='" + name + '\'' +
                ", Цена=" + price +
                '}';
    }

    @Override
    public Integer getBill() {
        return this.getPrice();
    }
}
