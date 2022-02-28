CREATE TABLE ` laboratorio ` (
` id ` int ( 20 ) NOT NULL ,
` nome ` varchar ( 255 ) NOT NULL ,
` endereco ` varchar ( 255 ) NOT NULL,
` status ` boolean  NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

ALTER TABLE ` laboratorio `
ADD PRIMARY KEY ( ` id ` );
ALTER TABLE ` laboratorio `
MODIFY ` id ` int ( 20 ) NOT NULL AUTO_INCREMENT
INSERT INTO ` laboratorio ` ( ` id ` , ` nome ` , ` endereco ` , ` status ` )
VALUES ( NULL , 'labWaProject' , 'Salvador-BA', true);

CREATE TABLE ` exames ` (
` id ` int ( 20 ) NOT NULL ,
` nome ` varchar ( 255 ) NOT NULL ,
` tipo ` int ( 10 ) NOT NULL,
` status ` boolean  NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

ALTER TABLE ` exame `
ADD PRIMARY KEY ( ` id ` );
ALTER TABLE ` exame `
MODIFY ` id ` int ( 20 ) NOT NULL AUTO_INCREMENT
INSERT INTO ` exame ` ( ` id ` , ` nome ` , ` tipo ` , ` status ` )
VALUES ( NULL , 'Hemograma' , 1, false);
INSERT INTO ` exame ` ( ` id ` , ` nome ` , ` tipo ` , ` status ` )
VALUES ( NULL , 'Imagem' , 2, true);