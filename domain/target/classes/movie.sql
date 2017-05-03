/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50623
Source Host           : 127.0.0.1:3306
Source Database       : movie

Target Server Type    : MYSQL
Target Server Version : 50623
File Encoding         : 65001

Date: 2017-03-31 14:44:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for actor_info
-- ----------------------------
DROP TABLE IF EXISTS `actor_info`;
CREATE TABLE `actor_info` (
  `actor_id` varchar(255) NOT NULL,
  `actor_birthday` datetime DEFAULT NULL,
  `actor_birthplace` varchar(255) DEFAULT NULL,
  `actor_intro` varchar(255) DEFAULT NULL,
  `actor_name` varchar(255) DEFAULT NULL,
  `actor_nation` varchar(255) DEFAULT NULL,
  `actor_nationality` varchar(255) DEFAULT NULL,
  `actor_photo` varchar(255) DEFAULT NULL,
  `actor_sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`actor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for actor_type_info
-- ----------------------------
DROP TABLE IF EXISTS `actor_type_info`;
CREATE TABLE `actor_type_info` (
  `actor_type_id` varchar(255) NOT NULL,
  `actor_type_name` varchar(255) DEFAULT NULL,
  `actor_type_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`actor_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for admin_info
-- ----------------------------
DROP TABLE IF EXISTS `admin_info`;
CREATE TABLE `admin_info` (
  `admin_id` varchar(255) NOT NULL,
  `admin_name` varchar(255) DEFAULT NULL,
  `admin_password` varchar(255) DEFAULT NULL,
  `admin_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cinema_address_info
-- ----------------------------
DROP TABLE IF EXISTS `cinema_address_info`;
CREATE TABLE `cinema_address_info` (
  `cinema_address_id` varchar(255) NOT NULL,
  `cinema_address_area` varchar(255) DEFAULT NULL,
  `cinema_address_city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cinema_address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cinema_info
-- ----------------------------
DROP TABLE IF EXISTS `cinema_info`;
CREATE TABLE `cinema_info` (
  `cinema_id` varchar(255) NOT NULL,
  `cinema_address_particular` varchar(255) DEFAULT NULL,
  `cinema_cover` varchar(255) DEFAULT NULL,
  `cinema_intro` varchar(255) DEFAULT NULL,
  `cinema_name` varchar(255) DEFAULT NULL,
  `cinema_score` double DEFAULT NULL,
  `cinema_status` varchar(255) DEFAULT NULL,
  `cinema_tel` varchar(255) DEFAULT NULL,
  `cinema_address_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`cinema_id`),
  KEY `FKb1cqcfpofte0ulwbmsyrxq6hv` (`cinema_address_id`),
  CONSTRAINT `FKb1cqcfpofte0ulwbmsyrxq6hv` FOREIGN KEY (`cinema_address_id`) REFERENCES `cinema_address_info` (`cinema_address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cinema_screens_info
-- ----------------------------
DROP TABLE IF EXISTS `cinema_screens_info`;
CREATE TABLE `cinema_screens_info` (
  `screens_id` varchar(255) NOT NULL,
  `screens_name` varchar(255) DEFAULT NULL,
  `screens_num` int(11) DEFAULT NULL,
  `screens_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`screens_id`),
  CONSTRAINT `FKko7d060j9u16qm33ei136yd9c` FOREIGN KEY (`screens_id`) REFERENCES `cinema_info` (`cinema_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cinema_seats_info
-- ----------------------------
DROP TABLE IF EXISTS `cinema_seats_info`;
CREATE TABLE `cinema_seats_info` (
  `seats_id` varchar(255) NOT NULL,
  `seats_col` int(11) DEFAULT NULL,
  `seats_row` int(11) DEFAULT NULL,
  `seats_status` int(11) DEFAULT NULL,
  `screens_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`seats_id`),
  KEY `sadsadad` (`screens_id`),
  CONSTRAINT `sadsadad` FOREIGN KEY (`screens_id`) REFERENCES `cinema_screens_info` (`screens_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for cinema_show_info
-- ----------------------------
DROP TABLE IF EXISTS `cinema_show_info`;
CREATE TABLE `cinema_show_info` (
  `show_id` varchar(255) NOT NULL,
  `cinema_id` varchar(255) DEFAULT NULL,
  `movie_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`show_id`),
  KEY `FKdrxxdnocau0pnefvt0rje2pts` (`cinema_id`),
  KEY `FKppch1ijy85vjnbrpcamkj2hka` (`movie_id`),
  CONSTRAINT `FKdrxxdnocau0pnefvt0rje2pts` FOREIGN KEY (`cinema_id`) REFERENCES `cinema_info` (`cinema_id`),
  CONSTRAINT `FKppch1ijy85vjnbrpcamkj2hka` FOREIGN KEY (`movie_id`) REFERENCES `movie_info` (`movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for comment_cinema_info
-- ----------------------------
DROP TABLE IF EXISTS `comment_cinema_info`;
CREATE TABLE `comment_cinema_info` (
  `comment_cinema_id` varchar(255) NOT NULL,
  `comment_context` varchar(255) DEFAULT NULL,
  `comment_score` double DEFAULT NULL,
  `comment_time` datetime DEFAULT NULL,
  `cinema_id` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`comment_cinema_id`),
  KEY `FK5w7bucsdd1l5ur6c9b2k63bmr` (`cinema_id`),
  KEY `FKh0c7i181p0439ag8c5hgf03nv` (`user_id`),
  CONSTRAINT `FK5w7bucsdd1l5ur6c9b2k63bmr` FOREIGN KEY (`cinema_id`) REFERENCES `cinema_info` (`cinema_id`),
  CONSTRAINT `FKh0c7i181p0439ag8c5hgf03nv` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for comment_movie_info
-- ----------------------------
DROP TABLE IF EXISTS `comment_movie_info`;
CREATE TABLE `comment_movie_info` (
  `comment_movie_id` varchar(255) NOT NULL,
  `comment_context` varchar(255) DEFAULT NULL,
  `comment_score` double DEFAULT NULL,
  `comment_time` datetime DEFAULT NULL,
  `user_id` varchar(255) NOT NULL,
  `movie_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`comment_movie_id`),
  KEY `FK2hwdithf141bbg5ebu5pber5f` (`user_id`),
  KEY `sadas` (`movie_id`),
  CONSTRAINT `FK2hwdithf141bbg5ebu5pber5f` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`),
  CONSTRAINT `sadas` FOREIGN KEY (`movie_id`) REFERENCES `movie_info` (`movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_actor_info
-- ----------------------------
DROP TABLE IF EXISTS `movie_actor_info`;
CREATE TABLE `movie_actor_info` (
  `movie_actor_id` varchar(255) NOT NULL,
  `movie_actor_name` varchar(255) DEFAULT NULL,
  `actor_id` varchar(255) DEFAULT NULL,
  `actor_type_id` varchar(255) DEFAULT NULL,
  `movie_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`movie_actor_id`),
  KEY `FKqe1dnpld1mfvcu8cdet71xxl2` (`actor_id`),
  KEY `FKgxegcq8qn33tafqasleupyi9a` (`actor_type_id`),
  KEY `FKlqywcv4acbxrqy8lxrrk3ivvu` (`movie_id`),
  CONSTRAINT `FKgxegcq8qn33tafqasleupyi9a` FOREIGN KEY (`actor_type_id`) REFERENCES `actor_type_info` (`actor_type_id`),
  CONSTRAINT `FKlqywcv4acbxrqy8lxrrk3ivvu` FOREIGN KEY (`movie_id`) REFERENCES `movie_info` (`movie_id`),
  CONSTRAINT `FKqe1dnpld1mfvcu8cdet71xxl2` FOREIGN KEY (`actor_id`) REFERENCES `actor_info` (`actor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_area_info
-- ----------------------------
DROP TABLE IF EXISTS `movie_area_info`;
CREATE TABLE `movie_area_info` (
  `movie_area_id` varchar(255) NOT NULL,
  `movie_area_name` varchar(255) DEFAULT NULL,
  `movie_area_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`movie_area_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_date_info
-- ----------------------------
DROP TABLE IF EXISTS `movie_date_info`;
CREATE TABLE `movie_date_info` (
  `movie_date_id` varchar(255) NOT NULL,
  `movie_date_name` varchar(255) DEFAULT NULL,
  `movie_date_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`movie_date_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_info
-- ----------------------------
DROP TABLE IF EXISTS `movie_info`;
CREATE TABLE `movie_info` (
  `movie_id` varchar(255) NOT NULL,
  `movie_cover` varchar(255) DEFAULT NULL,
  `movie_end_date` datetime DEFAULT NULL,
  `movie_intro` varchar(255) DEFAULT NULL,
  `movie_name` varchar(255) DEFAULT NULL,
  `movie_release_date` datetime DEFAULT NULL,
  `movie_score` double DEFAULT NULL,
  `movie_time` varchar(255) DEFAULT NULL,
  `movie_date_id` varchar(255) DEFAULT NULL,
  `movie_version_id` varchar(255) DEFAULT NULL,
  `movie_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`movie_id`),
  KEY `FKrdeuounk892uit2hvcy614923` (`movie_date_id`),
  KEY `FKso5s9ttm23yn7rchsw89hw0ut` (`movie_version_id`),
  CONSTRAINT `FKrdeuounk892uit2hvcy614923` FOREIGN KEY (`movie_date_id`) REFERENCES `movie_date_info` (`movie_date_id`),
  CONSTRAINT `FKso5s9ttm23yn7rchsw89hw0ut` FOREIGN KEY (`movie_version_id`) REFERENCES `movie_version_info` (`movie_version_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_moviearea
-- ----------------------------
DROP TABLE IF EXISTS `movie_moviearea`;
CREATE TABLE `movie_moviearea` (
  `movie_movie_area` varchar(255) NOT NULL,
  `movie_area_id` varchar(255) DEFAULT NULL,
  `movie_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`movie_movie_area`),
  KEY `sdaad` (`movie_area_id`),
  KEY `sdasdasda` (`movie_id`),
  CONSTRAINT `sdaad` FOREIGN KEY (`movie_area_id`) REFERENCES `movie_area_info` (`movie_area_id`),
  CONSTRAINT `sdasdasda` FOREIGN KEY (`movie_id`) REFERENCES `movie_info` (`movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_movietype
-- ----------------------------
DROP TABLE IF EXISTS `movie_movietype`;
CREATE TABLE `movie_movietype` (
  `movie_movie_type` varchar(255) NOT NULL,
  `movie_type_id` varchar(255) DEFAULT NULL,
  `movie_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`movie_movie_type`),
  KEY `sdasada` (`movie_type_id`),
  KEY `ssdasd` (`movie_id`),
  CONSTRAINT `sdasada` FOREIGN KEY (`movie_type_id`) REFERENCES `movie_type_info` (`movie_type_id`),
  CONSTRAINT `ssdasd` FOREIGN KEY (`movie_id`) REFERENCES `movie_info` (`movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_photos_info
-- ----------------------------
DROP TABLE IF EXISTS `movie_photos_info`;
CREATE TABLE `movie_photos_info` (
  `photos_id` varchar(255) NOT NULL,
  `photos_address` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`photos_id`),
  CONSTRAINT `FK7m9dt52a613v7g0mjjgii8qpl` FOREIGN KEY (`photos_id`) REFERENCES `movie_info` (`movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_schedule_info
-- ----------------------------
DROP TABLE IF EXISTS `movie_schedule_info`;
CREATE TABLE `movie_schedule_info` (
  `movie_schedule_id` varchar(255) NOT NULL,
  `end_time` datetime DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `ticket_price` double DEFAULT NULL,
  `show_id` varchar(255) DEFAULT NULL,
  `screens_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`movie_schedule_id`),
  KEY `FKq9rbq731ib4v6o9mhi37c9krg` (`show_id`),
  KEY `FKj55lo7v2c81epj1bcfrrktdi3` (`screens_id`),
  CONSTRAINT `FKj55lo7v2c81epj1bcfrrktdi3` FOREIGN KEY (`screens_id`) REFERENCES `cinema_screens_info` (`screens_id`),
  CONSTRAINT `FKq9rbq731ib4v6o9mhi37c9krg` FOREIGN KEY (`show_id`) REFERENCES `cinema_show_info` (`show_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_type_info
-- ----------------------------
DROP TABLE IF EXISTS `movie_type_info`;
CREATE TABLE `movie_type_info` (
  `movie_type_id` varchar(255) NOT NULL,
  `movie_type_name` varchar(255) DEFAULT NULL,
  `movie_type_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`movie_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for movie_version_info
-- ----------------------------
DROP TABLE IF EXISTS `movie_version_info`;
CREATE TABLE `movie_version_info` (
  `movie_version_id` varchar(255) NOT NULL,
  `movie_version_name` varchar(255) DEFAULT NULL,
  `movie_version_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`movie_version_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `order_id` varchar(255) NOT NULL,
  `order_end_time` datetime DEFAULT NULL,
  `order_start_time` datetime DEFAULT NULL,
  `order_statys` varchar(255) DEFAULT NULL,
  `order_total` double DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `FKgb06s9qkvgo5hdgu90whc1iek` (`user_id`),
  CONSTRAINT `FKgb06s9qkvgo5hdgu90whc1iek` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_item_info
-- ----------------------------
DROP TABLE IF EXISTS `order_item_info`;
CREATE TABLE `order_item_info` (
  `item_id` varchar(255) NOT NULL,
  `item_num` int(11) DEFAULT NULL,
  `movie_schedule_id` varchar(255) DEFAULT NULL,
  `order_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`item_id`),
  KEY `FKn6egti92lc461j94ptb9b1jw3` (`movie_schedule_id`),
  KEY `FK32jdckof1mh8vtdjd4h3pald4` (`order_id`),
  CONSTRAINT `FK32jdckof1mh8vtdjd4h3pald4` FOREIGN KEY (`order_id`) REFERENCES `order_info` (`order_id`),
  CONSTRAINT `FKn6egti92lc461j94ptb9b1jw3` FOREIGN KEY (`movie_schedule_id`) REFERENCES `movie_schedule_info` (`movie_schedule_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` varchar(255) NOT NULL,
  `user_head_portrait` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `user_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user_movie
-- ----------------------------
DROP TABLE IF EXISTS `user_movie`;
CREATE TABLE `user_movie` (
  `user_id` varchar(255) NOT NULL,
  `movie_id` varchar(255) NOT NULL,
  PRIMARY KEY (`user_id`,`movie_id`),
  KEY `FKbnlxs1ajwie3jroihwajeemn3` (`movie_id`),
  CONSTRAINT `FKbnlxs1ajwie3jroihwajeemn3` FOREIGN KEY (`movie_id`) REFERENCES `movie_info` (`movie_id`),
  CONSTRAINT `FKsu3j1usttbviw7v965i8ok9bl` FOREIGN KEY (`user_id`) REFERENCES `user_info` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
