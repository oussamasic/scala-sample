# scala-sample
cette application implémente un module d'authentification avec mysql comme base de données, c'est une application Scala.

les outils utilisés sont : 
Scala : language de programmation.
Scala IDE : pour compiler le code et exécuter l'application.
mysql connector : pour faire la connexion avec la base de données.

donc pour faire cette application dans un premier temps vous allez créer une application scala dans l'IDE de Scala
après vous devez ajouter mysql connector pour que les classes de votre application puissent communiquer avec la base de données
ensuite vous créer votre classe scala.

enfin vous devez créer votre base de données(pour moi le nom de ma base de données est scala)
et après créer la table user(id, username, mdp)
script pour créer la table
create table user(id int primary key, username varchar(250), mdp varchar(250));
