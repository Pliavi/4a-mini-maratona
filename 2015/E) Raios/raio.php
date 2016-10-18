<?php
$in = fopen("raio.in", "r");
$out = fopen("raio.out", "w");

 while(($lines = fgets($in)[0]) != 0){

  for ($i=0; $i < $lines; $i++) {
    $line = fgets($in);
    $raios[] = $line;
  }

  $hasSamePlace = count(array_count_values($raios)) != $lines ? 1 : 0;

  fwrite($out, $hasSamePlace."\n");
}

fclose($out);
fclose($in);
?>
