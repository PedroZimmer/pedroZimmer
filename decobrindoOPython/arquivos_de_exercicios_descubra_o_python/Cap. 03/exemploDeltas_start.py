#
# Arquivo de exemplo para uso da classe timedeltas
#

from datetime import date
from datetime import time
from datetime import datetime
from datetime import timedelta



def QuantosDiasFaltam(ano,mes,dia):
    hoje = date.today()
    dataprocurada = date(ano,mes,dia)
    
    qtsdias = dataprocurada - hoje
    
    mensagemretorno = "Faltam " + str(qtsdias).replace("days, 0:00:00", "") + " dias para a data " + dataprocurada.strftime("%d/%m/%y")
    
    print(mensagemretorno)
    
QuantosDiasFaltam(2022, 12, 31)