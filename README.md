# jakartaee-example-jpa

This project is an example of implementation read and write data from database using JPA.

##  RUN Postgress DataBase

### Build Docker of Postgress

On the home of project, run the following command:

$ docker build -t postgress-9.3 .

### Run Dorker

$ docker run -p 5432:5432 postgress-9.3

### Application Server Configurations

To run this application you need create a datasource with JNDI "jdbc/MyDataSource" on the application server. 
