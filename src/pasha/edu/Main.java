package pasha.edu;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	ComplexLunch g1 = new ComplexLunch("n1",70);
	ComplexLunch g2 = new ComplexLunch("n2",190);
	ComplexLunch g3 = new ComplexLunch("n1",70);
	ComplexLunch g4 = new ComplexLunch("n2",190);
	ComplexLunch g5 = new ComplexLunch("n1",70);
	OrderLunch g6 = new OrderLunch("Цезарь" ,
            50 ,
            "Гороховий Суп" ,
            33,
            "Картошка С Мяском(ГМО)" ,
            80 ,
            "Песочный пирог с творогом" ,
            70);

        OrderLunch g7 = new OrderLunch("Салат к пиву " ,
                90 ,
                "Борщ" ,
                60,
                "Шашличок и Лучок(ГМО)" ,
                110 ,
                "Песочный пирог с творогом" ,
                120);

        List<IBill> bills = new ArrayList<>();
        bills.add(g1);
        bills.add(g2);
        bills.add(g3);
        bills.add(g4);
        bills.add(g5);
        bills.add(g6);
        bills.add(g7);
        int sum = bills.stream().
                mapToInt(gest -> gest.getBill()).sum();
        System.out.println(sum);

        int max = bills.stream().
                mapToInt(gest -> gest.getBill()).max().getAsInt();
        System.out.println(max);


        int min = bills.stream().
                mapToInt(gest -> gest.getBill()).min().getAsInt();
        System.out.println(min);

        Double agerige = bills.stream().
                mapToInt(gest -> gest.getBill()).average().getAsDouble();
        System.out.println(agerige);
    }
}
