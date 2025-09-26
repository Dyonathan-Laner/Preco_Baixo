# Preco_Baixo
Sistema para o mercado: Preço Baixo

Apresentação: Seu Joaquim é dono de um mercadinho de sua cidade, onde futuramente ele planeja fazer uma expansão que tornaria seu mercadinho em um dos maiores mercados de sua cidade. Atualmente ele contém um sistema de estoque por anotações em seu caderno, o que não gera nenhum problema no momento já que ele tem poucos produtos e apenas seu neto como funcionário, mas com essa ampliação será necessário o desenvolvimento de um software que organize seus produtos e seus futuros funcionários.

Descrição do projeto: Em vista tudo isso será necessária a criação de um software desktop que organize os funcionários e seus salários e gere um controle de suas mercadorias.

Descrição dos usuários:

Gerente(Dono): Terá acesso liberado a todas as funções e funcionalidades do software como controle de salário e dados de cada funcionário, controle de estoque, criação e exclusão de contas dos seus funcionários.

Repositor: Terá acesso ao controle de estoque e todos seus dados. Açougueiro: Terá acesso ao controle de estoque e todos seus dados. Faxineiro: Terá acesso apenas aos seus dados.
Caixa: Terá acesso apenas aos seus dados e controle de estoque.

Necessidades observadas: Será necessário que mais de um funcionário consiga acessar o software ao mesmo tempo, não necessite de internet, que seja prático e rápido para não causar espera ou confusão.

Regras de negócio: Funcionários com mais de 40 anos ganham um adicional de 300 reais a mais no final do mês.

Requisitos funcionais:
Conta:
Criação de conta utilizando os dados senha, cpf, nome, email, nascimento, função no mercado e salário.
Exclusão ou modificação dessa conta sendo que para logar deve ser necessário nome e senha.

Funcionários:
Visualização de todos os dados dos funcionários sendo que cada funcionário tem acesso apenas aos seus dados(com exceção do Gerente que tem acesso a todos os dados).

Estoque:
Adicionar, remover ou modificar produtos e seus dados (nome, valor, validade e quantidade).
Visualizar produtos em forma de tabela, sendo possível pesquisar por nome.

Requisitos não funcionais:
O sistema deve permitir o login de qualquer usuário em até 3 segundos, garantindo agilidade e não causando filas e lentidão no mercado.

Tecnologias previstas: java + mysql = sistema desktop. 

Telas previstas:

Tela de login:
Deve ser uma tela que solicite nome do usuário e senha.

Tela inicial:
Deve ter uma opção que leva a tela de estoque, outra que leve até a tela dos dados da pessoa logada e outra que leva a tela das contas que só aparecerá para quem tiver o cargo de gerente.
Deve ter um botão para sair.

Tela das contas:
Mostrar todas as contas contendo a opção de excluir(que deve pedir a senha do Gerente por segurança e como modo de confirmação), modificar ou adicionar mais uma conta (esses dois devem abrir cada um uma tela com a respectiva função).
Deve haver a função para calcular o salário final do funcionário selecionado informando o total de horas trabalhadas.


Tela modificar conta:
Deve ter opção para redefinir qualquer dado da conta selecionada na tela anterior(esses espaços devem vir preenchidos com os dados atuais ).
Também deve ter um botão para salvar as alterações, que deve exigir uma confirmação com a senha do Gerente.

tela adicionar conta:
Deve ser possível adicionar todos os dados de um novo usuário.
Deve ter a opção de voltar para a tela anterior e a opção de criar, que deve ser confirmado com a senha do Gerente como segurança.

Tela do estoque:
Deve exibir os produtos e seus dados.
Deve haver opções de exclusão, modificação ou adição de um produto. Deve ter um espaço para filtrar os produtos(nome).

Tela adicionar produto:
Deve ter espaços de preenchimento para todos os dados de produtos(nome, validade, quantidade e preço).

Tela editar produto:
Deve ter opções para editar qualquer dado de um produto.

Tela dados:
Deve mostrar ao usuário todos os seus dados.

OBS: Todas as telas devem ter um botão para voltar.
