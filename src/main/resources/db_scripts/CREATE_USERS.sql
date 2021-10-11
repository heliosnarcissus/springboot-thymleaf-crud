CREATE TABLE `sakila`.`users` (
  `userID` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(35) NOT NULL,
  `password` VARCHAR(100) NOT NULL,
  `role` VARCHAR(35) NOT NULL,
  `enabled` INT NOT NULL,
  PRIMARY KEY (`userID`));