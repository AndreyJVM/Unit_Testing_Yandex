package stringBuilderTask;

public class Praktikum {
    public static void main(String[] args) {
        //Создай экземпляр StringBuilder, а затем вызови метод append() так, чтобы на экране появилась строка "Hello, java!".
        // Метод append() нужно вызвать один раз.
        String str = "Hello,";
        StringBuilder sb = new StringBuilder(str); // создай экземпляр StringBuilder со строкой str

        // Под этим комментарием должен быть вызов sb.append(..)
        sb.append(" java!");
        String asString = sb.toString();
        System.out.println(asString);


        //Вставить новый элемент в объект StringBuilder поможет метод insert(int offset, String str).
        //offset — это индекс позиции, на которую нужно поставить строку. А str — сама строка, которую хочешь вставить.
        //Например, такой код вставит букву l на место с индексом 3:
        StringBuilder sb1 = new StringBuilder("Helo!");
        sb1.insert(3, "l");                 // вставит l на 3 позицию: туда, где сейчас стоит o
        System.out.println(sb1.toString()); // выведет строку "Hello!": вставка сдвигает символы

        //Заменить элемент
        //Поможет метод replace(int indexFromInclusive, int indexToExclusive, String replacement).
        //В скобках нужно указать:
        //индекс элемента, с которого начнётся замена. Например, 1;
        //индекс элемента, до которого продлится замена. Например, 3;
        //новый элемент, который нужно вставить. Например, "e".
        //Первый индекс в замене берётся включительно, а второй — нет.
        //Например, нужно заменить букву i на е в строке "Hillo!":
        StringBuilder sb2 = new StringBuilder("Hillo!");
        sb2.replace(1, 2, "e");
        System.out.println(sb2.toString()); // выведет строку "Hello!"

        //Удалить элемент
        //Поможет метод deleteCharAt(). В скобках нужно указать индекс элемента, который хочешь удалить. Например, deleteCharAt(1).
        //Можно убирать несколько элементов за раз. В скобках нужно уточнить, с какого индекса по какой удалить символы.
        //Например, delete(1,5) удалит всё с индекса 1 по 5. Первый индекс включается, второй — нет.
        //Например, нужно удалить лишнюю h и все лишние l из строки "Hhellllllo!"
        StringBuilder sb3 = new StringBuilder("Hhellllllo!");
        sb3.deleteCharAt(1); // удалит элемент 'h'
        sb3.delete(2, 6);    // удалит все лишние символы 'l'
        System.out.println(sb3.toString()); // выведет строку "Hello!"
    }
}