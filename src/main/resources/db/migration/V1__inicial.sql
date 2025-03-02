-- Insercao de veiculos
INSERT INTO veiculo (tipo, placa, marca, quilometragem, status, num_eixos) VALUES
    ('CARRO', 'ABC-1234', 'Toyota', 50000, 'ATIVO', 0),
    ('CARRO', 'DEF-5678', 'Honda', 30000, 'ATIVO', 0),
    ('CARRO', 'GHI-9012', 'Ford', 70000, 'INATIVO', 0),
    ('CAMINHAO', 'JKL-3456', 'Volvo', 120000, 'ATIVO', 3),
    ('CAMINHAO', 'MNO-7890', 'Scania', 150000, 'ATIVO', 4),
    ('CAMINHAO', 'PQR-2345', 'Mercedes', 200000, 'INATIVO', 5);

-- Insercao de pneus
INSERT INTO pneu (numero_fogo, marca, pressao_atual, status) VALUES
    ('F12345', 'Michelin', 32.5, 'NOVO'),
    ('F67890', 'Pirelli', 30.0, 'USADO'),
    ('F11223', 'Goodyear', 28.5, 'DESCARTADO'),
    ('F44556', 'Bridgestone', 35.0, 'NOVO'),
    ('F77889', 'Continental', 31.0, 'USADO'),
    ('F99001', 'Dunlop', 29.5, 'NOVO');

-- Associacao de pneus aos veiculos
INSERT INTO veiculo_pneu (veiculo_id, pneu_id, posicao) VALUES
    (1, 1, 'Dianteiro Esquerdo'),
    (1, 2, 'Dianteiro Direito'),
    (2, 3, 'Traseiro Esquerdo'),
    (2, 4, 'Traseiro Direito'),
    (4, 5, 'Eixo 1 - Esquerdo'),
    (4, 6, 'Eixo 1 - Direito');
