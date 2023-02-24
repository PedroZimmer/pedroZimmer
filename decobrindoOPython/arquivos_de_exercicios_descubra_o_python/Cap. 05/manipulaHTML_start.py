# 
# Exemplo de processamento e parse de HTML
#
from html.parser import HTMLParser


class meuParser(HTMLParser):
    def handle_starttag (self, tag, attrs):
        print("tag de abertura encontrada")
        if attrs.__len__() > 0:
            for a in attrs:
                print ("  Valroes encontrados", a[0],  "=", a[1])
    
    def handle_endtag(self, tag):
        print("tag de fechamento encontrada")
        
    def handle_comment(self, data):
        print("comentario encontrado")
    
    def handle_data(self, data):
        print("dados encontrados")
        if data.isspace():
            print("O valor encontrado eh um espaco em branco")
        else:
            print("O valor encotnrado eh: ", data)
            
def meuObjeto():
    meuParser1 = meuParser()
    arquivo = open("C:\\#Dev\\pedroZimmer\\decobrindoOPython\\arquivos_de_exercicios_descubra_o_python\\Cap. 05\\exemplohtml.html")
    dados = arquivo.read()
    meuParser1.feed(dados)
    
meuObjeto()