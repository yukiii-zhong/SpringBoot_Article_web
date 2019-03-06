package com.kath.springbootjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Article {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;



}
