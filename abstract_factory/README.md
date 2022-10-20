## Abstract Factory

O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.(Livro Mergulho nos Padrões de Projeto) 

Prover uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.(Livro GOF)

---
#### - Problema

Como escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? 

Como podemos garantir que um conjunto/familia de objetos relacionados ou dependentes possam ser criadas em um unico contexto?

de objtos relacionados  deixar o código desacoplado das classes concretas? 

COMO GARANTIR QUE UM CONJUNTO DE
OBJETOS RELACIONADOS (OU
MANTENDO O CONTEXTO ÚNICO?



#### - Solução

Extrair o código de criação para um Factory Method.  

Invocar o Factory Method para receber uma instância qualquer que implemente um determinada interface.

#### - Vantagens

 Você evita acoplamentos firmes entre o criador e os produtos concretos.
 
 Princípio de responsabilidade única. Você pode mover o código de criação do produto para um único local do programa, facilitando a manutenção do código.
 
 Princípio aberto/fechado. Você pode introduzir novos tipos de produtos no programa sem quebrar o código cliente existente.
 
#### - Desvantagens
 
O código pode se tornar mais complicado, pois você precisa introduzir muitas subclasses novas para implementar o padrão. O melhor cenário é quando você está introduzindo o padrão em uma hierarquia existente de classes criadoras.
