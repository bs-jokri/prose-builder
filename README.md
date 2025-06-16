# Prose Builder

Prose Builder ist eine Java-Bibliothek zur Erstellung einfacher 
Prosatexte. Sie erlaubt das schrittweise Zusammenbauen von Sätzen und gibt den finalen Text als 
String zurück.

## Installation

Klonen und mit Maven bauen:

```bash
git clone https://github.com/QuyNyHoang/prose-builder.git
cd prose-builder
mvn clean install

## Verwendung

```java
import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;

ProseBuilder prose = new ProseBuilder();
prose.register(() -> "Dies ist ein Beispiel.");
System.out.println(prose.get());
```

> Eine Beispielgeschichte findest du unter 
[`samples/coffee_break.txt`](samples/coffee_break.txt).

## Beitrag leisten

Pull Requests sind willkommen. Bitte öffne bei größeren Änderungen zuerst ein Issue zur 
Diskussion.

## Lizenz

Dieses Projekt steht unter der [GNU GPLv3](https://www.gnu.org/licenses/gpl-3.0.de.html).

