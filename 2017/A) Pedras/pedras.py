from math import ceil

fin  = open('pedras.in', 'r')  # fin == FileIn
fout = open('pedras.out', 'w') # fout == FileOut

for linha in fin:
    if linha.strip() == '0':
        continue

    # Separa os dois valores pelo espaço e os atribui
    col, lin = linha.split(' ')

    # Se seguir o padrão, as linhas e colunas sempre terão uma pedra de distancia sempre
    #  iniciando pela preenchida para que se possa ter a maior quantidade no tabuleiro
    # ex: 5x5 (1 = tem pedra, 0 = não tem pedra)
    # 10101 = 3 (5/2 = 2,5 arredondando para cima 3)
    # 00000 = 0
    # 10101
    # 00000
    # 10101
    # o padrão é sempre o mesmo. em um caso 1010 = 2 (4/2 = 2, arrendondando para cima continua sendo 2)
    # visto isso, toda coluna ou linha PAR estará vazia e toda IMPAR cheia
    # logo, se tem a função:
    #   f(c,l) = ceil(c/2) * ceil(l/2)
    # * ceil arredonda o valor para cima(somando +1 para valores impares)

    res = ceil(col/2) * ceil(lin/2)

    fout.write(str(res))

fin.close()
fout.close()
