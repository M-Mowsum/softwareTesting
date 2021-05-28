-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2021 at 08:16 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.3.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `form1`
--

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `id` int(11) NOT NULL,
  `firstName` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `dob` date NOT NULL,
  `gender` enum('m','f') NOT NULL,
  `email` varchar(20) NOT NULL,
  `phoneNumber` bigint(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `confirmPassword` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`id`, `firstName`, `lastName`, `dob`, `gender`, `email`, `phoneNumber`, `password`, `confirmPassword`) VALUES
(15, 'Munim', 'Mowsum', '1993-10-12', '', 'munimmowsum@hotmail.', 1872230040, 'iit123', 'iit123'),
(16, 'Hasib', 'Mia', '1992-02-12', '', 'hasib@gmail.com', 1552369745, 'mno456', 'mno456'),
(18, 'Mushfiq', 'Fuad', '2000-01-01', '', 'fuad@gmail.com', 1718458799, '123456789', '123456789'),
(19, 'azam', 'khan', '2000-01-01', '', 'azam@gmail.com', 1718543211, '123456789', '123456789'),
(20, 'niro', 'haque', '2000-01-01', '', 'nero@hotmail.com', 1718412311, '123456789', '123456789'),
(21, '', 'a', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(22, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(23, 'Munim', 'Mowsum', '1995-11-02', '', 'munimmowsum@hotmail.', 1872230040, '12345', '12345'),
(24, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(25, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(26, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(27, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(28, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(29, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(30, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(31, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(32, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(33, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(34, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(35, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(36, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(37, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(38, '', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(39, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(40, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(41, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(42, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(43, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(44, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(45, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(46, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(47, 'Asad', 'khan', '1990-01-01', '', 'a@gmail.com', 1718543211, '123456789', '123456789'),
(48, 'Asad', 'khan', '1990-01-01', '', 'A1_b@gmail.command', 1718543211, '123456789', '123456789'),
(49, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(50, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(51, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(52, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(53, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(54, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(55, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(56, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(57, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(58, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(59, 'Asad', 'khan', '1990-01-01', '', 'a@gmail.com', 1718543211, '123456789', '123456789'),
(60, 'Asad', 'khan', '1990-01-01', '', 'A1_b@gmail.command', 1718543211, '123456789', '123456789'),
(61, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(62, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(63, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(64, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(65, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(66, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123iit', '123iit'),
(67, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123iit', '123iit'),
(68, 'As', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(69, 'Asa', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(70, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(71, 'Asaaaaaaaaaaaaaaaaaa', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(72, 'Asaaaaaaaaaaaaaaaaaa', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(73, 'Asad', 'Khaaaaaaaaaaaaaaaaaa', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(74, 'Asad', 'Khaaaaaaaaaaaaaaaaaa', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(75, 'Asad', 'kh', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(76, 'Asad', 'kha', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(77, 'Asad', 'khan', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(78, 'Asad', 'Khaaaaaaaaaaaaaaaaaa', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(79, 'Asad', 'Khaaaaaaaaaaaaaaaaaa', '2000-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(80, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(81, 'Asad', 'khan', '1990-02-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(82, 'Asad', 'khan', '2020-12-31', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(83, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(84, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(85, 'Asad', 'khan', '1990-01-01', '', 'a@gmail.com', 1718543211, '123456789', '123456789'),
(86, 'Asad', 'khan', '1990-01-01', '', 'a1@gmail.com', 1718543211, '123456789', '123456789'),
(87, 'Asad', 'khan', '1990-01-01', '', 'a1B@gmail.com', 1718543211, '123456789', '123456789'),
(88, 'Asad', 'khan', '1990-01-01', '', 'A1_b@gmail.com', 1718543211, '123456789', '123456789'),
(89, 'Asad', 'khan', '1990-01-01', '', 'A1_b@gmail.command', 1718543211, '123456789', '123456789'),
(90, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789', '123456789'),
(91, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123it', '123it'),
(92, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.command', 1718543211, '123iit', '123iit'),
(93, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789iiiiiiiiit', '123456789iiiiiiiiit'),
(94, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.com', 1718543211, '123456789iiiiiiiiitt', '123456789iiiiiiiiitt'),
(95, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.command', 1718543211, '123iit', '123iit'),
(96, 'Asad', 'khan', '1990-01-01', '', 'asad@gmail.command', 1718543211, '123iit', '123iit');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `registration`
--
ALTER TABLE `registration`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=97;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
