CREATE TABLE PROFILE.PERSON(
  PERSON_ID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  EMAIL_ID VARCHAR(255) UNIQUE,
  NAME VARCHAR(255),
  FIRST_NAME VARCHAR(255),
  LAST_NAME VARCHAR(255),
  SEX VARCHAR(1),
  ADDRESS_1 VARCHAR(30),
  ADDRESS_2 VARCHAR(30),
  CITY VARCHAR(30),
  STATE VARCHAR(30),
  MOBILE VARCHAR(30)
);

CREATE TABLE SNAPPY.ALBUM (
  ALBUM_ID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
  DESCRIPTION VARCHAR(255),
  PERSON_ID BIGINT NOT NULL,
  CREATE_DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  UPDATE_DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (PERSON_ID) REFERENCES PROFILE.PERSON (PERSON_ID)
);

CREATE TABLE SNAPPY.PHOTO (
   PHOTO_ID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
   DESCRIPTION varchar(255),
   LOCATION varchar(255),
   PERSON_ID BIGINT NOT NULL,
   ALBUM_ID BIGINT NOT NULL,
   FILE_LOCATION MEDIUMTEXT NOT NULL,
   CREATE_DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
   UPDATE_DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
   FOREIGN KEY (ALBUM_ID) REFERENCES ALBUM (ALBUM_ID),
   FOREIGN KEY (PERSON_ID) REFERENCES PROFILE.PERSON (PERSON_ID)
);


CREATE TABLE RATING.PIC_RATING (
   RATING_ID BIGINT PRIMARY KEY AUTO_INCREMENT NOT NULL,
   RATING INT,
   PHOTO_ID BIGINT NOT NULL,
   CREATE_DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
   UPDATE_DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
   FOREIGN KEY (PHOTO_ID) REFERENCES SNAPPY.PHOTO (PHOTO_ID)
);