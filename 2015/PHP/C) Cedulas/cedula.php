<?php
$in = fopen("cedula.in", "r");
$out = fopen("cedula.out", "w");

while(($lines = fgets($in)[0]) != 0){

  $cel[100] = 0;
  $cel[50] = 0;
  $cel[20] = 0;
  $cel[10] = 0;
  $cel[5] = 0;
  $cel[2] = 0;
  $cel[1] = 0;

  for ($i = 0; $i < $lines; $i++) {
    $line = substr(fgets($in), 0, -5)*1000;
    echo "Valor: ".$line."<br>";

    foreach ($cel as $nota => $value) {
      $cel[$nota] += floor($line/$nota);
      $line = $line%$nota;
      // echo $nota.": ".$cel[$nota];
      // echo " Sobrou: ".$line."<br>";
    }

  }

  foreach ($cel as $nota => $valor) {
    echo "$valor ";
  }

  echo "<br>";
}
