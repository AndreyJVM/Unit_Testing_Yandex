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
    }
}
