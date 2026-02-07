# Movie REST API
 This project is a simple Spring Boot RESTful API developed using Java for managing a collection of movies.
 The application uses in-memory storage (ArrayList) and does not require a database.

## Technologies Used
- Java
- Spring Boot
- Maven

## How to Run
1. open project in STS
2. Run MovieApiApplication.java
3. Server starts on port 8080

## API Endpoints 

### Add Movie
POST /api/movie/add

Request Body:
{
  "id": 1,
  "name": "Inception",
  "description": "Sci-fi movie",
  "genre": "Sci-Fi"
}

### Get Movie by ID
GET /api/movie/{id}

## Data Storage
In-memory ArrayList (No database)


