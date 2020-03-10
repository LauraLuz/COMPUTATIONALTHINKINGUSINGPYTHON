''' O usuário informa quatro valores. O
programa mostra o resultado da multiplicação do primeiro pelo terceiro e
o resultado da soma do segundo com o quarto.'''

n1 = int(input("Digite o primeiro valor: "))
n2 = int(input("Digite o segundo valor: "))
n3 = int(input("Digite o terceiro valor: "))
n4 = int(input("Digite o quarto valor: "))

multiplicacao = n1*n3
soma = n2+n4

print("O resultado da multiplicação do primeiro valor com o terceiro é {} \ne da soma do segundo com o quarto é {}".format(multiplicacao, soma)) #impressão do resultado
#print("o quadrado do número", numero, "é:", quadrado)