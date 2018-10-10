package hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.repository.RecipeRepository;
import hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.model.Recipe;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }
}
