
//Создай хеш-таблицу kittenWeights с весом котят. Напиши в угловых скобках типы ключей и значений.
package hashMap;
import java.util.HashMap;
public class Praktikum {
    public static void main(String[] args) {
        // объяви хеш-таблицу kittenWeights:
        // ключ - кличка котёнка, значение - его вес
        // создай объект - хеш-таблицу
        HashMap<String, Double> kittenWeights = new HashMap<>();

        //Создай хеш-таблицу kittenWeights с весом котят. Сохрани в ней значения:
        //Пушок — 1,62 кг;
        //Снежок — 1,91 кг;
        //Черныш — 1,76 кг;
        //Ушастик — 2,02 кг;
        //Рыжик — 1,88 кг.
        //После этого измени вес Черныша: теперь он весит 1,96 кг.
        //Выведи хеш-таблицу на экран.
        kittenWeights.put("Пушок", 1.62);
        kittenWeights.put("Снежок", 1.91);
        kittenWeights.put("Черныш", 1.76);
        kittenWeights.put("Ушастик", 2.02);
        kittenWeights.put("Рыжик", 1.88);

        kittenWeights.put("Черныш", 1.96);

        System.out.println(kittenWeights);

        Double kittenWeightsSum = 0.0;
        // получи вес каждого котёнка oneKittenWeight
        // и прибавь его к переменной суммарного веса
        for (Double oneKittenWeight : kittenWeights.values()) {
            kittenWeightsSum += oneKittenWeight;
        }
        // выведи на экран суммарный вес котят
        System.out.println("Суммарный вес котят: " + kittenWeightsSum + " кг");


        //Выведи на экран клички всех котят из хеш-таблицы.
        //Используй цикл for each с переменной итерирования kittenName — кличка котёнка.
        for (String kittenName : kittenWeights.keySet()) {
            System.out.println(kittenName);
        }
    }
}
