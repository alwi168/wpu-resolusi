package SispakLaptop;

import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class FrmMenuUtama extends JFrame {

	private JPanel contentPane;
	private JPanel panelAtas;
	private static JLabel lblWall;
	private JPanel panelDock;
	private static JLabel lblPlank;
	private JLabel lblAbout;
	private JLabel lblLogOut;
	private JLabel lblJam;
	private static JLabel lblApp;
	private JPanel panelMenu;
	private static JLabel lblIconApp;
	static String username;
	static String password;
	static String level;
	private JButton btnKamus;
	private static ClButtonTransparan btnUserManagement;
	private JLabel lblHelp;
	private ClButtonTransparan btnIdentifikasi;
	private ClButtonTransparan btnKesimpulan;
	private ClButtonTransparan btnAturanYa;
	private ClButtonTransparan btnAturanTdk;
	private ClButtonTransparan btnArahan;
	private JLabel lblIconbaterai;
	private JLabel lblIconNetwork;
	private JPanel panelInfo;
	private JLabel lblSelamatDatang;
	private JLabel lblKlik;
	private JLabel label;
	private JLabel lblMulai;
	private ClButtonTransparan btnDiagnosis;
	static JPanel panelUser;
	private JLabel lblKamusUser;
	private JLabel lblDiagnosisUser;

	/**
	 * Create the frame.
	 */
	public FrmMenuUtama() {
		setResizable(false);
		setTitle("Menu Utama");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelAtas = new ClPanelTransparan();
		panelAtas.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelAtas.setBounds(0, 0, 769, 29);
		contentPane.add(panelAtas);
		panelAtas.setLayout(null);

		lblJam = new JLabel("");
		lblJam.setFont(new Font("Courier 10 Pitch", Font.BOLD, 17));
		lblJam.setBounds(648, 0, 121, 29);
		panelAtas.add(lblJam);

		lblApp = new JLabel("Application");
		lblApp.setFont(new Font("Courier 10 Pitch", Font.BOLD, 17));
		lblApp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelMenu.setVisible(true);
			}
		});
		lblApp.setBounds(154, 0, 127, 29);
		panelAtas.add(lblApp);

		lblIconApp = new JLabel("");
		lblIconApp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelMenu.setVisible(true);
			}
		});
		lblIconApp.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/app.png")));
		lblIconApp.setFont(new Font("Courier 10 Pitch", Font.BOLD, 17));
		lblIconApp.setBounds(119, 0, 33, 29);
		panelAtas.add(lblIconApp);

		lblIconbaterai = new JLabel("90%");
		lblIconbaterai.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/battery.png")));
		lblIconbaterai.setBounds(512, 0, 70, 29);
		panelAtas.add(lblIconbaterai);

		lblIconNetwork = new JLabel("");
		lblIconNetwork.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/network-wired.png")));
		lblIconNetwork.setBounds(594, 0, 42, 29);
		panelAtas.add(lblIconNetwork);

		lblPlank = new JLabel("");
		lblPlank.setToolTipText("Menu");
		lblPlank.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlank.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblPlank.setIcon(new ImageIcon(FrmMenuUtama.class
						.getResource("/SispakLaptop/plank2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblPlank.setIcon(new ImageIcon(FrmMenuUtama.class
						.getResource("/SispakLaptop/plank.png")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				panelMenu.setVisible(true);
			}
		});
		lblPlank.setBounds(235, 380, 68, 75);
		contentPane.add(lblPlank);
		lblPlank.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/plank.png")));

		lblAbout = new JLabel("");
		lblAbout.setToolTipText("About");
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAbout.setIcon(new ImageIcon(FrmMenuUtama.class
						.getResource("/SispakLaptop/background2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblAbout.setIcon(new ImageIcon(FrmMenuUtama.class
						.getResource("/SispakLaptop/background.png")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				getRootPane().getGlassPane().setVisible(true);
				JOptionPane
						.showMessageDialog(
								FrmMenuUtama.this,
								"Ingat Hari Senin sudah mulai Puasa :D  : ingat tuh :)]",
								"Informasi Aplikasi",
								JOptionPane.INFORMATION_MESSAGE, new ImageIcon(
										("src/SispakLaptop/background2.png")));
				getRootPane().getGlassPane().setVisible(false);
			}
		});
		lblAbout.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/background.png")));
		lblAbout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbout.setBounds(311, 380, 68, 75);
		contentPane.add(lblAbout);

		lblLogOut = new JLabel("");
		lblLogOut.setToolTipText("Log Out");
		lblLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogOut.setIcon(new ImageIcon(FrmMenuUtama.class
						.getResource("/SispakLaptop/system-shutdown2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblLogOut.setIcon(new ImageIcon(FrmMenuUtama.class
						.getResource("/SispakLaptop/system-shutdown.png")));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				getRootPane().getGlassPane().setVisible(true);
				JOptionPane.showMessageDialog(FrmMenuUtama.this,
						"System Log Out", "Pesan",
						JOptionPane.INFORMATION_MESSAGE, new ImageIcon(
								("src/SispakLaptop/system-shutdown.png")));
				getRootPane().getGlassPane().setVisible(false);
				dialogLogin dialog = new dialogLogin();
				dialog.setVisible(true);
				dialog.setLocationRelativeTo(null);

			}
		});
		lblLogOut.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/system-shutdown.png")));
		lblLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogOut.setBounds(471, 380, 68, 75);
		contentPane.add(lblLogOut);

		lblHelp = new JLabel("");
		lblHelp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				getRootPane().getGlassPane().setVisible(true);
				JOptionPane
						.showMessageDialog(
								FrmMenuUtama.this,
								"saya atas nama muhammad alwi mengucapkan selamat menuaikan ibadah puasa ramadhan :)",
								"Batuan", JOptionPane.INFORMATION_MESSAGE,
								new ImageIcon(("src/SispakLaptop/easytag.png")));
				getRootPane().getGlassPane().setVisible(false);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblHelp.setIcon(new ImageIcon(FrmMenuUtama.class
						.getResource("/SispakLaptop/easytag2.png")));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblHelp.setIcon(new ImageIcon(FrmMenuUtama.class
						.getResource("/SispakLaptop/easytag.png")));
			}
		});
		lblHelp.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/easytag.png")));
		lblHelp.setToolTipText("Help");
		lblHelp.setHorizontalAlignment(SwingConstants.CENTER);
		lblHelp.setBounds(391, 380, 68, 75);
		contentPane.add(lblHelp);

		panelDock = new ClPanelTransparan();
		panelDock.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panelDock.setBounds(225, 426, 314, 29);
		contentPane.add(panelDock);
		panelDock.setLayout(null);

		panelMenu = new ClPanelTransparan();
		panelMenu.setVisible(false);
		panelMenu.setBorder(new ClCallOutBorder());
		panelMenu.setBounds(10, 31, 417, 298);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);

		btnKamus = new ClButtonTransparan("Kamus");
		btnKamus.setFont(new Font("Courier 10 Pitch", Font.BOLD, 12));
		btnKamus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrmKamus fk = new FrmKamus();
				fk.setVisible(true);
			}
		});
		btnKamus.setHorizontalTextPosition(SwingConstants.CENTER);
		btnKamus.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnKamus.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/accessories-text-editor.png")));
		btnKamus.setBounds(12, 27, 114, 78);
		panelMenu.add(btnKamus);

		btnUserManagement = new ClButtonTransparan("");
		btnUserManagement.setFont(new Font("Courier 10 Pitch", Font.BOLD, 12));
		btnUserManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act) {
				FrmTambahUser ftu = new FrmTambahUser();
				ftu.setVisible(true);
				ftu.setLocationRelativeTo(null);
			}
		});
		btnUserManagement.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/android.png")));
		btnUserManagement.setText("Tambah User");
		btnUserManagement.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnUserManagement.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUserManagement.setBounds(138, 27, 127, 78);
		panelMenu.add(btnUserManagement);

		btnIdentifikasi = new ClButtonTransparan("");
		btnIdentifikasi.setFont(new Font("Courier 10 Pitch", Font.BOLD, 12));
		btnIdentifikasi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act) {
				FrmIdentifikasi fi = new FrmIdentifikasi();
				fi.setVisible(true);
			}
		});
		btnIdentifikasi.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/jockey.png")));
		btnIdentifikasi.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnIdentifikasi.setText("Identifikasi");
		btnIdentifikasi.setHorizontalTextPosition(SwingConstants.CENTER);
		btnIdentifikasi.setBounds(277, 27, 127, 78);
		panelMenu.add(btnIdentifikasi);

		btnKesimpulan = new ClButtonTransparan("Kamus");
		btnKesimpulan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent act) {
				FrmKesimpulan fk = new FrmKesimpulan();
				fk.setVisible(true);
			}
		});
		btnKesimpulan.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/libreoffice3-writer.png")));
		btnKesimpulan.setFont(new Font("Courier 10 Pitch", Font.BOLD, 12));
		btnKesimpulan.setText("Kesimpulan");
		btnKesimpulan.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnKesimpulan.setHorizontalTextPosition(SwingConstants.CENTER);
		btnKesimpulan.setBounds(12, 117, 114, 78);
		panelMenu.add(btnKesimpulan);

		btnAturanYa = new ClButtonTransparan("");
		btnAturanYa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrmAturanYa fay = new FrmAturanYa();
				fay.setVisible(true);
			}
		});
		btnAturanYa.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/web-google-play.png")));
		btnAturanYa.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAturanYa.setText("Aturan Ya");
		btnAturanYa.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAturanYa.setFont(new Font("Courier 10 Pitch", Font.BOLD, 12));
		btnAturanYa.setBounds(138, 117, 127, 78);
		panelMenu.add(btnAturanYa);

		btnAturanTdk = new ClButtonTransparan("");
		btnAturanTdk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmAturanTidak fat = new FrmAturanTidak();
				fat.setVisible(true);
			}
		});
		btnAturanTdk.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/xournal.png")));
		btnAturanTdk.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnAturanTdk.setText("Aturan Tidak");
		btnAturanTdk.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAturanTdk.setFont(new Font("Courier 10 Pitch", Font.BOLD, 12));
		btnAturanTdk.setBounds(277, 117, 127, 78);
		panelMenu.add(btnAturanTdk);

		btnArahan = new ClButtonTransparan("Kamus");
		btnArahan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrmArahan fa = new FrmArahan();
				fa.setVisible(true);
			}
		});
		btnArahan.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/lubuntu-software-center.png")));
		btnArahan.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnArahan.setText("Arahan");
		btnArahan.setHorizontalTextPosition(SwingConstants.CENTER);
		btnArahan.setFont(new Font("Courier 10 Pitch", Font.BOLD, 12));
		btnArahan.setBounds(12, 207, 114, 78);
		panelMenu.add(btnArahan);

		btnDiagnosis = new ClButtonTransparan("");
		btnDiagnosis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrmKerusakan fd = new FrmKerusakan();
				fd.setVisible(true);
			}
		});
		btnDiagnosis.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/apport.png")));
		btnDiagnosis.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnDiagnosis.setText("Diagnosis");
		btnDiagnosis.setHorizontalTextPosition(SwingConstants.CENTER);
		btnDiagnosis.setFont(new Font("Courier 10 Pitch", Font.BOLD, 12));
		btnDiagnosis.setBounds(138, 207, 127, 78);
		panelMenu.add(btnDiagnosis);

		lblWall = new JLabel("");
		lblWall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelMenu.setVisible(false);
			}
		});

		panelInfo = new LeftArrowBubble();
		panelInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panelInfo.setVisible(false);
				label.setVisible(false);
			}
		});
		panelInfo.setBounds(508, 82, 249, 57);
		contentPane.add(panelInfo);
		panelInfo.setLayout(null);

		lblSelamatDatang = new JLabel("Selamat Datang");
		lblSelamatDatang.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelamatDatang.setFont(new Font("Droid Sans", Font.BOLD, 12));
		lblSelamatDatang.setBounds(62, 0, 120, 15);
		panelInfo.add(lblSelamatDatang);

		lblKlik = new JLabel("Klik");
		lblKlik.setFont(new Font("Droid Sans", Font.BOLD, 12));
		lblKlik.setHorizontalAlignment(SwingConstants.CENTER);
		lblKlik.setBounds(22, 30, 38, 15);
		panelInfo.add(lblKlik);

		lblMulai = new JLabel("Application untuk memulai");
		lblMulai.setHorizontalAlignment(SwingConstants.LEFT);
		lblMulai.setFont(new Font("Droid Sans", Font.BOLD, 12));
		lblMulai.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/chromeIcon.png")));
		lblMulai.setBounds(59, 27, 178, 18);
		panelInfo.add(lblMulai);

		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/androidIcon.png")));
		label.setBounds(430, 67, 75, 75);
		contentPane.add(label);

		panelUser = new ClPanelTransparan();
		panelUser.setBorder(new LineBorder(new Color(255, 255, 255), 1, true));
		panelUser.setBounds(147, 314, 455, 75);
		contentPane.add(panelUser);
		panelUser.setLayout(null);

		lblKamusUser = new JLabel("Kamus User");
		lblKamusUser.setForeground(new Color(255, 255, 255));
		lblKamusUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrmKamus fk = new FrmKamus();
				fk.setVisible(true);
				fk.btnSimpan.setVisible(false);
				fk.btnUbah.setVisible(false);
				fk.btnHapus.setVisible(false);
			}
		});
		lblKamusUser.setFont(new Font("Droid Sans", Font.BOLD, 12));
		lblKamusUser.setHorizontalTextPosition(SwingConstants.CENTER);
		lblKamusUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblKamusUser.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblKamusUser.setBounds(12, 0, 167, 71);
		panelUser.add(lblKamusUser);
		lblKamusUser.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/accessories-text-editor.png")));

		lblDiagnosisUser = new JLabel("Diagnosis");
		lblDiagnosisUser.setForeground(new Color(255, 255, 255));
		lblDiagnosisUser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FrmKerusakan fk = new FrmKerusakan();
				fk.setVisible(true);
			}
		});
		lblDiagnosisUser.setFont(new Font("Droid Sans", Font.BOLD, 12));
		lblDiagnosisUser.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/apport.png")));
		lblDiagnosisUser.setVerticalTextPosition(SwingConstants.BOTTOM);
		lblDiagnosisUser.setHorizontalTextPosition(SwingConstants.CENTER);
		lblDiagnosisUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiagnosisUser.setBounds(251, 0, 167, 71);
		panelUser.add(lblDiagnosisUser);
		lblWall.setIcon(new ImageIcon(FrmMenuUtama.class
				.getResource("/SispakLaptop/wall.png")));
		lblWall.setBounds(0, 0, 769, 455);
		contentPane.add(lblWall);
		setLocationRelativeTo(null);

		// Jam Desktop
		ActionListener listener = new ActionListener()

		{

			@Override
			public void actionPerformed(ActionEvent act)

			{
				// TODO Auto-generated method stub

				String sJam = " ";
				String sMenit = " ";
				String sDetik = " ";

				Date today = new Date();
				@SuppressWarnings("deprecation")
				int now_Jam = today.getHours(); // Mengambil jam saat ini
				@SuppressWarnings("deprecation")
				int now_Menit = today.getMinutes(); // Mengambil menit saat ini
				@SuppressWarnings("deprecation")
				int now_Detik = today.getSeconds(); // Mengambil detik saat ini

				if (now_Jam <= 9) {
					sJam = "0"; // Menambah angka 0 di depan Jam
				}
				if (now_Menit <= 9) {
					sMenit = "0"; // Menambah angka 0 di depan Menit
				}
				if (now_Detik <= 9) {
					sDetik = "0"; // Menambah angka 0 di depan Detik
				}

				String Jam = sJam + Integer.toString(now_Jam); // Merubah type
																// data int
																// now_Jam
																// menjadi
																// String
				String Menit = sMenit + Integer.toString(now_Menit); // Merubah
																		// type
																		// data
																		// int
																		// now_Menit
																		// menjadi
																		// String
				String Detik = sDetik + Integer.toString(now_Detik); // Merubah
																		// type
																		// data
																		// int
																		// now_Detik
																		// menjadi
																		// String

				lblJam.setText(Jam + ":" + Menit + ":" + Detik);

			}
		};

		Timer waktu = new Timer(1000, listener);
		waktu.start();

		getRootPane().setGlassPane(new JComponent() {
			public void paintComponent(Graphics g) {
				g.setColor(new Color(0, 0, 0, 100));
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		});

		addWindowListener(new WindowAdapter() {
			public void windowOpened(WindowEvent we) {
				bukaLogin();
			}
		});
		panelUser.setVisible(false);
	} // Akhir Konstruktor

	public static void levelMenu() {

		if (level.equals("Admin")) {

		} else if (level.equals("User")) {
			panelUser.setVisible(true);
			lblApp.setVisible(false);
			lblIconApp.setVisible(false);
			lblWall.setIcon(new ImageIcon(FrmMenuUtama.class
					.getResource("/SispakLaptop/wall_3.jpg")));
			lblPlank.setVisible(false);
		}
	}

	public static Boolean statusLogin() {

		Boolean status = false;
		PreparedStatement prepare = null;
		Connection konek = null;
		try {
			konek = Koneksi.getKoneksi();
			String sql = " SELECT * FROM  akses " + " WHERE username = ? "
					+ " AND password = ? AND level = ?";
			prepare = konek.prepareStatement(sql);
			prepare.setString(1, username);
			prepare.setString(2, password);
			prepare.setString(3, level);

			ResultSet rec = prepare.executeQuery();
			if (rec.next()) {
				status = true;
			} else {
				JOptionPane
						.showMessageDialog(null, "Username / Password salah");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}

		return status;
	}

	public static void bukaLogin() {

		dialogLogin login = new dialogLogin();
		login.setModal(true);
		login.setVisible(true);

		username = login.loginusername;
		password = login.loginpassword;
		level = login.loginlevel;

		// Check Login
		if (!statusLogin()) {
			bukaLogin();
		} else {
			levelMenu(); // Login Success
		}

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager
							.getSystemLookAndFeelClassName());
					FrmMenuUtama frame = new FrmMenuUtama();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
