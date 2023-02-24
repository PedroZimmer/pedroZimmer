# 
# Exemplo de como processar dados provenientes de um JSON
#

import urllib.request  
import json

def ManipulaJSON():
    endereco = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_day.geojson"
    webURL = urllib.request.urlopen(endereco)
    if (webURL.getcode() == 200 ):
        dados = webURL.read()
        oJSON = json.loads(dados)
        
        contagem = oJSON["metadata"]["count"]
        print("Contagem: " + str(contagem))
        
        for local in oJSON["features"]:
            if local["properties"]["place"] == "47 km S of Faro, Portugal":
                print("Achei o local")
            else:
                print(local["properties"]["place"])
            
            
ManipulaJSON()
            