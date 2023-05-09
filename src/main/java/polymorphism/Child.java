package polymorphism;

public class Child implements Footballer, Pupil{
    @Override
    public void playFootball() {
        System.out.println("Выполняю упражнения на владение мячом.");
    }

    @Override
    public void doPrep() {
        System.out.println("Делаю домашнее задание.");
    }

    @Override
    public void readCoursebook() {
        System.out.println("Читаю учебник.");
    }

    @Override
    public void makeFriends() {
        System.out.println("Играю с друзьями.");
    }
}
