package hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.service.RecipeService;
import hu.receptblog.alkfejlesztes.g7tzap.fejer.Receptblog.model.Recipe;

@RestController
@RequestMapping("/api/recipe")
class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/all")
    public List<Recipe> all() {
        return recipeService.findAll();
    }

      @GetMapping("/hash")
    public String hash() {
        return new BCryptPasswordEncoder().encode("password");
    }
}
