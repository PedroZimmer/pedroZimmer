#
#  Arquivo com exemplos de como formatar uma data
#

from datetime import datetime

# Datas e horas podem ser formatados usando um conjunto de strings predefinidas
def FormataDataHora():

#### Date Formatting ####
  
# %y/%Y - Ano, %a/%A - Dia da semana, %b/%B - Mês, %d - dia do mÊs
    hoje = datetime.now()

    print (hoje.strftime("O ano é: %y"))

#% c - data e hora da localidade,% x - data da localidade,% X - hora da localidade
    print (hoje.strftime("Data e hora local: %c"))
  
#### Time Formatting ####
# %I/%H - 12/24 hpras, %M - minuto, %S - segundo, %p -  AM/PM
    print (hoje.strftime("A hora atual é: %I:%M:%S %p"))
    
FormataDataHora()
