package baseball;

public class CreatePlayer {

	public static Player[] CreatePlayers() {
		Player p1 = new Player("Chase Utley");	
		p1.ppos("SB");
		p1.pG(1351);
		p1.pPA(5796);
		p1.pAB(5023);
		p1.pR(869);
		p1.pH(1447);
		p1.pdoubles(309);
		p1.ptriples(42);
		p1.pHR(220);
		p1.pRBI(823);
		p1.pSB(129);
		p1.pCS(17);
		p1.pBB(560);
		p1.pSO(852);
		p1.pHBP(157);
		p1.setStats();
		//p1.printPlayer();
		
		Player p2 = new Player("Babe Ruth");
		p2.ppos("RF");
		p2.pG(2503);
		p2.pPA(10622);
		p2.pAB(8399);
		p2.pR(2174);
		p2.pH(2873);
		p2.pdoubles(506);
		p2.ptriples(136);
		p2.pHR(714);
		p2.pRBI(2214);
		p2.pSB(123);
		p2.pCS(117);
		p2.pBB(2062);
		p2.pSO(1330);
		p2.pHBP(43);
		p2.setStats();
		
		Player p3 = new Player("Ted Williams");	
		p3.ppos("LF");
		p3.pG(2292);
		p3.pPA(9788);
		p3.pAB(7706);
		p3.pR(1798);
		p3.pH(2654);
		p3.pdoubles(525);
		p3.ptriples(71);
		p3.pHR(521);
		p3.pRBI(1839);
		p3.pSB(24);
		p3.pCS(17);
		p3.pBB(2021);
		p3.pSO(709);
		p3.pHBP(39);
		p3.setStats();
		//p3.printPlayer();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p4 = new Player("Rickey Henderson");
		p4.ppos("LF");
		p4.pG(3081);
		p4.pPA(13346);
		p4.pAB(10961);
		p4.pR(2295);
		p4.pH(3055);
		p4.pdoubles(510);
		p4.ptriples(66);
		p4.pHR(297);
		p4.pRBI(1115);
		p4.pSB(1406);
		p4.pCS(335);
		p4.pBB(2190);
		p4.pSO(1694);
		p4.pHBP(98);
		p4.setStats();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p5 = new Player("Chipper Jones");
		p5.ppos("TB");
		p5.pG(2499);
		p5.pPA(10614);
		p5.pAB(8984);
		p5.pR(1619);
		p5.pH(2726);
		p5.pdoubles(549);
		p5.ptriples(38);
		p5.pHR(468);
		p5.pRBI(1623);
		p5.pSB(150);
		p5.pCS(46);
		p5.pBB(1512);
		p5.pSO(1409);
		p5.pHBP(253);
		p5.setStats();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p6 = new Player("John Olerud");
		p6.ppos("FB");
		p6.pG(2234);
		p6.pPA(9063);
		p6.pAB(7592);
		p6.pR(1139);
		p6.pH(2239);
		p6.pdoubles(500);
		p6.ptriples(13);
		p6.pHR(255);
		p6.pRBI(1230);
		p6.pSB(11);
		p6.pCS(14);
		p6.pBB(1275);
		p6.pSO(1016);
		p6.pHBP(88);
		p6.setStats();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p7 = new Player("Ozzie Smith");
		p7.ppos("SS");
		p7.pG(2573);
		p7.pPA(10778);
		p7.pAB(9396);
		p7.pR(1257);
		p7.pH(2460);
		p7.pdoubles(402);
		p7.ptriples(69);
		p7.pHR(28);
		p7.pRBI(793);
		p7.pSB(580);
		p7.pCS(148);
		p7.pBB(1072);
		p7.pSO(589);
		p7.pHBP(33);
		p7.setStats();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p8 = new Player("Mike Piazza");
		p8.ppos("C");
		p8.pG(1912);
		p8.pPA(7745);
		p8.pAB(6911);
		p8.pR(1048);
		p8.pH(2127);
		p8.pdoubles(344);
		p8.ptriples(8);
		p8.pHR(427);
		p8.pRBI(1335);
		p8.pSB(17);
		p8.pCS(20);
		p8.pBB(759);
		p8.pSO(1113);
		p8.pHBP(30);
		p8.setStats();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p9 = new Player("Don Mattingly");
		p9.ppos("DH");
		p9.pG(1785);
		p9.pPA(7722);
		p9.pAB(7003);
		p9.pR(1007);
		p9.pH(2153);
		p9.pdoubles(442);
		p9.ptriples(20);
		p9.pHR(222);
		p9.pRBI(1099);
		p9.pSB(14);
		p9.pCS(9);
		p9.pBB(588);
		p9.pSO(444);
		p9.pHBP(21);
		p9.setStats();

		
		Player p10 = new Player("Jose Reyes");
		p10.ppos("SS");
		p10.pG(1321);
		p10.pPA(6058);
		p10.pAB(5551);
		p10.pR(890);
		p10.pH(1610);
		p10.pdoubles(284);
		p10.ptriples(111);
		p10.pHR(104);
		p10.pRBI(525);
		p10.pSB(427);
		p10.pCS(109);
		p10.pBB(438);
		p10.pSO(622);
		p10.pHBP(8);
		p10.setStats();
		//p10.printPlayer();
		
		Player p11 = new Player("Jose Bautista");
		p11.ppos("RF");
		p11.pG(149);
		p11.pPA(655);
		p11.pAB(513);
		p11.pR(105);
		p11.pH(155);
		p11.pdoubles(24);
		p11.ptriples(2);
		p11.pHR(43);
		p11.pRBI(103);
		p11.pSB(9);
		p11.pCS(5);
		p11.pBB(132);
		p11.pSO(111);
		p11.pHBP(6);
		p11.setStats();
		//p11.printPlayer();
		
		Player p12 = new Player("Shannon Stewart");
		p12.ppos("LF");
		p12.pG(1386);
		p12.pPA(6205);
		p12.pAB(5574);
		p12.pR(853);
		p12.pH(1653);
		p12.pdoubles(315);
		p12.ptriples(41);
		p12.pHR(115);
		p12.pRBI(580);
		p12.pSB(196);
		p12.pCS(71);
		p12.pBB(504);
		p12.pSO(684);
		p12.pHBP(74);
		p12.setStats();
		//p12.printPlayer();
		
		Player p13 = new Player("Carlos Delgado");
		p13.ppos("1B");
		p13.pG(2035);
		p13.pPA(8657);
		p13.pAB(7283);
		p13.pR(1241);
		p13.pH(2038);
		p13.pdoubles(483);
		p13.ptriples(18);
		p13.pHR(473);
		p13.pRBI(1512);
		p13.pSB(14);
		p13.pCS(8);
		p13.pBB(1109);
		p13.pSO(1745);
		p13.pHBP(172);
		p13.setStats();
		//p13.printPlayer();
			 	 	 	 	 	 	 	 	 	 	 	
		Player p14 = new Player("Orlando Hudson");
		p14.ppos("2B");
		p14.pG(1345);
		p14.pPA(5413);
		p14.pAB(4825);
		p14.pR(648);
		p14.pH(1319);
		p14.pdoubles(256);
		p14.ptriples(66);
		p14.pHR(93);
		p14.pRBI(542);
		p14.pSB(85);
		p14.pCS(28);
		p14.pBB(483);
		p14.pSO(825);
		p14.pHBP(30);
		p14.setStats();
		//p14.printPlayer();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p15 = new Player("Eric Hinske");
		p15.ppos("3B");
		p15.pG(1387);
		p15.pPA(4310);
		p15.pAB(3797);
		p15.pR(549);
		p15.pH(947);
		p15.pdoubles(240);
		p15.ptriples(18);
		p15.pHR(137);
		p15.pRBI(522);
		p15.pSB(61);
		p15.pCS(21);
		p15.pBB(452);
		p15.pSO(949);
		p15.pHBP(30);
		p15.setStats();
		//p15.printPlayer();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p16 = new Player("Vernon Wells");
		p16.ppos("CF");
		p16.pG(1731);
		p16.pPA(7212);
		p16.pAB(6642);
		p16.pR(930);
		p16.pH(1794);
		p16.pdoubles(379);
		p16.ptriples(34);
		p16.pHR(270);
		p16.pRBI(958);
		p16.pSB(109);
		p16.pCS(37);
		p16.pBB(472);
		p16.pSO(956);
		p16.pHBP(31);
		p16.setStats();
		//p16.printPlayer();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p17 = new Player("Darrin Fletcher");
		p17.ppos("C");
		p17.pG(1245);
		p17.pPA(4271);
		p17.pAB(3902);
		p17.pR(377);
		p17.pH(1048);
		p17.pdoubles(214);
		p17.ptriples(8);
		p17.pHR(124);
		p17.pRBI(583);
		p17.pSB(2);
		p17.pCS(6);
		p17.pBB(255);
		p17.pSO(399);
		p17.pHBP(49);
		p17.setStats();
		//p17.printPlayer();
		 	 	 	 	 	 	 	 	 	 	 	 	
		Player p18 = new Player("Raul Modesi");
		p18.ppos("DH");
		p18.pG(1525);
		p18.pPA(6369);
		p18.pAB(5814);
		p18.pR(909);
		p18.pH(1589);
		p18.pdoubles(319);
		p18.ptriples(49);
		p18.pHR(271);
		p18.pRBI(860);
		p18.pSB(229);
		p18.pCS(92);
		p18.pBB(475);
		p18.pSO(1130);
		p18.pHBP(41);
		p18.setStats();
		//p18.printPlayer();
		
		
		
		Player[] playerArray = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18};
		return playerArray;

