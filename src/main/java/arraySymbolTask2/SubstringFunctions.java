//Нужно доработать метод из предыдущего задания: сделать так, чтобы он не учитывал регистр.
//Метод должен возвращать true, если строка содержит подстроку независимо от регистра. Пример: строка "Властелин Колец" содержит "колец".

package arraySymbolTask2;

public class SubstringFunctions {
    public boolean search(String name, String subName) {
        return name.toLowerCase().indexOf(subName.toLowerCase()) != -1;
    }
}


//Help
//Чтобы метод не зависел от регистра, нужно привести строки name и subName к одному регистру — например, с помощью name.toLowerCase.
// А затем — применить метод indexOf.
//Получится return name.toLowerCase().indexOf(subName.toLowerCase()) != -1;.