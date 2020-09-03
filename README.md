# softQA_bancoxyz

<h3><b>Gerenciamento Banco - Cenários verificados</b></h3><br>

<b>Cadastrar novo cliente</b><br>

<b>DADO</b> administrador deve fazer novo cadastro de cliente
<b>QUANDO</b> enviar formulário com todos os dados do cliente preenchido 
<b>ENTÃO</b> sistema deve salvar dados gerando novo login e id para o cliente.
<br>

<b>Cadastrar cliente dados duplicados</b><br>

<b>DADO</b> administrador deve fazer novo cadastro de cliente
<b>QUANDO</b> preencher todos os dados do cliente no formulário com dados já cadastrados
<b>ENTÃO</b> sistema não deve salvar dados apresentando mensagem de erro.
<br>

<b>Cadastrar nova conta para cliente</b><br>

<b>DADO</b> administrador deva abrir uma nova conta para cliente cadastrado
<b>QUANDO</b> enviar formulário com nome do cliente  e moeda utilizada selecionados
<b>ENTÃO</b> sistema deve gerar um número de conta nova para o cliente.
<br>

<h3><b>Acesso cliente - Cenários verificados</b></h3><br>

<b>Login do cliente</b><br>

<b>DADO</b> cliente seja cadastrado quer fazer login
<b>QUANDO</b> selecionar nome do cliente acionar botão [Login]
<b>ENTÃO</b> sistema deve abrir página com informações do cliente selecionado.
<br>

<b>Alterar número de conta</b><br>

<b>DADO</b> cliente logado tenha mais de uma conta cadastrada
<b>QUANDO</b> selecionar outro número de conta
<b>ENTÃO</b> sistema deve atualizar dados de número da conta selecionada.
<br>

<b>Depósito sucesso - mensagem</b><br>

<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer depósito
<b>QUANDO</b> informar o valor maior que 0 para depósito 
<b>ENTÃO</b> sistema deve salvar movimentação e apresentar mensagem de sucesso.
<br>

<b>Depósito sucesso - alterar saldo total</b><br>

<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer depósito
<b>QUANDO</b> informar o valor maior que 0 para depósito 
<b>ENTÃO</b> sistema deve atualizar saldo total da conta.
<br>

<b>Depósito valr não permitido</b><br>

<b>DADO</b> cliente esteja logado que tenha conta cadastrada deseja fazer depósito
<b>QUANDO</b> informar o valor menor ou igual a 0 para depósito 
<b>ENTÃO</b> sistema não deve efetuar depósito.
<br>

<b>Saque sucesso - alterar saldo total</b><br>
<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer saque
<b>QUANDO</b> informar o valor para saque
<b>ENTÃO</b> sistema deve atualizar saldo total da conta. 
<br>

<b>Saque valor não permitido</b><br>

<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer saque
<b>QUANDO</b> informar o valor maior que o saldo total para saque
<b>ENTÃO</b> sistema não deve efetuar saque informando que a transação falhou por falta de saldo. 
<br>

<b> Excluir movimentações</b><br>

<b>DADO</b> cliente esteja logado que tenha conta cadastrada deseja excluir todas as movimentações feitas na conta
<b>QUANDO</b> clicar botão [Reset] na listagem de movimentações
<b>ENTÃO</b> sistema deve zerar saldo total da conta.
<br>

<b>Logout conta</b><br>

<b>DADO</b> cliente esteja logado deseja sair do perfil
<b>QUANDO</b> clicar botão [Logout]
<b>ENTÃO</b> sistema deve voltar para a página inicial de logins.

<h3><b>Cenários previstos ainda não validados</b></h3><br>

<h4><b>Gerenciamento Banco</b></h4><br>

<b>Excluir cadastro de cliente</b><br>

<b>DADO</b> administrador deve excluir cadastro do cliente
<b>QUANDO</b> selecionar o botão [Delete] na listagem referente ao cliente
<b>ENTÃO</b> sistema deve deletar as informações sobre o cliente.


<h4><b>Login cliente</b></h4><br>

<b>Cliente sem conta cadastrada</b><br>

<b>DADO</b> cliente não tem conta cadastrada
<b>QUANDO</b> fizer o login  
<b>ENTÃO</b> sistema deve apresentar mensagem para cadastrar conta.

<b>Depósito Sucesso - validar atualização listagem</b><br>

<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer depósito
<b>QUANDO</b> informar o valor maior que 0 para depósito 
<b>ENTÃO</b> sistema deve salvar dados da movimentação (data/hora, total depositado e tipo de transação) na listagem de transações.

<b>Saque Sucesso - validar atualização listagem</b><br>

<b>DADO</b> cliente logado que tenha conta cadastrada deseja fazer saque
<b>QUANDO</b> informar o valor para saque
<b>ENTÃO</b> sistema deve salvar dados da movimentação (data/hora, total sacado e tipo de transação) na listagem de transações.  

<b>Excluir movimentações - validar atualização listagem</b><br>

<b>DADO</b> cliente esteja logado que tenha conta cadastrada deseja excluir todas as movimentações feitas na conta
<b>QUANDO</b> clicar botão [Reset] na listagem de movimentações
<b>ENTÃO</b> sistema deve apagar todas as movimentações listadas da conta até o momento.
