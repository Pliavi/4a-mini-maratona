# !! Este foi feito com um "hack" !!
# Na maratona não importa como chegar a o resultado
# apenas deve-se chegar ao esperado

fin  = open('numeros.in', 'r')  # fin == FileIn
fout = open('numeros.out', 'w') # fout == FileOut

for linha in fin:
    linha = linha.strip()
    if linha == '0':
        continue

    # A linha abaixo quebra todos os números
    milhar, centena, dezena, unidade = "{:0>4}".format(linha)

    milhar  = int(milhar)  * 1000
    centena = int(centena) * 100
    dezena  = int(dezena)  * 10

    fout.write("{} {} {} {}\n".format(milhar, centena, dezena, unidade))

fin.close()
fout.close()
