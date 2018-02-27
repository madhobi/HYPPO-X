/**************************************************************************************************
 Copyright © 2016-2018 Md.Kamruzzaman. All rights reserved.
 The generated code is released under following licenses:
 GNU GENERAL PUBLIC LICENSE, Version 3, 29 June 2007
 --------------------------------------------------------------------------------------------------
 File name: Barcode.java
 Objective: Generate barcode image
 Additional information: NA
 --------------------------------------------------------------------------------------------------
 Contributors                   Date            Task details
 -------------------------    ----------      --------------------
 Md. Kamruzzaman              02/16/2017      Initial version
 **************************************************************************************************/



package barcode;

import edu.stanford.math.plex4.homology.barcodes.BarcodeCollection;
import edu.stanford.math.plex4.homology.chain_basis.Simplex;
import edu.stanford.math.plex4.homology.interfaces.AbstractPersistenceAlgorithm;
import edu.stanford.math.plex4.streams.impl.ExplicitSimplexStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Barcode {

    public void GetStreamForData(ExplicitSimplexStream stream) {
        /************ Start from here *************/
        stream.addVertex(1, 0.000);
        stream.addVertex(2, 0.000);
        stream.addVertex(3, 0.000);
        stream.addVertex(4, 0.000);
        stream.addVertex(5, 0.000);
        stream.addVertex(6, 0.000);
        stream.addVertex(7, 0.000);
        stream.addVertex(8, 0.000);
        stream.addVertex(9, 0.000);
        stream.addVertex(10, 0.000);
        stream.addVertex(11, 0.000);
        stream.addVertex(12, 0.000);
        stream.addVertex(13, 0.000);
        stream.addVertex(14, 0.000);
        stream.addVertex(15, 0.000);
        stream.addVertex(16, 0.000);
        stream.addVertex(17, 0.000);
        stream.addVertex(18, 0.000);
        stream.addVertex(19, 0.000);
        stream.addVertex(20, 0.000);
        stream.addVertex(21, 0.000);
        stream.addVertex(22, 0.000);
        stream.addVertex(23, 0.000);
        stream.addVertex(24, 0.000);
        stream.addVertex(25, 0.000);
        stream.addVertex(26, 0.000);
        stream.addVertex(27, 0.000);
        stream.addVertex(28, 0.000);
        stream.addVertex(29, 0.000);
        stream.addVertex(30, 0.000);
        stream.addVertex(31, 0.000);
        stream.addVertex(32, 0.000);
        stream.addVertex(33, 0.000);
        stream.addVertex(34, 0.000);
        stream.addVertex(35, 0.000);
        stream.addVertex(37, 0.000);
        stream.addVertex(36, 0.000);
        stream.addVertex(38, 0.000);
        stream.addVertex(40, 0.000);
        stream.addVertex(39, 0.000);
        stream.addVertex(41, 0.000);
        stream.addVertex(43, 0.000);
        stream.addVertex(42, 0.000);
        stream.addVertex(45, 0.000);
        stream.addVertex(44, 0.000);
        stream.addVertex(46, 0.000);
        stream.addVertex(47, 0.000);
        stream.addVertex(48, 0.000);
        stream.addVertex(49, 0.000);
        stream.addVertex(50, 0.000);
        stream.addVertex(51, 0.000);
        stream.addVertex(52, 0.000);
        stream.addVertex(54, 0.000);
        stream.addVertex(53, 0.000);
        stream.addVertex(55, 0.000);
        stream.addVertex(56, 0.000);
        stream.addVertex(58, 0.000);
        stream.addVertex(57, 0.000);
        stream.addVertex(59, 0.000);
        stream.addVertex(61, 0.000);
        stream.addVertex(60, 0.000);
        stream.addVertex(62, 0.000);
        stream.addVertex(64, 0.000);
        stream.addVertex(63, 0.000);
        stream.addVertex(65, 0.000);
        stream.addVertex(66, 0.000);
        stream.addVertex(67, 0.000);
        stream.addVertex(68, 0.000);
        stream.addVertex(69, 0.000);
        stream.addVertex(70, 0.000);
        stream.addVertex(71, 0.000);
        stream.addVertex(72, 0.000);
        stream.addVertex(74, 0.000);
        stream.addVertex(73, 0.000);
        stream.addVertex(75, 0.000);
        stream.addVertex(76, 0.000);
        stream.addVertex(77, 0.000);
        stream.addVertex(78, 0.000);
        stream.addVertex(80, 0.000);
        stream.addVertex(79, 0.000);
        stream.addVertex(81, 0.000);
        stream.addVertex(82, 0.000);
        stream.addVertex(84, 0.000);
        stream.addVertex(83, 0.000);
        stream.addVertex(85, 0.000);
        stream.addVertex(86, 0.000);
        stream.addVertex(87, 0.000);
        stream.addVertex(88, 0.000);
        stream.addVertex(89, 0.000);
        stream.addVertex(90, 0.000);
        stream.addVertex(91, 0.000);
        stream.addVertex(92, 0.000);
        stream.addVertex(93, 0.000);
        stream.addVertex(95, 0.000);
        stream.addVertex(94, 0.000);
        stream.addVertex(96, 0.000);
        stream.addVertex(97, 0.000);
        stream.addVertex(98, 0.000);
        stream.addVertex(99, 0.000);
        stream.addVertex(100, 0.000);
        stream.addVertex(101, 0.000);
        stream.addVertex(103, 0.000);
        stream.addVertex(102, 0.000);
        stream.addVertex(104, 0.000);
        stream.addVertex(105, 0.000);
        stream.addVertex(106, 0.000);
        stream.addVertex(107, 0.000);
        stream.addElement(new int[]{35,37},  2.500);
        stream.addElement(new int[]{35,36},  2.500);
        stream.addElement(new int[]{40,74},  2.500);
        stream.addElement(new int[]{51,53},  2.500);
        stream.addElement(new int[]{56,94},  2.500);
        stream.addElement(new int[]{56,57},  2.500);
        stream.addElement(new int[]{74,76},  2.500);
        stream.addElement(new int[]{73,75},  2.500);
        stream.addElement(new int[]{88,90},  2.500);
        stream.addElement(new int[]{95,97},  2.500);
        stream.addElement(new int[]{8,9},  5.000);
        stream.addElement(new int[]{13,14},  5.000);
        stream.addElement(new int[]{7,14},  5.000);
        stream.addElement(new int[]{15,16},  5.000);
        stream.addElement(new int[]{18,35},  5.000);
        stream.addElement(new int[]{22,52},  5.000);
        stream.addElement(new int[]{44,46},  5.000);
        stream.addElement(new int[]{60,62},  5.000);
        stream.addElement(new int[]{82,84},  5.000);
        stream.addElement(new int[]{104,105},  5.000);
        stream.addElement(new int[]{4,8},  7.500);
        stream.addElement(new int[]{10,17},  7.500);
        stream.addElement(new int[]{14,32},  7.500);
        stream.addElement(new int[]{33,34},  7.500);
        stream.addElement(new int[]{42,44},  7.500);
        stream.addElement(new int[]{59,61},  7.500);
        stream.addElement(new int[]{78,80},  7.500);
        stream.addElement(new int[]{83,86},  7.500);
        stream.addElement(new int[]{59,99},  7.500);
        stream.addElement(new int[]{98,100},  7.500);
        stream.addElement(new int[]{65,104},  7.500);
        stream.addElement(new int[]{1,2},  10.00);
        stream.addElement(new int[]{38,40},  10.00);
        stream.addElement(new int[]{66,68},  10.00);
        stream.addElement(new int[]{71,72},  10.00);
        stream.addElement(new int[]{29,30},  12.50);
        stream.addElement(new int[]{41,75},  12.50);
        stream.addElement(new int[]{41,42},  12.50);
        stream.addElement(new int[]{43,78},  12.50);
        stream.addElement(new int[]{45,80},  12.50);
        stream.addElement(new int[]{45,81},  12.50);
        stream.addElement(new int[]{80,81},  12.50);
        stream.addElement(new int[]{45,80,81},  12.50);
        stream.addElement(new int[]{49,86},  12.50);
        stream.addElement(new int[]{51,87},  12.50);
        stream.addElement(new int[]{53,87},  12.50);
        stream.addElement(new int[]{51,53,87},  12.50);
        stream.addElement(new int[]{62,102},  12.50);
        stream.addElement(new int[]{69,107},  12.50);
        stream.addElement(new int[]{68,69},  12.50);
        stream.addElement(new int[]{76,78},  12.50);
        stream.addElement(new int[]{86,87},  12.50);
        stream.addElement(new int[]{7,8},  15.00);
        stream.addElement(new int[]{6,7},  15.00);
        stream.addElement(new int[]{6,13},  15.00);
        stream.addElement(new int[]{7,13},  15.00);
        stream.addElement(new int[]{6,7,13},  15.00);
        stream.addElement(new int[]{6,14},  15.00);
        stream.addElement(new int[]{6,7,14},  15.00);
        stream.addElement(new int[]{6,13,14},  15.00);
        stream.addElement(new int[]{7,13,14},  15.00);
        stream.addElement(new int[]{6,7,13,14},  15.00);
        stream.addElement(new int[]{16,33},  15.00);
        stream.addElement(new int[]{34,35},  15.00);
        stream.addElement(new int[]{46,47},  15.00);
        stream.addElement(new int[]{58,59},  15.00);
        stream.addElement(new int[]{62,65},  15.00);
        stream.addElement(new int[]{28,68},  15.00);
        stream.addElement(new int[]{81,82},  15.00);
        stream.addElement(new int[]{96,98},  15.00);
        stream.addElement(new int[]{3,7},  17.50);
        stream.addElement(new int[]{3,4},  17.50);
        stream.addElement(new int[]{4,7},  17.50);
        stream.addElement(new int[]{3,4,7},  17.50);
        stream.addElement(new int[]{3,8},  17.50);
        stream.addElement(new int[]{3,4,8},  17.50);
        stream.addElement(new int[]{3,7,8},  17.50);
        stream.addElement(new int[]{4,7,8},  17.50);
        stream.addElement(new int[]{3,4,7,8},  17.50);
        stream.addElement(new int[]{14,15},  17.50);
        stream.addElement(new int[]{17,18},  17.50);
        stream.addElement(new int[]{65,102},  17.50);
        stream.addElement(new int[]{62,65,102},  17.50);
        stream.addElement(new int[]{62,104},  17.50);
        stream.addElement(new int[]{62,65,104},  17.50);
        stream.addElement(new int[]{102,104},  17.50);
        stream.addElement(new int[]{62,102,104},  17.50);
        stream.addElement(new int[]{65,102,104},  17.50);
        stream.addElement(new int[]{62,65,102,104},  17.50);
        stream.addElement(new int[]{34,70},  17.50);
        stream.addElement(new int[]{35,70},  17.50);
        stream.addElement(new int[]{34,35,70},  17.50);
        stream.addElement(new int[]{36,71},  17.50);
        stream.addElement(new int[]{36,72},  17.50);
        stream.addElement(new int[]{36,71,72},  17.50);
        stream.addElement(new int[]{48,50},  17.50);
        stream.addElement(new int[]{48,85},  17.50);
        stream.addElement(new int[]{50,85},  17.50);
        stream.addElement(new int[]{48,50,85},  17.50);
        stream.addElement(new int[]{57,96},  17.50);
        stream.addElement(new int[]{57,98},  17.50);
        stream.addElement(new int[]{57,96,98},  17.50);
        stream.addElement(new int[]{58,99},  17.50);
        stream.addElement(new int[]{58,59,99},  17.50);
        stream.addElement(new int[]{68,107},  17.50);
        stream.addElement(new int[]{68,69,107},  17.50);
        stream.addElement(new int[]{1,5},  20.00);
        stream.addElement(new int[]{49,51},  20.00);
        stream.addElement(new int[]{51,86},  20.00);
        stream.addElement(new int[]{49,51,86},  20.00);
        stream.addElement(new int[]{49,87},  20.00);
        stream.addElement(new int[]{49,51,87},  20.00);
        stream.addElement(new int[]{49,86,87},  20.00);
        stream.addElement(new int[]{51,86,87},  20.00);
        stream.addElement(new int[]{49,51,86,87},  20.00);
        stream.addElement(new int[]{53,55},  20.00);
        stream.addElement(new int[]{28,69},  20.00);
        stream.addElement(new int[]{28,68,69},  20.00);
        stream.addElement(new int[]{72,73},  20.00);
        stream.addElement(new int[]{75,77},  20.00);
        stream.addElement(new int[]{43,76},  20.00);
        stream.addElement(new int[]{43,76,78},  20.00);
        stream.addElement(new int[]{5,12},  22.50);
        stream.addElement(new int[]{9,16},  22.50);
        stream.addElement(new int[]{21,50},  22.50);
        stream.addElement(new int[]{21,52},  22.50);
        stream.addElement(new int[]{50,52},  22.50);
        stream.addElement(new int[]{21,50,52},  22.50);
        stream.addElement(new int[]{23,53},  22.50);
        stream.addElement(new int[]{23,55},  22.50);
        stream.addElement(new int[]{23,53,55},  22.50);
        stream.addElement(new int[]{24,59},  22.50);
        stream.addElement(new int[]{13,30},  22.50);
        stream.addElement(new int[]{13,31},  22.50);
        stream.addElement(new int[]{30,31},  22.50);
        stream.addElement(new int[]{13,30,31},  22.50);
        stream.addElement(new int[]{37,38},  22.50);
        stream.addElement(new int[]{39,72},  22.50);
        stream.addElement(new int[]{39,73},  22.50);
        stream.addElement(new int[]{39,72,73},  22.50);
        stream.addElement(new int[]{55,95},  22.50);
        stream.addElement(new int[]{61,101},  22.50);
        stream.addElement(new int[]{66,105},  22.50);
        stream.addElement(new int[]{15,33},  25.00);
        stream.addElement(new int[]{15,16,33},  25.00);
        stream.addElement(new int[]{24,61},  25.00);
        stream.addElement(new int[]{24,59,61},  25.00);
        stream.addElement(new int[]{12,29},  25.00);
        stream.addElement(new int[]{12,30},  25.00);
        stream.addElement(new int[]{12,29,30},  25.00);
        stream.addElement(new int[]{16,17},  25.00);
        stream.addElement(new int[]{17,33},  25.00);
        stream.addElement(new int[]{16,17,33},  25.00);
        stream.addElement(new int[]{16,34},  25.00);
        stream.addElement(new int[]{17,34},  25.00);
        stream.addElement(new int[]{16,17,34},  25.00);
        stream.addElement(new int[]{16,33,34},  25.00);
        stream.addElement(new int[]{17,33,34},  25.00);
        stream.addElement(new int[]{16,17,33,34},  25.00);
        stream.addElement(new int[]{19,37},  25.00);
        stream.addElement(new int[]{19,38},  25.00);
        stream.addElement(new int[]{19,37,38},  25.00);
        stream.addElement(new int[]{43,80},  25.00);
        stream.addElement(new int[]{43,78,80},  25.00);
        stream.addElement(new int[]{64,101},  25.00);
        stream.addElement(new int[]{60,100},  25.00);
        stream.addElement(new int[]{62,100},  25.00);
        stream.addElement(new int[]{60,62,100},  25.00);
        stream.addElement(new int[]{60,102},  25.00);
        stream.addElement(new int[]{60,62,102},  25.00);
        stream.addElement(new int[]{100,102},  25.00);
        stream.addElement(new int[]{60,100,102},  25.00);
        stream.addElement(new int[]{62,100,102},  25.00);
        stream.addElement(new int[]{60,62,100,102},  25.00);
        stream.addElement(new int[]{28,66},  25.00);
        stream.addElement(new int[]{28,66,68},  25.00);
        stream.addElement(new int[]{77,79},  25.00);
        stream.addElement(new int[]{14,31},  27.50);
        stream.addElement(new int[]{13,14,31},  27.50);
        stream.addElement(new int[]{13,32},  27.50);
        stream.addElement(new int[]{13,14,32},  27.50);
        stream.addElement(new int[]{31,32},  27.50);
        stream.addElement(new int[]{13,31,32},  27.50);
        stream.addElement(new int[]{14,31,32},  27.50);
        stream.addElement(new int[]{13,14,31,32},  27.50);
        stream.addElement(new int[]{44,79},  27.50);
        stream.addElement(new int[]{46,79},  27.50);
        stream.addElement(new int[]{44,46,79},  27.50);
        stream.addElement(new int[]{20,47},  27.50);
        stream.addElement(new int[]{49,83},  27.50);
        stream.addElement(new int[]{49,83,86},  27.50);
        stream.addElement(new int[]{52,88},  27.50);
        stream.addElement(new int[]{18,19},  30.00);
        stream.addElement(new int[]{19,35},  30.00);
        stream.addElement(new int[]{18,19,35},  30.00);
        stream.addElement(new int[]{18,36},  30.00);
        stream.addElement(new int[]{19,36},  30.00);
        stream.addElement(new int[]{18,19,36},  30.00);
        stream.addElement(new int[]{18,35,36},  30.00);
        stream.addElement(new int[]{19,35,36},  30.00);
        stream.addElement(new int[]{18,19,35,36},  30.00);
        stream.addElement(new int[]{21,49},  30.00);
        stream.addElement(new int[]{21,51},  30.00);
        stream.addElement(new int[]{21,49,51},  30.00);
        stream.addElement(new int[]{22,51},  30.00);
        stream.addElement(new int[]{23,52},  30.00);
        stream.addElement(new int[]{23,54},  30.00);
        stream.addElement(new int[]{52,54},  30.00);
        stream.addElement(new int[]{23,52,54},  30.00);
        stream.addElement(new int[]{24,58},  30.00);
        stream.addElement(new int[]{24,60},  30.00);
        stream.addElement(new int[]{58,60},  30.00);
        stream.addElement(new int[]{24,58,60},  30.00);
        stream.addElement(new int[]{34,69},  30.00);
        stream.addElement(new int[]{35,69},  30.00);
        stream.addElement(new int[]{34,35,69},  30.00);
        stream.addElement(new int[]{37,39},  30.00);
        stream.addElement(new int[]{36,37},  30.00);
        stream.addElement(new int[]{19,36,37},  30.00);
        stream.addElement(new int[]{38,71},  30.00);
        stream.addElement(new int[]{38,72},  30.00);
        stream.addElement(new int[]{38,71,72},  30.00);
        stream.addElement(new int[]{40,41},  30.00);
        stream.addElement(new int[]{42,77},  30.00);
        stream.addElement(new int[]{42,79},  30.00);
        stream.addElement(new int[]{42,77,79},  30.00);
        stream.addElement(new int[]{44,80},  30.00);
        stream.addElement(new int[]{79,80},  30.00);
        stream.addElement(new int[]{44,79,80},  30.00);
        stream.addElement(new int[]{41,43},  30.00);
        stream.addElement(new int[]{43,45},  30.00);
        stream.addElement(new int[]{45,46},  30.00);
        stream.addElement(new int[]{45,78},  30.00);
        stream.addElement(new int[]{43,45,78},  30.00);
        stream.addElement(new int[]{20,46},  30.00);
        stream.addElement(new int[]{48,86},  30.00);
        stream.addElement(new int[]{50,86},  30.00);
        stream.addElement(new int[]{48,50,86},  30.00);
        stream.addElement(new int[]{85,86},  30.00);
        stream.addElement(new int[]{48,85,86},  30.00);
        stream.addElement(new int[]{50,85,86},  30.00);
        stream.addElement(new int[]{48,50,85,86},  30.00);
        stream.addElement(new int[]{47,49},  30.00);
        stream.addElement(new int[]{47,84},  30.00);
        stream.addElement(new int[]{49,84},  30.00);
        stream.addElement(new int[]{47,49,84},  30.00);
        stream.addElement(new int[]{52,86},  30.00);
        stream.addElement(new int[]{50,52,86},  30.00);
        stream.addElement(new int[]{54,90},  30.00);
        stream.addElement(new int[]{54,93},  30.00);
        stream.addElement(new int[]{90,93},  30.00);
        stream.addElement(new int[]{54,90,93},  30.00);
        stream.addElement(new int[]{52,90},  30.00);
        stream.addElement(new int[]{52,54,90},  30.00);
        stream.addElement(new int[]{55,92},  30.00);
        stream.addElement(new int[]{55,56},  30.00);
        stream.addElement(new int[]{57,58},  30.00);
        stream.addElement(new int[]{57,97},  30.00);
        stream.addElement(new int[]{58,97},  30.00);
        stream.addElement(new int[]{57,58,97},  30.00);
        stream.addElement(new int[]{60,99},  30.00);
        stream.addElement(new int[]{61,64},  30.00);
        stream.addElement(new int[]{61,100},  30.00);
        stream.addElement(new int[]{64,100},  30.00);
        stream.addElement(new int[]{61,64,100},  30.00);
        stream.addElement(new int[]{61,102},  30.00);
        stream.addElement(new int[]{64,102},  30.00);
        stream.addElement(new int[]{61,64,102},  30.00);
        stream.addElement(new int[]{61,100,102},  30.00);
        stream.addElement(new int[]{64,100,102},  30.00);
        stream.addElement(new int[]{61,64,100,102},  30.00);
        stream.addElement(new int[]{63,99},  30.00);
        stream.addElement(new int[]{59,98},  30.00);
        stream.addElement(new int[]{61,98},  30.00);
        stream.addElement(new int[]{59,61,98},  30.00);
        stream.addElement(new int[]{59,100},  30.00);
        stream.addElement(new int[]{59,61,100},  30.00);
        stream.addElement(new int[]{59,98,100},  30.00);
        stream.addElement(new int[]{61,98,100},  30.00);
        stream.addElement(new int[]{59,61,98,100},  30.00);
        stream.addElement(new int[]{65,67},  30.00);
        stream.addElement(new int[]{67,104},  30.00);
        stream.addElement(new int[]{65,67,104},  30.00);
        stream.addElement(new int[]{67,68},  30.00);
        stream.addElement(new int[]{67,105},  30.00);
        stream.addElement(new int[]{68,105},  30.00);
        stream.addElement(new int[]{67,68,105},  30.00);
        stream.addElement(new int[]{28,67},  30.00);
        stream.addElement(new int[]{28,65},  30.00);
        stream.addElement(new int[]{28,65,67},  30.00);
        stream.addElement(new int[]{28,67,68},  30.00);
        stream.addElement(new int[]{36,70},  30.00);
        stream.addElement(new int[]{70,71},  30.00);
        stream.addElement(new int[]{36,70,71},  30.00);
        stream.addElement(new int[]{72,74},  30.00);
        stream.addElement(new int[]{42,75},  30.00);
        stream.addElement(new int[]{42,75,77},  30.00);
        stream.addElement(new int[]{81,83},  30.00);
        stream.addElement(new int[]{48,82},  30.00);
        stream.addElement(new int[]{82,85},  30.00);
        stream.addElement(new int[]{48,82,85},  30.00);
        stream.addElement(new int[]{51,88},  30.00);
        stream.addElement(new int[]{87,88},  30.00);
        stream.addElement(new int[]{51,87,88},  30.00);
        stream.addElement(new int[]{93,95},  30.00);
        stream.addElement(new int[]{56,96},  30.00);
        stream.addElement(new int[]{94,96},  30.00);
        stream.addElement(new int[]{56,94,96},  30.00);
        stream.addElement(new int[]{102,103},  30.00);
        stream.addElement(new int[]{65,103},  30.00);
        stream.addElement(new int[]{15,32},  32.50);
        stream.addElement(new int[]{14,15,32},  32.50);
        stream.addElement(new int[]{39,75},  32.50);
        stream.addElement(new int[]{39,73,75},  32.50);
        stream.addElement(new int[]{4,9},  35.00);
        stream.addElement(new int[]{4,8,9},  35.00);
        stream.addElement(new int[]{11,20},  35.00);
        stream.addElement(new int[]{8,15},  35.00);
        stream.addElement(new int[]{9,15},  35.00);
        stream.addElement(new int[]{8,9,15},  35.00);
        stream.addElement(new int[]{8,16},  35.00);
        stream.addElement(new int[]{8,9,16},  35.00);
        stream.addElement(new int[]{8,15,16},  35.00);
        stream.addElement(new int[]{9,15,16},  35.00);
        stream.addElement(new int[]{8,9,15,16},  35.00);
        stream.addElement(new int[]{18,34},  35.00);
        stream.addElement(new int[]{17,18,34},  35.00);
        stream.addElement(new int[]{17,35},  35.00);
        stream.addElement(new int[]{17,18,35},  35.00);
        stream.addElement(new int[]{17,34,35},  35.00);
        stream.addElement(new int[]{18,34,35},  35.00);
        stream.addElement(new int[]{17,18,34,35},  35.00);
        stream.addElement(new int[]{64,65},  35.00);
        stream.addElement(new int[]{64,65,102},  35.00);
        stream.addElement(new int[]{64,103},  35.00);
        stream.addElement(new int[]{64,65,103},  35.00);
        stream.addElement(new int[]{64,102,103},  35.00);
        stream.addElement(new int[]{65,102,103},  35.00);
        stream.addElement(new int[]{64,65,102,103},  35.00);
        stream.addElement(new int[]{41,76},  37.50);
        stream.addElement(new int[]{41,43,76},  37.50);
        stream.addElement(new int[]{41,78},  37.50);
        stream.addElement(new int[]{41,43,78},  37.50);
        stream.addElement(new int[]{41,76,78},  37.50);
        stream.addElement(new int[]{41,43,76,78},  37.50);
        stream.addElement(new int[]{58,60,99},  37.50);
        stream.addElement(new int[]{60,63},  37.50);
        stream.addElement(new int[]{60,63,99},  37.50);
        stream.addElement(new int[]{33,69},  40.00);
        stream.addElement(new int[]{33,34,69},  40.00);
        stream.addElement(new int[]{37,73},  40.00);
        stream.addElement(new int[]{37,39,73},  40.00);
        stream.addElement(new int[]{41,74},  40.00);
        stream.addElement(new int[]{40,41,74},  40.00);
        stream.addElement(new int[]{40,76},  40.00);
        stream.addElement(new int[]{40,41,76},  40.00);
        stream.addElement(new int[]{40,74,76},  40.00);
        stream.addElement(new int[]{41,74,76},  40.00);
        stream.addElement(new int[]{40,41,74,76},  40.00);
        stream.addElement(new int[]{47,81},  40.00);
        stream.addElement(new int[]{47,83},  40.00);
        stream.addElement(new int[]{47,81,83},  40.00);
        stream.addElement(new int[]{48,84},  40.00);
        stream.addElement(new int[]{50,84},  40.00);
        stream.addElement(new int[]{48,50,84},  40.00);
        stream.addElement(new int[]{84,85},  40.00);
        stream.addElement(new int[]{48,84,85},  40.00);
        stream.addElement(new int[]{50,84,85},  40.00);
        stream.addElement(new int[]{48,50,84,85},  40.00);
        stream.addElement(new int[]{52,85},  40.00);
        stream.addElement(new int[]{50,52,85},  40.00);
        stream.addElement(new int[]{52,89},  40.00);
        stream.addElement(new int[]{54,89},  40.00);
        stream.addElement(new int[]{52,54,89},  40.00);
        stream.addElement(new int[]{54,92},  40.00);
        stream.addElement(new int[]{89,92},  40.00);
        stream.addElement(new int[]{54,89,92},  40.00);
        stream.addElement(new int[]{55,91},  40.00);
        stream.addElement(new int[]{56,91},  40.00);
        stream.addElement(new int[]{55,56,91},  40.00);
        stream.addElement(new int[]{55,93},  40.00);
        stream.addElement(new int[]{56,93},  40.00);
        stream.addElement(new int[]{55,56,93},  40.00);
        stream.addElement(new int[]{91,93},  40.00);
        stream.addElement(new int[]{55,91,93},  40.00);
        stream.addElement(new int[]{56,91,93},  40.00);
        stream.addElement(new int[]{55,56,91,93},  40.00);
        stream.addElement(new int[]{58,96},  40.00);
        stream.addElement(new int[]{57,58,96},  40.00);
        stream.addElement(new int[]{60,96},  40.00);
        stream.addElement(new int[]{58,60,96},  40.00);
        stream.addElement(new int[]{58,98},  40.00);
        stream.addElement(new int[]{60,98},  40.00);
        stream.addElement(new int[]{58,60,98},  40.00);
        stream.addElement(new int[]{58,96,98},  40.00);
        stream.addElement(new int[]{60,96,98},  40.00);
        stream.addElement(new int[]{58,60,96,98},  40.00);
        stream.addElement(new int[]{61,99},  40.00);
        stream.addElement(new int[]{64,99},  40.00);
        stream.addElement(new int[]{61,64,99},  40.00);
        stream.addElement(new int[]{61,64,101},  40.00);
        stream.addElement(new int[]{99,101},  40.00);
        stream.addElement(new int[]{61,99,101},  40.00);
        stream.addElement(new int[]{64,99,101},  40.00);
        stream.addElement(new int[]{61,64,99,101},  40.00);
        stream.addElement(new int[]{63,98},  40.00);
        stream.addElement(new int[]{60,63,98},  40.00);
        stream.addElement(new int[]{59,97},  40.00);
        stream.addElement(new int[]{61,97},  40.00);
        stream.addElement(new int[]{59,61,97},  40.00);
        stream.addElement(new int[]{59,61,99},  40.00);
        stream.addElement(new int[]{97,99},  40.00);
        stream.addElement(new int[]{59,97,99},  40.00);
        stream.addElement(new int[]{61,97,99},  40.00);
        stream.addElement(new int[]{59,61,97,99},  40.00);
        stream.addElement(new int[]{67,103},  40.00);
        stream.addElement(new int[]{65,67,103},  40.00);
        stream.addElement(new int[]{68,104},  40.00);
        stream.addElement(new int[]{67,68,104},  40.00);
        stream.addElement(new int[]{48,82,84},  40.00);
        stream.addElement(new int[]{92,94},  40.00);
        stream.addElement(new int[]{56,95},  40.00);
        stream.addElement(new int[]{56,93,95},  40.00);
        stream.addElement(new int[]{101,102},  40.00);
        stream.addElement(new int[]{67,102},  40.00);
        stream.addElement(new int[]{65,67,102},  40.00);
        stream.addElement(new int[]{65,101},  40.00);
        stream.addElement(new int[]{64,65,101},  40.00);
        stream.addElement(new int[]{64,101,102},  40.00);
        stream.addElement(new int[]{65,101,102},  40.00);
        stream.addElement(new int[]{64,65,101,102},  40.00);
        stream.addElement(new int[]{22,49},  42.50);
        stream.addElement(new int[]{22,49,51},  42.50);
        stream.addElement(new int[]{8,14},  45.00);
        stream.addElement(new int[]{7,8,14},  45.00);
        stream.addElement(new int[]{7,15},  45.00);
        stream.addElement(new int[]{7,8,15},  45.00);
        stream.addElement(new int[]{7,14,15},  45.00);
        stream.addElement(new int[]{8,14,15},  45.00);
        stream.addElement(new int[]{7,8,14,15},  45.00);
        stream.addElement(new int[]{21,22},  45.00);
        stream.addElement(new int[]{21,22,49},  45.00);
        stream.addElement(new int[]{21,22,51},  45.00);
        stream.addElement(new int[]{21,22,49,51},  45.00);
        stream.addElement(new int[]{25,66},  45.00);
        stream.addElement(new int[]{40,72},  45.00);
        stream.addElement(new int[]{38,40,72},  45.00);
        stream.addElement(new int[]{38,74},  45.00);
        stream.addElement(new int[]{38,40,74},  45.00);
        stream.addElement(new int[]{38,72,74},  45.00);
        stream.addElement(new int[]{40,72,74},  45.00);
        stream.addElement(new int[]{38,40,72,74},  45.00);
        stream.addElement(new int[]{57,92},  45.00);
        stream.addElement(new int[]{57,94},  45.00);
        stream.addElement(new int[]{57,92,94},  45.00);
        stream.addElement(new int[]{10,18},  47.50);
        stream.addElement(new int[]{10,17,18},  47.50);
        /************ End here *************/

    }

    public static void main(String[] args) {
        Barcode barcode_ = new Barcode();
        int dimension = 4; // The maximum dimension

        ExplicitSimplexStream stream = edu.stanford.math.plex4.api.Plex4.createExplicitSimplexStream();

        barcode_.GetStreamForData(stream);
        stream.finalizeStream();

        int slices = stream.getSize();
        System.out.println("Total simplices=" + slices);

        AbstractPersistenceAlgorithm<Simplex> persistent
                = edu.stanford.math.plex4.api.Plex4.getDefaultSimplicialAlgorithm(dimension);
        BarcodeCollection<Double> intervals_index = persistent.computeIntervals(stream);

        try {
            edu.stanford.math.plex4.api.Plex4.createBarcodePlot(intervals_index, "Barcode-(Filter:DAP,Temperature)", 50);
        } catch (IOException ex) {
            Logger.getLogger(Barcode.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
