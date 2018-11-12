package hu.alkfejlesztes.g7tzap.fejer.receptblog.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    private String role;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Recipe> recipes;
}