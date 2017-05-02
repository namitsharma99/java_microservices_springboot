Microservices using JAVA and Spring Boot.


Microservices -

To enable service based architecture, monolith applications moved towards SOA.
To incorporate loose coupling, SOA gave way for more segregated modules which are called Microservices.

An insight into Microservice can be obtained from -
http://sdtimes.com/digging-into-microservices/7/

Trying to imbibe microservice architecture in a small application -
1.	3 loosely coupled projects.
2.	Using Spring Boot that provides embedded tomcat server.
3.	Architecture representing 2 producers and 1 consumer.

( Idea realized with the help of - https://dzone.com/articles/spring-boot-creating )


Use Case -

Implement a school’s details fetching model, that comprises of 3 services -
A.	fetching details of the teacher based on subject id.
B.	fetching details of the subject based on subject id.
C.	fetching both the above details, based on the subject id.
The services 1 and 2 ought to be independently up and running, and should be available for service 3 as well, when service 3 is invoked.




