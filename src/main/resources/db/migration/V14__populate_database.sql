INSERT INTO categories (name)
VALUES ('Fruits'),
       ('Vegetables'),
       ('Dairy'),
       ('Meat'),
       ('Beverages'),
       ('Bakery'),
       ('Snacks'),
       ('Grains');

INSERT INTO products (name, description, price, category_id)
VALUES

-- Fruits
('Bananas (1kg)', 'Fresh ripe yellow bananas rich in potassium', 1.99, 1),
('Apples (1kg)', 'Crisp red apples, perfect for snacking', 2.49, 1),

-- Vegetables
('Carrots (1kg)', 'Organic carrots, great for cooking and salads', 1.29, 2),
('Spinach (250g)', 'Fresh green spinach leaves packed with nutrients', 1.79, 2),

-- Dairy
('Milk (1L)', 'Full cream fresh milk', 1.50, 3),
('Cheddar Cheese (200g)', 'Aged cheddar cheese with rich flavor', 3.99, 3),

-- Meat
('Chicken Breast (500g)', 'Boneless skinless chicken breast', 5.49, 4),

-- Beverages
('Orange Juice (1L)', '100% pure orange juice, no added sugar', 2.99, 5),

-- Bakery
('White Bread Loaf', 'Soft freshly baked white bread', 1.89, 6),

-- Snacks
('Potato Chips (150g)', 'Crispy salted potato chips', 1.99, 7);

INSERT INTO products (name, description, price, category_id)
VALUES ('Brown Rice (1kg)', 'Whole grain brown rice, high in fiber', 2.79, 8),
       ('Eggs (12 pack)', 'Farm fresh eggs', 3.49, 3),
       ('Tomatoes (1kg)', 'Juicy red tomatoes', 1.99, 2);

