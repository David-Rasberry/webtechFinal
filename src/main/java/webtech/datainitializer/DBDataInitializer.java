package webtech.datainitializer;


import webtech.dao.BookDao;
import webtech.domain.Book;
import webtech.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBDataInitializer implements CommandLineRunner {

    private BookDao bookDao;
    private BookService bookService;

    public DBDataInitializer(BookDao bookDao, BookService bookService) {

        this.bookDao = bookDao;
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        Book a1 = new Book();
        a1.setId("1250808601736515584");
        a1.setBookName("Harry Potter and the Sorcerer’s Stone");
        a1.setDescription("Harry finds some stones");
        a1.setAuthor("J.K. Rawlings");

        Book a2 = new Book();
        a2.setId("1250808601736516943");
        a2.setBookName("Harry Potter and the Chamber of Secrets");
        a2.setDescription("Harry finds out secrets");
        a2.setAuthor("J.K. Rawlings");

        Book a3 = new Book();
        a3.setId("1250808601736511232");
        a3.setBookName("Harry Potter and the Prisoner of Azkaban");
        a3.setDescription("Harry goes to prison");
        a3.setAuthor("J.K. Rawlings");

        Book a4 = new Book();
        a4.setId("1250808601736510436");
        a4.setBookName("Harry Potter and the Goblet of Fire");
        a4.setDescription("Harry finds a goblet");
        a4.setAuthor("J.K. Rawlings");

        Book a5 = new Book();
        a5.setId("125080860173651290");
        a5.setBookName("Harry Potter and the Order of the Phoenix");
        a5.setDescription("Harry finds the order of the phoenix");
        a5.setAuthor("J.K. Rawlings");

        Book a6 = new Book();
        a6.setId("1250808601736512367");
        a6.setBookName("Harry Potter and the Half-Blood Prince");
        a6.setDescription("Harry meets the prince");
        a6.setAuthor("J.K. Rawlings");

        Book a7 = new Book();
        a7.setId("1250808601736510436");
        a7.setBookName("Harry Potter and the Deathly Hallows");
        a7.setDescription("Harry finds the deathly hallows");
        a7.setAuthor("J.K. Rawlings");

    }
}
