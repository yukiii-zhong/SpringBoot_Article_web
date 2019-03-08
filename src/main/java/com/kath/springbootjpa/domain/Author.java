package com.kath.springbootjpa.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nickName;
    private String phone;

    @Temporal(TemporalType.DATE)
    private Date signDate;

    @OneToOne(cascade =
            {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE},
            optional = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "author_wallet_id")
    private Wallet wallet;

    public Author(){};

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
}
