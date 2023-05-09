//Создай пустую хеш-таблицу kittenToys. В ней будут храниться ключи — имена котят и значения — списки их любимых игрушек.
//Для каждого котёнка создай список любимых игрушек и помести этот список в хеш-таблицу. Создавай списки методом Arrays.asList().
//Проверь, что в хеш-таблице есть игрушки Снежка.
//Проверь, что игрушки всех котят попали в хеш-таблицу: посчитай количество списков в хеш-таблице.
//Выведи на экран любимые игрушки Снежка.
//Выведи на экран все игрушки из хеш-таблицы.
//Очисть хеш-таблицу и проверь, что она пустая.


package hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task {
    public static void main(String[] args) {

        // создай хеш-таблицу
        HashMap<String, List<String>> kittenToys = new HashMap<>();

        // создай список любимых игрушек Пушка
        List<String> pushokToys = Arrays.asList("Мяч");
        // добавь игрушки Пушка в хеш-таблицу
        kittenToys.put("Пушок", pushokToys);

        // создай список любимых игрушек Снежка
        List<String> snezhokToys = Arrays.asList("Бантик");
        // добавь игрушки Снежка в хеш-таблицу
        kittenToys.put("Снежок", snezhokToys);

        // создай список любимых игрушек Черныша
        List<String> chernyshToys = Arrays.asList("Мышка", "Носок");
        // добавь игрушки Черныша в хеш-таблицу
        kittenToys.put("Черныш", chernyshToys);

        // создай список любимых игрушек Ушастика
        List<String> ushastikToys = Arrays.asList("Бантик", "Клубок");
        kittenToys.put("Ушастик", ushastikToys);

        // создай список любимых игрушек Рыжика
        List<String> ryzhikToys = Arrays.asList("Мяч", "Рыбка-пищалка");
        // добавь игрушки Рыжика в хеш-таблицу
        kittenToys.put("Рыжик", ryzhikToys);

        // проверь, что игрушки Снежка внесены в хеш-таблицу
        System.out.println("Игрушки Снежка есть в таблице: " + kittenToys.containsKey("Снежок"));

        // проверь количество списков в хеш-таблице
        System.out.println("В таблице есть игрушки " + kittenToys.size() + " котят");

        // проверь, игрушки каких котят есть в таблице
        System.out.println("В таблице есть игрушки котят: " + kittenToys.keySet());

        // выведи на экран любимые игрушки Снежка
        System.out.println("Любимые игрушки Снежка: " + kittenToys.get("Снежок"));

        // выведи на экран список всех игрушек
        System.out.println("В таблице есть игрушки: " + kittenToys.values());

        // очисть хеш-таблицу
        kittenToys.clear();

        // проверь, очистилась ли таблица
        System.out.println("Хеш-таблица пуста: " + kittenToys.isEmpty());
    }
    }
