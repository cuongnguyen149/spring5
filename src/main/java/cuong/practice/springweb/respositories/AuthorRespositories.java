package cuong.practice.springweb.respositories;

import cuong.practice.springweb.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRespositories extends CrudRepository<Author, Long> {
}
