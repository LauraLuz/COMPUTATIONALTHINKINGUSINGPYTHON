''' Deve ser informado o preço do litro do combustível e o
valor em dinheiro que se deseja abastecer. O programa mostra
quantos litros serão comprados. (Ex. a gasolina custa
R$ 4,30 e o motorista quer abastecer R$ 50,00).'''

preco = float(input("Digite o preço do combustível: "))
dinheiro = int(input("Digite o valor em reais que deseja abastecer: "))

litros = dinheiro//preco

print("A quantidade de litros que você conseguirá comprar é {}".format(litros)) #impressão do resultado
#print("A quantidade de litros que você conseguirá comprar é", litros)