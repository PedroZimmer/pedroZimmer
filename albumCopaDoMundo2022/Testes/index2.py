import openpyxl
# Carregando arquivo
book = openpyxl.load_workbook('Planilha.xlsx')
# Selecionando uma página
frutas_page = book['Frutas']
# Imprimindo os dados de cada linha
for i in frutas_page.iter_rows(min_row=2,max_row=5):
    for cell in i:
        if cell.value == 'Banana':
            cell.value = 'Jacare'
# Salvar as alterações
book.save('Planilha.xlsx')
