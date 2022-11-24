#
# Exemplos de como trabalhar com arquivos
#
import os
from os import path
import shutil
from shutil import make_archive
from zipfile import ZipFile




def criaZipModo1():
    shutil.make_archive("ArquivoCompactado", "zip", )