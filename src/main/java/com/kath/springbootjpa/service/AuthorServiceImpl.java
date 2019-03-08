package com.kath.springbootjpa.service;

import com.kath.springbootjpa.domain.Author;
import com.kath.springbootjpa.domain.AuthorRepository;
import com.kath.springbootjpa.domain.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Date;

@Service
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
        author.setWallet(new Wallet(new BigDecimal(0)));
        Author author1 = authorRepository.save(author);

        author1.setPhone("11111111");
        Author author2 = authorRepository.save(author1);

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
