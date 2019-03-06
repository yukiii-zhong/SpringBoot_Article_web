package com.kath.springbootjpa.service;

import com.kath.springbootjpa.domain.Author;

public interface AuthorService {
    Author updateAuthor();

    Author saveAuthor(Author author);

    Author updateAuthor(Author author);

    Author findAuthor(Long id);

    void deleteAuthor(Long id);
}
