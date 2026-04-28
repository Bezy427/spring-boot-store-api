ALTER TABLE products
    Add `description` TEXT NULL;

ALTER TABLE products
    MODIFY `description` TEXT NOT NULL;