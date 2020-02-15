-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 15, 2020 at 01:02 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `farm`
--

-- --------------------------------------------------------

--
-- Table structure for table `cabbage_farm`
--

CREATE TABLE `cabbage_farm` (
  `id` bigint(20) NOT NULL,
  `humidity` double NOT NULL,
  `temperature` double NOT NULL,
  `light_intensity` double NOT NULL,
  `soil_acidity` double NOT NULL,
  `date` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cabbage_farm`
--

INSERT INTO `cabbage_farm` (`id`, `humidity`, `temperature`, `light_intensity`, `soil_acidity`, `date`) VALUES
(3, 62.2, 30.4, 400.2, 4, '10-Jan'),
(4, 63.2, 45.1, 500.6, 3.4, '12-Jan'),
(7, 63.2, 35.4, 400.5, 0.4, '14-Jan'),
(8, 65.6, 33.1, 300.7, 8.9, '16-Jan'),
(9, 69.1, 28.2, 700.3, 6.4, '18-Jan'),
(10, 66.1, 36.2, 500.3, 7.1, '20-Jan'),
(11, 67.9, 36.8, 500.7, 4.6, '22-Jan'),
(12, 65.1, 39.9, 700.1, 8, '24-Jan');

-- --------------------------------------------------------

--
-- Table structure for table `potato_farm`
--

CREATE TABLE `potato_farm` (
  `id` bigint(20) NOT NULL,
  `humidity` double NOT NULL,
  `temperature` double NOT NULL,
  `light_intensity` double NOT NULL,
  `soil_acidity` double NOT NULL,
  `date` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `potato_farm`
--

INSERT INTO `potato_farm` (`id`, `humidity`, `temperature`, `light_intensity`, `soil_acidity`, `date`) VALUES
(1, 4, 4.2, 2, 4.6, '10-Jan'),
(2, 5, 1.1, 6.8, 8.9, '12-Jan'),
(3, 2, 3.4, 5, 4, '14-Jan'),
(4, 8, 1.1, 5, 7.1, '16-Jan'),
(5, 2, 6.8, 7, 4.6, '18-Jan'),
(6, 8, 6.2, 5, 7.1, '20-Jan'),
(7, 2, 8.2, 7, 4.3, '22-Jan'),
(8, 8, 3.9, 6.8, 7.1, '24-Jan');

-- --------------------------------------------------------

--
-- Table structure for table `sunflower_farm`
--

CREATE TABLE `sunflower_farm` (
  `id` bigint(20) NOT NULL,
  `humidity` double NOT NULL,
  `temperature` double NOT NULL,
  `light_intensity` double NOT NULL,
  `soil_acidity` double NOT NULL,
  `date` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sunflower_farm`
--

INSERT INTO `sunflower_farm` (`id`, `humidity`, `temperature`, `light_intensity`, `soil_acidity`, `date`) VALUES
(1, 9, 3.4, 7, 4.3, '10-Jan'),
(2, 8, 6.2, 5, 7.1, '12-Jan'),
(3, 7, 3.4, 7, 4.3, '14-Jan'),
(4, 8, 3.9, 6.8, 8.9, '16-Jan'),
(5, 6, 8.2, 7, 6.4, '18-Jan'),
(6, 8, 6.2, 6.8, 8.9, '20-Jan'),
(7, 7.9, 6.8, 7, 6.4, '22-Jan'),
(8, 8, 6.2, 6.8, 8.9, '24-Jan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cabbage_farm`
--
ALTER TABLE `cabbage_farm`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `potato_farm`
--
ALTER TABLE `potato_farm`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sunflower_farm`
--
ALTER TABLE `sunflower_farm`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cabbage_farm`
--
ALTER TABLE `cabbage_farm`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `potato_farm`
--
ALTER TABLE `potato_farm`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `sunflower_farm`
--
ALTER TABLE `sunflower_farm`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
