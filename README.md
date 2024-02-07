# moviebooking
Online Movie Booking Platform

APIs Implemented 

1. API to book movie tickets 

HTTP Method : POST
API URL : /api/booking
Payload :

{

       "user_id": 2,
        "current_movie_id":3,
        "total_seats":4,
        "total_amount":800,
        "theatre_id" : 1,
        "screen_name" : "Screen 1",
        "movie_name" : "Bombay",
        "movie_date" : "2024-02-06",
        "movie_timing" : "3PM",
        "seats" : 
        [
        {"seat_id" :"d15"},
        {"seat_id" :"d16"},
        {"seat_id" :"d17"},
        {"seat_id" :"d18"}
        ]
    }

Response :
HTTP Code : 200 
Response Body :

JSON containing booking details

2. Get the Theatre details based on Movie Name, City and Date

HTTP Method : GET
API URL : /api/theatre/{city_name}/{movie_name}/{date}

Response :
HTTP Code : 200
Response Body :

`[
{
"theatre_id": "1",
"theatre_name": "City Pride",
"address": "Kothrud",
"city": "Pune"
}
]`



