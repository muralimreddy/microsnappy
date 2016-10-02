# Online Photo Album App Using Spring Microservices Concepts

This project will use following Spring Microservice concepts
* Spring Cloud 
* Eureka Server
* Netflix Feign (Ribbon)
* Config Server
* Netflix Zuul
* Database: MYSQL

Tables

Schema |Table Name | Description  
-------|-----------|-------------
PROFILE|PERSON     | Person table with demographic information
SNAPPY |ALBUM      | Photo album information like album id, person id etc
SNAPPY |PHOTO      | Photo information like album id, photo id, location etc
RATING |PIC_RATING | Stores rating information



Server | Port(s)| Technologies Used
-------|-------|-------
Config Server| 8001|
Eureka Server| 8010|
Product Service|8021, 8022, 8023|
Product Inventory Service|8026, 8027, 8028|
Product Catalog Service|8031, 8032,8033|

This is an inprogress project and any suggestions are welcome @ murali.dk.reddy@gmail.com
