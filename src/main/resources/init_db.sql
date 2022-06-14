CREATE DATABASE `ticket_app`;

CREATE TABLE `ticket_app`.`movies` (
                                       `id` BIGINT(11) NOT NULL AUTO_INCREMENT,
                                       `title` VARCHAR(255) NOT NULL,
                                       `description` VARCHAR(255) NOT NULL,
                                       PRIMARY KEY (`id`));
