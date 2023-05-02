//Задание
//Разбей входящую строку kittens по символу-разделителю ';' так,
// чтобы программа вывела длину клички каждого котёнка.

package howToSplitAString.task;

public class Practikum {
    public static void main(String[] args) {
        String kittens = "Пушок;Ушастик;Рыжик;Снежок;Черныш";

        String[] split = kittens.split(";");// Разбей строку
        System.out.println(split[0].length());
        System.out.println(split[1].length());
        System.out.println(split[2].length());
        System.out.println(split[3].length());
        System.out.println(split[4].length());
    }
}
