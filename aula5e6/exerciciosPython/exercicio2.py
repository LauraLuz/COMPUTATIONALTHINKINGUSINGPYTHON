''' O usuário informa três números
inteiros, o programa soma esses três valores e depois mostra o
quadrado do resultado obtido.'''

n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))
n3 = int(input("Digite o terceiro número: "))
soma = n1+n2+n3
quadrado = soma*soma

print("A soma dos números é {} e o quadrado da soma é {}".format(soma, quadrado)) #impressão do resultado
#print("o quadrado do número", numero, "é:", quadrado)