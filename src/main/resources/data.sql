INSERT INTO
    recipes(id, author, title, text)
VALUES
    (1, 'Marjai Peter', 'Fott rizs', 'Fozd meg a rizset sos vizben');

INSERT INTO
    comments(id, author, text, recipe_id)
VALUES
    (1, 'Marjai Peter', 'Nagyon finom.', 1);

INSERT INTO
    users(id, firstname, lastname, username, password, role, recipe_id)
VALUES
    (1, 'Marjai', 'Peter','mrpetko','password','user', 1);


INSERT INTO
    ingredients(id, name)
VALUES
    (1, 'so');

INSERT INTO
    ingredients(id, name)
VALUES
    (2, 'rizs');

INSERT INTO
    recipes_ingredients(recipes_id, ingredients_id)
VALUES
    (1, 1);

INSERT INTO
    recipes_ingredients(recipes_id, ingredients_id)
VALUES
    (1, 2);