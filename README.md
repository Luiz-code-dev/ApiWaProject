# ApiWaProject
API para manutenção de laboratórios e exames.<br>

💻 API para gerenciamento de laboratórios e exames permite realizar CRUD para exame e laboratório, associar um exame a um laboratório, desassociar um exame de um laboratório e listar todos os laboratórios associados a um exame através da busca por nome do exame.

<h4>⚙️ Tecnologias Utilizadas</h4><br>
O projeto foi criado com Spring Boot na linguagem de programação Java com BD PostgreSQL, utilizando Spring Data JPA e o gerenciador de dependência Maven.<br>

<h4>Arquitetura</h4><br>
O projeto está divido nas seguintes camadas:<br>

main:<br>
Entidade<br>
Repositório<br>
Serviço<br>
Controle<br>
DTO<br>
Converte<br>
Exceção

# 🚀 Como executarClonar o projeto

🎲 Rodando o servidor
# Clone este repositório
$ git clone <https://github.com/Luiz-code-dev/ApiWaProject.git>

**Ter instalado o BD PostgreSQL<br>**
**Configurar no aplication.properties a conexão do BD<br>**
**Executar no terminal o comando: mvn spring-boot:run<br>**
**Chamar os endpoint.<br>**
<h4>Como testar<br></h4>
O sistema possui os endpoint abaixo:

POST /exames: Requisita o cadastro do exame que é enviado no corpo da requisição. Exemplo do corpo da requisição para Cadastro de Exame
{
	"nome": "Hemograma",
	"tipo": "ANALISE_CLINICA"
}


GET /exames: Requisita todos os exames cadastrados na aplicação.
*Não possui corpo na requisição*


GET /exames/{id}: Requisita os dados do exame do id informado na URL.
*Não possui corpo na requisição*


PUT /exames/{id}: Requisita a atualização do id informado na URL com os novos dados enviado no corpo da requisição. Exemplo do corpo da requisição para Atualizar o Exame
{
	"nome": "Hemograma",
	"tipo": "ANALISE_CLINICA",
	"status": "INATIVO"
}


DELETE /exames/{id}: Requisita a remoção lógica do exame informado pelo id na URL (Remoção Lógica = Inativar o status do exame).
*Não possui corpo na requisição*


POST /laboratorios: Requisita o cadastro do laboratório que é enviado no corpo da requisição. Exemplo do corpo da requisição para Cadastro de Laboratório
{
	"nome": "Laboratório Sabin",
	"endereco": "Salvador"
}


GET /laboratorios: Requisita todos os laborátorios cadastrados na aplicação.
*Não possui corpo na requisição*


GET /laboratorios?nome=: Requisita todos os laborátorios associados ao nome do exame passado na URL. Para buscar através do nome do exame é necessário passar o paramentro na URL.

*Não possui corpo na requisição*


GET /laboratorios/{id}: Requisita os dados do id do laboratório informado na URL.
*Não possui corpo na requisição*


PUT /laboratorios/{id}: Requisita a atualização do id do laboratório informado na URL com os novos dados enviados no corpo da requisição. Exemplo do corpo da requisição para Atualizar o Laboratório
{
	"nome": "Laboratório CRV",
	"endereco": "SanSalvador",
	"status": "INATIVO"
}


DELETE /laboratorios/{id}: Requisita a remoção lógica do laboratório informado pelo id na URL (Remoção Lógica = Inativar o status do laboratório).
*Não possui corpo na requisição*


POST /exames/{id}/laboratorios: Requisita a associação do id do exame informado na URL com o id do laboratório informado no corpo da requisição. Exemplo do corpo da requisição para Associar um Exame a um Laboratório
{
	"idLaboratorio": 2
}


DELETE /exames/{id}/laboratorios: Requisita a desassociação do id do exame informado na URL com o id do laboratório informado no corpo da requisição. Exemplo do corpo da requisição para Desassociar um Exame de um Laboratório
{
	"idLaboratorio": 2
}


# Acesse <https://api-laboratorios-exames.herokuapp.com/>

