<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>
<body>
  <?php

function ggt($n, $m) {

  $M = array($n, $m);
  $ciftSayilar = array();

  foreach($M as $x) {
      if ($x % 2 == 0) {
          $ciftSayilar[] = $x;
      }
  }

  if (empty($ciftSayilar)) {
      echo "Çift sayı bulunamadı.";
  } else {
      echo "Çift sayılar: " . implode(", ", $ciftSayilar);
  }
}

ggt(10,11); 



?>
</body>
</html>