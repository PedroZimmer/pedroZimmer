#
# Exemplos de como trabalhar com arquivos
#
import os
from os import path
import shutil
from shutil import make_archive
from zipfile import ZipFile




def criaZipModo1():
    shutil.make_archive("ArquivoCompactado", "zip", 'C:\\#Dev\\pedroZimmer\\decobrindoOPython\\arquivos_de_exercicios_descubra_o_python\\Cap. 03' )

#criaZipModo1()


def criaZipModo2():
    with ZipFile("ArquivoZipModo2.zip", "w") as novoZip:
        novoZip.write("NovoArquivo.bkp")
        novoZip.write("NovoArquivo.txt")
        novoZip.write("zipModo1.zip.zip")
        
criaZipModo2()

        