# 
# Exemplo de acesso a uma base de dados SQLite
#
import pymongo
from pymongo import MongoClient

def manipulaDadosMongoDB():
    cliente = pymongo.MongoClient("mongodb://localhost:27017")
    db = cliente.conheca_python

    for i in range(1,10):
        objDic = {'codigo' : i}
        db.conheca_mongodb.insert_one(objDic)

    db.conheca_mongodb.update_one({'codigo' : 2}, {"$set" : {'atributoNovo' : 789}})   
    db.conheca_mongodb.delete_one({'codigo' : 1})

    resultadoConsulta = db.conheca_mongodb.find({})
    for doc in resultadoConsulta:
        print (doc)

manipulaDadosMongoDB()

