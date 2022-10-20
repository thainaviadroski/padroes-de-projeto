## Abstract Factory

O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.(Livro Mergulho nos Padrões de Projeto) 

Prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.(Livro GOF)

---
#### - Problema

Como escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? 

Como garantir que um conjunto de objetos relacionados ou dependentes possam ser criadas em um único contexto?

#### - Solução

Extrair o código de criação para um Abstract Factory.  

Criar uma implementção do Abstract Factory para cada contexto, garantindo assim que todos os objetos criados sejam do mesmo conjunto.

#### - Vantagens

 Você evita acoplamentos firmes entre o criador e os produtos concretos.
 
 Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.
 
 Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.
 
#### - Desvantagens
 
O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.
