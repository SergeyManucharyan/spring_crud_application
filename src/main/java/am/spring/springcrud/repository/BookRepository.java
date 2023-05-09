package am.spring.springcrud.repository;

import am.spring.springcrud.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books,Integer> {
}
