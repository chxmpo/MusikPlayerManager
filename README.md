# Musik-Playlist-Manager

Der **Musik-Playlist-Manager** ist ein objektorientiertes Java-Projekt mit grafischer Benutzeroberfläche (GUI) zur Verwaltung von Musik-Playlists.  
Die Anwendung wurde mit **Java Swing** entwickelt und folgt dem **MVC-Architekturprinzip** (Model – View – Controller).

---

## GitHub

[Link zum Projekt](https://github.com/chxmpo/MusikPlayerManager)

---

## Entwicklerinformationen

Projektname: Musik-Playlist-Manager
Name: chxmpo(Niklas Redetzki)
Version: 1.0

---

## Funktionen

- Hinzufügen neuer Songs (Titel und Künstler)
- Löschen von Songs
- Anzeige aller Songs in einer übersichtlichen Tabelle
- Speicherung und Laden der Playlist aus einer Datei
- Benutzerfreundliche grafische Oberfläche mit modernem Design
- Saubere Trennung zwischen Model, View und Controller (MVC)

---

## Benutzeroberfläche

Das Hauptfenster besteht aus:
1. einer Tabelle mit Songs (Titel und Künstler)
2. drei Buttons:  
Song hinzufügen – öffnet ein Dialogfenster für die Eingabe  
Song löschen – entfernt den ausgewählten Song  
Speichern - Playlist wird in eine Datei namens Songspeichern.dat gespeichert  
Sortieren - entweder auf Titel oder Autor klicken um zu sortieren:  
ein Klick -> alphabetisch aufwärts 
zwei Klicks -> alphabetisch abwärts

---

## Bedienung

1. Programm in der main starten
2. Auf Song hinzufügen klicken
3. Titel und Künstler eingeben
4. Mit Ok bestätigen -> Song erscheint in der Tabelle
5. Song anklicken und "Song löschen" klicken um ihn zu entfernen
6. Wenn alle Songs eingefügt, dann Speichern klicken und die Playlist ist gespeichert

--- 

## Beispiel
1. Klick Song hinzufügen
2. Eingabe Song: Thunder
3. Eingabe Artist: Imagine Dragons
4. Klick Ok -> Song erscheint mit Artist
5. Klick auf Titel -> sortiert alphabetisch
6. Klick auf Song und Artist und Song Löschen -> Song wird gelöscht und aus der Tabelle genommen
7. Klick Song hizufügen 
8. Eingeben der Daten
9. Speichern -> beim nächsten Starten wird dir dieser Song wieder angezeigt