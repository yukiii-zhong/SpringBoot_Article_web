package com.kath.springbootjpa.service;

import com.kath.springbootjpa.domain.Author;
import com.kath.springbootjpa.domain.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Date;

public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Transactional
    @Override
    public Author updateAuthor(){
        Author author = new Author();
        author.setPhone("99999999");
        author.setNickName("Mike");
        author.setSignDate(new Date());
        Author author1 = authorRepository.save(author);

        author1.setPhone("11111111");
        Author author2 = authorRepository.save(author1);

        int i=8/0;
        return author2;
    }

    @Override
    public Author saveAuthor(Author author){
        return authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author){
        return authorRepository.save(author);
    }

    public Author findAuthor(Long id){
        return authorRepository.getOne(id);
    }

    @Override
    public void deleteAuthor(Long id){
        authorRepository.delete(authorRepository.getOne(id));
    }
}
