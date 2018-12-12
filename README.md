### Run The Application:

1. Open PostgreSQL shell

1. Create database with following command: `CREATE DATABASE Lab12_albums` Warning: Capitalization is important.

1. Navigate to application directory in terminal

1. Execute the following in terminal: `./gradlew run`

1. Go to localhost:8080 in browser


### Available Routes:

* "Localhost:8080" -> Goes to a page telling you to go to "/hello"

* "Localhost:8080/hello" -> hello world page

* "Localhost:8080/capitalize" -> instructions for how to use "/capitalize"

* "Localhost:8080/capitalize/anything" -> page containing "ANYTHING"

* "Localhost:8080/albums" -> provides the index of albums that exist in the local database. From this page you can add new albums to the database.