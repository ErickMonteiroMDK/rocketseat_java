<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <h1>Gerenciador de Tarefas</h1>
    <p>Este projeto consiste em uma API de Gerenciamento de Tarefas desenvolvida em Java com o framework Spring Boot.</p>
    
   <h2>Funcionalidades</h2>
    <ul>
        <li>Criação, listagem e atualização de tarefas.</li>
        <li>Autenticação básica para proteger rotas relacionadas a tarefas.</li>
        <li>Validações de data e permissão de usuário.</li>
        <li>Criptografia de senha utilizando BCrypt.</li>
        <li>Persistência de dados utilizando JPA e banco de dados relacional.</li>
    </ul>
    
   <h2>Estrutura do Projeto</h2>
    <p>O projeto está estruturado em pacotes que representam diferentes componentes da API:</p>
    <ul>
        <li><strong>errors</strong>: Controla exceções específicas da API.</li>
        <li><strong>filter</strong>: Filtro de autenticação para rotas de tarefas.</li>
        <li><strong>task</strong>: Controladores, modelos e repositórios relacionados a tarefas.</li>
        <li><strong>user</strong>: Controladores, modelos e repositórios relacionados a usuários.</li>
    </ul>
    
   <h2>Tecnologias Utilizadas</h2>
    <ul>
        <li>Java</li>
        <li>Spring Boot</li>
        <li>Spring Data JPA</li>
        <li>BCrypt</li>
        <li>Hibernate</li>
        <li>Tomcat (embarcado com Spring Boot)</li>
        <li>Banco de Dados Relacional (configuração dependente do ambiente)</li>
    </ul>
    
   <h2>Como Utilizar</h2>
    <ol>
        <li>Clone este repositório.</li>
        <li>Configure um banco de dados relacional e atualize as configurações no arquivo <code>application.properties</code>.</li>
        <li>Compile e execute o projeto utilizando Maven ou a IDE de sua preferência.</li>
    </ol>
    
   <h2>Contribuição</h2>
    <p>Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests e reportar issues.</p>
    
  <h2>Autor</h2>
    <p>Erick Monteiro - <a href="https://github.com/erickmonteiro">GitHub</a></p>
</body>
</html>
