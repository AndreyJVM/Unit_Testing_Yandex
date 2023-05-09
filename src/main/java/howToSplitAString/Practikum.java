package howToSplitAString;

public class Practikum {
    public static void main(String[] args) {
        String[] arrayOFDishes = new String[]{
                "борщ",
                "котлета",
                "компот"
        };

        String allDishes = String.join(", ", arrayOFDishes);
        System.out.println(allDishes);
    }
}
