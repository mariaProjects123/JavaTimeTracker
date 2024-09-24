-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema timetracker
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema timetracker
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `timetracker` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `timetracker` ;

-- -----------------------------------------------------
-- Table `timetracker`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `timetracker`.`user` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `FirstName` VARCHAR(45) NOT NULL,
  `UserName` VARCHAR(45) NOT NULL,
  `CreatedDate` DATE NULL DEFAULT NULL,
  `UpdatedDate` DATE NULL DEFAULT NULL,
  `UserEmail` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 10
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `timetracker`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `timetracker`.`login` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `UserEmail` VARCHAR(45) NOT NULL,
  `Password` VARCHAR(45) NOT NULL,
  `LastLoginDate` DATE NULL DEFAULT NULL,
  `user_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_login_user_idx` (`user_ID` ASC) VISIBLE,
  CONSTRAINT `fk_login_user`
    FOREIGN KEY (`user_ID`)
    REFERENCES `timetracker`.`user` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 9
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `timetracker`.`user_activities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `timetracker`.`user_activities` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `activity_date` DATETIME NULL DEFAULT NULL,
  `school_hrs` INT NULL DEFAULT NULL,
  `school_mins` INT NULL DEFAULT NULL,
  `work_hrs` INT NULL DEFAULT NULL,
  `work_mins` INT NULL DEFAULT NULL,
  `sleep_hrs` INT NULL DEFAULT NULL,
  `sleep_mins` INT NULL DEFAULT NULL,
  `exercise_hrs` INT NULL DEFAULT NULL,
  `exercise_mins` INT NULL DEFAULT NULL,
  `eating_hrs` INT NULL DEFAULT NULL,
  `eating_mins` INT NULL DEFAULT NULL,
  `other_hrs` INT NULL DEFAULT NULL,
  `other_mins` INT NULL DEFAULT NULL,
  `user_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_user_activities_user1_idx` (`user_ID` ASC) VISIBLE,
  CONSTRAINT `fk_user_activities_user1`
    FOREIGN KEY (`user_ID`)
    REFERENCES `timetracker`.`user` (`ID`))
ENGINE = InnoDB
AUTO_INCREMENT = 23
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
