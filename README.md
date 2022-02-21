# library-api
Design-de-API-s-RestFul-com-Spring-Boot-TDD-e-o-novo-JUnit5

# Endpoints
## Verbos HTTP

POST
- Criar um recurso no servidor.
- Envia-se o recurso a ser criado.
- Resposta com código 201(CREATED).

GET
- Obter um recurso do servidor
- Pode se enviar parâmentros com critérios de busca.
- Resposta de sucesso com código 200(OK) ou 404 (NOT FOUND)
- quando o rerurso não foi encontrado no servidor.

PUT
- Atualizar um recurso no servidor.
- Envia-se recurso com as informaçoes atualizadas a através
  da URL, envia-se o identificador do recurso que irá receber a atualização.
- Resposta com código 200(OK).

DELETE
- Deleta um recurso no servidor.
- Envia-se o identificador do recurso que deseja-se
  deletar através da URL.
- Resposta com código 204(NO CONTENT).

# Identificação de Recursos

### Verbo HTTP ---- URL --------- Ação

POST   |  --------------->    /Clientes  |--------->   *salvar            
GET    |  ---------------->   /Cliente/1   |--------->  *visualizar                
DELETE |  ---------->    /Cliente/1   | --------->  *remover           
PUT    |  --------------->    /Cliente/1  |----------->  *atualizar

# Identificação de sub Recursos

### Verbo HTTP --------- URL --------- Ação

POST   |  --------->    /Clientes/1/endereços  |--->   *salvar            
GET    |  ---------->   /Cliente/1/endereços/1   |--->  *visualizar                
DELETE |  ----->    /Cliente/1/endereços/1    | --->  *remover           
PUT    |  ----------->  /Cliente/1/endereços/1   | --->  *atualizar

# Códigos de Status

### Verbo HTTP  --- Sucesso ---------- Erro

POST   |  ----------->    201 (CREATED)  |---> 400 (BAD REQUEST)           
GET    |  ------------->   200 (OK)   |-------------> 404 (NOT FOUND)                
DELETE |  ------>  204 (NO CONTENT)|-----> 400 (BAD REQUEST)/ 404 (NOT FOUND)          
PUT    |  ------------>   200 (OK) | --------------->  400/ 404 (NOT FOUND)

## Tecnologias Usadas

Java.
GitHub.
Intelij.
Insomnia.
Spring Boot..
