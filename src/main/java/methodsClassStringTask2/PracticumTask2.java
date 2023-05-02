//Когда оплачиваешь покупку банковской картой через интернет, нужно ввести имя держателя карты.
//Имя на карте написано заглавными буквами, а пользователь может ввести его любыми. Напиши метод, который переводит имя в верхний регистр — то есть делает все буквы заглавными.

package methodsClassStringTask2;

public class PracticumTask2 {
    public static void main(String[] args) {
        String name = "Vasiliy Ivanov";
        String fixedName = cardFieldEditor(name);
        System.out.println(fixedName);
    }

    public static String cardFieldEditor(String name) {
        return name.toUpperCase();
    }
}
