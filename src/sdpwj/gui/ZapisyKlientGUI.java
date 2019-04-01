package sdpwj.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.net.InetAddress;

import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ZapisyKlientGUI {
	JLabel lblNewLabel_0 = new JLabel("New label");
	static Przedmioty t;
	private JFrame frmZapisuje;
	private JTextField textField;
	private JTextField textField_1;
	String[] messageStrings = new String[7];
	public static Socket socket;
	public static JButton btnZapisz;
	public static JLabel label;
	public static int iloscPrzedmiotow = 0;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JTextField textField_4;
	public static JTextField textField_5;
	public static JTextField textField_6;
	public static JTextField textField_7;
	public static JTextField textField_8;
	public static JTextField textField_9;

	Runnable r = new Runnable() {

		public void run() {
			try {

				socket = new Socket(InetAddress.getByName("localhost"), 3000);
				// socket = new Socket();
				// socket.connect(new InetSocketAddress("localhost", 3000), 1000);
				PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
				long threadId = Thread.currentThread().getId();
				System.out.println(threadId);
				// pobieranie obiektu
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				t = ((Przedmioty) ois.readObject());

				// wypelnienie pol
				int size = t.przedmioty.size();
				btnZapisz.setVisible(true);
				if (size >= 1) {
					lblNewLabel_0.setText(t.przedmioty.get(0).nazwa);
					for (String key : t.przedmioty.get(0).godziny.values())
						comboBox.addItem(key);
					lblNewLabel_0.setVisible(true);
					comboBox.setVisible(true);
					textField_2.setVisible(true);
					iloscPrzedmiotow++;
				}
				if (size >= 2) {
					lblNewLabel_1.setText(t.przedmioty.get(1).nazwa);
					for (String key : t.przedmioty.get(1).godziny.values())
						comboBox_1.addItem(key);
					lblNewLabel_1.setVisible(true);
					comboBox_1.setVisible(true);
					textField_3.setVisible(true);
					iloscPrzedmiotow++;
				}
				if (size >= 3) {
					lblNewLabel_2.setText(t.przedmioty.get(2).nazwa);
					for (String key : t.przedmioty.get(2).godziny.values())
						comboBox_2.addItem(key);
					lblNewLabel_2.setVisible(true);
					comboBox_2.setVisible(true);
					textField_4.setVisible(true);
					iloscPrzedmiotow++;
				}
				if (size >= 4) {
					lblNewLabel_3.setText(t.przedmioty.get(3).nazwa);
					for (String key : t.przedmioty.get(3).godziny.values())
						comboBox_3.addItem(key);
					lblNewLabel_3.setVisible(true);
					comboBox_3.setVisible(true);
					textField_5.setVisible(true);
					iloscPrzedmiotow++;
				}
				if (size >= 5) {
					lblNewLabel_4.setText(t.przedmioty.get(4).nazwa);
					for (String key : t.przedmioty.get(4).godziny.values())
						comboBox_4.addItem(key);
					lblNewLabel_4.setVisible(true);
					comboBox_4.setVisible(true);
					textField_6.setVisible(true);
					iloscPrzedmiotow++;
				}
				if (size >= 6) {
					lblNewLabel_5.setText(t.przedmioty.get(5).nazwa);
					for (String key : t.przedmioty.get(5).godziny.values())
						comboBox_5.addItem(key);
					lblNewLabel_5.setVisible(true);
					comboBox_5.setVisible(true);
					textField_7.setVisible(true);
					iloscPrzedmiotow++;
				}
				if (size >= 7) {
					lblNewLabel_6.setText(t.przedmioty.get(6).nazwa);
					for (String key : t.przedmioty.get(6).godziny.values())
						comboBox_6.addItem(key);
					lblNewLabel_6.setVisible(true);
					comboBox_6.setVisible(true);
					textField_8.setVisible(true);
					iloscPrzedmiotow++;
				}
				if (size >= 8) {
					lblNewLabel_7.setText(t.przedmioty.get(7).nazwa);
					for (String key : t.przedmioty.get(7).godziny.values())
						comboBox_7.addItem(key);
					lblNewLabel_7.setVisible(true);
					comboBox_7.setVisible(true);
					textField_9.setVisible(true);
					iloscPrzedmiotow++;
				}

				// limit czasu
				new TimeCounter(30);
				System.out.format("Masz 30 sekund.%n");
				label.setText("Masz 30 sekund na wype³nienie formularzu");

				Scanner sc = new Scanner(System.in);
				String str;
				while (sc.hasNext()) {
					str = sc.nextLine();
					out.println(str);
					out.flush();
					if (str.equals("exit"))
						break;
				}

				sc.close();
				socket.close();
			} catch (Exception e) {
				System.err.println(e);
			}

		}
	};
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JComboBox<String> comboBox_4;
	private JComboBox<String> comboBox_5;
	private JComboBox<String> comboBox_6;
	private JComboBox<String> comboBox_7;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZapisyKlientGUI window = new ZapisyKlientGUI();
					window.frmZapisuje.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ZapisyKlientGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZapisuje = new JFrame();
		frmZapisuje.setResizable(false);
		frmZapisuje.setTitle("Zapisujrze!");
		frmZapisuje.setBounds(100, 100, 581, 302);
		frmZapisuje.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZapisuje.getContentPane().setLayout(null);

		JLabel lblImiINazwisko = new JLabel("Imi\u0119 i nazwisko");
		lblImiINazwisko.setBounds(29, 28, 94, 14);
		frmZapisuje.getContentPane().add(lblImiINazwisko);

		JLabel lblNumerIp = new JLabel("Numer ip");
		lblNumerIp.setBounds(29, 53, 68, 14);
		frmZapisuje.getContentPane().add(lblNumerIp);

		textField = new JTextField();
		textField.setBounds(122, 27, 86, 20);
		frmZapisuje.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(122, 50, 86, 20);
		frmZapisuje.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnZaloguj = new JButton("Zaloguj");

		btnZaloguj.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				textField.setEnabled(false);
				textField_1.setEnabled(false);
				btnZaloguj.setEnabled(false);
				ExecutorService executor = Executors.newCachedThreadPool();
				executor.submit(r);

			}
		});

		btnZaloguj.setBounds(122, 81, 89, 23);
		frmZapisuje.getContentPane().add(btnZaloguj);

		lblNewLabel_0.setBounds(218, 28, 133, 14);
		frmZapisuje.getContentPane().add(lblNewLabel_0);
		lblNewLabel_0.setVisible(false);

		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(218, 53, 76, 14);
		frmZapisuje.getContentPane().add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);

		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(218, 78, 76, 14);
		frmZapisuje.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);

		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(218, 103, 76, 14);
		frmZapisuje.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setVisible(false);

		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(218, 128, 76, 14);
		frmZapisuje.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);

		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(218, 153, 76, 14);
		frmZapisuje.getContentPane().add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);

		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(218, 178, 76, 14);
		frmZapisuje.getContentPane().add(lblNewLabel_6);
		lblNewLabel_6.setVisible(false);

		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(218, 203, 76, 14);
		frmZapisuje.getContentPane().add(lblNewLabel_7);
		lblNewLabel_7.setVisible(false);

		comboBox = new JComboBox<>();
		comboBox.setBounds(353, 25, 152, 20);
		frmZapisuje.getContentPane().add(comboBox);
		comboBox.setVisible(false);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int a = 1; a <= ZapisyKlientGUI.t.przedmioty.get(0).iloœæ_wolnych.size(); a++) {
					String godzina = (String) comboBox.getSelectedItem();
					if (ZapisyKlientGUI.t.przedmioty.get(0).godziny.get(a).equals(godzina) == true) {
						int wolne = ZapisyKlientGUI.t.przedmioty.get(0).iloœæ_wolnych.get(a - 1);
						textField_2.setText(String.valueOf(wolne));
						if (wolne == 0) {
							btnZapisz.setEnabled(false);
							label.setText("Wybierz godziny w ktorych s¹ jeszcze wolne miejsca");
						} else {
							btnZapisz.setEnabled(true);
							label.setText("");
						}

					}

				}
			}
		});

		comboBox_1 = new JComboBox<>();
		comboBox_1.setBounds(353, 50, 152, 20);
		frmZapisuje.getContentPane().add(comboBox_1);
		comboBox_1.setVisible(false);

		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int a = 1; a <= ZapisyKlientGUI.t.przedmioty.get(1).iloœæ_wolnych.size(); a++) {
					String godzina = (String) comboBox_1.getSelectedItem();
					if (ZapisyKlientGUI.t.przedmioty.get(1).godziny.get(a).equals(godzina) == true) {
						int wolne = ZapisyKlientGUI.t.przedmioty.get(1).iloœæ_wolnych.get(a - 1);
						textField_3.setText(String.valueOf(wolne));
						czyMiejsceWWybranych.czyMiejsca(iloscPrzedmiotow);
					}
				}
			}
		});

		comboBox_2 = new JComboBox<>();
		comboBox_2.setBounds(353, 75, 152, 20);
		frmZapisuje.getContentPane().add(comboBox_2);
		comboBox_2.setVisible(false);

		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int a = 1; a <= ZapisyKlientGUI.t.przedmioty.get(2).iloœæ_wolnych.size(); a++) {
					String godzina = (String) comboBox_2.getSelectedItem();
					if (ZapisyKlientGUI.t.przedmioty.get(2).godziny.get(a).equals(godzina) == true) {
						int wolne = ZapisyKlientGUI.t.przedmioty.get(2).iloœæ_wolnych.get(a - 1);
						textField_4.setText(String.valueOf(wolne));
						czyMiejsceWWybranych.czyMiejsca(iloscPrzedmiotow);

					}
				}
			}
		});

		comboBox_3 = new JComboBox<>();
		comboBox_3.setBounds(353, 100, 152, 20);
		frmZapisuje.getContentPane().add(comboBox_3);
		comboBox_3.setVisible(false);

		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int a = 1; a <= ZapisyKlientGUI.t.przedmioty.get(3).iloœæ_wolnych.size(); a++) {
					String godzina = (String) comboBox_3.getSelectedItem();
					if (ZapisyKlientGUI.t.przedmioty.get(3).godziny.get(a).equals(godzina) == true) {
						int wolne = ZapisyKlientGUI.t.przedmioty.get(3).iloœæ_wolnych.get(a - 1);
						textField_5.setText(String.valueOf(wolne));
						czyMiejsceWWybranych.czyMiejsca(iloscPrzedmiotow);

					}
				}
			}
		});
		comboBox_4 = new JComboBox<>();
		comboBox_4.setBounds(353, 125, 152, 20);
		frmZapisuje.getContentPane().add(comboBox_4);
		comboBox_4.setVisible(false);
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int a = 1; a <= ZapisyKlientGUI.t.przedmioty.get(4).iloœæ_wolnych.size(); a++) {
					String godzina = (String) comboBox_4.getSelectedItem();
					if (ZapisyKlientGUI.t.przedmioty.get(4).godziny.get(a).equals(godzina) == true) {
						int wolne = ZapisyKlientGUI.t.przedmioty.get(4).iloœæ_wolnych.get(a - 1);
						textField_6.setText(String.valueOf(wolne));
						czyMiejsceWWybranych.czyMiejsca(iloscPrzedmiotow);

					}
				}
			}
		});
		comboBox_5 = new JComboBox<>();
		comboBox_5.setBounds(353, 150, 152, 20);
		frmZapisuje.getContentPane().add(comboBox_5);
		comboBox_5.setVisible(false);
		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int a = 1; a <= ZapisyKlientGUI.t.przedmioty.get(5).iloœæ_wolnych.size(); a++) {
					String godzina = (String) comboBox_5.getSelectedItem();
					if (ZapisyKlientGUI.t.przedmioty.get(5).godziny.get(a).equals(godzina) == true) {
						int wolne = ZapisyKlientGUI.t.przedmioty.get(5).iloœæ_wolnych.get(a - 1);
						textField_7.setText(String.valueOf(wolne));
						czyMiejsceWWybranych.czyMiejsca(iloscPrzedmiotow);
					}
				}
			}
		});
		comboBox_6 = new JComboBox<>();
		comboBox_6.setBounds(353, 175, 152, 20);
		frmZapisuje.getContentPane().add(comboBox_6);
		comboBox_6.setVisible(false);
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int a = 1; a <= ZapisyKlientGUI.t.przedmioty.get(6).iloœæ_wolnych.size(); a++) {
					String godzina = (String) comboBox_6.getSelectedItem();
					if (ZapisyKlientGUI.t.przedmioty.get(6).godziny.get(a).equals(godzina) == true) {
						int wolne = ZapisyKlientGUI.t.przedmioty.get(6).iloœæ_wolnych.get(a - 1);
						textField_8.setText(String.valueOf(wolne));
						czyMiejsceWWybranych.czyMiejsca(iloscPrzedmiotow);

					}
				}
			}
		});
		comboBox_7 = new JComboBox<>();
		comboBox_7.setBounds(353, 200, 152, 20);
		frmZapisuje.getContentPane().add(comboBox_7);
		comboBox_7.setVisible(false);
		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int a = 1; a <= ZapisyKlientGUI.t.przedmioty.get(7).iloœæ_wolnych.size(); a++) {
					String godzina = (String) comboBox_7.getSelectedItem();
					if (ZapisyKlientGUI.t.przedmioty.get(7).godziny.get(a).equals(godzina) == true) {
						int wolne = ZapisyKlientGUI.t.przedmioty.get(7).iloœæ_wolnych.get(a - 1);
						textField_9.setText(String.valueOf(wolne));
						czyMiejsceWWybranych.czyMiejsca(iloscPrzedmiotow);

					}
				}
			}
		});
		btnZapisz = new JButton("Zapisz");
		btnZapisz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<String> godziny = new ArrayList<String>();
				String nazwisko = textField.getText();
				int size = t.przedmioty.size();

				if (size > 0)
					godziny.add((String) comboBox.getSelectedItem());
				if (size > 1)
					godziny.add((String) comboBox_1.getSelectedItem());
				if (size > 2)
					godziny.add((String) comboBox_2.getSelectedItem());
				if (size > 3)
					godziny.add((String) comboBox_3.getSelectedItem());
				if (size > 4)
					godziny.add((String) comboBox_4.getSelectedItem());
				if (size > 5)
					godziny.add((String) comboBox_5.getSelectedItem());
				if (size > 6)
					godziny.add((String) comboBox_6.getSelectedItem());
				if (size > 7)
					godziny.add((String) comboBox_7.getSelectedItem());

				try {
					Wybory w = new Wybory(nazwisko, godziny);
					ObjectOutputStream ous;
					ous = new ObjectOutputStream(socket.getOutputStream());
					ous.writeObject(w);
					label.setText("Gratulacje! Uda³o Ci siê zapisaæ!");
					socket.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnZapisz.setBounds(353, 231, 89, 23);
		frmZapisuje.getContentPane().add(btnZapisz);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(515, 25, 19, 20);
		frmZapisuje.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setVisible(false);

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(515, 50, 19, 20);
		frmZapisuje.getContentPane().add(textField_3);
		textField_3.setVisible(false);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(515, 75, 19, 20);
		frmZapisuje.getContentPane().add(textField_4);
		textField_4.setVisible(false);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(515, 100, 19, 20);
		frmZapisuje.getContentPane().add(textField_5);
		textField_5.setVisible(false);

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(515, 125, 19, 20);
		frmZapisuje.getContentPane().add(textField_6);
		textField_6.setVisible(false);

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(515, 150, 19, 20);
		frmZapisuje.getContentPane().add(textField_7);
		textField_7.setVisible(false);

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(515, 175, 19, 20);
		frmZapisuje.getContentPane().add(textField_8);
		textField_8.setVisible(false);

		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(515, 200, 19, 20);
		frmZapisuje.getContentPane().add(textField_9);
		textField_9.setVisible(false);

		label = new JLabel("");
		label.setBounds(10, 235, 317, 14);
		frmZapisuje.getContentPane().add(label);
		btnZapisz.setVisible(false);

	}
}
