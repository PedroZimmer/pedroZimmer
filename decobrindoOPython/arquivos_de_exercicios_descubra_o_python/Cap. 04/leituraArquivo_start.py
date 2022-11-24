#
# Lendo arquivos com funções do Python
#


def leituraArquivo():
    arquivo = open("novoArquivo.txt", "r")
    
    if arquivo.mode == "r":
        conteudo = arquivo.read()
        print(conteudo)
    
    arquivo.close()
    
#leituraArquivo()


def leituraArquivoGrande():
    arquivo = open("novoArquivo.txt", "r")
    
    if arquivo.mode == "r":
        conteudototal = arquivo.readlines()
        for conteudo in conteudototal:
            print(conteudo)
    
    arquivo.close()
    
leituraArquivoGrande()