<?php
$in = fopen("azul.in", "r");
$out = fopen("azul.out", "w");

while(($line = fgets($in))[0] != 0){
  $azulejosTotal = $line;
  $conjuntos = 0;
  $azulejos = intval($azulejosTotal);

  while($azulejos > 3){
    $raiz = sqrt($azulejos);
    if(!strpos($raiz, '.')){
      $azulejos = $azulejosTotal - sqrt($azulejos)*sqrt($azulejos);
      $azulejosTotal = $azulejos;
      $conjuntos++;
    } else {
      $azulejos -= 1;
    }
  }

  $conjuntos += $azulejos;

  echo "$conjuntos<br>";

  fwrite($out, "$conjuntos\n");
}

fclose($out);
fclose($in);
