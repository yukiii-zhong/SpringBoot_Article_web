package com.kath.springbootjpa;

import com.kath.springbootjpa.domain.Author;
import com.kath.springbootjpa.domain.AuthorRepository;
import com.kath.springbootjpa.domain.Wallet;
import com.kath.springbootjpa.domain.WalletRepository;
import com.kath.springbootjpa.service.AuthorService;
import com.kath.springbootjpa.service.AuthorServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorTest {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private AuthorServiceImpl authorServiceImpl;

    @Test
    public void saveAuthorTest(){
        Author author = new Author();
        author.setNickName("Amy");
        author.setPhone("123456");
        author.setSignDate(new Date());
        author.setWallet(new Wallet(new BigDecimal(188.23)));
        authorRepository.save(author);
    }

    @Test
    public void updateAuthor(){
        Author author = authorServiceImpl.findAuthor(2L);
        author.setPhone("18217564563");
        Wallet wallet = author.getWallet();
        wallet.setBalance(new BigDecimal(288.88));
        author.setWallet(wallet);

        authorServiceImpl.updateAuthor(author);
    }
}
