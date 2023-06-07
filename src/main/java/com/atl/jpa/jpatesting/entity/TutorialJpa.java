package com.atl.jpa.jpatesting.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tutorial_JPA")
@Data
public class TutorialJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description", nullable = true, length = 25, unique = false)
    private String description;
    @Column(name = "title", nullable = true, length = 25, unique = false)
    private String title;
    private boolean published;
}
