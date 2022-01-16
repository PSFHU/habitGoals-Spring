-- User data
CREATE TABLE users
(
    id                  SERIAL      PRIMARY KEY,
    username            VARCHAR(255) NOT NULL,
    password            VARCHAR(255) NOT NULL
);

CREATE TABLE role
(
    id                  SERIAL      PRIMARY KEY,
    role_name           VARCHAR(255)
);

CREATE TABLE user_role
(
    id                  SERIAL      PRIMARY KEY,
    user_id             SERIAL      NOT NULL REFERENCES users (id),
    role_id             SERIAL      NOT NULL REFERENCES role (id)
);

-- Goal data
CREATE TABLE goal_category
(
    id                  serial PRIMARY KEY,
    name               varchar(255) NOT NULL
);

CREATE TABLE goal
(
    id                  serial              PRIMARY KEY,
    title               varchar(255)        NOT NULL,
    goal_value          double precision    NOT NULL,
    goal_logic          varchar(2)          NOT NULL,
    goal_category_id    serial              NOT NULL REFERENCES goal_category (id)
);

-- Stat data
CREATE TABLE unit_type
(
    id                  serial PRIMARY KEY,
    name                varchar(255) NOT NULL
);

CREATE TABLE progress
(
    id                  serial      PRIMARY KEY,
    value               double precision,
    timestamp           date        NOT NULL
);

CREATE TABLE stat
(
    id                  serial      PRIMARY KEY,
    user_id             serial      NOT NULL REFERENCES users (id),
    goal_id             serial      REFERENCES goal (id),
    unit_type_id        serial      NOT NULL REFERENCES unit_type (id)
);

CREATE TABLE progress_stat
(
    id                  serial      PRIMARY KEY,
    progress_id         serial      NOT NULL REFERENCES progress (id),
    stat_id             serial      NOT NULL REFERENCES stat (id)
);