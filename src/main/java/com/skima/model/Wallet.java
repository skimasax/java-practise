package com.skima.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wallet_number")
    private BigDecimal walletNumber;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Wallet(Long id, User user, BigDecimal walletNumber) {
        this.id = id;
        this.user = user;
        this.walletNumber = walletNumber;
    }

    public Wallet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getWalletNumber() {
        return walletNumber;
    }

    public void setWalletNumber(BigDecimal walletNumber) {
        this.walletNumber = walletNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
