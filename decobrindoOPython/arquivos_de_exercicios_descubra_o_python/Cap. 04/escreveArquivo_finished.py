#
# Exemplos de como trabalhar com arquivos
#
import os
from os import path
import shutil
from shutil import make_archive
from zipfile import ZipFile

def CopiaArquivo():
    if path.exists("NovoArquivo.txt"):
        pathOriginal = path.realpath("NovoArquivo.txt")
        novoPath = pathOriginal + ".bkp"

        shutil.copy(pathOriginal , novoPath)
        shutil.copystat(pathOriginal, novoPath)

#CopiaArquivo()

def RenomearArquivo():
    if path.exists("NovoArquivo.txt.bkp"):
        novoNome = "NovoArquivo.bkp"
        os.rename("NovoArquivo.txt.bkp", novoNome)

RenomearArquivo()