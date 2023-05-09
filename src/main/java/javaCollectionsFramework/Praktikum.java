//Создай список кличек котят из массива "Пушок", "Снежок", "Черныш", "Ушастик", "Рыжик" методом Arrays.asList().
// Выведи список на экран.
//Преобразуй список кличек котят в массив. Выведи его на экран через цикл for each.

package javaCollectionsFramework;
import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays; // импорт массива
import java.util.List; // импорт списка
public class Praktikum {
    public static void main(String[] args) {
        List<String> kittenNamesList = Arrays.asList("Пушок", "Снежок", "Черныш", "Ушастик", "Рыжик");

        // выведи список на экран
        System.out.println(kittenNamesList);

        // создай массив из списка
         String[] kittenNamesArray = kittenNamesList.toArray(new String[]{});
        // выведи массив на экран через цикл for each
        for (String kittenName: kittenNamesArray) {
            System.out.print(kittenName + ", ");
        }


        //Создай список кличек котят из массива "Пушок", "Снежок", "Черныш", "Ушастик", "Рыжик"
        // методом List.of. Выведи список на экран.
        List<String> kittenNamesList1 = List.of("Пушок", "Снежок", "Черныш", "Ушастик", "Рыжик");
        System.out.println(kittenNamesList1);
    }

}
