# language: pt

Funcionalidade: Apenas usuarios cadastrados podem se logar

  Cenario: Um usuario valido consegue se logar
    Dado o usuario valido
    Quando realiza login
    Entao � redirecionado para a pagina de leiloes


  Cenario: Um usuario invalido n�o consegue se logar
    Dado o usuario invalido
    Quando tenta se logar
    Entao continua na p�gina de login