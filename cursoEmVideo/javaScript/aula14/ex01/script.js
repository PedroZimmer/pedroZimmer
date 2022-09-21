function contar() {
  var ini = document.getElementById('start');
  var fim = document.getElementById('end');
  var pass = document.getElementById('pass');
  var res = document.getElementById('res');


  if (ini.value == 0 || fim.value == 0 || pass.value == 0) {
    //window.alert(`Impossivel contar!`);
    res.innerHTML = `Impossivel contar`
  } else {
    res.innerHTML = `Contando`;
    let i = Number(ini.value);
    let f = Number(fim.value);
    let p = Number(pass.value);
    if (i < f) {
      //Progressiva
      for (let c = i; c <= f; c += p) {
        res.innerHTML += ` > ${c}`;
       }
      } else {
        //Regressiva
        for (let c = i; c >= f; c -= p) {
          res.innerHTML += ` > ${c}`;
         }
      }
  }
}