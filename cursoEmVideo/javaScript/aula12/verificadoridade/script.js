function verificar() {
  var data = new Date();
  var ano = data.getFullYear();
  var fano = document.getElementById("txtano");
  var res = document.querySelector("div#res");
  if (fano.value.length == 0 || fano.value > ano) {
    window.alert("[Erro] Verifique os dados e tente novamente!");
  } else {
    var fsex = document.getElementsByName("radsex");
    var idade = ano - Number(fano.value);
    var genero = "";
    var img = document.createElement("img");
    img.setAttribute("id", "foto");
    if (fsex[0].checked) {
      genero = "Homem";
      if (idade >= 0 && idade < 10) {
        //crianca
        img.setAttribute("src", "homembebe.png");
      } else if (idade < 21) {
        //jovem
        img.setAttribute("src", "homemjovem.png");
      } else if (idade < 50) {
        //adulto
        img.setAttribute("src", "homemadulto.png");
      } else {
        //Idoso
        img.setAttribute("src", "homemidoso.png");
      }
    } else if (fsex[1].checked) {
      genero = "Mulher";
      if (idade >= 0 && idade < 10) {
        //crianca
        img.setAttribute("src", "mulherbebe.png");
      } else if (idade < 21) {
        //jovem
        img.setAttribute("src", "mulherjovem.png");
      } else if (idade < 50) {
        //adulto
        img.setAttribute("src", "mulheradulta.png");
      } else {
        //Idoso
        img.setAttribute("src", "mulheridosa.png");
      }
    }
    res.style.textAlign = "center";
    res.innerHTML = `Detectamos ${genero} com ${idade} anos.`;
    res.appendChild(img)
  }
}
