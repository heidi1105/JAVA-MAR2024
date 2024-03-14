# Notes on Spring MVC with 1:n
## 1. Project Setup
1. Create a new starter project with MySQL driver, JPA, devtools, Spring Web
2. Add dependencies on pom.xml 
   - For database: persistence validation
   - For web: jasper, jstl
3. Add config on application.properties 
   - For database: MySQL connection 
   - For Web: ```spring.mvc.view.prefix=/WEB-INF/```
   - To enable RESTful routing for forms: ```spring.mvc.hiddenmethod.filter.enabled=true```
4. Create all the packages (controllers, models, services, repo)
5. Create the following files
| Package    | Files | Use | Platform reference | 
   | ---------- | ---------------| -------------------------| ---|
   | models     | [Trip class](./packages/Trip.java) | like ERD, building the database design on server | [DomainModels](https://login.codingdojo.com/m/315/9533/64299) |
   | repositores| [TripRepository interface](./packages/TripRepository.java) | To perform queries on MySQL | [Repositories](https://login.codingdojo.com/m/315/9533/64300) |
   | services   | [TripService class](./packages/TripService.java) | To handle all backend logic (will stay the same) | [Services](https://login.codingdojo.com/m/315/9533/64301) |  
   | controllers| [APIController class](./packages/APIController.java) | To receive HTTP request and render the data  (DON'T NEED IT AFTER JSP)|   |
     | controllers| [TripController class](./packages/TripController.java) | To receive HTTP request, retrieve data from service and render the jsp|   |
## 2. Models
1. Refer to the MVC demo models that follow POJO (private attributes, constructor, getters/setters) for both models (User & Trip)
2. Create the foreign key reference so that these 2 tables are joint
    ##### Trip model
    ```java
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="owner_id") // the foreign key on MySQL
    private User owner;
    ```

    ##### User model
    ```java
    @OneToMany(mappedBy="owner", fetch = FetchType.LAZY)
    private List<Trip> ownedTrips;
    ```

3. Don't forget about the zero-argument constructor & all the getters/setters

## 3. Repositories
Refer to the MVC demo repository interface and create one repo for each model. (In Trip-owner example, you will need 2 repo)

## 4. Services
- Refer to the MVC demo service for CRUD. You could create 2 services for the corresponding model.
- You can also create 1 MainService that autowire both repo into the same service

## 5. Controllers & Views
1. Create Users
    - Refer to MVC demo for the create form & create process for User
2. Create Trip
    - As Trip requires the foreign key (User as the owner), a dropdown menu is required in this situation. 
    - To create the drop-down menu to pick the user, get all users from the service and put the userList in Model model
    - Make use of the forEach to display all the options

    ```html
		<form:select path="owner">
            <!-- TODO: forEach for the form:option -->
		</form:select>    
    ```
    ##### HINT: we need to use form:select with the correct PATH that corresponding to the getters/setters in Trip model

3. Trip Dashboard
   - Refer to MVC demo for dashboard
   - Note that ``` eachTrip.owner ``` is not a String, it is a User datatype 
   - Make use of the User datatype to display the username or email (whichever you want to display on the dashboard)

4. Edit Trip
   - Refer to MVC demo for Edit
   - If we do not wish to change the 1:n (trip), make sure use hidden input for the owner as the path so that users cannot change it in the form ```<form:hidden path="owner" />``` 

5. Delete Trip
   - Refer to MVC demo for the delete button. 






