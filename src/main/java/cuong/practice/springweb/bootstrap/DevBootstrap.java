package cuong.practice.springweb.bootstrap;

import cuong.practice.springweb.model.Author;
import cuong.practice.springweb.model.Book;
import cuong.practice.springweb.model.Publisher;
import cuong.practice.springweb.respositories.AuthorRespositories;
import cuong.practice.springweb.respositories.BookRespositories;
import cuong.practice.springweb.respositories.PublisherRepositories;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private AuthorRespositories authorRespositories;
    private BookRespositories bookRespositories;
    private PublisherRepositories publisherRepositories;

    public DevBootstrap(AuthorRespositories authorRespositories, BookRespositories bookRespositories, PublisherRepositories publisherRepositories) {
        this.authorRespositories = authorRespositories;
        this.bookRespositories = bookRespositories;
        this.publisherRepositories = publisherRepositories;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("onApplicationEvent");
        initData();
    }

    private void initData(){
        System.out.println("addPublisher");
        Publisher p = new Publisher("Devlopment", "CuongProd");
        publisherRepositories.save(p);
        System.out.println("addBook");
        Author a = new Author("Cuong", "Nguyen");
        Book b = new Book("Title","123",p);
        a.getBooks().add(b);
        authorRespositories.save(a);
        bookRespositories.save(b);
        System.out.println("author count " + authorRespositories.count());
        System.out.println("book count " + bookRespositories.count());
    }
}
