
![[Pasted image 20260709183057.png]]

Para executar este exercício recebemos uma tabela UCM e iremos fazer a leitura desta que é dividida por três blocos:

1. Classe
2. Atributos (do lado temos o tipo de variável do atributo)
3. Métodos (dentro de parênteses temos os parâmetros e ao lado temos o tipo de dado que o método retorna)

Então já temos uma prévia de como o nosso projeto vai ficar:

- O nome da nossa classe composta será Product;
- Dentro desta classe teremos três atributos: `name`, `price` e `quantity`;
- Na nossa entidade teremos três métodos que utilizarão os atributos já declarados na classe:
    - `TotalValueInStock(): double` -> Onde vamos ter um controle de quantos produtos temos em estoque
    - `AddProducts(quantity: int): void` -> Agora aqui neste método vamos acrescentar produtos na nossa lista de estoque, PORÉM, vamos precisar utilizar um parâmetro. Este é declarado sempre dentro dos parênteses do método e na tabela de UCM ficará dentro do parênteses também.
    - `RemoveProducts(quantity: int): void` -> Mesma coisa para o método anterior, porém utilizaremos uma fórmula um pouco diferente, pois agora o objetivo é tirar produtos da lista de estoque;

Mas agora vem o questionamento:

*Se temos um atributo na entidade chamado `quantity` como que o código vai diferenciar o parâmetro `quantity` dos métodos?*

Para que não haja confusões vamos utilizar um carinha chamado `this.quantity`. Este vai trabalhar justamente para que o código consiga diferenciar um atributo e um parâmetro com o mesmo nome;

Um exemplo prático de como utilizar o `this` num código e montando a sintaxe do método `AddProducts()`:

```java
public void AddProducts(int quantity) {
	this.quantity += quantity;
}
```

Pronto, o seu código agora sabe diferenciar qual `quantity` é o ATRIBUTO e o PARÂMETRO. 