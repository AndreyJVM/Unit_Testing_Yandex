//Когда ищешь данные в библиотеке, неудобно вводить название книги полностью. Иногда полное название и вовсе неизвестно.
//Нужно написать метод, который ищет книгу по частичному названию. Пусть он называется public boolean search(String name, String subName) {}.
//Метод возвращает true, если строка содержит подстроку.

package arraySymbolTask1;

public class SubstringFunctions {
    public boolean search(String name, String subName) {
        if (name.indexOf(subName) == 1) {
            return true;
        } else if(name.indexOf(subName) == -1) {
            return false;
        }
        return true;
    }
}
