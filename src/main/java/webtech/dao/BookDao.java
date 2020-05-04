package webtech.dao;

import webtech.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Integer> {
    Book findByBookname(String bookname);
}