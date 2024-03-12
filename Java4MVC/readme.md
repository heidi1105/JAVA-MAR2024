# Notes on Spring MVC
## 1. Project Setup
1. Create a new starter project with MySQL driver, JPA, devtools, Spring Web
2. Add dependencies on pom.xml 
   - For database: [persistence validation](https://login.codingdojo.com/m/315/9533/64299)
   - For web: jasper, jstl
3. Add config on application.properties 
   - For database: [MySQL connection ](https://login.codingdojo.com/m/315/9533/64298)
   - For Web: ```spring.mvc.view.prefix=/WEB-INF/```
   - To enable RESTful routing for forms: ```spring.mvc.hiddenmethod.filter.enabled=true```
4. Create all the subpackages (controllers, models, services, repositories)
5. Create the following files & corresponding jsp files
   | Package    | Files | Use | Platform reference | 
   | ---------- | ---------------| -------------------------| ---|
   | models     | [Trip class](./packages/Trip.java) | like ERD, building the database design on server | [DomainModels](https://login.codingdojo.com/m/315/9533/64299) |
   | repositores| [TripRepository interface](./packages/TripRepository.java) | To perform queries on MySQL | [Repositories](https://login.codingdojo.com/m/315/9533/64300) |
   | services   | [TripService class](./packages/TripService.java) | To handle all backend logic (will stay the same) | [Services](https://login.codingdojo.com/m/315/9533/64301) |  
   | controllers| [APIController class](./packages/APIController.java) | To receive HTTP request and render the data  (DON'T NEED IT AFTER JSP)|   |
     | controllers| [TripController class](./packages/TripController.java) | To receive HTTP request, retrieve data from service and render the jsp|   |
6. Create all the corresponding jsp when testing each CRUD operations (NO CODE PROVIDED)


    | jsp Page |  Logic  | Reference |
    | ---------| --------| -----------|
    | tripDashboard |  Get the list of trips from service and render in jsp| Fruity Loop |
    | tripDetails |  Get the ID from PathVariable, use the ID to get the trip information from service | [Video from Adding Views](https://login.codingdojo.com/m/315/9533/65957) |
 




