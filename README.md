# Restful Web Services using Spring Boot

## Steps to run the application
1. Clone the repository to your local
2. Open it on an IDE or editor
3. Run mvn clean install
4. Run the Application.class main method

## API's Created
1. GET /users - to fetch all users in the list

2. GET /users/{id} - to fetch a user with particular id

3. POST /users/addNew - add a new user to the list    
Request Body for the POST call: {"name":"{Name}","id":{Integer id},"occupation":"{Person's occupation}"}  
For eg. - {"name":"Utkarsh","id":4,"occupation":"Analyst"}
 
