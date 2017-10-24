<?php
$in = fopen("bacteria.in", "r");
$out = fopen("bacteria.out", "w");

while(($lines = fgets($in)[0]) != 0){
  $resultado = array();

  for ($i=0; $i < $lines; $i++) {
    $line = fgets($in);
    $bac = explode(" ", $line);

    $resultado[] = $bac[0]**$bac[1];
  }

  $melhor = max($resultado);
  $melhor = array_search($melhor, $resultado);
  print("$melhor<br>");

  fwrite($out, $melhor."\n");
}

fclose($out);
fclose($in);
?>
