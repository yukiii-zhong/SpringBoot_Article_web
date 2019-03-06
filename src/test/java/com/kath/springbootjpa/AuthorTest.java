package com.kath.springbootjpa;

import com.kath.springbootjpa.domain.Author;
import com.kath.springbootjpa.domain.AuthorRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorTest {

    @Autowired
    private AuthorRepository authorRepository;

    @Test
    public void saveAuthorTest(){
        Author author = new Author();
        author.setNickName("Amy");
        author.setPhone("123456");
        author.setSignDate(new Date());
        authorRepository.save(author);
    }
}
