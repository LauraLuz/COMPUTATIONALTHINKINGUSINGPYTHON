'''O usuário informa o valor do seu salário e suas despesas
mensais. O programa calcula o valor que sobra e diz quanto
tempo (em anos) será necessário poupar para se tornar milionário'''

salario = int(input("Insira o valor de seu salário: "))
despesas = float(input("Insira o valor de suas despesas mensais: "))

diferenca = salario - despesas
tempo = 1000000/diferenca
anos = tempo//12

print("Você demorará {} anos para ficar milhonário".format(anos))
