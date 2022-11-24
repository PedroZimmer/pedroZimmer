#
# Arquivo com exemplos de uso de calendários
#

import calendar

# criando um calendário no formato texto
def calendarioTexto():
    calendarioTexto = calendar.TextCalendar(calendar.SUNDAY)
    txtcalendario = calendarioTexto.formatmonth(2022, 8)
    print(txtcalendario)

#calendarioTexto()

# Criando um calendário no formato HTML

def calendarioHTML():
    calendarioHTML = calendar.HTMLCalendar(calendar.SUNDAY)
    txtcalendario = calendarioHTML.formatmonth(2022, 8)
    print(txtcalendario)

calendarioHTML()



# loop ao longo dos dias de um mês




