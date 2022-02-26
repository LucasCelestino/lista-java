# Lista de Exercícios Java
Lista de exercícios sobre OO em Java para a matéria de Desenvolvimento para servidores I do curso de Sistemas para Internet da FATEC RL



**Exercício 1.1**
Dada a classe Pessoa, que possui os atributos: String
nome, String sexo, int idade, boolean vegetariana. Faça agora uma
classe Churrasco que possua:
Atributos: qtdCarne(double);
Método: verificarConsumo(): Recebe via parâmetro uma Pessoa, e com
isto define a consumação média de carne(quantidade de carne consumida), pessoas de 0 a 3 anos não consomem, vegetarianos também não.
Pessoas de 4 a 12 anos consomem 1 kilo de carne e de 13 anos em diante 2 kilos de carne


**Exercício 1.2**
*Implemente uma classe Lâmpada. Toda lâmpada possui um estado (on/off ). Sabe-se que as lâmpadas podem ter seu estado
trocado (click do interruptor). Será necessário também uma funcionalidade para checar o estado atual da lâmpada. Uma lâmpada estraga após
uma quantidade de clicks (o click não troca mais o estado deixando-a
eternamente em off ) e esta depende da lâmpada. Implemente esta situação e seu teste.*


**Exercício 1.3**
*Implemente uma classe chamada Complexo para representar números imaginários e esta deve possuir:
Atributos: dois doubles a(Parte real) e b(Parte imaginária).
Métodos:*
*(1) Construtor;
(2) soma(): recebe via parâmetro outro número complexo(objeto desta
classe) e efetua sua soma, ou seja, parte real será somada com
parte real, e parte imaginária com parte imaginária.
(4) toString(): Mostra uma string na tela com os atributos a e b na
notação Complexa a+bi.*


**Exercício 1.4**
*Implemente uma classe que modele um triangulo equilátero(lados iguais)
Atributos: lado, perímetro, área.
Métodos: calcArea(), calcPerímeto() e seus gets. O lado deverá ser
o único atributo inicializado via construtor.
Fórmulas:
Área = lado *
√
3
2
Perímetro= 3*lado  *


**Exercício 1.5**
*Implemente uma classe que modele um jogo de advinhação de números de 0 a 99. O jogo deve possuir um método para
sortear e outro que simule a advinhação.*


**Exercício 1.6**
*Implemente a classe Eq2Grau que possua:
• Atributos: a,b e c (doubles);
• Métodos: delta(): retorna o delta da equação;
• raiz1(): retorna a primeira raiz se ∆ ≥ 0, se não retorna NaN;
• raiz2(): retorna a segunda raiz se ∆ ≥ 0, se não retorna NaN.*


**Exercício 1.7**
*Implemente a classe Porta que possua:
• Atributos: isOpen(boolean), numAberturas(int);
• Métodos: abrir(): abre a porta e conta 1 na contagem de aberturas;
• fechar(): fecha a porta. OBS: O atributo numAberturas deve
contar o total de aberturas de todas as portas possíveis.*
