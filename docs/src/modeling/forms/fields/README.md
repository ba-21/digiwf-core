# Formularfelder

Für die Modellierung von Formularen stehen verschiedene Felder zur Verfügung.
Alle Felder haben folgende Konfigurationen gemeinsam, die über den `Edit` Button geöffnet werden können:

### Allgemein

- **Key:** Der Schlüssel unter dem der Wert gespeichert wird
- **Titel:** Der Titel des Formularfelds
- **Beschreibung:** Ein Infotext der über ein Tooltip am Formularfeld angezeigt werden kann
- **Readonly:** Gibt an ob der Bearbeiter:in das Feld nur lesen darf. **!ACHTUNG!** Wenn die Checkbox gesetzt wurde und
  der Haken entfernt wird, ist im Schema *false* als Wert hinterlegt. Dies kann dazu führen, dass *readonly* bei
  Objekten nicht richtig vererbt wird.
- **Default:** Der Wert mit dem das Formular vorbefüllt wird

![Formular Editor](~@source/modeling/forms/fields/edit-field.png)

Außer dem **Allgemein** Tab, gibt es noch weiter Einstellungsmöglichkeiten.

### Optionen

In den Optionen können Oberflächenelemente konfiguriert und Übersetzungstexte konfiguriert werden.

- **Dense:** Gibt an ob das Formularfeld schmaler angeordnet werden soll
- **Outlined:** Gibt an ob das Formularfeld mit einer Rahmen angezeigt werden soll
- **Standardgröße:** Die Größe auf normalen Endgeräten.
- **Größe auf kleinen Geräten:** Die Größe auf mobilen Endgeräten

![Formular Editor](~@source/modeling/forms/fields/edit-field-options.png)

### Validierung

Validierungen schränken den Wertebereich der Eingabe ein.

- **Pattern:** Ein regulärer Ausdruck, der die Eingabe einschränkt
- **required:** Gibt an ob das Feld ein Pflichtfeld ist
- **min. Länge:** Die minimale Länge der Eingabe
- **max. Länge:** Die maximale Länge der Eingabe

Die Validierungen können je nach Feldtyp variieren.

![Formular Editor](~@source/modeling/forms/fields/edit-field-validation.png)

## Textfeld

Ein Textfeld ist ein Feld, in das ein Text eingegeben werden kann.
Dieses besteht aus einer Zeile.

![Formular Editor](~@source/modeling/forms/fields/textfield.png)

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/textfield-form.png)

## Textarea

Eine Textarea ist ein Feld, in das ein Text eingegeben werden kann.
Im Gegensatz zum Textfeld besteht dieses aus mehreren Zeilen.

![Formular Editor](~@source/modeling/forms/fields/textarea.png)

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/textarea-form.png)

## Zahl

Ein Zahl ist ein Feld, in das eine Ganzzahl eingegeben werden kann.

![Formular Editor](~@source/modeling/forms/fields/number.png)

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/number-form.png)

## Gleitkommazahl

In dieses Feld kann eine Gleitkommazahl eingegeben werden.
Im Gegensatz zum Zahl Feld, ist hier ein ``,`` als Trennzeichen erlaubt.

![Formular Editor](~@source/modeling/forms/fields/float.png)

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/float-form.png)

## Checkbox

Eine Checkbox ist ein Feld, das ein Ja/Nein Wert repräsentiert.

## Datum

## Zeit

Über dieses Feld kann eine Uhrzeit eingegeben werden.

![Formular Editor](~@source/modeling/forms/fields/time.png)

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt, über das Kontextmenü kann die Uhrzeit ausgewählt werden:

![Formular Editor](~@source/modeling/forms/fields/time-form.png)

## Auswahl

In diesem Feld kann eine Auswahl aus vordefinierten Werten getroffen werden.
Diese werden können bei der Erstellung im Contextmenü hinzugefügt werden.

![Formular Editor](~@source/modeling/forms/fields/select.png)

#### Einstellungen

Auswahlmöglichkeiten können über das Kontextmenü hinzugefügt werden.

- **Titel:** Anzeige im Formular
- **Wert:** Der Wert der gespeichert wird

![Formular Editor](~@source/modeling/forms/fields/select-context.png)

