package howToSplitAString;

public class Praktikum {
    public static void main(String[] args) {
        String kittens = "Пушок,Ушастик,Рыжик,Снежок,Черныш,";
        //charAt разбивает строку на отдельные клички:
        int lastNameStart = 0; // переменная-счётчик
        for (int i = 0; i < kittens.length(); i++) { // цикл
            if (kittens.charAt(i) == ',') { // ориентируется на запятую
                System.out.println(kittens.substring(lastNameStart, i) + " — у него лапки!"); // выводит имя котёнка
                lastNameStart = i + 1;
            }
        }

        //split(String regex). Он превращает строку в массив строк String[]
/*        Метод разделит строку по символу или строке-разделителю regex.
            Например, в случае с кличками котиков этот символ — запятая ','. Целиком получится String[]
        split = kittens.split(",")*/

        String[] split = kittens.split(",");

        System.out.println(split[0]);  // выведет "Пушок"
        System.out.println(split[1]);  // выведет "Ушастик"
        System.out.println(split[2]);  // выведет "Рыжик"
        System.out.println(split[3]);  // выведет "Снежок"
        System.out.println(split[4]);  // выведет "Черныш"
    }


}