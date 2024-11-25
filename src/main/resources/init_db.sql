-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0;
SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0;
SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE =
        'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema hibernate_task
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hibernate_task
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hibernate_task` DEFAULT CHARACTER SET utf8;
USE `hibernate_task`;

-- -----------------------------------------------------
-- Table `hibernate_task`.`movie`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hibernate_task`.`movie`
(
    `id`    INT         NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(45) NULL,
    `description` VARCHAR(155)     NULL,
    PRIMARY KEY (`id`)
    )
    ENGINE = InnoDB;

TRUNCATE TABLE `hibernate_task`.`movie`;

INSERT INTO `movie` (title, description)
VALUES ('title_1', 'description_1'),
       ('title_2', 'description_2'),
       ('title_3', 'description_3'),
       ('title_4', 'description_4'),
       ('title_5', 'description_5'),
       (NULL, 'description_6'),
       ('title_7', NULL);

SET SQL_MODE = @OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS;