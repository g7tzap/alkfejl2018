package hu.alkfejlesztes.g7tzap.fejer.receptblog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import hu.alkfejlesztes.g7tzap.fejer.receptblog.repository.RecipeRepository;
import hu.alkfejlesztes.g7tzap.fejer.receptblog.model.Recipe;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    public Optional<Recipe> findByRecipeNo(int recipeNo) {
        return recipeRepository.findById(recipeNo);
    }

    public Recipe save(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void delete(Recipe recipe) {
        recipeRepository.delete(recipe);
    }
}
