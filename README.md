# Java_Workshop_02

Aplikacja zarządzająca danymi użytkowników znajdującymi się w tabeli `users`. Klasa `UserDAO` realizujące wzorzec projektowy `DAO` i umożliwia wykonywanie operacji na bazie danych. Dane przechowywane są w bazie danych o nazwie `workshop2` w tabeli `users`.

Tabela `users:`


| Field            | Type         | Null | Key | Default | Extra          |
|------------------|--------------|------|-----|---------|----------------|
| id               | int(11)      | NO   | PRI | NULL    | auto_increment |
| email            | varchar(255) | NO   | UNI | NULL    |                |
| username         | varchar(255) | NO   |     | NULL    |                |
| password         | varchar(60)  | NO   |     | NULL    |                |