		/*double samplehits = 0;
		double sampleAB = 0;
		double samplePA = 0;
		double sample1b = 0;
		double sample2b = 0;
		double sample3b = 0;
		double sampleHR = 0;
		double sampleBB = 0;
		double sampleSO = 0;
		double sampleHBP = 0;
		double sampleTB = 0;
		
		//for (int i=0; i<739; i++){
			
			
			
			//System.out.println(result);
			
			
			if (result == "Single"){
				sample1b++;	
				samplehits++;
				sampleAB++;
				sampleTB++;
			}
			if (result == "Double"){
				sample2b++;	
				samplehits++;
				sampleAB++;
				sampleTB+=2;
			}
			if (result == "Triple"){
				sample3b++;	
				samplehits++;
				sampleAB++;
				sampleTB+=3;
			}
			if (result == "HOME RUN!"){
				sampleHR++;
				samplehits++;
				sampleAB++;
				sampleTB+=4;
			}
			if (result == "Walk"){
				sampleBB++;				
			}
			if (result == "Hit By Pitch"){
				sampleHBP++;				
			}
			if (result == "Strikeout"){
				sampleSO++;
				sampleAB++;
			}
			if (result == "Out"){
				sampleAB++;
			}
			samplePA++;
			
		}
		
		System.out.println("Hits: " + samplehits);
		System.out.println("Doubles Hit: " + sample2b);
		System.out.println("Triples Hit: " + sample3b);
		System.out.println("Home Runs Hit: " + sampleHR);
		System.out.println("Times Walked: " + sampleBB);
		System.out.println("Times Struk Out: " + sampleSO);
		System.out.println("Time Hit By Pitch: " + sampleHBP);
		
		double sampleAVG = samplehits/sampleAB; 
		double sampleOBP = (samplehits + sampleBB + sampleHBP) / samplePA;
		double sampleSLG = sampleTB/sampleAB; 
		double sampleOPS = sampleOBP + sampleSLG; 
		
		System.out.println("AVG: " + sampleAVG);
		System.out.println("OBP: " + sampleOBP);
		System.out.println("SLG: " + sampleSLG);
		System.out.println("OPS: " + sampleOPS);
		*/
	}
}

