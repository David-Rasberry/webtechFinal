package webtech.service;


import org.springframework.stereotype.Component;
import webtech.dao.BookDao;
import webtech.domain.Book;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookService {

    private BookDao bookDao;

    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public List<Book> findAll() {
        return bookDao.findAll();
    }

    public Book findById(Integer id) {
        return bookDao.findById(id).get();
    }

    public void save(Book book) {
        bookDao.save(book);
    }

    public void update(String id, Book book) {
        book.setId(id);
        bookDao.save(book);
    }

    public void deleteById(Integer id) {
        bookDao.deleteById(id);
    }

//    @Override
//    public BookDetails loadUserByUsername(String bookname) throws UsernameNotFoundException {
//        Book book = bookDao.findByBookname(bookname);
//        if (book != null) {
//            return new MyBookPrincipal(book);
//        } else {
//            throw new UsernameNotFoundException(bookname);
//        }
//
//    }
}