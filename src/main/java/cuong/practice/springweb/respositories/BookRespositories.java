package cuong.practice.springweb.respositories;

import cuong.practice.springweb.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRespositories extends CrudRepository<Book, Long> {
}
