DROP TABLE Player CASCADE CONSTRAINTS;
DROP TABLE Club CASCADE CONSTRAINTS;
DROP TABLE League CASCADE CONSTRAINTS;
DROP TABLE Country CASCADE CONSTRAINTS;


CREATE TABLE Country (
  countryId   CHAR(2) PRIMARY KEY,
  countryName VARCHAR2(40) NOT NULL
);

CREATE TABLE League (
  leagueId   NUMBER(4) PRIMARY KEY,
  leagueName VARCHAR2(40) NOT NULL,
  countryId  CHAR(2) REFERENCES Country (countryId)
);

CREATE TABLE Club (
  clubId    NUMBER(4) PRIMARY KEY,
  clubName  VARCHAR2(40) NOT NULL,
  leagueIid NUMBER(4) REFERENCES League (leagueId)
);

CREATE TABLE Player (
  playerId   NUMBER(6) PRIMARY KEY,
  firstName  VARCHAR2(20),
  lastName   VARCHAR2(25) NOT NULL,
  birthDate  DATE,
  costs      NUMBER(8),
  stats      NUMBER(4),
  skills   NUMBER(2),
  position VARCHAR2(3),
  clubId     NUMBER(4) REFERENCES Club,
  countryId  CHAR(2) REFERENCES Country,
  CHECK (costs > 0)
);

COMMIT;