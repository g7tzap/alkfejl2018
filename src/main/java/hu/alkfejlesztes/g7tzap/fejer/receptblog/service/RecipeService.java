package hu.alkfejlesztes.g7tzap.fejer.receptblog.service;

import java.util.List;

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
}
