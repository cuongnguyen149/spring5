package cuong.practice.springweb.controller;

import cuong.practice.springweb.respositories.AuthorRespositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private AuthorRespositories authorRespositories;

    public AuthorController(AuthorRespositories authorRespositories) {
        this.authorRespositories = authorRespositories;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){
        model.addAttribute("authors", authorRespositories.findAll());
        return "authors";
    }
}
