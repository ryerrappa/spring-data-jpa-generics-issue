package com.example.jparepodemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "stuff")
public class Stuff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    private String attr;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public Stuff() {
    }

    public Stuff(Long id, String attr, User user) {
        this.id = id;
        this.attr = attr;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stuff stuff))
            return false;
        return getId() != null && getId().equals(stuff.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
