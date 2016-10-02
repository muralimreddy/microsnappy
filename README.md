# Online Photo Album App Using Spring Microservices Concepts

This project will use following Spring Microservice concepts
* Spring Cloud 
* Eureka Server
* Netflix Feign (Ribbon)
* Config Server
* Netflix Zuul
* Database: MYSQL

###Tables

Schema |Table Name | Description  
-------|-----------|-------------
PROFILE|PERSON     | Person table with demographic information
SNAPPY |ALBUM      | Photo album information like album id, person id etc
SNAPPY |PHOTO      | Photo information like album id, photo id, location etc
RATING |PIC_RATING | Stores rating information


###Servers
Server         | Port(s)          | Technologies Used
---------------|------------------|----------------
Config Server  | 8001, 8002, 8003 |
Eureka Server  | 8010, 8011, 8012 |
Snappy Service | 8021, 8022, 8023 |
Person Service | 8031, 8032, 8033 |
Rating Service | 8041, 8042, 8043 |


This is an inprogress project and any suggestions are welcome @ murali.dk.reddy@gmail.com
