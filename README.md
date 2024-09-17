# README.md for Blog Application

I am following a Spring Boot + Kotlin tutorial (found here https://spring.io/guides/tutorials/spring-boot-kotlin)

## Things I've added to the tutorial

1. Create a new user page + button to navigate to that page
2. Create a new article + button to navigate to that page
3. Delete a user page + button to navigate to that page
4. Delete an article page + button to navigate to that page
5. View all users - Displays "no users" if users are 0
6. View all articles - Displays "no articles" if articles are 0
7. Navigation bar on all pages
8. Banner to show on all pages
9. Home Page displays on `/` or `/home`
10. The "headline" field is now the article description
    - First 5 words of an article - If less than 5 words, display no description
11. Migrated the project from H2 to Postgres (I hope!)

## Navigation Links when running the application

`http://localhost:8080/` --> Home Page


- `/home` --> Alternate Way to get to Home Page
- `/users` --> View all users
- `/articles` --> View all articles
- `/user/new` --> Create a new user
- `user/delete` --> Delete a user
- `/article/new` --> Create a new article
- `/article/delete` --> Delete an article
- `/article/{title-of-article}` --> View a specific article (use hyphens, - , between words)

### Database information: 

- URL: `jdbc:postgresql://localhost:5432/blogDB`
- Username: blog

## TODO:

1. Make the code clean (according to the rules of clean code + look at rt-domain-pro, etc.
to get a better idea)
   - Separate repositories
   - Separate controllers
   - Separate entities (to models?)
2. Create tests that cover most of the code
   - Postman tests
   - Unit tests
   - Integration tests
3. Add verification
   - Must have a valid username to delete it (case-sensitive)
   - Must fill out all fields to create a new user/write a new article
   - Must have a valid username to write an article (case-sensitive)
4. Add a search bar to search for articles (Will take some time to do)

### Notes:

Postgres commands:

`brew instsall postgresql` --> install Postgresql using Brew

`createuser --interactive` --> create a new user

`createdb blogdb` --> create a new database

`psql -d blogdb` --> connect to the database

`psql -U blog -d blogDB -f src/main/resources/blog.sql` --> run the schema.sql file

`\d [table name]` --> show specific table

`\dt` --> show all tables

`\q` --> quit the database

`\l` --> list all databases

