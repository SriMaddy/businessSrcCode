import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BusinessBoard {
	static final String imagePath = "D:/BusinessImages/";
	JFrame boardFrame;
	JPanel boardPanel;
	JPanel boardPanel1;
	JLabel lblStart;
	JLabel lblBombay;
	JLabel lblWaterWorks;
	JLabel lblRailway;
	JLabel lblAhamedabad;
	JLabel lblIncomeTax;
	JLabel lblIndore;
	JLabel lblChance1;
	JLabel lblJaipur;
	JLabel lblJail;
	JLabel lblHowrah;
	JLabel lblElectricCity;
	JLabel lblBestTown;
	JLabel lblSimla;
	JLabel lblJammu;
	JLabel lblCommnuityChest1;
	JLabel lblKasmir;
	JLabel lblClub;
	JLabel lblAgra;
	JLabel lblChance2;
	JLabel lblKanpur;
	JLabel lblPatna;
	JLabel lblDargiling;
	JLabel lblAirIndia;
	JLabel lblCalcutta;
	JLabel lblHyderabad;
	JLabel lblRestHouse;
	JLabel lblMadras;
	JLabel lblCommunityChest2;
	JLabel lblBanglore;
	JLabel lblWealthTaxes;
	JLabel lblOoty;
	JLabel lblCochin;
	JLabel lblMotorBoat;
	JLabel lblPlayer1;
	JLabel lblPlayer2;
	JLabel lblPlayer1Status;
	JLabel lblPlayer2Status;
	JLabel lblPlayer1CashLabel;
	JLabel lblPlayer2CashLabel;
	JLabel lblPlayer1CashValue;
	JLabel lblPlayer2CashValue;
	JButton btnPlayer1Play;
	JLabel lblPlayer1Coin, lblPlayer2Coin;
	JLabel lblDice1, lblDice2;
	JButton btnInStructions;
	Map<Integer, JLabel> map;
	Map<JLabel, Integer> map1;
	Set<JLabel> player1Cities;
	Set<JLabel> player2Cities;
	JButton btnPlayer1Buy;
	JButton btnPlayer1Cancel;
	JLabel lblConfirmBuy;
	Player1 player1;
	Computer computer;
	int diceValue, cityCost, player1CurrentBalance, computerCurrentBalance;
	JLabel lblThis;

	public BusinessBoard() {
	}

	public void initial() {
		createObjects();
		addActionListeners();
		setBoundsForComponents();
		addComponentsIntoFrame();
		showFrame();
		addMapContents();
		addMap1Contents();
	}

	private void addMap1Contents() {
		map1.put(lblStart, 0);
		map1.put(lblBombay, 8500);
		map1.put(lblWaterWorks, 3200);
		map1.put(lblRailway, 9500);
		map1.put(lblAhamedabad, 4000);
		map1.put(lblIncomeTax, 500);
		map1.put(lblIndore, 1500);
		map1.put(lblChance1, 0);
		map1.put(lblJaipur, 3000);
		map1.put(lblJail, 1500);
		map1.put(lblHowrah, 2500);
		map1.put(lblElectricCity, 2500);
		map1.put(lblBestTown, 3500);
		map1.put(lblSimla, 2200);
		map1.put(lblJammu, 3300);
		map1.put(lblCommnuityChest1, 0);
		map1.put(lblKasmir, 5000);
		map1.put(lblClub, 0);
		map1.put(lblAgra, 2500);
		map1.put(lblChance2, 0);
		map1.put(lblKanpur, 4000);
		map1.put(lblPatna, 2000);
		map1.put(lblDargiling, 2500);
		map1.put(lblAirIndia, 10500);
		map1.put(lblCalcutta, 6500);
		map1.put(lblHyderabad, 3500);
		map1.put(lblRestHouse, 0);
		map1.put(lblMadras, 7000);
		map1.put(lblCommunityChest2, 0);
		map1.put(lblBanglore, 8000);
		map1.put(lblWealthTaxes, 700);
		map1.put(lblOoty, 2500);
		map1.put(lblCochin, 3000);
		map1.put(lblMotorBoat, 5500);
	}

	private void addMapContents() {
		map.put(1, lblStart);
		map.put(2, lblBombay);
		map.put(3, lblWaterWorks);
		map.put(4, lblRailway);
		map.put(5, lblAhamedabad);
		map.put(6, lblIncomeTax);
		map.put(7, lblIndore);
		map.put(8, lblChance1);
		map.put(9, lblJaipur);
		map.put(10, lblJail);
		map.put(11, lblHowrah);
		map.put(12, lblElectricCity);
		map.put(13, lblBestTown);
		map.put(14, lblSimla);
		map.put(15, lblJammu);
		map.put(16, lblCommnuityChest1);
		map.put(17, lblKasmir);
		map.put(18, lblClub);
		map.put(19, lblAgra);
		map.put(20, lblChance2);
		map.put(21, lblKanpur);
		map.put(22, lblPatna);
		map.put(23, lblDargiling);
		map.put(24, lblAirIndia);
		map.put(25, lblCalcutta);
		map.put(26, lblHyderabad);
		map.put(27, lblRestHouse);
		map.put(28, lblMadras);
		map.put(29, lblCommunityChest2);
		map.put(30, lblBanglore);
		map.put(31, lblWealthTaxes);
		map.put(32, lblOoty);
		map.put(33, lblCochin);
		map.put(34, lblMotorBoat);

	}

	private void setDiceIcon(int d, JLabel lblDice) {
		switch (d) {
		case 1:
			lblDice.setIcon(new ImageIcon("imagePathDice11.png"));
			break;
		case 2:
			lblDice.setIcon(new ImageIcon(imagePath + "Dice12.png"));
			break;
		case 3:
			lblDice.setIcon(new ImageIcon(imagePath + "Dice13.png"));
			break;
		case 4:
			lblDice.setIcon(new ImageIcon(imagePath + "Dice14.png"));
			break;
		case 5:
			lblDice.setIcon(new ImageIcon(imagePath + "Dice15.png"));
			break;
		case 6:
			lblDice.setIcon(new ImageIcon(imagePath + "Dice16.png"));
			break;
		}
	}

	private void movePlayer1() {
		player1 = new Player1();
		lblThis = player1.move(map, diceValue);
		setBoundsForPlayer1();
		if (lblThis == lblIncomeTax) {
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			player1CurrentBalance -= 500;
			lblPlayer1CashValue.setText("" + player1CurrentBalance);
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			moveComputer();
		} else if (lblThis == lblJail) {
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			player1CurrentBalance -= 1500;
			lblPlayer1CashValue.setText("" + player1CurrentBalance);
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			moveComputer();
		} else if (lblThis == lblWealthTaxes) {
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			player1CurrentBalance -= 700;
			lblPlayer1CashValue.setText("" + player1CurrentBalance);
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			moveComputer();
		} else if ((lblThis == lblChance1) || (lblThis == lblChance2)) {
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			lblPlayer1CashValue.setText("" + player1CurrentBalance);
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			moveComputer();
		} else if ((lblThis == lblCommnuityChest1)
				|| (lblThis == lblCommunityChest2)) {
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			lblPlayer1CashValue.setText("" + player1CurrentBalance);
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			moveComputer();

		} else if ((lblThis == lblClub) || (lblThis == lblRestHouse)) {
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			lblPlayer1CashValue.setText("" + player1CurrentBalance);
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			moveComputer();
		} else if (lblThis == lblStart) {
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			player1CurrentBalance += 1500;
			lblPlayer1CashValue.setText("" + player1CurrentBalance);
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			moveComputer();
		} else {
			movePlayer1Helper();
		}

	}

	private void moveComputer() {
		btnPlayer1Play.setEnabled(false);
		Dice d = new Dice();
		int d1 = d.getDice1Value();
		setDiceIcon(d1, lblDice1);
		int d2 = d.getDice2Value();
		setDiceIcon(d2, lblDice2);
		diceValue = d.getDiceValue();
		computer = new Computer();
		lblThis = computer.move(map, diceValue);
		//git hub
		setBoundsForComputer();
		if (lblThis == lblIncomeTax) {
			computerCurrentBalance = computer.getComputerCurrentBalance();
			computerCurrentBalance -= 500;
			lblPlayer2CashValue.setText("" + computerCurrentBalance);
			computer.setComputerCurrentBalance(computerCurrentBalance);
			btnPlayer1Play.setEnabled(true);
		} else if (lblThis == lblJail) {
			computerCurrentBalance = computer.getComputerCurrentBalance();
			computerCurrentBalance -= 1500;
			lblPlayer2CashValue.setText("" + computerCurrentBalance);
			computer.setComputerCurrentBalance(computerCurrentBalance);
			btnPlayer1Play.setEnabled(true);
		} else if (lblThis == lblWealthTaxes) {
			computerCurrentBalance = computer.getComputerCurrentBalance();
			computerCurrentBalance -= 700;
			lblPlayer2CashValue.setText("" + computerCurrentBalance);
			computer.setComputerCurrentBalance(computerCurrentBalance);
			btnPlayer1Play.setEnabled(true);
		} else if ((lblThis == lblChance1) || (lblThis == lblChance2)) {
			computerCurrentBalance = computer.getComputerCurrentBalance();
			lblPlayer2CashValue.setText("" + computerCurrentBalance);
			computer.setComputerCurrentBalance(computerCurrentBalance);
			btnPlayer1Play.setEnabled(true);
		} else if ((lblThis == lblCommnuityChest1)
				|| (lblThis == lblCommunityChest2)) {
			System.out.println("Enter Community Chest ");
			computerCurrentBalance = computer.getComputerCurrentBalance();
			lblPlayer2CashValue.setText("" + computerCurrentBalance);
			computer.setComputerCurrentBalance(computerCurrentBalance);
			btnPlayer1Play.setEnabled(true);

		} else if ((lblThis == lblClub) || (lblThis == lblRestHouse)) {
			System.out.println("Enter Club ");
			computerCurrentBalance = computer.getComputerCurrentBalance();
			lblPlayer2CashValue.setText("" + computerCurrentBalance);
			computer.setComputerCurrentBalance(computerCurrentBalance);
			btnPlayer1Play.setEnabled(true);
		} else if (lblThis == lblStart) {
			computerCurrentBalance = computer.getComputerCurrentBalance();
			computerCurrentBalance += 1500;
			lblPlayer2CashValue.setText("" + computerCurrentBalance);
			computer.setComputerCurrentBalance(computerCurrentBalance);
			btnPlayer1Play.setEnabled(true);
		} else {
			moveComputerHelper();
		}
	}

	private void movePlayer1Helper() {
		if (player1.isBoughtByComputer(player2Cities, lblThis)) {
			System.out.println("Computer bought- rent code goes here");
			cityCost = map1.get(lblThis);
			int rent = (int) (cityCost * .1);
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			player1CurrentBalance -= rent;
			lblPlayer1CashValue.setText("" + player1CurrentBalance);
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			computerCurrentBalance = computer.getComputerCurrentBalance();
			computerCurrentBalance += rent;
			lblPlayer2CashValue.setText("" + computerCurrentBalance);
			computer.setComputerCurrentBalance(computerCurrentBalance);
			moveComputer();
		} else {
			if (player1.isBoughtByMe(player1Cities, lblThis)) {
				System.out.println("No Change in any cash");
				btnPlayer1Play.setEnabled(true);
			} else {
				System.out
						.println("City is now eligible to be bought by Player1");
				cityCost = map1.get(lblThis);
				player1CurrentBalance = player1.getPlayer1CurrentBalance();
				if (player1CurrentBalance >= cityCost) {
					lblConfirmBuy.setVisible(true);
					btnPlayer1Buy.setVisible(true);
					btnPlayer1Cancel.setVisible(true);
				} else {
					System.out.println("Not enough balance to buy by Player1");
					moveComputer();
				}
			}
		}
	}

	private void moveComputerHelper() {
		if (computer.isBoughtByPlayer1(player1Cities, lblThis)) {
			System.out.println("Player1 bought- rent code goes here");
			cityCost = map1.get(lblThis);
			int rent = (int) (cityCost * .1);
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			player1CurrentBalance += rent;
			lblPlayer1CashValue.setText("" + player1CurrentBalance);
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			computerCurrentBalance = computer.getComputerCurrentBalance();
			computerCurrentBalance -= rent;
			lblPlayer2CashValue.setText("" + computerCurrentBalance);
			computer.setComputerCurrentBalance(computerCurrentBalance);
			btnPlayer1Play.setEnabled(true);
		} else {
			if (computer.isBoughtByMe(player2Cities, lblThis)) {
				System.out.println("No Change in any cash");
				btnPlayer1Play.setEnabled(true);
			} else {
				System.out
						.println("City is now eligible to be bought by computer");
				cityCost = map1.get(lblThis);
				computerCurrentBalance = computer.getComputerCurrentBalance();
				if (computerCurrentBalance >= cityCost) {
					buyCity(2);
				} else {
					System.out.println("Not enough balance to buy by Computer");
					btnPlayer1Play.setEnabled(true);
				}
			}
		}
	}

	private void buyCity(int n) {
		switch (n) {
		case 1:
			player1Cities.add(lblThis);
			player1CurrentBalance = player1.getPlayer1CurrentBalance();
			player1CurrentBalance -= cityCost;
			player1.setPlayer1CurrentBalance(player1CurrentBalance);
			lblPlayer1CashValue
					.setText("" + player1.getPlayer1CurrentBalance());
			System.out.println("City booked by player1"
					+ player1.getPlayer1CurrentBalance());
			lblConfirmBuy.setVisible(false);
			btnPlayer1Buy.setVisible(false);
			btnPlayer1Cancel.setVisible(false);
			btnPlayer1Play.setEnabled(true);
			break;
		case 2:
			player2Cities.add(lblThis);
			computerCurrentBalance = computer.getComputerCurrentBalance();
			computerCurrentBalance -= cityCost;
			computer.setComputerCurrentBalance(computerCurrentBalance);
			lblPlayer2CashValue.setText(""
					+ computer.getComputerCurrentBalance());
			System.out.println("City booked by computer"
					+ computer.getComputerCurrentBalance());
			btnPlayer1Play.setEnabled(true);
			break;
		}

	}

	private void addActionListeners() {
		btnPlayer1Play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				btnPlayer1Play.setEnabled(false);
				Dice d = new Dice();
				int d1 = d.getDice1Value();
				setDiceIcon(d1, lblDice1);
				int d2 = d.getDice2Value();
				setDiceIcon(d2, lblDice2);
				diceValue = d.getDiceValue();
				movePlayer1();
			}
		});
		btnPlayer1Buy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				buyCity(1);
				moveComputer();
			}
		});
		btnPlayer1Cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Booking Cancelled");
				lblConfirmBuy.setVisible(false);
				btnPlayer1Buy.setVisible(false);
				btnPlayer1Cancel.setVisible(false);
				btnPlayer1Play.setEnabled(true);
				moveComputer();
			}
		});
		btnInStructions.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new InstrcutionsFrame();
			}
		});
	}

	private void setBoundsForPlayer1() {
		int lbl = 0;
		for (Integer key : map.keySet()) {
			if (map.get(key).equals(lblThis))
				lbl = key;
		}

		switch (lbl) {
		case 1:
			lblPlayer1Coin.setBounds(90, 691, 10, 10);
			break;
		case 2:
			lblPlayer1Coin.setBounds(5, 569, 10, 10);
			break;
		case 3:
			lblPlayer1Coin.setBounds(5, 509, 10, 10);
			break;
		case 4:
			lblPlayer1Coin.setBounds(5, 449, 10, 10);
			break;
		case 5:
			lblPlayer1Coin.setBounds(5, 389, 10, 10);
			break;
		case 6:
			lblPlayer1Coin.setBounds(5, 329, 10, 10);
			break;
		case 7:
			lblPlayer1Coin.setBounds(5, 269, 10, 10);
			break;
		case 8:
			lblPlayer1Coin.setBounds(5, 209, 10, 10);
			break;
		case 9:
			lblPlayer1Coin.setBounds(5, 149, 10, 10);
			break;
		case 10:
			lblPlayer1Coin.setBounds(85, 15, 10, 10);
			break;
		case 11:
			lblPlayer1Coin.setBounds(195, 15, 10, 10);
			break;
		case 12:
			lblPlayer1Coin.setBounds(275, 15, 10, 10);
			break;
		case 13:
			lblPlayer1Coin.setBounds(355, 15, 10, 10);
			break;
		case 14:
			lblPlayer1Coin.setBounds(435, 15, 10, 10);
			break;
		case 15:
			lblPlayer1Coin.setBounds(515, 15, 10, 10);
			break;
		case 16:
			lblPlayer1Coin.setBounds(595, 15, 10, 10);
			break;
		case 17:
			lblPlayer1Coin.setBounds(675, 15, 10, 10);
			break;
		case 18:
			lblPlayer1Coin.setBounds(785, 15, 10, 10);
			break;
		case 19:
			lblPlayer1Coin.setBounds(865, 145, 10, 10);
			break;
		case 20:
			lblPlayer1Coin.setBounds(865, 205, 10, 10);
			break;
		case 21:
			lblPlayer1Coin.setBounds(865, 265, 10, 10);
			break;
		case 22:
			lblPlayer1Coin.setBounds(865, 325, 10, 10);
			break;
		case 23:
			lblPlayer1Coin.setBounds(865, 385, 10, 10);
			break;
		case 24:
			lblPlayer1Coin.setBounds(865, 445, 10, 10);
			break;
		case 25:
			lblPlayer1Coin.setBounds(865, 505, 10, 10);
			break;
		case 26:
			lblPlayer1Coin.setBounds(865, 565, 10, 10);
			break;
		case 27:
			lblPlayer1Coin.setBounds(785, 691, 10, 10);
			break;
		case 28:
			lblPlayer1Coin.setBounds(675, 691, 10, 10);
			break;
		case 29:
			lblPlayer1Coin.setBounds(595, 691, 10, 10);
			break;
		case 30:
			lblPlayer1Coin.setBounds(515, 691, 10, 10);
			break;
		case 31:
			lblPlayer1Coin.setBounds(435, 691, 10, 10);
			break;
		case 32:
			lblPlayer1Coin.setBounds(355, 691, 10, 10);
			break;
		case 33:
			lblPlayer1Coin.setBounds(275, 691, 10, 10);
			break;
		case 34:
			lblPlayer1Coin.setBounds(195, 691, 10, 10);
			break;
		}
	}

	private void setBoundsForComputer() {
		int lbl = 0;
		for (Integer key : map.keySet()) {
			if (map.get(key).equals(lblThis))
				lbl = key;
		}

		switch (lbl) {
		case 1:
			lblPlayer2Coin.setBounds(5, 639, 10, 10);
			break;
		case 2:
			lblPlayer2Coin.setBounds(165, 569, 10, 10);
			break;
		case 3:
			lblPlayer2Coin.setBounds(165, 509, 10, 10);
			break;
		case 4:
			lblPlayer2Coin.setBounds(165, 449, 10, 10);
			break;
		case 5:
			lblPlayer2Coin.setBounds(165, 389, 10, 10);
			break;
		case 6:
			lblPlayer2Coin.setBounds(165, 329, 10, 10);
			break;
		case 7:
			lblPlayer2Coin.setBounds(165, 269, 10, 10);
			break;
		case 8:
			lblPlayer2Coin.setBounds(165, 209, 10, 10);
			break;
		case 9:
			lblPlayer2Coin.setBounds(165, 149, 10, 10);
			break;
		case 10:
			lblPlayer2Coin.setBounds(5, 74, 10, 10);
			break;
		case 11:
			lblPlayer2Coin.setBounds(195, 125, 10, 10);
			break;
		case 12:
			lblPlayer2Coin.setBounds(275, 125, 10, 10);
			break;
		case 13:
			lblPlayer2Coin.setBounds(355, 125, 10, 10);
			break;
		case 14:
			lblPlayer2Coin.setBounds(435, 125, 10, 10);
			break;
		case 15:
			lblPlayer2Coin.setBounds(515, 125, 10, 10);
			break;
		case 16:
			lblPlayer2Coin.setBounds(595, 125, 10, 10);
			break;
		case 17:
			lblPlayer2Coin.setBounds(675, 125, 10, 10);
			break;
		case 18:
			lblPlayer2Coin.setBounds(865, 70, 10, 10);
			break;
		case 19:
			lblPlayer2Coin.setBounds(705, 145, 10, 10);
			break;
		case 20:
			lblPlayer2Coin.setBounds(705, 205, 10, 10);
			break;
		case 21:
			lblPlayer2Coin.setBounds(705, 265, 10, 10);
			break;
		case 22:
			lblPlayer2Coin.setBounds(705, 325, 10, 10);
			break;
		case 23:
			lblPlayer2Coin.setBounds(705, 385, 10, 10);
			break;
		case 24:
			lblPlayer2Coin.setBounds(705, 445, 10, 10);
			break;
		case 25:
			lblPlayer2Coin.setBounds(705, 505, 10, 10);
			break;
		case 26:
			lblPlayer2Coin.setBounds(705, 565, 10, 10);
			break;
		case 27:
			lblPlayer2Coin.setBounds(865, 640, 10, 10);
			break;
		case 28:
			lblPlayer2Coin.setBounds(675, 586, 10, 10);
			break;
		case 29:
			lblPlayer2Coin.setBounds(595, 586, 10, 10);
			break;
		case 30:
			lblPlayer2Coin.setBounds(515, 586, 10, 10);
			break;
		case 31:
			lblPlayer2Coin.setBounds(435, 586, 10, 10);
			break;
		case 32:
			lblPlayer2Coin.setBounds(355, 586, 10, 10);
			break;
		case 33:
			lblPlayer2Coin.setBounds(275, 586, 10, 10);
			break;
		case 34:
			lblPlayer2Coin.setBounds(195, 586, 10, 10);
			break;
		}
	}

	private void setBoundsForComponents() {
		boardFrame.setLayout(null);
		boardPanel.setLayout(null);
		boardPanel1.setLayout(null);
		boardPanel.setBounds(190, 150, 500, 420);
		boardPanel1.setBounds(900, 30, 450, 660);
		boardFrame.getContentPane().setBackground(Color.BLACK);
		boardPanel.setBackground(Color.DARK_GRAY);
		boardPanel1.setBackground(Color.ORANGE);
		lblStart.setBounds(20, 600, 140, 90);
		lblBombay.setBounds(20, 540, 140, 60);
		lblWaterWorks.setBounds(20, 480, 140, 60);
		lblRailway.setBounds(20, 420, 140, 60);
		lblAhamedabad.setBounds(20, 360, 140, 60);
		lblIncomeTax.setBounds(20, 300, 140, 60);
		lblIndore.setBounds(20, 240, 140, 60);
		lblChance1.setBounds(20, 180, 140, 60);
		lblJaipur.setBounds(20, 120, 140, 60);
		lblJail.setBounds(20, 30, 140, 90);
		lblHowrah.setBounds(160, 30, 80, 90);
		lblElectricCity.setBounds(240, 30, 80, 90);
		lblBestTown.setBounds(320, 30, 80, 90);
		lblSimla.setBounds(400, 30, 80, 90);
		lblJammu.setBounds(480, 30, 80, 90);
		lblCommnuityChest1.setBounds(560, 30, 80, 90);
		lblKasmir.setBounds(640, 30, 80, 90);
		lblClub.setBounds(720, 30, 140, 90);
		lblAgra.setBounds(720, 120, 140, 60);
		lblChance2.setBounds(720, 180, 140, 60);
		lblKanpur.setBounds(720, 240, 140, 60);
		lblPatna.setBounds(720, 300, 140, 60);
		lblDargiling.setBounds(720, 360, 140, 60);
		lblAirIndia.setBounds(720, 420, 140, 60);
		lblCalcutta.setBounds(720, 480, 140, 60);
		lblHyderabad.setBounds(720, 540, 140, 60);
		lblRestHouse.setBounds(720, 600, 140, 90);
		lblMadras.setBounds(640, 600, 80, 90);
		lblCommunityChest2.setBounds(560, 600, 80, 90);
		lblBanglore.setBounds(480, 600, 80, 90);
		lblWealthTaxes.setBounds(400, 600, 80, 90);
		lblOoty.setBounds(320, 600, 80, 90);
		lblCochin.setBounds(240, 600, 80, 90);
		lblMotorBoat.setBounds(160, 600, 80, 90);
		lblPlayer1.setBounds(1000, 30, 60, 60);
		lblPlayer1Status.setBounds(1100, 30, 200, 60);
		lblPlayer1CashLabel.setBounds(1000, 160, 70, 60);
		lblPlayer1CashValue.setBounds(1100, 160, 70, 60);
		btnPlayer1Play.setBounds(300, 300, 125, 125);
		
		//lblPlayer1Coin.setBounds(785, 15, 10, 10);
		//lblPlayer2Coin.setBounds(865, 70, 10, 10);
		lblPlayer1Coin.setBounds(450, 250, 30, 30);
		lblPlayer2Coin.setBounds(490, 250, 30, 30);
		lblDice1.setBounds(450, 350, 35, 30);
		lblDice2.setBounds(490, 350, 35, 30);
		lblPlayer2.setBounds(1000, 350, 70, 60);
		lblPlayer2Status.setBounds(1100, 350, 200, 60);
		lblPlayer2CashLabel.setBounds(1000, 460, 70, 60);
		lblPlayer2CashValue.setBounds(1100, 460, 70, 60);
		lblConfirmBuy.setBounds(1000, 90, 400, 25);
		btnPlayer1Buy.setBounds(1000, 120, 30, 30);
		btnPlayer1Cancel.setBounds(1075, 120, 30, 30);
		btnInStructions.setBounds(940, 550, 290, 120);

	}

	private void showFrame() {
		// boardFrame.setSize(600, 500);
		boardFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boardFrame.setVisible(true);
		lblConfirmBuy.setVisible(false);
		btnPlayer1Buy.setVisible(false);
		btnPlayer1Cancel.setVisible(false);
	}

	private void addComponentsIntoFrame() {
		boardFrame.add(lblStart);
		boardFrame.add(lblBombay);
		boardFrame.add(lblWaterWorks);
		boardFrame.add(lblRailway);
		boardFrame.add(lblAhamedabad);
		boardFrame.add(lblIncomeTax);
		boardFrame.add(lblIndore);
		boardFrame.add(lblChance1);
		boardFrame.add(lblJaipur);
		boardFrame.add(lblJail);
		boardFrame.add(lblHowrah);
		boardFrame.add(lblElectricCity);
		boardFrame.add(lblBestTown);
		boardFrame.add(lblSimla);
		boardFrame.add(lblJammu);
		boardFrame.add(lblCommnuityChest1);
		boardFrame.add(lblKasmir);
		boardFrame.add(lblClub);
		boardFrame.add(lblAgra);
		boardFrame.add(lblChance2);
		boardFrame.add(lblKanpur);
		boardFrame.add(lblPatna);
		boardFrame.add(lblDargiling);
		boardFrame.add(lblAirIndia);
		boardFrame.add(lblCalcutta);
		boardFrame.add(lblHyderabad);
		boardFrame.add(lblRestHouse);
		boardFrame.add(lblMadras);
		boardFrame.add(lblCommunityChest2);
		boardFrame.add(lblBanglore);
		boardFrame.add(lblWealthTaxes);
		boardFrame.add(lblOoty);
		boardFrame.add(lblCochin);
		boardFrame.add(lblMotorBoat);
		boardFrame.add(lblPlayer1);
		boardFrame.add(lblPlayer1Coin);
		boardFrame.add(lblPlayer2Coin);
		boardFrame.add(lblPlayer1Status);
		boardFrame.add(lblPlayer1CashLabel);
		boardFrame.add(lblPlayer1CashValue);
		boardFrame.add(btnPlayer1Play);
		boardFrame.add(lblPlayer2);
		boardFrame.add(lblPlayer2Status);
		boardFrame.add(lblPlayer2CashLabel);
		boardFrame.add(lblPlayer2CashValue);
		boardFrame.add(btnInStructions);
		boardFrame.add(lblDice1);
		boardFrame.add(lblDice2);
		boardFrame.add(btnPlayer1Buy);
		boardFrame.add(btnPlayer1Cancel);
		boardFrame.add(lblConfirmBuy);
		boardFrame.add(boardPanel);
		boardFrame.add(boardPanel1);
	}

	private void createObjects() {
		boardFrame = new JFrame("BUSINESS GAME HOME");
		boardPanel = new JPanel();
		boardPanel1 = new JPanel();
		lblStart = new JLabel(new ImageIcon(imagePath + "Start.png"));
		lblBombay = new JLabel(new ImageIcon(imagePath + "Bombay.png"));
		lblWaterWorks = new JLabel(new ImageIcon(imagePath + "WaterWorks.png"));
		lblRailway = new JLabel(new ImageIcon(imagePath + "Railway.png"));
		lblAhamedabad = new JLabel(new ImageIcon(imagePath + "Ahamedabad.png"));
		lblIncomeTax = new JLabel(new ImageIcon(imagePath + "IncomeTax.png"));
		lblIndore = new JLabel(new ImageIcon(imagePath + "Indore.png"));
		lblChance1 = new JLabel(new ImageIcon(imagePath + "Chance.png"));
		lblJaipur = new JLabel(new ImageIcon(imagePath + "Jaipur.png"));
		lblJail = new JLabel(new ImageIcon(imagePath + "Jail.png"));
		lblHowrah = new JLabel(new ImageIcon(imagePath + "Howrah.png"));
		lblElectricCity = new JLabel(new ImageIcon(imagePath
				+ "ElectricCity.png"));
		lblBestTown = new JLabel(new ImageIcon(imagePath + "Best.png"));
		lblSimla = new JLabel(new ImageIcon(imagePath + "Simla.png"));
		lblJammu = new JLabel(new ImageIcon(imagePath + "Jammu.png"));
		lblCommnuityChest1 = new JLabel(new ImageIcon(imagePath
				+ "CommunityChest.png"));
		lblKasmir = new JLabel(new ImageIcon(imagePath + "Kashmir.png"));
		lblClub = new JLabel(new ImageIcon(imagePath + "Club.png"));
		lblAgra = new JLabel(new ImageIcon(imagePath + "Agra.png"));
		lblChance2 = new JLabel(new ImageIcon(imagePath + "Chance.png"));
		lblKanpur = new JLabel(new ImageIcon(imagePath + "Kanpur.png"));
		lblPatna = new JLabel(new ImageIcon(imagePath + "Patna.png"));
		lblDargiling = new JLabel(new ImageIcon(imagePath + "Dargeeling.png"));
		lblAirIndia = new JLabel(new ImageIcon(imagePath + "AirIndia.png"));
		lblCalcutta = new JLabel(new ImageIcon(imagePath + "Kolkata.png"));
		lblHyderabad = new JLabel(new ImageIcon(imagePath + "Hyderabad.png"));
		lblRestHouse = new JLabel(new ImageIcon(imagePath + "RestHouse.png"));
		lblMadras = new JLabel(new ImageIcon(imagePath + "Madras.png"));
		lblCommunityChest2 = new JLabel(new ImageIcon(imagePath
				+ "CommunityChest.png"));
		lblBanglore = new JLabel(new ImageIcon(imagePath + "Banglore.png"));
		lblWealthTaxes = new JLabel(new ImageIcon(imagePath + "WealthTax.png"));
		lblOoty = new JLabel(new ImageIcon(imagePath + "Ooty.png"));
		lblCochin = new JLabel(new ImageIcon(imagePath + "Cochin.png"));
		lblMotorBoat = new JLabel(new ImageIcon(imagePath + "MotorBoat.png"));
		lblPlayer1 = new JLabel("Player1: ");
		lblPlayer1Coin = new JLabel(new ImageIcon(imagePath
				+ "Player1Image.png"));
		lblPlayer1Status = new JLabel("PLAY NOW");
		lblPlayer1CashLabel = new JLabel("Cash(Rs):");
		lblPlayer1CashValue = new JLabel("25000");
		btnPlayer1Play = new JButton("PLAY", new ImageIcon(imagePath
				+ "PlayButton.png"));

		lblPlayer2 = new JLabel("Computer: ");
		lblPlayer2Coin = new JLabel(new ImageIcon(imagePath
				+ "Player2Image.png"));
		lblPlayer2Status = new JLabel("PLAY NEXT");
		lblPlayer2CashLabel = new JLabel("Cash(Rs):");
		lblPlayer2CashValue = new JLabel("25000");

		lblDice1 = new JLabel(new ImageIcon(imagePath + "EmptyDice.png"));
		lblDice2 = new JLabel(new ImageIcon(imagePath + "EmptyDice.png"));
		lblConfirmBuy = new JLabel("You want to buy?");
		btnPlayer1Buy = new JButton(new ImageIcon(imagePath + "Player1Buy.png"));
		btnPlayer1Cancel = new JButton(new ImageIcon(imagePath
				+ "Player1Cancel.png"));

		btnInStructions = new JButton("INSTRUCTIONS", new ImageIcon(imagePath
				+ "InstructionButton2.png"));
		map = new HashMap<Integer, JLabel>();
		map1 = new HashMap<JLabel, Integer>();
		player1Cities = new HashSet<JLabel>();
		player2Cities = new HashSet<JLabel>();
	}

}
