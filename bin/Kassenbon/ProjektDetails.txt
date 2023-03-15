Kassenbon
Es soll ein Programm geschrieben werden, das einen Kassenbon auf der Konsole anzeigt (mit System.out.println). 
Am Anfang des Programmes werden in Form von Variablen folgende Werte festgelegt:

Anzahl von mindestens vier verschiedenen Waren, die gekauft werden sollen.
Einzelpreise der Waren. (Ja, jede Warensorte hat einen anderen Preis)
Inhalt der Brieftasche.
Das Programm soll den Gesamtpreis der eingangs festgelegten Waren ermitteln. 
Übersteigt der Gesamtpreis den Inhalt der Brieftasche, wird der Benutzer auf den fehlenden Betrag hingewiesen. 
Reicht der Inhalt der Brieftasche für den Einkauf aus, wird ein Kassenbon ausgegeben, 
der die gekauften Waren mit Anzahl und Preis sowie am Ende den Gesamtpreis auflistet.

Hinweis: Erstellt zuerst die Ausgabe des Kassenbons und füllt sie anschließend mit Berechnungen und der Fallunterscheidung.


Beispiel wie ein Kassenbon aussehen könnte:

Wurst      1 x  4.20 EUR
                          4.20 EUR
Käse       1 x  2.30 EUR
                          2.30 EUR
Brot       1 x  2.10 EUR
                          2.10 EUR
DVD        2 x 12.00 EUR
                         24.00 EUR
----------------------------------
Gesamt                   32.60 EUR
Gegeben                  50.00 EUR

Zurück                   17.40 EUR
Kassenbon + automatischer Einkauf
Erstellt eine Kopie eures soeben geschriebenden Programmes.

Verändert das Programm so, dass nun versucht wird, mehrfach Produkte eines Typs (z.B. Wurst) hintereinander zu kaufen, 
und abgebrochen wird, wenn das Geld für keine weiteren Einkäufe mehr ausreicht. Danach soll für diesen Einkauf der Kassenbon ausgegeben werden.

Hinweis: Viele, viele Fallunterscheidungen hintereinander! 
Natürlich ließe sich ein Einkauf, bis das Geld nicht mehr ausreicht, 
besser mit einer Schleife realisieren, die allerdings erst in Vorlesung 2 behandelt wird - 
hier ist auch "Spagetticode", d.h. viele gleiche Befehle hintereinander, erlaubt.