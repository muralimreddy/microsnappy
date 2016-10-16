# Online Photo Album App Using Spring Microservices Concepts

Online Photo Album app is created to store photos on the cloud. This project is created to explore and expermentalize vaious Spring Cloud Concepts including

* - [x] Spring Config 
* - [x] Eureka Server
* - [ ] Netflix Feign (Ribbon)
* - [ ] Netflix Zuul
* - [x] Database: MYSQL
* - [ ] OAuth2

### Services

Sevice Name    | Service Description                                                                |Dependency Service
---------------|------------------------------------------------------------------------------------|-------------------
Snappy Service | RESTful Service which allows adding of Album, Photo, updating / deleting photo     |Profile service
Rating Service | RESTful service to record count of like of a photo                                 |Snappy service
Profile Service| RESTful service to register profile                                                |

### Tables

Schema |Table Name | Description  
-------|-----------|---------------------------------------------------------
PROFILE|PERSON     | Person table with demographic information 
SNAPPY |ALBUM      | Photo album information like album id, person id etc
SNAPPY |PHOTO      | Photo information like album id, photo id, location etc
RATING |PIC_RATING | Stores rating information


### Servers
Server         | Port(s)          | Technologies Used
---------------|------------------|----------------
Config Server  | 8001, 8002, 8003 |
Eureka Server  | 8010, 8011, 8012 |
Snappy Service | 8021, 8022, 8023 |
Person Service | 8031, 8032, 8033 |
Rating Service | 8041, 8042, 8043 |

### REST API
#### Snappy Service
Method  | Operation            | API                                                             | JSON Input
--------|----------------------|-----------------------------------------------------------------|------------
GET     |Get Photo             | http://localhost:8021/SnappyService/getPhotoById/{photoId}      |
GET     |Get Photos in a Album | http://localhost:8021/SnappyService/getPhotosByAlbumId/{albumId}| 
GET     |Get Album Details     | http://localhost:8021/SnappyService/getAlbumDetailsById/{albumId}|
POST    |Add Album             | http://localhost:8021/SnappyService/addAlbum                   | {"description": "AlbumM2", "personId": 2 }
POST    |Update Album          | http://localhost:8021/SnappyService/updateAlbum                | { "albumId": 4, "description": "Album Kiran", "personId": 2 }
POST    |Delete Album          | http://localhost:8021/SnappyService/deleteAlbum/{albumId}      |

#### Rating Service
Method  | Operation            | API
--------|----------------------|--------------------------------------------------------------------
GET     | Get rating of photo  | http://localhost:8041/RatingService/getRatingByPhotoId/{photoId}
POST    | Add Photo Rating     | http://localhost:8041/RatingService/addRatingByPhotoId/{photoId}


#### Person Service
Method  | Operation            | API                                                           | JSON Input
--------|----------------------|---------------------------------------------------------------|-----
GET     | Get Person by Id     | http://localhost:8031/PersonService/getPersonsById/{personId} |
POST    | Add Person           |http://localhost:8031/PersonService/addPerson                  |{"emailId": "bob@email.com", "name": "Bob" } 
POST    | Update Person        |http://localhost:8031/PersonService/updatePerson               |{ "personId": 3, "emailId": "bob@gmail.com", "name": "Bob Hillman" }
POST    | Delete Person        | http://localhost:8031/PersonService/deletePerson/{personId}   |

## Tools:
 - [x] Spring STS
 - [x] Postman
 - [x] MYSQL 
 - [x] Brew

This  project is inprogress. Any suggestions are welcome @ murali.dk.reddy@gmail.com

Last Updated: Oct 16, 2016
