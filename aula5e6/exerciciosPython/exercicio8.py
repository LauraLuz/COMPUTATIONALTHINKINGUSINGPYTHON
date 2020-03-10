'''O usuário informa o valor de um boleto,
o percentual de juros cobrado e o numero de dias em atraso. O
programa calcula o novo valor a ser pago através da fórmula:
NOVO VALOR = VALOR BOLETO + (VALOR BOLETO * (JUROS/100)) * DIAS'''

boleto = int(input("Insira o valor de um boleto: "))
juros = float(input("Insira o valor do percentual de juros: "))
atraso = float(input("Insira o número de dias em atraso: "))

novoBoleto = boleto + (boleto*(juros/100)*atraso)

print("O valor do novo boleto a ser pago é de {}".format(novoBoleto))
