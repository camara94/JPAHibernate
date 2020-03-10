# JPAHibernate
Dans ce projet, je vais créer un application de gestion de produit en JPA Hibernate

## JPA
.JPA('Java Persistance API'), c'est un ensemble de spécification Java EE qui doit être respecter par les framework Objet Mapping Relationnel('ORM') comme Hibernate, TopLink, EclipseLink, ... en afin d'assurer la portabilité du code c'est le changement de framework ne nous oblige pas de réecrire le code de l'application.

## Une Entitité JPA
Une Entité JPA est une classe dans laquelle, il faut obligatoirement ajouter 
l'annotation '''@Entity''' pour dire que c'est une classe persistante c'est à dire
que les objets de cette classe sont conservés dans un support de stockage
'''SGBDR''' ou '''NoSQL''' oubien '''fichier''', l'annotation '''@Id''' pour indiquer qu'il ya attribut clé primaire et eventuellement cette classe doit implementer l'interface Serializable 