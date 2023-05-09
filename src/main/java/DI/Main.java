
/*Измени и дополни код так, чтобы зависимости Author и Publisher (Издатель) класса Book внедрялись при помощи конструктора.*/

package DI;

public class Main {
    public static void main(String[] args) {
        IAuthor author = new FantasyAuthor();
        IPublisher publisher = new OldPublisher();
        Book book = new Book(author, publisher);
        book.printBookInfo();
    }
}

/*Чтобы внедрить зависимость через конструктор, нужно использовать конструкции this.author = author; и this.publisher = publisher.*/
