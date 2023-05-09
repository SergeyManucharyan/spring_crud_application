package am.spring.springcrud.service;

import am.spring.springcrud.model.Books;
import am.spring.springcrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public List<Books> getAllBooks(){
        List<Books> books = new ArrayList<Books>();
        bookRepository.findAll().forEach(books1 -> books.add(books1));
        return books;
    }
    public Books getBooksById(int id){
        return bookRepository.findById(id).get();
    }
    public void saveOrUpdate(Books books){
        bookRepository.save(books);
    }
    public void delete(int id){
        bookRepository.deleteById(id);
    }
}
