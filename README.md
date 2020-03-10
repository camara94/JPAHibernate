# JPAHibernate
Dans ce projet, je vais créer un application de gestion de produit en JPA Hibernate

## JPA
.JPA(**Java Persistance API**), c'est un ensemble de spécification Java EE qui doit être respecter par les framework Objet Mapping Relationnel(**ORM**) comme Hibernate, TopLink, EclipseLink, ... en afin d'assurer la portabilité du code cela a pour concequence, le changement de framework ne nous oblige pas de réecrire le code de l'application.

## Une Entitité JPA
Une Entité JPA est une classe dans laquelle, il faut obligatoirement ajouter 
l'annotation **@Entity** pour dire que c'est une classe persistante c'est à dire
que les objets de cette classe sont conservés dans un support de stockage
**SGBDR** ou **NoSQL** oubien un **fichier**, l'annotation **@Id** pour indiquer qu'il ya un attribut clé primaire et eventuellement cette classe doit implementer l'interface Serializable pour l'utilisation de divers format (text, json, xml, html,...)

## Dialect
C'est une classe qui indique au code sql la syntaxe d'un **SGDB** qu'il faut utiliser, c'est pour facilité la migration d'un **SGBD** vers un autre
  
### DDL 
  C'est à dire **Data Description Language**, creation, suppression des base de données, table (DROP DATABASE, DROP TABLE, ALTER TABLE ), ajout et suppression des contraintes et colonnes

### DML 
  C'est **Data Manipulation Language** ajout, lecture,mise à jour, suppression des entrées d'une table, vue,... (INSERT, SELECT, DELETE, UPDATE)
### DCL
  C'est à dire **Data Control Language** (GRANT, DINIED, ...), ajout, suppression d'utilisateurs ou group d'utilisateur par exemple.

### hibernate.hbm2ddl.auto
 Il faut surtout faire **attention** aux valeur de cet attribut **create** | **drop** | **update**

* **Create** va écraser tout le contenu de la base de donnée et recrée donc on peut tout perdre, et surtout attention à cet attribut si vous travailler avec une base de donnée en production d'une entreprise.

* **drop** c'est pour supprimer la base de donnée et son contenu, là rien dire déjà le nom devine bien

* **update** c'est celui que je prefère car il permet de créer une table ou un champ si il n'existe pas sinon il laisse les autres intacte

# Pourquoi utilisé les Framework ORM en java

* Gain de temps pour les développeurs
* La protabilité de l'application pour SGBD
* Et les performance des applications qui utilisent les Framework ORM; 

# Différence entre JPA et Hibernate 

* **JPA** est une spécification Java EE dont tous les Framework **ORM** devraient respecter 
* Alors **Hibernate** est un Framework **ORM** java qui implement les spécification **JPA**

# Un Java Bean
C'est une classe sérialisable avec les attributs privé, un constructuer sans paramètre et des getters et setters

# Maven 
Maven est un gestionnaire de dependance qui gère les dependances des projets java et leur cycle de vie.

# Différence entre HQL et SQL
**HQL** pour dire **Hibernate Query Language**, sorte d' **SQL** mais à la difference manipulant que des classes et leurs rélations et non les tables qui seront traduit en **SQL** par Frameword **ORM** en java
