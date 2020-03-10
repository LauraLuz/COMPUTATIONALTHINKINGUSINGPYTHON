'''Calcula o volume cúbico de uma lata de óleo. O usuário
informa a altura e o valor de r. O programa calcula através
da fórmula VOLUME = 3.14 * (R * R) * ALTURA'''

h = float(input("Insira a altura da sua lata de óleo: "))
R = float(input("Insiro raio da sua lata de óleo: "))

volume = (3.14*(R*R)) * h

print("O volume cúbico da sua lata de óleo é {}".format(volume))
