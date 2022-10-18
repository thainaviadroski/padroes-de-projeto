## Factory Method

É um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados. 

---
#### - Problema

Como escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? 

Como escrever um código onde as classes instanciadas possam variar dentro de uma mesma interface? 

Como deixar o código desacoplado das classes concretas? 

#### - Solução

Extrair o código de criação para um Factory Method

Invocar o Factory Method para receber uma instância qualquer que implemente um determinada interface.





O [Factory Method](https://refactoring.guru/pt-br/design-patterns/factory-method) é um padrão criacional de projeto que fornece uma interface para criar objetos em uma superclasse, mas permite que as subclasses alterem o tipo de objetos que serão criados.

[Implementação Java](factory_method/java)

