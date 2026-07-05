# Criando uma classe para representar uma entidade

## Objetivo da aula

O foco desta aula **não é diminuir linhas de código**.

O verdadeiro objetivo é aprender a **modelar um problema do mundo real através de objetos**.

Até agora o programa tratava apenas números independentes.

Agora começamos a enxergar que vários desses números pertencem à mesma "coisa".

Essa "coisa" passa a ser representada por uma **classe**.

---

# Antes da Orientação a Objetos

Na aula anterior cada lado do triângulo era tratado como uma variável independente.

```
double xA;double xB;double xC;double yA;double yB;double yC;
```

Visualmente:

```
xAxBxCyAyByC
```

Problemas desse modelo:

- muitas variáveis
- nomes começam a ficar confusos
- difícil aumentar o programa
- difícil reutilizar código
- os dados não ficam organizados

Embora essas seis variáveis representem apenas **dois triângulos**, o compilador não sabe disso. Para ele, são apenas seis valores `double` independentes.

---

# Pensando como Orientação a Objetos

Em vez de pensar:

```
Tenho 6 variáveis
```

passamos a pensar:

```
Tenho 2 triângulos
```

Cada triângulo possui:

```
lado Alado Blado C
```

Ou seja:

```
Triângulo    ├── a    ├── b    └── c
```

Essa mudança de pensamento é chamada de **modelagem**.

Modelar significa representar elementos do mundo real utilizando código.

---

# O que é uma entidade?

Uma entidade é um objeto do mundo real que possui características próprias.

Exemplos:

```
PessoaNomeIdadeCPF
```

```
ProdutoNomePreçoQuantidade
```

```
TriânguloLado ALado BLado C
```

Nesta aula:

A entidade é:

```
Triangle
```

Ela representa um triângulo qualquer.

---

# O que é uma Classe?

Definição simples:

> Uma classe é um molde utilizado para criar objetos.

Imagine uma planta de uma casa.

A planta não é uma casa.

Ela apenas descreve como uma casa deverá ser construída.

Classe funciona exatamente assim.

```
Classe↓Objeto↓Objeto↓Objeto
```

Todos seguem o mesmo modelo.

O professor define a classe como um **tipo estruturado**, capaz de agrupar dados e comportamentos relacionados. Ela pode conter atributos, métodos e outros recursos da linguagem, embora nesta aula sejam utilizados apenas os atributos.

---

# Estrutura de uma classe

Nesta aula a classe é extremamente simples.

```
public class Triangle {    public double a;    public double b;    public double c;}
```

Cada linha possui uma função.

```
public class Triangle
```

Define um novo tipo chamado Triangle.

Depois:

```
public double a;
```

cria um atributo.

O mesmo vale para:

```
b
```

e

```
c
```

---

# O que é um atributo?

Atributo é uma informação pertencente ao objeto.

No nosso caso:

```
Triangle↓a↓b↓c
```

Esses atributos existem **dentro** de cada objeto criado.

É por isso que depois conseguimos acessar:

```
x.a
```

---

# O significado do `public`

Nesta aula todos os atributos são públicos.

```
public double a;
```

O `public` indica que o atributo pode ser acessado por outras classes do programa. Isso permite que a classe `Program` leia e altere diretamente os valores de `a`, `b` e `c`. Nas próximas aulas você verá por que essa prática é evitada em projetos reais, mas neste momento ela simplifica o aprendizado.

---

# O Package `entities`

Foi criado:

```
entities
```

Por quê?

Porque ele irá guardar todas as entidades do sistema.

É uma convenção muito utilizada.

Exemplo:

```
applicationProgram.java
```

```
entitiesTriangle.javaProduct.javaClient.java
```

Isso deixa o projeto organizado.

---

# Criando objetos

Depois de criar a classe:

```
Triangle
```

podemos criar objetos.

Primeiro declaramos as referências:

```
Triangle x, y;
```

Aqui **nenhum objeto foi criado ainda**.

Apenas declaramos duas variáveis capazes de armazenar objetos do tipo Triangle.

---

# O operador `new`

Depois aparece:

```
x = new Triangle();
```

O que acontece?

Java reserva memória.

↓

Cria um objeto.

↓

Devolve o endereço desse objeto.

↓

Esse endereço é guardado em:

```
x
```

O mesmo ocorre com:

```
y
```

Esse processo é chamado de **instanciação**, ou seja, transformar a definição da classe em um objeto real na memória.

---

# O que significa `x.a`?

Antes:

```
xA
```

era uma variável independente.

Agora:

```
x.a
```

significa:

```
Objeto x↓atributo a
```

Ou seja:

```
x↓a = 3↓b = 4↓c = 5
```

Enquanto:

```
y↓a = 7.5↓b = 4.5↓c = 4.02
```

Cada objeto possui sua própria cópia dos atributos.

---

# Como a memória fica organizada

Antes:

```
xAxBxCyAyByC
```

Tudo espalhado.

Agora:

```
Objeto Xabc----------------Objeto Yabc
```

Muito mais organizado.

O slide mostra essa diferença utilizando a separação entre **Stack** e **Heap**. As variáveis `x` e `y` ficam na Stack armazenando referências, enquanto os objetos `Triangle` criados com `new` ficam na Heap contendo os atributos `a`, `b` e `c`. Nesta etapa basta entender que o objeto existe em uma região de memória diferente da variável que o referencia.

---

# Comparando os dois códigos

## Antes

```
double xA;double xB;double xC;
```

Cada informação era independente.

---

## Depois

```
Triangle x;
```

Agora todas as informações pertencem ao mesmo objeto.

```
x↓a↓b↓c
```

O código passa a representar melhor o problema.

---

# O que mudou na prática?

Antes:

```
6 variáveis
```

Agora:

```
2 objetos↓cada objeto possui↓3 atributos
```

O número de valores continua sendo seis.

O que mudou foi a organização desses valores.

Essa é a primeira grande vantagem da Orientação a Objetos.

---

# Conceitos aprendidos nesta aula

- Programação Orientada a Objetos (introdução)
- Entidade
- Classe
- Objeto
- Instância
- Instanciação (`new`)
- Atributo
- Referência para objeto
- Package
- Organização de código
- Modelagem de entidades

---

# Resumo da aula

A Aula 72 marca a transição da programação estruturada para a Orientação a Objetos. O problema dos triângulos continua exatamente o mesmo, mas a forma de representá-lo muda completamente: em vez de manipular variáveis soltas, passamos a criar uma **classe** que descreve o que é um triângulo e **objetos** que representam cada triângulo específico. O ganho principal ainda não é reduzir código, e sim **organizar os dados de acordo com o domínio do problema**, tornando o programa mais legível, escalável e alinhado à forma como aplicações profissionais são desenvolvidas.