package hu.alkfejlesztes.g7tzap.fejer.receptblog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import hu.alkfejlesztes.g7tzap.fejer.receptblog.service.RecipeService;
import hu.alkfejlesztes.g7tzap.fejer.receptblog.model.Recipe;

@RestController
@RequestMapping("/api/recipe")
class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/all")
    @CrossOrigin
    public List<Recipe> all() {
        return recipeService.findAll();
    }

      @GetMapping("/hash")
    public String hash() {
        return new BCryptPasswordEncoder().encode("password");
    }
}
