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
"theatre_id": "Theatre Id",
"theatre_name": "Theatre Name",
"address": "Address",
"city": "City"
}
]`



