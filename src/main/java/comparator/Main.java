//В списке children хранятся имена и рост детей. Отсортируй их по возрастанию роста:
//Напиши компаратор CHILD_COMPARATOR. Его метод compare() принимает два объекта класса Child — Child o1 и Child o2
// и возвращает разницу между их ростом —o1.height и o2.height.
//Вызови метод sort(). Передай компаратор в качестве аргумента.

package comparator;
import java.util.ArrayList; // импортировали класс ArrayList
import java.util.Comparator; // импортировали интерфейс Comparator
import java.util.List;

public class Main {

    // напиши свой компаратор:
    private static Comparator<Child> CHILD_COMPARATOR = new Comparator<Child>(){
        @Override
        public int compare(Child o1, Child o2) {
            return o1.height - o2.height;
        }
    };

    public static void main(String[] args) {

        Child petya = new Child("Петя", 120);
        Child vasya = new Child("Вася", 130);
        Child ilia = new Child("Илья", 110);

        ArrayList<Child> children = new ArrayList<>();
        children.add(petya);
        children.add(vasya);
        children.add(ilia);

        // вызови метод сортировки у списка детей и передай в него компаратор
				children.sort(CHILD_COMPARATOR);

        System.out.println(children);
    }
}

class Child {
    String name;
    int height;

    public Child(String name, int height) {
        this.name = name;
        this.height = height;
    }

    /* чтобы получить строковое представление объекта класса Child в консоли,
нужно переопределить метод toString() класса Object */
    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
