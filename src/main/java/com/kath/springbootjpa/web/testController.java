package com.kath.springbootjpa.web;

import com.kath.springbootjpa.domain.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class testController {

    @Autowired
    private AuthorServiceImpl authorServiceImp;

    @GetMapping("/3")
    public Author updateAuthor(){
        return authorServiceImp.updateAuthor();
    }
}
