package hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.model;

import java.util.List;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;

//import hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.model.Ingredients;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String author;
    
    @Column
    private String title;

    @Column
    private String text;

    @OneToMany(mappedBy = "recipe")
    private List<Comment> comments;

    @ManyToMany
    @JoinTable
    private List<Ingredient> ingredients;
}