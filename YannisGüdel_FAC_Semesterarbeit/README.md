# Semesterarbeit FAC

In der vorliegenden Semesterarbeit, wurde einen Parser, Scanner und Interpreter für eine eigene Skript-Sparche entwickelt.

Die Sprache hat folgende Features:

- Variabeln
- Arithmetische Ausdrücke
- Definition und Auruf von Funktionen
- Schleifen
- Bediegung

Beispiel-Scripts sind im Ordner `src/test/data` zu finden.

Die Tests können mit `mvn clean` und `mvn text` ausgeführt werden.

Die Interaktive-Shell kann mit `mvn package` kompiliert werden und 
dann mit `java -jar ./target/projekt-full-1.0.jar`  ausgeführt werden.