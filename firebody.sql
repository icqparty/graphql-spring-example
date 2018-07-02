ALTER TABLE `saunas_halls` DROP FOREIGN KEY `fk_saunas_halls_saunas_1`;
ALTER TABLE `saunas_images` DROP FOREIGN KEY `fk_saunas_images_saunas_1`;
ALTER TABLE `saunas_phones` DROP FOREIGN KEY `fk_phones_saunas_1`;
ALTER TABLE `advs_options` DROP FOREIGN KEY `fk_advs_options_advs_1`;
ALTER TABLE `clients` DROP FOREIGN KEY `fk_clients_users_1`;
ALTER TABLE `saunas_clients` DROP FOREIGN KEY `fk_saunas_clients_clients_1`;
ALTER TABLE `saunas_clients` DROP FOREIGN KEY `fk_saunas_clients_saunas_1`;
ALTER TABLE `saunas` DROP FOREIGN KEY `fk_saunas_cities_1`;

DROP TABLE `users`;
DROP TABLE `advs`;
DROP TABLE `saunas`;
DROP TABLE `cities`;
DROP TABLE `saunas_halls`;
DROP TABLE `saunas_images`;
DROP TABLE `saunas_phones`;
DROP TABLE `advs_options`;
DROP TABLE `clients`;
DROP TABLE `saunas_clients`;

CREATE TABLE `users` (
`id` integer(11) NOT NULL AUTO_INCREMENT,
`username` varchar(255) NULL,
`password` varchar(255) NULL,
`created_at` datetime NULL,
`update_at` datetime NULL,
`deleted_at` datetime NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `advs` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`object_id` int(11) NULL,
`created_at` datetime NULL,
`update_at` datetime NULL,
`deleted_at` datetime NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `saunas` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`city_id` int(11) NULL,
`description` varchar(255) NULL,
`name` varchar(255) NULL,
`created_at` datetime NULL,
`update_at` datetime NULL,
`deleted_at` datetime NULL,
`status` int(255) NULL DEFAULT 0,
`address` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `cities` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `saunas_halls` (
`id` int(11) NOT NULL,
`sauna_id` int(11) NULL,
`restroom` varchar(255) NULL,
`service` varchar(255) NULL,
`description` varchar(255) NULL,
`price_hour` varchar(255) NULL,
`pool` varchar(255) NULL,
`pairs` varchar(255) NULL,
`created_at` datetime NULL,
`updated_at` datetime NULL,
`deleted_at` datetime NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `saunas_images` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`sauna_id` int(11) NULL,
`file` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `saunas_phones` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`sauna_id` int(11) NULL,
`value` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `advs_options` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(255) NULL,
`value` varchar(255) NULL,
`adv_id` int(11) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `clients` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`user_id` int(11) NULL,
`fullname` varchar(255) NULL,
`phone` varchar(255) NULL,
`address` varchar(255) NULL,
`inn` varchar(255) NULL,
`ogrn` varchar(255) NULL,
PRIMARY KEY (`id`) 
);

CREATE TABLE `saunas_clients` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`client_id` int(11) NULL,
`sauna_id` int(11) NULL,
PRIMARY KEY (`id`) 
);


ALTER TABLE `saunas_halls` ADD CONSTRAINT `fk_saunas_halls_saunas_1` FOREIGN KEY (`sauna_id`) REFERENCES `saunas` (`id`);
ALTER TABLE `saunas_images` ADD CONSTRAINT `fk_saunas_images_saunas_1` FOREIGN KEY (`sauna_id`) REFERENCES `saunas` (`id`);
ALTER TABLE `saunas_phones` ADD CONSTRAINT `fk_phones_saunas_1` FOREIGN KEY (`sauna_id`) REFERENCES `saunas` (`id`);
ALTER TABLE `advs_options` ADD CONSTRAINT `fk_advs_options_advs_1` FOREIGN KEY (`adv_id`) REFERENCES `advs` (`id`);
ALTER TABLE `clients` ADD CONSTRAINT `fk_clients_users_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
ALTER TABLE `saunas_clients` ADD CONSTRAINT `fk_saunas_clients_clients_1` FOREIGN KEY (`client_id`) REFERENCES `clients` (`id`);
ALTER TABLE `saunas_clients` ADD CONSTRAINT `fk_saunas_clients_saunas_1` FOREIGN KEY (`sauna_id`) REFERENCES `saunas` (`id`);
ALTER TABLE `saunas` ADD CONSTRAINT `fk_saunas_cities_1` FOREIGN KEY (`city_id`) REFERENCES `cities` (`id`);

