package exception;

public class Praktikum {
    public static void main(String[] args) {
        String string = null;
        try{
            string.length();
            System.out.println("Код отработал без ошибок");
        } finally{
            System.out.println("Этот код выполняется вне зависимости от произошедшего");
        }
        System.out.println("Завершение программы");
    }
}
