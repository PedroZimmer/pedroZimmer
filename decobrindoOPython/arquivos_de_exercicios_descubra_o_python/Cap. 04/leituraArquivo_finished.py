#
# Lendo arquivos com funções do Python
#

def leituraArquivo():
    arquivo = open ("NovoArquivo.txt", "r")
    if (arquivo.mode == "r"):
        conteudo = arquivo.read()
        print (conteudo)

    arquivo.close()

#leituraArquivo()

def leituraArquivoGrande():
    arquivo = open ("NovoArquivo.txt", "r")
    if (arquivo.mode == "r"):
        conteudoTotal = arquivo.readlines()

        for conteudo in conteudoTotal:
            print (conteudo)

    arquivo.close()

leituraArquivoGrande()