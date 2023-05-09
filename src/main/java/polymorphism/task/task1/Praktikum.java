/*Начинающий разработчик хочет написать программу, которая пополняет баланс телефона.
У него получилось написать её только для целых чисел. Но ведь на счёт можно положить не только целое число рублей, но и дробное — с копейками.
Помоги закончить программу: доработай класс Account так, чтобы он мог пополнять баланс и дробными числами.*/

package polymorphism.task.task1;

public class Praktikum {
    public static void main(String[] args) {
        Account account = new Account(100.65);
        account.add(10);
        account.add(10.10);
        System.out.println(account.getBalance());
    }
}