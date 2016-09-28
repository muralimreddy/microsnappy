# Shopping App Using Spring Microservices Concepts

This project will use following Spring Microservice concepts
* Spring Cloud 
* Eureka Server
* Netflix Feign (Ribbon)
* Config Server
* Netflix Zuul
* Database: H2
#
Eureka Server: 8010
Config Server: 8001

Product Service
This service will provide product details like
* Title of product
* SKU
* Price

Product service will be running in three instances:
Ports: 8021, 8022, 8023

__Product Inventory Service:__
This service will provide the inventory details. It will take SKU as input and provides quantity of the item. 
This service will run in three instances on ports: 8026, 8027, 8028

__Product Catalog Service:__

This service will consume Product service and Inventory service and provide a catalog to the UI
This service will also run in three instances on ports: 8031, 8032,8033


This is an inprogress project and any suggestions are welcome @ murali.dk.reddy@gmail.com
