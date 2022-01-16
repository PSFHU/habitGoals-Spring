-- Adding default users
-- Admin
insert into users (username, password)
values ('admin', '$2a$10$prNhwDKXkPAzTHfHtShojeofzSswq1lsQHkNYG3ZeFIYlZi50P5B2');
-- User (Basic)
insert into users (username, password)
values ('user', '$2a$10$prNhwDKXkPAzTHfHtShojeofzSswq1lsQHkNYG3ZeFIYlZi50P5B2');
-- Adding roles
INSERT INTO role (role_name)
VALUES ('USER');
INSERT INTO role (role_name)
VALUES ('ADMIN');

INSERT INTO user_role (user_id, role_id)
SELECT *
FROM (SELECT u.id FROM users u WHERE u.username = 'admin') a,
     (SELECT r.id FROM "role" r WHERE r.role_name = 'ADMIN') b;
INSERT INTO user_role (user_id, role_id)
SELECT *
FROM (SELECT u.id FROM users u WHERE u.username = 'admin') a,
     (SELECT r.id FROM "role" r WHERE r.role_name = 'USER') b;
INSERT INTO user_role (user_id, role_id)
SELECT *
FROM (SELECT u.id FROM users u WHERE u.username = 'user') a,
     (SELECT r.id FROM "role" r WHERE r.role_name = 'USER') b;

-- Aimlab goals
-- Create a goal_category
insert into goal_category (id, name)
values (1, 'Aimlab Professional');

-- Setup our goals
insert into goal (id, title, goal_value, goal_category_id,goal_logic)
values (1, 'Gridshot Precision 65000 point', 65000,1,'<=');
insert into goal (id, title, goal_value, goal_category_id,goal_logic)
values (2, 'Spidershot 64000 point', 64000,1,'<');
insert into goal (id, title, goal_value, goal_category_id,goal_logic)
values (3, 'Microshot 70000 point', 70000,1,'<');

-- Create unit_types
insert into unit_type (id, name)
values (1, 'Gridshot Precision');
insert into unit_type (id, name)
values (2, 'Spidershot');
insert into unit_type (id, name)
values (3, 'Microshot');

-- Create stats
insert into stat(id, user_id, goal_id, unit_type_id)
VALUES (1,(SELECT u.id FROM users u WHERE u.username = 'user'),1,1);
insert into stat(id, user_id, goal_id, unit_type_id)
VALUES (2,(SELECT u.id FROM users u WHERE u.username = 'user'),2,2);
insert into stat(id, user_id, goal_id, unit_type_id)
VALUES (3,(SELECT u.id FROM users u WHERE u.username = 'user'),3,3);

-- Give in some progress
insert into progress(id, value, timestamp)
values (1 , 50000, '2021-03-10');
insert into progress(id, value, timestamp)
values (2 , 52000, '2021-03-11');
insert into progress(id, value, timestamp)
values (3 , 54000, '2021-03-12');
insert into progress(id, value, timestamp)
values (4 , 51000, '2021-03-13');
insert into progress(id, value, timestamp)
values (5 , 40021, '2021-03-10');
insert into progress(id, value, timestamp)
values (6 , 44021, '2021-03-11');
insert into progress(id, value, timestamp)
values (7 , 42021, '2021-03-12');
insert into progress(id, value, timestamp)
values (8 , 45021, '2021-03-13');
insert into progress(id, value, timestamp)
values (9 , 60021, '2021-03-12');
insert into progress(id, value, timestamp)
values (10 , 71498, '2021-03-13');

-- Add progress and goals to user
-- Gridshot
insert into progress_stat(id, progress_id, stat_id)
values (1,1,1);
insert into progress_stat(id, progress_id, stat_id)
values (2,2,1);
insert into progress_stat(id, progress_id, stat_id)
values (3,3,1);
insert into progress_stat(id, progress_id, stat_id)
values (4,4,1);
-- Spidershot
insert into progress_stat(id, progress_id, stat_id)
values (5,5,2);
insert into progress_stat(id, progress_id, stat_id)
values (6,6,2);
insert into progress_stat(id, progress_id, stat_id)
values (7,7,2);
insert into progress_stat(id, progress_id, stat_id)
values (8,8,2);
-- Microshot
insert into progress_stat(id, progress_id, stat_id)
values (9,9,3);
insert into progress_stat(id, progress_id, stat_id)
values (10,10,3);

