CREATE SCHEMA `cinema_hall`
USE `cinema_hall`

CREATE TABLE IF NOT EXISTS `movie` (
    `id` BIGINT(11) NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(45) NOT NULL,
    `description` VARCHAR(500) NOT NULL,
    PRIMARY KEY (`id`));