# jakartaee-example-jpa

This project is an example of implementation read and write data from database using JPA.

### Application Server Configurations

To run this application you need create a datasource on the application server with the following configurations.

    JNDI: "jdbc/MyDataSource"
    DATABASE: mydatabase
    HOST: localhost
    PORT: 5432
    USER: admin
    PASS: admin

##  RUN Postgress DataBase

### Build Docker of Postgress

On the home of project, run the following command:

$ docker build -t postgress-9.3 .

### Run Dorcker

$ docker run -p 5432:5432 postgress-9.3


