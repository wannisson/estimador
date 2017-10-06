
--Script para popular tabela de permissao
INSERT INTO `tb_permission` (`pk_id`, `role`) VALUES (1,'ROLE_ADMIN');
INSERT INTO `tb_permission` (`pk_id`, `role`) VALUES (2,'ROLE_USER');
INSERT INTO `tb_permission` (`pk_id`, `role`) VALUES (3,'ROLE_FORNEC');

--Script para popular tabela de usuario
INSERT INTO `tb_user` (`pk_id`,`name`, `email`, `password`,`phone`) VALUES (1,'User 1','wannisson@gmail.com','123','34991393623');
INSERT INTO `tb_user` (`pk_id`,`name`, `email`, `password`,`phone`) VALUES (2,'User 2','wannisson.freitas.pinho@everis.com','123','34991393623');

--Script para pupular a table de Permission x Usuario
INSERT INTO `tb_user_permission` (`permission_id`,`user_id`) VALUES (1,1);
INSERT INTO `tb_user_permission` (`permission_id`,`user_id`) VALUES (2,2);

--Script para popular tabela de tecnologia
INSERT INTO `tb_tecnologia` (`pk_id`,`desc_tecnologia`,`sigla`) VALUES (1,'JAVA','JV');

--Script para popular tabela de risco
INSERT INTO `tb_risco` (`id`, `desc_risco`, `texto_risco`) VALUES (1, 'Atualização das tabelas e campos pelo Warehouse', 'A atualização das tabelas e campos pelo Warehouse tem problemas de sincronização pelo Desktop através da ferramenta.');

--Script para popular tabela de pendencia
INSERT INTO `tb_pendencia`(`id`, `desc_pendencia`, `texto_pendencia`) VALUES (1, 'Acesso ao Cobol não liberado', 'Acesso ao ambiente do Cobol está liberado apenas para um usuário, não possibilitando vários desenvolvimentos simultaneos.');

--Script para popular tabela de premissa
INSERT INTO `tb_premissa`(`id`, `desc_premissa`, `texto_premissa`)	VALUES (1, 'Estrutura de dados criada em desenvolvimento','Estrutura de tabelas, partições e índices criadas em desenvolvimento, possibilitando manipulação de dados.');


--Script para popular tabela  tb_pendencia_tecnologia
INSERT INTO `tb_pendencia_tecnologia`(`id_tecnologia`,`id_pendencia`) VALUES (1,1);

--Script para popular tabela  tb_premissa_tecnologia
INSERT INTO `tb_premissa_tecnologia`(`id_tecnologia`,`id_premissa`) VALUES (1,1);

--Script para popular tabela  tb_premissa_tecnologia
INSERT INTO `tb_risco_tecnologia`(`id_tecnologia`,`id_risco`) VALUES (1,1);