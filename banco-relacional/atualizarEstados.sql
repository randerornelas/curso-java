update estados
set nome = 'Maranhão'
where sigla = 'MA';

update estados
set nome = 'Amapá'
where sigla = 'AP';

update estados
set nome = 'Paraná',
    populacao = 11.32
where sigla = 'PR';

select * from estados;