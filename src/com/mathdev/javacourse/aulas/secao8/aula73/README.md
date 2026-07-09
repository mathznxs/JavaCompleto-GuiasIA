# S8A73 - Criando um método para obtermos os benefícios de reaproveitamento e delegação

Na aula anterior aprendemos e declaramos ao invés de quatro variáveis para representar um único triângulo, porém reduzimos isto para uma classe composta com três atributos e agora vamos aprender a utilizar MÉTODOS.

No código anterior, era necessário repetir a mesma fórmula duas vezes para calcular os dois triângulos:

```java
double p = (xA + xB + xC) / 2.0;  
double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));  
  
System.out.printf("\nÁrea do triângulo X: %.4f", areaX);  
  
p = (yA + yB + yC) / 2.0;  
double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));  
  
System.out.printf("\nÁrea do triângulo X: %.4f", areaY);
```

E pensando em organização, não é tão recomendado que este calculo esteja integrado direto no código base do Program.java, então vamos criar um novo método agora dentro da entidade Triangle()

para isso dentro da classe vamos atribuir um novo método:

```java
package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area (parâmetro) {
		
	}
}
```

A partir deste novo método vamos agora retirar as fórmulas do Program.java e levar para a entidade Triangle():

```java
public double area( ) {
	double p = (a + b + c) / 2.0; 
	return Math.sqrt(p * (p - a) * (p - b) * (p - c));
}
```

perfeito! Agora que os métodos já estão declarados na entidade Triangle() agora podemos já chamar o método no código Program.java:

Ao invés de criarmos várias variáveis, vamos apenas criar duas que são `areaX` e `areaY`:

```java
double areaX = x.area();
double areaY = y.area();
```

Tornando o código MUITO mais compacto, limpo e trabalhável, agora assim que o Scanner fazer a leitura das variáveis, vai enviar os valores para a entidade, calcular os valores no método e retornar os valores para o Program.java podendo ser exibidos no `System.out.print`:

```java 
Triangle x, y;
x = new Triangle();
y = new Triangle();
 
System.out.println("Insira as medidas do triângulo X: ");  
x.a = sc.nextDouble();  
x.b = sc.nextDouble();  
x.c = sc.nextDouble();  
System.out.println("Insira as medidas do triângulo Y: ");  
y.a = sc.nextDouble();  
y.b = sc.nextDouble();  
y.c = sc.nextDouble();  
   
double areaX = x.area();
double areaY = y.area(); 
    
System.out.printf("\nÁrea do triângulo X: %.4f", areaX);    
System.out.printf("\nÁrea do triângulo X: %.4f", areaY);
```

![[Pasted image 20260709181123.png]]

## Agora vem a discussão: 

**Quais os benefícios de se calcular a área do triângulo por meio de um MÉTODO dentro da CLASSE Triangle()?**

1. **Reaproveitamento do código**: Fizemos uma limpeza no código principal eliminando código repetitivo para calcular a área do triângulo.
2. **Delegação de responsabilidades**: Quem deve ser responsável por saber como calcular a área do triângulo é o próprio triângulo. A lógica do calculo da área não deve estar em outro lugar.

