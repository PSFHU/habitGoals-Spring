-- Goal data
CREATE TABLE goal_category
(
    id                  serial PRIMARY KEY,
    title               varchar(255) NOT NULL
);

CREATE TABLE goal
(
    id                  serial PRIMARY KEY,
    title               varchar(255) NOT NULL,
    goal_value          double precision,
    goal_category_id    serial       NOT NULL REFERENCES goal_category (id)
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
    unit_type_id        serial      NOT NULL REFERENCES unit_type (id),
    value               double precision,
    timestamp           date        NOT NULL
);

CREATE TABLE stat
(
    id                  serial      PRIMARY KEY,
    user_id             serial      NOT NULL REFERENCES "user" (id),
    goal_id             serial      NOT NULL REFERENCES goal (id),
    progress_id         serial      NOT NULL REFERENCES progress (id)
);

-- User data
CREATE TABLE "user"
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
    user_id             SERIAL      NOT NULL REFERENCES "user" (id),
    role_id             SERIAL      NOT NULL REFERENCES role (id)
);
