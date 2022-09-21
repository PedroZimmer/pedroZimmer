import openpyxl
album = openpyxl.load_workbook('C:/#Dev/Projetos/albumCopaDoMundo2022/APP/album.xlsx')
pag_album = album['novapagina']
cont = 0
#MENU
selecao = 0
lista = ['FWC','QAT','ECU','SEN','NED','ENG','IRN','USA','WAL','ARG','KSA','MEX','POL','FRA','AUS','DEN','TUN','ESP','CRC','GER','JPN','BEL','CAN','MAR','CRO','BRA','SRB','SUI','CMR','POR','GHA','URU','KOR']
menu = True
cont1 = 0
while menu:
    print("<<----MENU---->>")
    opcao = int(input("Oque deseja? ->\n1. Inserir figurinhas!\n2. Verificar repetidas!\n3. Verificar status!\n4. Encerrar operação!"))
    if opcao == 1:
        print("<<Inserir>>")
        repet1 = True
        while repet1:
            selecao = str(input("Insira a seleção abreviada...\n"))
            selecaoalta = selecao.upper()
            for i in range(len(lista)):
                if selecaoalta == lista[i]:
                    print('achei')
                    repet1 = False
                else:
                    cont1 += 1
            if cont1 == 33:#len(lista)
                print('Insira uma selecao correta!')
                repet1 = True
               

for i in pag_album.iter_cols(min_row=3,max_row=22):
    for celula in i:
        if celula.value != None:
            print(celula.value)
        else:
            cont += 1
print("Tenho:", cont,"| Faltam:", 670-cont)
album.save('C:/#Dev/Projetos/albumCopaDoMundo2022/APP/album.xlsx')