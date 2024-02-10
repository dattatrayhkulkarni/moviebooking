CREATE TABLE `user` (
  `user_id` int ,
  `user_mobile_number` varchar(20) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_email_address` varchar(50) DEFAULT NULL,
  PRIMARY KEY(user_id)
);

ALTER TABLE user MODIFY COLUMN user_id INT auto_increment;


CREATE TABLE `theatre` (
  `theatre_id` int ,
  `theatre_name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  PRIMARY KEY(theatre_id)
);

ALTER TABLE theatre MODIFY COLUMN theatre_id INT auto_increment;


CREATE TABLE `theatre_screens` (
  `theatre_id` int ,
  `theatre_screen_name` varchar(50),
  PRIMARY KEY(theatre_id, theatre_screen_name)
);

CREATE TABLE `current_movies` (
  `current_movie_id` int ,
  `theatre_id` int,
  `start_date` date,
  `end_date` date,
  `show_timing` varchar(50),
  `current_movie_name` varchar(100),
  PRIMARY KEY(current_movie_id)
);

ALTER TABLE current_movies MODIFY COLUMN current_movie_id INT auto_increment;

CREATE TABLE `ticket_inventory` (
  `current_movie_id` int ,
  `seat_id`  varchar(50),
  `seat_row`  varchar(50),
  `seat_column`  varchar(50),
  `start_date` date,
  `available_y_n` varchar(1),
  PRIMARY KEY(current_movie_id, seat_id)
);

CREATE TABLE `booking` (
  `booking_id`  BIGINT,
  `user_id`  int,
  `current_movie_id`  int,
  `total_seats` int,
  `total_amount` int,
  `screen_name` varchar(50),
  `movie_name` varchar(100),
  `movie_date` date,
  `movie_timing` varchar(50),
  PRIMARY KEY(booking_id)
);

ALTER TABLE booking MODIFY COLUMN booking_id INT auto_increment;

CREATE TABLE `booking_seats` (
   `booking_seat_id`  BIGINT,
  `booking_id`  varchar(50),
  `seat_id` varchar(50),
  PRIMARY KEY(booking_seat_id)
);

ALTER TABLE booking_seats MODIFY COLUMN booking_seat_id INT auto_increment;







