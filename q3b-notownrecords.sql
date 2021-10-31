
CREATE TABLE address (
                addressID INTEGER NOT NULL,
                number VARCHAR NOT NULL,
                street1 VARCHAR NOT NULL,
                street2 VARCHAR NOT NULL,
                city VARCHAR NOT NULL,
                state VARCHAR NOT NULL,
                zipCode VARCHAR NOT NULL,
                telephone VARCHAR NOT NULL,
                CONSTRAINT addressid PRIMARY KEY (addressID)
);


CREATE TABLE musician (
                ssn VARCHAR NOT NULL,
                addressID INTEGER NOT NULL,
                name VARCHAR NOT NULL,
                CONSTRAINT ssn PRIMARY KEY (ssn)
);


CREATE TABLE album (
                albumID INTEGER NOT NULL,
                ssn_producer VARCHAR NOT NULL,
                title_album VARCHAR NOT NULL,
                releaseDate VARCHAR NOT NULL,
                format VARCHAR NOT NULL,
                age INTEGER NOT NULL,
                CONSTRAINT albumid PRIMARY KEY (albumID)
);


CREATE TABLE song (
                title_song VARCHAR NOT NULL,
                ssn_performer VARCHAR NOT NULL,
                albumID INTEGER NOT NULL,
                ssn_author VARCHAR NOT NULL,
                length INTEGER NOT NULL,
                CONSTRAINT title PRIMARY KEY (title_song)
);


CREATE TABLE instrument (
                name VARCHAR NOT NULL,
                title_song VARCHAR NOT NULL,
                ssn_player VARCHAR NOT NULL,
                pitch VARCHAR NOT NULL,
                CONSTRAINT name PRIMARY KEY (name)
);


ALTER TABLE musician ADD CONSTRAINT lives_at
FOREIGN KEY (addressID)
REFERENCES address (addressID)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE song ADD CONSTRAINT authors
FOREIGN KEY (ssn_author)
REFERENCES musician (ssn)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE album ADD CONSTRAINT album_musician_fk
FOREIGN KEY (ssn_producer)
REFERENCES musician (ssn)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE song ADD CONSTRAINT performs
FOREIGN KEY (ssn_performer)
REFERENCES musician (ssn)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE instrument ADD CONSTRAINT plays
FOREIGN KEY (ssn_player)
REFERENCES musician (ssn)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE song ADD CONSTRAINT contains
FOREIGN KEY (albumID)
REFERENCES album (albumID)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;

ALTER TABLE instrument ADD CONSTRAINT uses
FOREIGN KEY (title_song)
REFERENCES song (title_song)
ON DELETE NO ACTION
ON UPDATE NO ACTION
NOT DEFERRABLE;
