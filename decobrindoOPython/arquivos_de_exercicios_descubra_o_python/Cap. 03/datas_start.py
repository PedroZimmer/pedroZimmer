#
# Arquivo com exemplos de manipulação de  datas
#

from datetime import date
from datetime import time
from datetime import datetime

def ManipulaDataHora():
    hoje = date.today()
    print("Hoje é: ", hoje)
    print('partes da data: ', hoje.day, hoje.month, hoje.year)
    print('weekday: ', hoje.weekday())
    dias = ["seg", "ter", "qua", "qui", "sex", "sab", "dom"]
    print("Nome abreviado do dia da semana", dias[hoje.weekday()])
    
    
    data = datetime.now()
    print("data e hora", data)
    
    tempo = datetime.time(data)
    print("hora atual", tempo)
ManipulaDataHora()