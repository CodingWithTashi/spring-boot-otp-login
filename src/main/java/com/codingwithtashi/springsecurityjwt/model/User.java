package com.codingwithtashi.springsecurityjwt.model;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "USERS")

public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "USERNAME")
    private String userName;
}
