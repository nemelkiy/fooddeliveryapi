DROP TABLE IF EXISTS order_info CASCADE;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE order_info
(
    id       INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name     VARCHAR NOT NULL,
    email    VARCHAR NOT NULL,
    phone    VARCHAR NOT NULL,
    city     VARCHAR NOT NULL,
    street   VARCHAR NOT NULL,
    home     INTEGER NOT NULL,
    flat     INTEGER NOT NULL,
    floor    INTEGER NOT NULL
);

INSERT INTO public.order_info (name, email, phone, city, street, home, flat, floor) VALUES ('Александр', 'alex@mail.ru', '+79165555555', 'Москва', 'Николая Химушина', 1, 5, 10);
INSERT INTO public.order_info (name, email, phone, city, street, home, flat, floor) VALUES ('Фёдор', 'fedor@mail.ru', '+79165885555', 'Москва', 'Проспект мира', 10, 55, 15);
INSERT INTO public.order_info (name, email, phone, city, street, home, flat, floor) VALUES ('Алексей', 'lexa@mail.ru', '+79169885775', 'Оренбург', 'Советская', 31, 109, 9);
INSERT INTO public.order_info (name, email, phone, city, street, home, flat, floor) VALUES ('Daniil', 'danya@mail.ru', '+79169185875', 'Нижний Новгород', 'Рождественская', 18, 119, 9);