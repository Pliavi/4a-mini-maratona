#Azulejos
São dados N azulejos de dimensões 10 cm x 10 cm. 
Com eles, você deve montar um conjunto de quadrados (com espessura de um azulejo) de modo a utilizar TODOS os azulejos dados. 
Inicialmente você deve montar o maior quadrado possível com os azulejos dados; 
então, com os azulejos que sobraram, você deve montar o maior quadrado possível, e assim sucessivamente. 
Por exemplo, se forem dados 31 azulejos, o conjunto montado terá quatro quadrados, conforme ilustra a figura abaixo:  
![alt][image]

Sua tarefa consiste em receber um número N de azulejos e informar quantos quadrados serão possíveis de se obter, 
seguindo a regra explicada acima.

### Entrada
A entrada é composta de vários números inteiros aleatórios (N) que representam a quantidade de azulejos.
Cada número entre 1 <= N <= 50000 é dado em uma linha separada. As entradas terminam com um número 0, que não deverá ser verificado.

### Saída
Seu programa deverá imprimir na saída padrão, para cada número dado de azulejos, 
a quantidade possível de quadrados a ser obtida, em uma linha separada.

### Exemplo
| Entrada | Saída |
|---------|-------|
| 347     | 6     |
| 1000    | 5     |
| 50      | 2     |
| 13      | 2     |
| 4       | 1     |
| 10      | 2     |
| 28170   | 3     |
| 0       |       |

[image]: https://github.com/Pliavi/mini-maratonas-ifspcar/blob/master/2015/A)%20Azulejos/img.png?raw=true