Zudem kann die Anzeige der Auswahlmöglichkeiten konfiguriert werden.

- **select** Die Auswahlmöglichkeiten werden als Dropdown angezeigt
- **radio** Die Auswahlmöglichkeiten werden als Radio Buttons angezeigt

![Formular Editor](~@source/modeling/forms/fields/select-context2.png)

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/select-form.png)

![Formular Editor](~@source/modeling/forms/fields/select-form2.png)

## Mehrfachauswahl

Die Mehrfachauswahl ist eine Auswahlmöglichkeit, bei der mehrere Werte ausgewählt werden können.

![Formular Editor](~@source/modeling/forms/fields/multiselect.png)

#### Einstellungen

Die Einstellungsmöglichkeiten sind nahezu die gleichen wie bei der Auswahl.
Es gibt lediglich einen Unterschied bei der Auswahl and Anzeigemöglichkeiten.

- **select** Die Auswahlmöglichkeiten werden als Dropdown angezeigt
- **checkbox** Die Auswahlmöglichkeiten werden als Checkboxen angezeigt
- **switch** Die Auswahlmöglichkeiten werden als Switch Buttons angezeigt

![Formular Editor](~@source/modeling/forms/fields/multiselect-context.png)

## Dateien

Über dieses Feld können Dateien hochgeladen und angezeigt werden.

![Formular Editor](~@source/modeling/forms/fields/files.png)

#### Einstellungen

- **Dateipfad** Über den Dateipfad kann der Pfad angegeben werden, in dem die Dateien gespeichert werden sollen oder aus
  dem Dateien geladen werden sollen.
- **Eindeutiger Indentifikator** Erzegut einen eindeutigen Identifikator, der an den Dateipfad angehängt wird. Diese
  Einstellung sollte in Objektlisten verwendet werden.

![Formular Editor](~@source/modeling/forms/fields/files-context.png)

::: tip
Je nachdem ob es sich um ein Start- oder Benutzerformular handelt, muss der Zugriff zusätzlich konfiguriert werden.
Dies kann in der jeweiligen Dokumentation nachgelesen werden

- [Benutzeraufgaben](/modeling/user-tasks/modeling/#template)
- [Prozesskonfiguration](/modeling/processes/config/)
  :::

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/files-form.png)

## Benutzerauswahl

Über dieses Feld können Benutzer in der Benutzerverwaltung durchsucht und ausgewählt werden.

#### Einstellungen

- **Ldap Gruppen** über die Ldap Gruppen kann die Auswahl der Benutzer in der Oberfläche eingegrenzt werden.

![Formular Editor](~@source/modeling/forms/fields/user.png)

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/user-form.png)

## Mehrfache Benutzerauswahl

Über dieses Feld können mehrere Benutzer ausgewählt werden.
Bei den Einstellungsmöglichkeiten unterscheidet es sich nicht von der Benutzerauswahl.

![Formular Editor](~@source/modeling/forms/fields/multiuser.png)

## Schalter

Bei diesem Feld handelt es sich um einen Schalter, der einen Ja/Nein Wert repräsentiert.
Dieser unterscheidet sich ledglich in der Anzeige von der Checkbox.

![Formular Editor](~@source/modeling/forms/fields/switch.png)

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/switch-form.png)

## Liste

Über dieses Feld können primitive Datentypen in einer Liste gespeichert und angezeigt werden.

![Formular Editor](~@source/modeling/forms/fields/list.png)

#### Einstellungen

- **Typ** Der Typ der Liste, kann zwischen `String` und `Integer` gewählt werden.

![Formular Editor](~@source/modeling/forms/fields/list-context.png)

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/list-form.png)

## Markdown

Über dieses Feld kann ein Markdown Text eingegeben oder angezeigt werden.

![Formular Editor](~@source/modeling/forms/fields/markdown.png)

::: tip
Dieses Feld wird häufig verwendet, um in Verbindung mit einem `default` Wert und `readonly`
dem Benutzer formatierte Inhalte anzuzeigen.
:::

#### Anzeige

Im Formular wird das Feld wie folgt angezeigt:

![Formular Editor](~@source/modeling/forms/fields/markdown-form.png)