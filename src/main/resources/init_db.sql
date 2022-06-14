CREATE SCHEMA IF NOT EXISTS `ticket_app` DEFAULT CHARACTER SET utf8;
USE `ticket_app`;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

CREATE TABLE `movies` (
                          `id` bigint NOT NULL AUTO_INCREMENT,
                          `description` varchar(255) DEFAULT NULL,
                          `title` varchar(255) DEFAULT NULL,
                          PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb3;
