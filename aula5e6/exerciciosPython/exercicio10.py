''' Três candidatos concorreram a uma eleição
(A, B, C). O usuário deve informar quantos votos cada candidato
recebeu, quantos foram os votos brancos e quantos foram os
votos nulos. O programa deve calcular e informar: o número total
de eleitores, o percentual de votos que cada candidato recebeu
(em relação ao número total de eleitores), o percentual de
brancos e o percentual de nulos.'''

candidatoA = int(input("Insira número de votos do Candidato A: "))
candidatoB = int(input("Insira número de votos do Candidato B: "))
candidatoC = int(input("Insira número de votos do Candidato C: "))
nulos = int(input(("Insira número de votos Nulos: ")))
brancos = int(input(("Insira número de votos Brancos: ")))

total = candidatoA + candidatoB + candidatoC + brancos + nulos


print("Total de eleitores: ", total)
print("Percentual de votos do candidato A é {0:.2f}%, candidato B é {1:.2f}%, candidato C é {2:.2f}%."
      .format(((candidatoA * 100) / total),((candidatoB * 100) / total),((candidatoC * 100) / total)))
print("Percentual de votos Brancos é {0:.2f}% e de votos Nulos é {1:.2f}%".format(((brancos * 100) / total),((nulos * 100) / total)))