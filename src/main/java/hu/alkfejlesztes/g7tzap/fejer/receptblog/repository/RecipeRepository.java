package hu.alkfejlesztes.g7tzap.fejer.receptblog.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import hu.alkfejlesztes.g7tzap.fejer.receptblog.model.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

    @Override
    public List<Recipe> findAll();
}
