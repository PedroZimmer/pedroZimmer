var idade = 80
console.log(`Você tem ${idade} anos. Então seu voto é...`)
if (idade < 16) {
    console.log('Proibido')
} else {
    if (idade < 18 || idade >65)  {
        console.log('Facultativo')
    } else {
        console.log('Obrigatório')
    } 
}   