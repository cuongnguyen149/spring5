package cuong.practice.springweb.controller;

import cuong.practice.springweb.respositories.BookRespositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private BookRespositories bookRespositories;

    public BookController(BookRespositories bookRespositories) {
        this.bookRespositories = bookRespositories;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){
        model.addAttribute("books", bookRespositories.findAll());
        return "books";
    }
}
