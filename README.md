# Shopping App Using Spring Microservices Concepts

This project will use following Spring Microservice concepts
* Spring Cloud 
* Eureka Server
* Netflix Feign (Ribbon)
* Config Server
* Netflix Zuul
* Database: H2

Product Service
This service will provide product details like
* Title of product
* SKU
* Price



__Product Inventory Service:__
This service will provide the inventory details. It will take SKU as input and provides quantity of the item. 


__Product Catalog Service:__

This service will consume Product service and Inventory service and provide a catalog to the UI

__Servers and Ports configuration__

Server | Port(s)| Technologies Used
-------|-------|-------
Config Server| 8001|
Eureka Server| 8010|
Product Service|8021, 8022, 8023|
Product Inventory Service|8026, 8027, 8028|
Product Catalog Service|8031, 8032,8033|

This is an inprogress project and any suggestions are welcome @ murali.dk.reddy@gmail.com
