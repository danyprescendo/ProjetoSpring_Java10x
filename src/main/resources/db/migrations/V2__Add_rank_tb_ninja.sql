-- V2: Migrations para aadicionar a coluna de RANK na tabela TB_NINJA

ALTER TABLE tb_ninja
ADD COLUMN rank VARCHAR(255);