package polymorphism;

public class Main {

    public static void main(String[] args) {
        Pupil pupil = new Child();
        pupil.makeFriends();
        //pupil.playFootball();  error
        pupil.doPrep();

        Footballer footballer = new Child();
        footballer.makeFriends();
        //footballer.doPrep();   error
    }
}