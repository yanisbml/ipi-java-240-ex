# TP Java 240, Spring et Spring Boot

L'objectif de ce TP est de comprendre l'intérêt d'un framework comme Spring en voyant les limitations courantes que l'on peut rencontrer, et de voir comment Spring adresse ces limitations.

## Introduction

- Exécutez cette application pour vous familiariser avec les différentes classes et lire la JavaDoc de chaque classe pour comprendre le rôle de chacune d'entre elles.
- Analysez cette application et définissez le graph de dépendances entre les classes (uniquement celles de votre projet, pas les dépendances externes). Il y a une dépendance entre deux classes lorsqu'une classe fait référence à une autre (par un appel de méthode par exemple).
- Concernant la classe `BitcoinService`, comment la dépendance avec `WebPageManager` est-elle gérée ? Essayer d'optimiser (sans utiliser Spring). Faire de même pour la classe `ProduitManager` avec `BitcoinService` et `WebPageManager`. 
- Qu'avez-vous gagner avec ces optimisations ? Quelle est la particularité de `BitcoinService`, `WebPageManager` et `ProduitManager` ? De combien d'instances de ces classes aurait-on en théorie besoin ? Est-ce le cas actuellement ?

## Ajout de Spring

- Créer à l'aide de votre IDE un fichier `pom.xml` et ajoutez les dépendances nécessaires pour le framework Spring (version 5.1.6.RELEASE)
