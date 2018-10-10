package hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.model.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

    @Override
    public List<Recipe> findAll();
}
