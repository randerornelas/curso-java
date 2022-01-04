SELECT
    e.nome as Estado,
    c.nome as Cidade,
    e.regiao as Região
FROM estados e, cidades c
WHERE e.id = c.estado_id;

SELECT
    c.nome as Cidade,
    e.nome as Estado,
    e.regiao as Região
FROM estados e
INNER JOIN cidades c
    ON e.id = c.estado_id;