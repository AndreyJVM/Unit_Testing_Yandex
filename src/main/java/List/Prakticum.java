package List;
//Составь список kittenNames и добавь в него клички котят:
// Пушок, Ушастик, Рыжик, Снежок. Поставь кличку Снежок на второе место в списке и выведи список на экран.


import java.util.ArrayList;

public class Prakticum {
    public static void main(String[] args) {
        // создай список
        ArrayList<String> kittenNames = new ArrayList<>();

        kittenNames.add(0,"Пушок");
        kittenNames.add(1,"Снежок");
        kittenNames.add(2,"Ушастик");
        kittenNames.add(3,"Рыжик");

        System.out.println(kittenNames);

        //Некоторые котята решили поменять клички. Внеси их в список: замени кличку Черныш на Черныш-крепыш,
        // а Снежок — на Снежок-красавчик. Выведи список на экран, чтобы проверить изменения.

        kittenNames.set(2,"Черныш-крепыш");
        kittenNames.set(1, "Снежок-красавчик");
        System.out.println(kittenNames);


        //Добавь на третье место в списке кличку Черныш методом add().
        //Выведи на экран последнюю, предпоследнюю и третью кличку в списке.
        //Не меняй местами строки кода.

        // добавь кличку Черныш на третье место в списке
        kittenNames.add(2,"Черныш");
        // выведи на экран последнюю кличку в списке
        System.out.println(kittenNames.get(4));
        // выведи на экран предпоследнюю кличку в списке
        System.out.println(kittenNames.get(3));
        // выведи на экран третью кличку в списке
        System.out.println(kittenNames.get(2));


//Создай список kittenWeights и добавь в него вес котят:
//Пушок — 1,62 кг;
//Снежок — 1,91 кг;
//Черныш — 1,76 кг;
//Ушастик — 2,02 кг;
//Рыжик — 1,88 кг.
//Найди максимальный вес котёнка через цикл for.

        ArrayList<Double> kittenWeights = new ArrayList<>();

        kittenWeights.add(1.62);
        kittenWeights.add(1.91);
        kittenWeights.add(1.76);
        kittenWeights.add(2.02);
        kittenWeights.add(1.88);
        double max = 0;
        for(int i = 0; i < kittenWeights.size()-1; i++){
            if (kittenWeights.get(i) > max){
                max = kittenWeights.get(i);
            }
        }
        System.out.println("Максимальный вес: " + max + " кг");


        //Рассчитай средний вес котёнка: используй цикл for each и метод size(). Выведи результат на экран.
        double sum = 0;
        for (Double weight : kittenWeights) {
            // сложи значения в списке
            sum += weight;
        }
        // рассчитай средний вес котёнка
        double averageWeight = sum / kittenWeights.size();
        // выведи результат на экран
        System.out.println("Средний вес котёнка: " + averageWeight + " кг");

        //
    }
}