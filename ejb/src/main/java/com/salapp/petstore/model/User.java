package com.salapp.petstore.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Stainley A. Lebron
 * @since 5/4/14.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @NotNull
    @GeneratedValue
    private long id;

    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @NotNull
    @Size(min = 5, max = 8, message = "Password must be 5 to 8 digits")
    @Column(name = "password")
    private String password;
}
