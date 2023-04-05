-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : mer. 05 avr. 2023 à 13:23
-- Version du serveur :  10.3.32-MariaDB
-- Version de PHP : 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `ProjetDevis`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`AdminDevis`@`%` PROCEDURE `getInsertDevis` (IN `article` VARCHAR(30), IN `quantite` INT, IN `unite` INT, IN `PUHT` INT, IN `TxTVA` INT, IN `TTC` INT)  NO SQL
Insert into DEVIS (article, quantite, PUHT, TxTVA, TTC)
VALUES(article, quantite, unite, PUHT, TxTVA, TTC)$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `BIEN`
--

CREATE TABLE `BIEN` (
  `BIE_REF` varchar(128) NOT NULL,
  `CLI_REF` varchar(128) NOT NULL,
  `BIE_DENOMINATION` varchar(128) DEFAULT NULL,
  `BIE_DESCRIPTION` varchar(128) DEFAULT NULL,
  `BIE_ADRUE` varchar(128) DEFAULT NULL,
  `BIE_ADBATIMENT` varchar(128) DEFAULT NULL,
  `BIE_CP` varchar(5) DEFAULT NULL,
  `BIE_VILLE` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `BIEN`
--

INSERT INTO `BIEN` (`BIE_REF`, `CLI_REF`, `BIE_DENOMINATION`, `BIE_DESCRIPTION`, `BIE_ADRUE`, `BIE_ADBATIMENT`, `BIE_CP`, `BIE_VILLE`) VALUES
('001', '1', 'zero', 'Description du bien.', 'rue du paradis', 'batiment 1', '07000', 'paris'),
('002', '1', 'builder', 'Description du bien.', 'rue des anges', 'batiment 3', '07000', 'toulon'),
('003', '1', 'builder2', 'Description du bien.', 'avenue des raisins', 'batiment 1', '07000', 'lyon'),
('004', '1', 'ooooo', 'dsfdfdsfdsf', 'gfhhgfdhgf', 'sdfdsfds', '07000', 'gfhdhhhh'),
('005', '1', 'builder3', 'Description du bien.', 'impasse des peintres', 'batiment 1', '07000', 'lilles'),
('006', '1', 'builder4', 'Description du bien.', 'rue de l\'or', 'résidence A', '07000', 'marseille'),
('007', '1', 'villa', 'Description du bien.', 'chemin de la baie', 'bâtiment 1', '07000', 'marseille'),
('010', '1', 'rezero', 'Description du bien.', 'rue du paradis', 'bâtiment 5', '07000', 'paris'),
('012', '1', 'builder5', 'Description du bien.', 'avenue de l\'écu d\'argent', 'résidence A', '07000', 'toulouse'),
('014', '1', 'builder6', 'Description du bien.', 'rue des pêcheurs', 'bâtiment 2', '07000', 'nice'),
('025', '1', 'hu', 'ki', 'lo', '4', '0600', 'nice'),
('026', '1', 'projetferme', 'Description du bien.', 'rue de la ferme', 'hectare 2', '07000', 'rennes'),
('066', '02', 'kkkk', 'iiyit', 'kkkk', 'kkk', 'kkk', 'kk'),
('099', '1', 'tttr', 'trrrt', 'rte', 'trtr', 'ttr', 'trtr');

-- --------------------------------------------------------

--
-- Structure de la table `CLIENT`
--

CREATE TABLE `CLIENT` (
  `CLI_REF` varchar(128) NOT NULL,
  `CLI_ADRUE` varchar(128) DEFAULT NULL,
  `CLI_ADBATIMENT` varchar(128) DEFAULT NULL,
  `CLI_CP` varchar(5) DEFAULT NULL,
  `CLI_VILLE` varchar(128) DEFAULT NULL,
  `CLI_MAIL` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `CLIENT`
--

INSERT INTO `CLIENT` (`CLI_REF`, `CLI_ADRUE`, `CLI_ADBATIMENT`, `CLI_CP`, `CLI_VILLE`, `CLI_MAIL`) VALUES
('01', 'Avenue des fleurs', 'F', '06400', 'JSP', 'bveyrb@bgrgb.com'),
('02', 'Avenue des Geek', 'Nvidia', '06000', 'Nice', 'test@gmail.com'),
('1', 'rue de nice', '5', '06000', 'Nice', 'dfjxbcfdjx@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `DEVIS`
--

CREATE TABLE `DEVIS` (
  `DEV_NUMERO` int(11) NOT NULL,
  `CLI_REF` varchar(128) NOT NULL,
  `BIE_REF` varchar(128) NOT NULL,
  `DEV_DATE` date DEFAULT NULL,
  `DEV_OBJET` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `DEVIS`
--

INSERT INTO `DEVIS` (`DEV_NUMERO`, `CLI_REF`, `BIE_REF`, `DEV_DATE`, `DEV_OBJET`) VALUES
(1, '01', '001', '2023-01-11', 'objet du devis');

--
-- Déclencheurs `DEVIS`
--
DELIMITER $$
CREATE TRIGGER `id_user` BEFORE INSERT ON `DEVIS` FOR EACH ROW SET NEW.DEV_NUMERO = (SELECT MAX(`DEV_NUMERO`) FROM `DEVIS`) + 1
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `ENTREPRISE`
--

CREATE TABLE `ENTREPRISE` (
  `CLI_REF` varchar(128) NOT NULL,
  `ENT_RAISONSOCIALE` varchar(128) DEFAULT NULL,
  `ENT_NOMCONTACT` varchar(128) DEFAULT NULL,
  `ENT_TELCONTACT` varchar(10) DEFAULT NULL,
  `ENT_MAILCONTACT` varchar(128) DEFAULT NULL,
  `CLI_ADRUE` varchar(128) DEFAULT NULL,
  `CLI_ADBATIMENT` varchar(128) DEFAULT NULL,
  `CLI_CP` varchar(5) DEFAULT NULL,
  `CLI_VILLE` varchar(128) DEFAULT NULL,
  `CLI_MAIL` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `PARTICULIER`
--

CREATE TABLE `PARTICULIER` (
  `CLI_REF` varchar(128) NOT NULL,
  `PAR_CIVILITE` varchar(128) DEFAULT NULL,
  `PAR_NOM` varchar(128) DEFAULT NULL,
  `CLI_ADRUE` varchar(128) DEFAULT NULL,
  `CLI_ADBATIMENT` varchar(128) DEFAULT NULL,
  `CLI_CP` varchar(5) DEFAULT NULL,
  `CLI_VILLE` varchar(128) DEFAULT NULL,
  `CLI_MAIL` varchar(128) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `PARTICULIER`
--

INSERT INTO `PARTICULIER` (`CLI_REF`, `PAR_CIVILITE`, `PAR_NOM`, `CLI_ADRUE`, `CLI_ADBATIMENT`, `CLI_CP`, `CLI_VILLE`, `CLI_MAIL`) VALUES
('01', 'Madame', 'Draperi', '390 chemin des âmes non purgatoires', 'A', '06600', 'Juan les pins', 'Drap@gmail.com');

-- --------------------------------------------------------

--
-- Structure de la table `POSTE`
--

CREATE TABLE `POSTE` (
  `POS_ID` int(11) NOT NULL,
  `POS_LIBELLE` varchar(128) DEFAULT NULL,
  `POS_TOTAL` int(11) DEFAULT NULL,
  `POS_PUHT` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `POSTE`
--

INSERT INTO `POSTE` (`POS_ID`, `POS_LIBELLE`, `POS_TOTAL`, `POS_PUHT`) VALUES
(1, 'P1', 20, 5),
(2, 'P2', 60, 10),
(3, 'P3', 800, 400);

-- --------------------------------------------------------

--
-- Structure de la table `QUANTITE`
--

CREATE TABLE `QUANTITE` (
  `DEV_NUMERO` int(11) NOT NULL,
  `POS_ID` int(11) NOT NULL,
  `QUANTITE` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `BIEN`
--
ALTER TABLE `BIEN`
  ADD PRIMARY KEY (`BIE_REF`),
  ADD KEY `I_FK_BIEN_CLIENT` (`CLI_REF`);

--
-- Index pour la table `CLIENT`
--
ALTER TABLE `CLIENT`
  ADD PRIMARY KEY (`CLI_REF`);

--
-- Index pour la table `DEVIS`
--
ALTER TABLE `DEVIS`
  ADD PRIMARY KEY (`DEV_NUMERO`),
  ADD KEY `I_FK_DEVIS_CLIENT` (`CLI_REF`),
  ADD KEY `I_FK_DEVIS_BIEN` (`BIE_REF`);

--
-- Index pour la table `ENTREPRISE`
--
ALTER TABLE `ENTREPRISE`
  ADD PRIMARY KEY (`CLI_REF`);

--
-- Index pour la table `PARTICULIER`
--
ALTER TABLE `PARTICULIER`
  ADD PRIMARY KEY (`CLI_REF`);

--
-- Index pour la table `POSTE`
--
ALTER TABLE `POSTE`
  ADD PRIMARY KEY (`POS_ID`);

--
-- Index pour la table `QUANTITE`
--
ALTER TABLE `QUANTITE`
  ADD PRIMARY KEY (`DEV_NUMERO`,`POS_ID`),
  ADD KEY `I_FK_QUANTITE_DEVIS` (`DEV_NUMERO`),
  ADD KEY `I_FK_QUANTITE_POSTE` (`POS_ID`);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `BIEN`
--
ALTER TABLE `BIEN`
  ADD CONSTRAINT `FK_BIEN_CLIENT` FOREIGN KEY (`CLI_REF`) REFERENCES `CLIENT` (`CLI_REF`);

--
-- Contraintes pour la table `DEVIS`
--
ALTER TABLE `DEVIS`
  ADD CONSTRAINT `FK_DEVIS_BIEN` FOREIGN KEY (`BIE_REF`) REFERENCES `BIEN` (`BIE_REF`),
  ADD CONSTRAINT `FK_DEVIS_CLIENT` FOREIGN KEY (`CLI_REF`) REFERENCES `CLIENT` (`CLI_REF`);

--
-- Contraintes pour la table `ENTREPRISE`
--
ALTER TABLE `ENTREPRISE`
  ADD CONSTRAINT `FK_ENTREPRISE_CLIENT` FOREIGN KEY (`CLI_REF`) REFERENCES `CLIENT` (`CLI_REF`);

--
-- Contraintes pour la table `PARTICULIER`
--
ALTER TABLE `PARTICULIER`
  ADD CONSTRAINT `FK_PARTICULIER_CLIENT` FOREIGN KEY (`CLI_REF`) REFERENCES `CLIENT` (`CLI_REF`);

--
-- Contraintes pour la table `QUANTITE`
--
ALTER TABLE `QUANTITE`
  ADD CONSTRAINT `FK_QUANTITE_DEVIS` FOREIGN KEY (`DEV_NUMERO`) REFERENCES `DEVIS` (`DEV_NUMERO`),
  ADD CONSTRAINT `FK_QUANTITE_POSTE` FOREIGN KEY (`POS_ID`) REFERENCES `POSTE` (`POS_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
