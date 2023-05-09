package polymorphism.task;

public class Fruit {
    public void processFruit() {
        removeStone();
        System.out.println("Фрукт готов к использованию");
    }

    public void removeStone() {
        System.out.println("Нужно удалить косточки ножом");
    }
}