-- Workout goals
-- Create a goal_category
insert into goal_category (id, name)
values (21, 'Summer body by Saitama');

-- Setup our goals
insert into goal (id, title, goal_value,goal_category_id, goal_logic)
values (4, 'Do 100 Push-ups', 100, 21, '<');
insert into goal (id, title, goal_value,goal_category_id, goal_logic)
values (5, 'Do 100 Sit-ups', 100, 21, '<=');
insert into goal (id, title, goal_value,goal_category_id, goal_logic)
values (6, 'Do 100 Squats', 100, 21, '<');
insert into goal (id, title, goal_value,goal_category_id, goal_logic)
values (7, 'Do 10km Running', 10, 21, '>=');

-- Create unit_types
insert into unit_type (id, name)
values (4, 'Push-ups');
insert into unit_type (id, name)
values (5, 'Sit-ups');
insert into unit_type (id, name)
values (6, 'Squats');
insert into unit_type (id, name)
values (7, 'Running(km)');

insert into stat(id, user_id, goal_id, unit_type_id)
values (4,(SELECT u.id FROM users u WHERE u.username = 'user'),4,4);
insert into stat(id, user_id, goal_id, unit_type_id)
values (5,(SELECT u.id FROM users u WHERE u.username = 'user'),5,5);
insert into stat(id, user_id, goal_id, unit_type_id)
values (6,(SELECT u.id FROM users u WHERE u.username = 'user'),6,6);
insert into stat(id, user_id, goal_id, unit_type_id)
values (7,(SELECT u.id FROM users u WHERE u.username = 'user'),7,7);

-- Give in some progress
insert into progress(id, value, timestamp)
values (11,  10, '2021-03-10');
insert into progress(id, value, timestamp)
values (12,  15, '2021-03-11');
insert into progress(id, value, timestamp)
values (13,  15, '2021-03-12');
insert into progress(id, value, timestamp)
values (14,  20, '2021-03-13');
insert into progress(id, value, timestamp)
values (15,  20, '2021-03-10');
insert into progress(id, value, timestamp)
values (16,  25, '2021-03-11');
insert into progress(id, value, timestamp)
values (17,  25, '2021-03-12');
insert into progress(id, value, timestamp)
values (18,  35, '2021-03-13');
insert into progress(id, value, timestamp)
values (19,  20, '2021-03-10');
insert into progress(id, value, timestamp)
values (20,  30, '2021-03-11');
insert into progress(id, value, timestamp)
values (21,  40, '2021-03-12');
insert into progress(id, value, timestamp)
values (22,  1, '2021-03-10');
insert into progress(id, value, timestamp)
values (23,  2, '2021-03-12');
insert into progress(id, value, timestamp)
values (24,  2, '2021-03-13');

-- Progress and goals to user
-- Push-up
insert into progress_stat(id, progress_id, stat_id)
values (11,11,4);
insert into progress_stat(id, progress_id, stat_id)
values (12,12,4);
insert into progress_stat(id, progress_id, stat_id)
values (13,13,4);
-- Sit-up
insert into progress_stat(id, progress_id, stat_id)
values (14,14,5);
insert into progress_stat(id, progress_id, stat_id)
values (15,15,5);
insert into progress_stat(id, progress_id, stat_id)
values (16,16,5);
insert into progress_stat(id, progress_id, stat_id)
values (17,17,5);
-- Squat
insert into progress_stat(id, progress_id, stat_id)
values (18,18,6);
insert into progress_stat(id, progress_id, stat_id)
values (19,19,6);
insert into progress_stat(id, progress_id, stat_id)
values (20,20,6);
insert into progress_stat(id, progress_id, stat_id)
values (21,21,6);
-- Running
insert into progress_stat(id, progress_id, stat_id)
values (22,22,7);
insert into progress_stat(id, progress_id, stat_id)
values (23,23,7);
insert into progress_stat(id, progress_id, stat_id)
values (24,24,7);