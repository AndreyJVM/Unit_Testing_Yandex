
/*Представь, что тебе нужно накормить котят: они должны заходить на кухню и уходить, когда поели.
  Создай список kittensInTheKitchen. В нём будут храниться клички котят, которые пришли на кухню: Пушок, Снежок, Черныш, Ушастик и Рыжик.
  Проверь, что никто из них не прокрался на кухню до тебя.
  Добавь клички котят в список и проверь, сколько их теперь на кухне. Удаляй котят из списка по инструкции в коде.*/

//Создай список котят: ArrayList<String> kittensInTheKitchen = new ArrayList<>();.
//Метод isEmpty() поможет проверить, есть ли на кухне котята.
//Количество элементов списка можно получить методом size().
//Добавляй каждого котёнка методом add(): например, kittensInTheKitchen.add("Пушок");.
//Чтобы удалить котёнка из списка, передай его индекс или кличку в виде строки в метод remove(). Не забудь, что индексы списка начинаются с 0.
//Чтобы проверить, остался ли котёнок в списке, вызови метод contains().
//Удали всех оставшихся котят из списка методом clear().

package List.task;
import java.util.ArrayList;

public class Praktikum {
    public static void main(String[] args) {
        // создай список kittensInTheKitchen
        ArrayList<String> kittensInTheKitchen = new ArrayList<>();
        // проверь, есть ли котята на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне есть котята, посчитай их
            System.out.println("Котят на кухне: " +kittensInTheKitchen.size());
        }
        // добавь в список каждого котёнка
        kittensInTheKitchen.add("Пушок");
        kittensInTheKitchen.add("Снежок");
        kittensInTheKitchen.add("Черныш");
        kittensInTheKitchen.add("Ушастик");
        kittensInTheKitchen.add("Рыжик");
        // проверь, есть ли котята на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне есть котята, посчитай их
            System.out.println("Котят на кухне: " +kittensInTheKitchen.size());
        }
        // удали Пушка из списка по индексу
        // удали Снежка из списка по имени
        kittensInTheKitchen.remove(0);
        kittensInTheKitchen.remove("Снежок");

        // проверь, пропал ли Снежок из списка
        if (kittensInTheKitchen.contains("Снежок")) {
            System.out.println("Снежок ещё на кухне");
        } else {
            System.out.println("Снежок уже ушёл");
        }
        // удали Черныша из списка по имени
        kittensInTheKitchen.remove("Черныш");
        // проверь, пропал ли Черныш из списка
        if (kittensInTheKitchen.contains("Черныш")) {
            System.out.println("Черныш ещё на кухне");
        } else {
            System.out.println("Черныш уже ушёл");
        }
        // удали оставшихся котят из списка
        kittensInTheKitchen.clear();
        // проверь, сколько теперь котят на кухне
        if (kittensInTheKitchen.isEmpty()) {
            System.out.println("На кухне нет котят");
        } else {
            // если на кухне есть котята, посчитай их
            System.out.println("Котят на кухне: " +kittensInTheKitchen.size());
        }
    }
}
