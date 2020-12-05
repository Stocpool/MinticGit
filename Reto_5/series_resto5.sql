create table reto5.serie (
	id_contenido int primary key auto_increment,
    titulo_contenido varchar(50),
    numTempo_contenido int(5),
    numEp_contenido int(5)
);
INSERT INTO `reto5`.`serie`
(`id_contenido`,
`titulo_contenido`,
`numTempo_contenido`,
`numEp_contenido`
)
VALUES
(null,'The walking dead',11,153),
(null,'Viaje a las estrellas: la serie original',3,80),
(null,'Glow',3,30),
(null,'La casa de papel',4,31),
(null,'Friends',10,236),
(null,'Arrow',8,170),
(null,'The big bang theory',12,279),
(null,'Vikingos',6,79);