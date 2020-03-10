''' O usuário digita quanto está valendo o
dólar e quanto em reais ele possui. O programa exibe quantos dólares
vale os reais que o usuário informou'''

dolar = int(input("Digite o valor da cotação do dólar hoje: "))
montante = int(input("Digite o valor em reais do seu montante: "))

quantia = montante/dolar

print("A sua quantia equivale a {}".format(quantia)) #impressão do resultado
print("A sua quantia equivale a", quantia)