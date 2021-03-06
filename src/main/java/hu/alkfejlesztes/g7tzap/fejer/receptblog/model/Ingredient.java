package hu.alkfejlesztes.g7tzap.fejer.receptblog.model;

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
import javax.persistence.ManyToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

import hu.alkfejlesztes.g7tzap.fejer.receptblog.model.Recipe;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "ingredients")
    @JsonIgnore
    private List<Recipe> recipes;
}