CREATE TABLE users (
    id UUID,
    username VARCHAR2(20),

    PRIMARY KEY (id)
);

CREATE TABLE stuff
(
    id   LONG,
    attr VARCHAR2(20),
    user_id UUID,

    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO users (id, username) VALUES ('123e4567-e89b-12d3-a456-426655440000', 'user1');
INSERT INTO stuff VALUES (1, 'my_attr', '123e4567-e89b-12d3-a456-426655440000');