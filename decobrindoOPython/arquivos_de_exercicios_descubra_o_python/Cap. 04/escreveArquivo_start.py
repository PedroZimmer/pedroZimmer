#
# Escrevendo arquivos com funções do Python
#

def escreveArquivo():
    arquivo = open("NovoArquivo.txt", "w+")
    
    arquivo.write("Linha gerada com a função 'write' do Python \r\n" )
    
    arquivo.close()
    
#escreveArquivo()

def alteraarquivo():
    arquivo = open("NovoArquivo.txt", "a+")
    
    arquivo.write("Linha gerada com a função 'write' do Python \r\n" )
    
    arquivo.close()
    
alteraarquivo()