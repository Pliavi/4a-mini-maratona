<?php
$in = fopen("nomes.in", "r");
$out = fopen("nomes.out", "w");

do{
  $line = fgets($in);
  $characters = str_split(rtrim($line));

  $index = array_search(" ", $characters);
  unset($characters[$index]);

  sort($characters);
  $characters = array_count_values($characters);
  foreach ($characters as $character => $count) {
    if($character != " "){
      fwrite($out, "$character $count ");
    }
  }
  fwrite($out, "\n");
} while($line != "0");

fclose($out)
fclose($in);
?>
