-- Adding default users
-- Admin
insert into "user" (username, password)
values ('admin', '$2a$10$prNhwDKXkPAzTHfHtShojeofzSswq1lsQHkNYG3ZeFIYlZi50P5B2');
-- User (Basic)
insert into "user" (username, password)
values ('user', '$2a$10$prNhwDKXkPAzTHfHtShojeofzSswq1lsQHkNYG3ZeFIYlZi50P5B2');
-- Adding roles
INSERT INTO role (role_name)
VALUES ('USER');
INSERT INTO role (role_name)
VALUES ('ADMIN');

INSERT INTO user_role (user_id, role_id)
SELECT *
FROM (SELECT u.id FROM "user" u WHERE u.username = 'admin') a,
     (SELECT r.id FROM "role" r WHERE r.role_name = 'ADMIN') b;
INSERT INTO user_role (user_id, role_id)
SELECT *
FROM (SELECT u.id FROM "user" u WHERE u.username = 'admin') a,
     (SELECT r.id FROM "role" r WHERE r.role_name = 'USER') b;
INSERT INTO user_role (user_id, role_id)
SELECT *
FROM (SELECT u.id FROM "user" u WHERE u.username = 'user') a,
     (SELECT r.id FROM "role" r WHERE r.role_name = 'USER') b;

-- Aimlab goals
-- First we create a goal_category
insert into goal_category (id, title)
values (20, 'Aimlab Professional');

-- Second we create unit_types
insert into unit_type (id, title)
values (1, 'Gridshot Precision');
insert into unit_type (id, title)
values (2, 'Spidershot');
insert into unit_type (id, title)
values (3, 'Microshot');

-- Third we setup our goals
insert into goal (id, title, goal_value, goal_category_id)
values (1, 'Gridshot Precision 65000 point', 65000, 20);
insert into goal (id, title, goal_value)
values (2, 'Spidershot 64000 point', 64000, 20);
insert into goal (id, title, goal_value)
values (3, 'Microshot 70000 point', 70000, 20);

-- Forth we give in some progress
insert into progress(id, unit_type_id, value, timestamp)
values (1 , 1, 50000, '2021-03-10');
insert into progress(id, unit_type_id, value, timestamp)
values (2 , 1, 52000, '2021-03-11');
insert into progress(id, unit_type_id, value, timestamp)
values (3 , 1, 54000, '2021-03-12');
insert into progress(id, unit_type_id, value, timestamp)
values (4 , 1, 51000, '2021-03-13');
insert into progress(id, unit_type_id, value, timestamp)
values (5 , 2, 40021, '2021-03-10');
insert into progress(id, unit_type_id, value, timestamp)
values (6 , 2, 44021, '2021-03-11');
insert into progress(id, unit_type_id, value, timestamp)
values (7 , 2, 42021, '2021-03-12');
insert into progress(id, unit_type_id, value, timestamp)
values (8 , 2, 45021, '2021-03-13');
insert into progress(id, unit_type_id, value, timestamp)
values (9 , 3, 60021, '2021-03-12');
insert into progress(id, unit_type_id, value, timestamp)
values (10 , 3, 71498, '2021-03-13');

-- Add progress and goals to user
insert into stat (user_id, goal_id, progress_id)
values ((SELECT u.id FROM "user" u WHERE u.username = 'user'), 1, 2);

-- Workout goals
-- First we create a goal_category
insert into goal_category (id, title)
values (21, 'Summer body by Saitama');

-- Second we create unit_types
insert into unit_type (id, title)
values (4, 'Push-ups');
insert into unit_type (id, title)
values (5, 'Sit-ups');
insert into unit_type (id, title)
values (6, 'Squats');
insert into unit_type (id, title)
values (7, 'Running(km)');

-- Third we setup our goals
insert into goal (id, title, goal_value)
values (4, 'Do 100 Push-ups', 100);
insert into goal (id, title, goal_value)
values (5, 'Do 100 Sit-ups', 100);
insert into goal (id, title, goal_value)
values (6, 'Do 100 Squats', 100);
insert into goal (id, title, goal_value)
values (7, 'Do 10km Running', 10);

-- Forth we give in some progress
insert into progress(id, unit_type_id, value, timestamp)
values (11, 4, 10, '2021-03-10');
insert into progress(id, unit_type_id, value, timestamp)
values (12, 4, 15, '2021-03-11');
insert into progress(id, unit_type_id, value, timestamp)
values (13, 4, 15, '2021-03-12');
insert into progress(id, unit_type_id, value, timestamp)
values (14, 4, 20, '2021-03-13');
insert into progress(id, unit_type_id, value, timestamp)
values (15, 5, 20, '2021-03-10');
insert into progress(id, unit_type_id, value, timestamp)
values (16, 5, 25, '2021-03-11');
insert into progress(id, unit_type_id, value, timestamp)
values (17, 5, 25, '2021-03-12');
insert into progress(id, unit_type_id, value, timestamp)
values (18, 5, 35, '2021-03-13');
insert into progress(id, unit_type_id, value, timestamp)
values (19, 6, 20, '2021-03-10');
insert into progress(id, unit_type_id, value, timestamp)
values (20, 6, 30, '2021-03-11');
insert into progress(id, unit_type_id, value, timestamp)
values (21, 6, 40, '2021-03-12');
insert into progress(id, unit_type_id, value, timestamp)
values (22, 7, 1, '2021-03-10');
insert into progress(id, unit_type_id, value, timestamp)
values (23, 7, 2, '2021-03-12');
insert into progress(id, unit_type_id, value, timestamp)
values (24, 7, 2, '2021-03-13');
