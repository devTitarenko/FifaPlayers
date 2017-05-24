INSERT INTO Country VALUES ('IT', 'Italy');
INSERT INTO Country VALUES ('EN', 'England');
INSERT INTO Country VALUES ('SP', 'Spain');
INSERT INTO Country VALUES ('UA', 'Ukraine');
INSERT INTO Country VALUES ('FR', 'France');
INSERT INTO Country VALUES ('DE', 'Germany');
INSERT INTO Country VALUES ('BR', 'Brazil');
INSERT INTO Country VALUES ('NL', 'Netherlands');
INSERT INTO Country VALUES ('AR', 'Argentina');
INSERT INTO Country VALUES ('BE', 'Belgium');
INSERT INTO Country VALUES ('PR', 'Portugal');
INSERT INTO Country VALUES ('SW', 'Sweden');
INSERT INTO Country VALUES ('PL', 'Poland');

INSERT INTO League VALUES (1000
  , 'Premier League'
  , 'EN'
);
INSERT INTO League VALUES (1100
  , 'LaLiga'
  , 'SP'
);
INSERT INTO League VALUES (1200
  , 'Serie A'
  , 'IT'
);
INSERT INTO League VALUES (1300
  , 'Bundesliga'
  , 'DE'
);
INSERT INTO League VALUES (1400
  , 'Ligue 1'
  , 'FR'
);


INSERT INTO Club VALUES (10
  , 'Arsenal'
  , 1000
);
INSERT INTO Club VALUES (20
  , 'Chelsea'
  , 1000
);
INSERT INTO Club VALUES (30
  , 'Leicester City'
  , 1000
);
INSERT INTO Club VALUES (40
  , 'Liverpool'
  , 1000
);
INSERT INTO Club VALUES (50
  , 'Manchester City'
  , 1000
);
INSERT INTO Club VALUES (60
  , 'Manchester United'
  , 1000
);
INSERT INTO Club VALUES (70
  , 'Atletico Madrid'
  , 1100
);
INSERT INTO Club VALUES (80
  , 'FC Barcelona'
  , 1100
);
INSERT INTO Club VALUES (90
  , 'Real Madrid'
  , 1100
);
INSERT INTO Club VALUES (100
  , 'Inter'
  , 1200
);
INSERT INTO Club VALUES (110
  , 'Juventus'
  , 1200
);
INSERT INTO Club VALUES (120
  , 'Milan'
  , 1200
);
INSERT INTO Club VALUES (130
  , 'Roma'
  , 1200
);
INSERT INTO Club VALUES (140
  , 'Borussia Dortmund'
  , 1300
);
INSERT INTO Club VALUES (150
  , 'FC Bayern Munchen'
  , 1300
);
INSERT INTO Club VALUES (160
  , 'Olympique Lyonnais'
  , 1400
);
INSERT INTO Club VALUES (170
  , 'Paris Saint-Germain'
  , 1400
);


CREATE SEQUENCE player_id
INCREMENT BY 1
START WITH 101;

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Cristiano'
  , 'Ronaldo'
  , TO_DATE('05-02-1985', 'dd-mm-yyyy')
  , 7900000
  , 2399
  , 'FIVE'
  , 'ST'
  , 90
  , 'PR'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Lionel'
  , 'Messi'
  , TO_DATE('24-06-1987', 'dd-mm-yyyy')
  , 7100000
  , 2391
  , 'FOUR'
  , 'RW'
  , 80
  , 'AR'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Zlatan'
  , 'Ibrahimovic'
  , TO_DATE('03-10-1981', 'dd-mm-yyyy')
  , 1700000
  , 2297
  , 'FOUR'
  , 'ST'
  , 60
  , 'SW'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Robert'
  , 'Lewandowski'
  , TO_DATE('21-08-1988', 'dd-mm-yyyy')
  , 2000000
  , 2269
  , 'THREE'
  , 'ST'
  , 150
  , 'SW'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Franck'
  , 'Ribery'
  , TO_DATE('07-04-1983', 'dd-mm-yyyy')
  , 23000
  , 1936
  , 'FIVE'
  , 'LM'
  , 150
  , 'FR'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Douglas'
  , 'Costa'
  , TO_DATE('14-09-1990', 'dd-mm-yyyy')
  , 21000
  , 2049
  , 'FIVE'
  , 'LM'
  , 150
  , 'BR'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Sergio'
  , 'Ramos'
  , TO_DATE('30-03-1986', 'dd-mm-yyyy')
  , 340000
  , 2345
  , 'THREE'
  , 'CB'
  , 90
  , 'SP'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Arjen'
  , 'Robben'
  , TO_DATE('23-01-1984', 'dd-mm-yyyy')
  , 1200000
  , 2228
  , 'FOUR'
  , 'RM'
  , 150
  , 'NL'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Andres'
  , 'Iniesta'
  , TO_DATE('11-09-1984', 'dd-mm-yyyy')
  , 1200000
  , 2303
  , 'FOUR'
  , 'CM'
  , 80
  , 'SP'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Gonzalo'
  , 'Higuain'
  , TO_DATE('10-12-1987', 'dd-mm-yyyy')
  , 150000
  , 2189
  , 'THREE'
  , 'ST'
  , 110
  , 'AR'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Paul'
  , 'Pogba'
  , TO_DATE('15-03-1993', 'dd-mm-yyyy')
  , 2000000
  , 2293
  , 'FIVE'
  , 'CDM'
  , 60
  , 'FR'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Angel'
  , 'Di Maria'
  , TO_DATE('14-02-1988', 'dd-mm-yyyy')
  , 850000
  , 2245
  , 'FIVE'
  , 'RW'
  , 170
  , 'AR'
);

INSERT INTO Player VALUES (player_id.NEXTVAL
  , 'Jerome'
  , 'Boateng'
  , TO_DATE('03-09-1988', 'dd-mm-yyyy')
  , 350000
  , 1970
  , 'TWO'
  , 'CB'
  , 150
  , 'DE'
);

COMMIT;