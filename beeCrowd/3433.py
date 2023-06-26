# -*- coding: utf-8 -*-


def botaDez(lista):
    for i in range(len(lista)):
        if lista[i] > 10:
            lista[i] = 10
    return lista

def tirarCarta(lista, matriz):
    for i in range(len(lista)):
        for j in range(len(matriz)):
            if lista[i] in matriz[j]:
                matriz[j].remove(lista[i])
    return matriz


def procurarMaior(matriz, resultado):
    maior = 0
    for linha in range(len(matriz)):
        for coluna in range(len(matriz)):
            if matriz[linha][coluna] > resultado:
                return matriz[linha][coluna]


def procurarResultado(matriz, resultado):
    #retornar o proximo numero maior que o resultado casi n tenha ele
    for linha in range(len(matriz)):
        for coluna in range(len(matriz)):
            if matriz[linha][coluna] == resultado:
                return True
    return procurarMaior(matriz, resultado)
    
            
cartas = []
for i in range(1,14):
    cartas.append(i)

matriz = [cartas for i in range(4)] 


rodada = int(input())

joao = []
joao = (input()).split()
joao = [int(num) for num in joao]
joao = botaDez(joao)


maria = []
maria = (input()).split()
maria = [int(num) for num in maria]
maria = botaDez(maria)

comuns = []
comuns = (input()).split()
comuns = [int(num) for num in comuns]


lista = joao + maria + comuns
lista = botaDez(lista)
tirarCarta(lista, matriz)

somaMaria = sum(maria + comuns)
somaJoao = sum(joao + comuns)


#resultado tem q estar na matriz 

if somaJoao > somaMaria:
    if somaJoao == 13:
        print(-1)
    else:
        resultado = 24 - somaJoao
        if resultado + somaMaria > 23:
            print(-1)
        else:
            if procurarResultado(matriz, resultado) + somaMaria > 23:
                print(-1)
            else:
                if procurarResultado(matriz, resultado):
                    print(resultado)

if somaJoao == somaMaria:
    print(-1)
    
if somaJoao < somaMaria:
    resultado = 23 - somaMaria
    if procurarResultado(matriz, resultado) + somaMaria > 23:
        print(-1)
    if procurarResultado(matriz, resultado):
        print(resultado)