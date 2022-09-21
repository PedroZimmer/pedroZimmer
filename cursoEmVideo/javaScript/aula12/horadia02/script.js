function carregar() {
  var msg = window.document.getElementById("msg");
  var img = window.document.getElementById("imagem");
  var data = new Date();
  var hora = data.getHours();
  //var hora = 12; //--> pode modificar a variavel(hora) para teste!
  msg.innerHTML = `Agora são ${hora} horas.`;
  if (hora >= 0 && hora < 12) {
    //bom dia
    img.src = "fotomanha.png";
    document.body.style.backgroundColor = "rgb(255, 150, 3)"
  } else if (hora >= 12 && hora < 18) {
    // boa tarde
    img.src = "fototarde.png";
    document.body.style.backgroundColor ="#4993DF"
  } else {
    //boa noite
    img.src = "fotonoite.png";
    document.body.style.backgroundColor = "#302a3a"
  }
}
