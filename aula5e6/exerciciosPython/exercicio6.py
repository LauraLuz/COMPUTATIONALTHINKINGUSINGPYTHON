'''O usuário digita a temperatura em
graus Célsius e o programa exibe o valor em graus Fahrenheit'''

celsius = float(input("Digite a temperatura em celsius que deseja converter: "))

fahrenheit = (celsius*(9/5)+32)

print("A temperatura em fahrenheit é {}".format(fahrenheit)) #impressão do resultado
