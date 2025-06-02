-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2025 at 04:57 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projek_puskesmas`
--

-- --------------------------------------------------------

--
-- Table structure for table `catatan_balita`
--

CREATE TABLE `catatan_balita` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `usia` int(11) NOT NULL,
  `berat_badan` int(11) NOT NULL,
  `tinggi_badan` int(11) NOT NULL,
  `catatan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `catatan_balita`
--

INSERT INTO `catatan_balita` (`id`, `nama`, `usia`, `berat_badan`, `tinggi_badan`, `catatan`) VALUES
(8, 'Kamari', 18, 11, 100, 'sudah imunisasi polio'),
(9, 'Ritsuki', 24, 15, 120, 'engga pernah eling'),
(10, 'Rayyanza', 20, 20, 100, 'sudah imunisasi');

-- --------------------------------------------------------

--
-- Table structure for table `catatan_lansia`
--

CREATE TABLE `catatan_lansia` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `usia` int(11) NOT NULL,
  `gula_darah` int(11) NOT NULL,
  `td_diastolik` int(11) NOT NULL,
  `td_sistolik` int(11) NOT NULL,
  `catatan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `catatan_lansia`
--

INSERT INTO `catatan_lansia` (`id`, `nama`, `usia`, `gula_darah`, `td_diastolik`, `td_sistolik`, `catatan`) VALUES
(7, 'Faisal Legowo', 912, 68, 80, 130, 'faisal suka olah raga');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `nama` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `telepon` varchar(100) NOT NULL,
  `role` varchar(100) NOT NULL,
  `gambar` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`nama`, `username`, `password`, `email`, `telepon`, `role`, `gambar`) VALUES
('Jono', '240101', 'karyawan', 'jono@gmail.com', '081234567890', 'karyawan', 'Jono.jpg'),
('admin', 'admin', 'admin', 'admin@gmail.com', '081234567890', 'admin', 'admin.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `catatan_balita`
--
ALTER TABLE `catatan_balita`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `catatan_lansia`
--
ALTER TABLE `catatan_lansia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `catatan_balita`
--
ALTER TABLE `catatan_balita`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `catatan_lansia`
--
ALTER TABLE `catatan_lansia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
