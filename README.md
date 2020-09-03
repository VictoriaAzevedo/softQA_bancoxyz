# softQA_bancoxyz

<b>Gerenciamento Banco - Cenários verificados</b>

<b>Cadastrar novo cliente</b>
<b>DADO</b> administrador deve fazer novo cadastro de cliente
<b>QUANDO</b> enviar formulário com todos os dados do cliente preenchido 
<b>ENTÃO</b> sistema deve salvar dados gerando novo login e id para o cliente.

<b>Cadastrar cliente dados duplicados</b>
<b>DADO</b> administrador deve fazer novo cadastro de cliente
<b>QUANDO</b> preencher todos os dados do cliente no formulário com dados já cadastrados
<b>ENTÃO</b> sistema não deve salvar dados apresentando mensagem de erro.

<b>Cadastrar nova conta para cliente</b>
<b>DADO</b> administrador deva abrir uma nova conta para cliente cadastrado
<b>QUANDO</b> enviar formulário com nome do cliente  e moeda utilizada selecionados
<b>ENTÃO</b> sistema deve gerar um número de conta nova para o cliente.

<b>Acesso cliente - Cenários verificados</b>

<b>Login do cliente</b>
<b>DADO</b> cliente seja cadastrado quer fazer login
<b>QUANDO</b> selecionar nome do cliente acionar botão [Login]
<b>ENTÃO</b> sistema deve abrir página com informações do cliente selecionado.

<b>Alterar número de conta</b>
<b>DADO</b> cliente logado tenha mais de uma conta cadastrada
<b>QUANDO</b> selecionar outro número de conta
<b>ENTÃO</b> sistema deve atualizar dados de número da conta selecionada.

<b>Depósito sucesso - mensagem</b>
<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer depósito
<b>QUANDO</b> informar o valor maior que 0 para depósito 
<b>ENTÃO</b> sistema deve salvar movimentação e apresentar mensagem de sucesso.

<b>Depósito sucesso - alterar saldo total</b>
<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer depósito
<b>QUANDO</b> informar o valor maior que 0 para depósito 
<b>ENTÃO</b> sistema deve atualizar saldo total da conta.

<b>Depósito valr não permitido</b>
<b>DADO</b> cliente esteja logado que tenha conta cadastrada deseja fazer depósito
<b>QUANDO</b> informar o valor menor ou igual a 0 para depósito 
<b>ENTÃO</b> sistema não deve efetuar depósito.

<b>Saque sucesso - alterar saldo total</b>
<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer saque
<b>QUANDO</b> informar o valor para saque
<b>ENTÃO</b> sistema deve atualizar saldo total da conta. 

<b>Saque valor não permitido</b>
<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer saque
<b>QUANDO</b> informar o valor maior que o saldo total para saque
<b>ENTÃO</b> sistema não deve efetuar saque informando que a transação falhou por falta de saldo. 

<b> Excluir movimentações</b>
<b>DADO</b> cliente esteja logado que tenha conta cadastrada deseja excluir todas as movimentações feitas na conta
<b>QUANDO</b> clicar botão [Reset] na listagem de movimentações
<b>ENTÃO</b> sistema deve zerar saldo total da conta.

<b>Logout conta</b>
<b>DADO</b> cliente esteja logado deseja sair do perfil
<b>QUANDO</b> clicar botão [Logout]
<b>ENTÃO</b> sistema deve voltar para a página inicial de logins.
