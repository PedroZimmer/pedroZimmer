#
# Arquivo com exemplos de como trabalhar com paths
#

from os  import path
import time


def dadosArquivo():
    arquivoexiste = path.exists("NovoArquivo.txt")
    ehDiretorio = path.isdir("NovoArquivo.txt")
    patharquivo = path.realpath("NovoArquivo.txt")
    pathrelative = path.relpath("NovoArquivo.txt")
    datacriacao = time.ctime(path.getctime("NovoArquivo.txt"))
    datamodificacao = time.ctime(path.getmtime("NovoArquivo.txt"))
    
    print("Arquivo existe: ", arquivoexiste)
    print("É um diretório: ", ehDiretorio)
    print(patharquivo)
    print(pathrelative)
    print("Data de criação: ", datacriacao)
    print("Data de modificação: ", datamodificacao)
    
dadosArquivo()