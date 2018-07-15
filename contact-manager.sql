CREATE DATABASE  IF NOT EXISTS `web_contact_manager`;
USE `web_contact_manager`;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;

CREATE TABLE `contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;

INSERT INTO `contact` VALUES 
	(1,'Kien','Le','kien.tufts@gmail.com'),
	(2,'Dat','Do','dodanhdat@yahoo.com'),
	(3,'Josh','Tso','Joshua.Tso@tufts.edu'),
	(4,'Duc','Nguyen','duc.nguyen@mit.com'),
	(5,'Leo','Le','leole23@ymail.com');

UNLOCK TABLES;
