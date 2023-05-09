package am.spring.springcrud.controller;

import am.spring.springcrud.model.Books;
import am.spring.springcrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @GetMapping("/book")
    private List<Books>getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/book/{bookId}")
    private Books getBook(@PathVariable("bookId")int bookId){
        return bookService.getBooksById(bookId);
    }
    @DeleteMapping("/book/{bookId}")
    private void deleteBook(@PathVariable("bookId") int bookId){
        bookService.delete(bookId);
    }
    @PostMapping("/books")
    private Long saveBook(@RequestBody Books books)
    {
        bookService.saveOrUpdate(books);
        return books.getBookId();
    }
}
