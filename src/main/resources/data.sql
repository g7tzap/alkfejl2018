INSERT INTO
    users(firstname, lastname, username, password, role)
VALUES
    ('Marjai', 'Peter','mrpetko','password','user');

INSERT INTO
    recipes(author, title, text, user_id)
VALUES
    ('Marjai Peter', 'Fott rizs', 'Fozd meg a rizset sos vizben', 1);

INSERT INTO
    comments(author, text, recipe_id)
VALUES
    ('Marjai Peter', 'Nagyon finom.', 1);

INSERT INTO
    ingredients(name)
VALUES
    ('so');

INSERT INTO
    ingredients(name)
VALUES
    ('rizs');

INSERT INTO
    recipes_ingredients(recipes_id, ingredients_id)
VALUES
    (1, 1);

INSERT INTO
    recipes_ingredients(recipes_id, ingredients_id)
VALUES
    (1, 2);