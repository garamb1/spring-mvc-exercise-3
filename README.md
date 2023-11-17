# spring-mvc-exercise-3
Spring MVC Course - Using Data JPA

A partire da quest'esempio:

- Aggiungi altri campi alla classe Entity Employee (come `salary` o `department`)
- Implementa una view che mostra gli impiegati salvati nel DB
- Imprementa una view che permette di aggiornare un impiegato esistente
- Implementa un meccanismo (opzione in una view + metodo del controller) per eliminare un impiegato
- Implementa un meccanismo di ricerca (ad esempio per nome e cognome o per email o id)

Per cominciare:

- Crea il database: `CREATE DATABASE company`;
- Assicurati che l'utente `springapp` abbia acesso al database creato: `grant all privileges on company.* to 'springapp'@'localhost';`
