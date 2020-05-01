package cuong.practice.springweb.respositories;

import cuong.practice.springweb.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepositories extends CrudRepository<Publisher, Long> {
}
