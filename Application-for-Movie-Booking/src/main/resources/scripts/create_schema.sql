CREATE TABLE `user` (
  `user_id` int ,
  `user_mobile_number` varchar(20) DEFAULT NULL,
  `user_name` varchar(50) DEFAULT NULL,
  `user_email_address` varchar(50) DEFAULT NULL,
  PRIMARY KEY(user_id)
);

ALTER TABLE user MODIFY COLUMN user_id INT auto_increment;


CREATE TABLE `cinema_hall` (
  `cinema_hall_id` int ,
  `cinema_hall_name` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  PRIMARY KEY(cinema_hall_id)
);

ALTER TABLE cinema_hall MODIFY COLUMN cinema_hall_id INT auto_increment;


CREATE TABLE `cinema_hall_screens` (
  `cinema_hall_id` int ,
  `cinema_hall_screen_name` varchar(50),
  PRIMARY KEY(cinema_hall_id, cinema_hall_screen_name)
);

CREATE TABLE `current_movies` (
  `current_movie_id` int ,
  `cinema_hall_id` int,
  `start_date` date,
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
  `booking_id`  varchar(50),
  `user_id`  int,
  `current_movie_id`  int,
  `total_seats` int,
  `total_amount` int,
  PRIMARY KEY(booking_id)
);

ALTER TABLE booking MODIFY COLUMN booking_id INT auto_increment;

CREATE TABLE `booking_seats` (
  `booking_id`  varchar(50),
  `seat_id` varchar(50),
  PRIMARY KEY(booking_id, seat_id)
);







