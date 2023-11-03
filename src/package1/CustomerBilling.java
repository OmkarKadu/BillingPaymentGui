package package1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CustomerBilling {

	private JFrame frameAddStudent;
	private JTextField txtName;
	private JTextField txtPhnNumber;
	private JTextField txtBillNumber;
	private JTextField txtBathSoap;
	private JTextField txtFaceCrm;
	private JTextField txtFaceWash;
	private JTextField txtHairSpray;
	private JTextField txtBLotion;
	private JTextField txtRice;
	private JTextField txtWheat;
	private JTextField txtDaal;
	private JTextField txtSugar;
	private JTextField txtCoffee;
	private JTextField txtCoke;
	private JTextField txtWbtl;
	private JTextField txtStationary;
	private JTextField txtTshirt;
	private JTextField txtJeans;
	private JTextField txtMail;
	private JTextField txtSubtotal;
	private JTextField txtSGST;
	private JTextField txtCGST;
	private JTextField txtTotalTax;
	private JTextField txtTotalAmount;
	private double bathsoap=10;
	private double facecream=50.00;
	private double facewash=70.00;
	private double hairspray=110.00;
	private double bodylotion=155.00;
	private double rice =55.50;
	private double wheat = 39.50;
	private double daal= 24.00;
	private double sugar = 52.00;
	private double coffee = 30.00;
	private double coke = 20.00;
	private double waterbottle = 20.00;
	private double pen = 10.00;
	private double tshirt=350.00;
	private double jeans = 999.00;
	private double Subtotal;
	private JTextArea txtReceipt;
	int billNo = (int)(Math.random()*1000);
	private JCheckBox chckboxBathSoap ,chckbxFaceCream ,chckbxFaceWash ,chckbxHairSpray,chckbxBodyLotion,chckbxRice,chckbxWheat,chckbxDaal,chckbxSugar,chckbxCoffee,chckbxCoke,chckbxWaterBottle,chckbxStationary,chckbxTshirt,chckbxJeans;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerBilling window = new CustomerBilling();
					window.frameAddStudent.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerBilling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameAddStudent = new JFrame();
		frameAddStudent.getContentPane().setBackground(new Color(29, 74, 99));
		frameAddStudent.setBounds(250, 50, 1250, 800);
		frameAddStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameAddStudent.getContentPane().setLayout(null);


		JLabel lblNewLabel = new JLabel(" Billing Software");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(470, 0, 295, 49);
		frameAddStudent.getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 46, 1236, 25);
		frameAddStudent.getContentPane().add(separator);

		JLabel lblNewLabel_1 = new JLabel("Customer Details");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setBounds(20, 59, 122, 33);
		frameAddStudent.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Customer Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(20, 102, 122, 25);
		frameAddStudent.getContentPane().add(lblNewLabel_1_1);

		txtName = new JTextField();
		txtName.setBounds(152, 106, 135, 19);
		frameAddStudent.getContentPane().add(txtName);
		txtName.setColumns(10);

		JLabel lblNewLabel_1_1_1 = new JLabel("Phone No.");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(314, 102, 68, 25);
		frameAddStudent.getContentPane().add(lblNewLabel_1_1_1);

		txtPhnNumber = new JTextField();
		txtPhnNumber.setColumns(10);
		txtPhnNumber.setBounds(392, 106, 135, 19);
		frameAddStudent.getContentPane().add(txtPhnNumber);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Bill No");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_1.setBounds(793, 102, 68, 25);
		frameAddStudent.getContentPane().add(lblNewLabel_1_1_1_1);

		txtBillNumber = new JTextField();
		txtBillNumber.setColumns(10);
		txtBillNumber.setBounds(871, 106, 135, 19);
		frameAddStudent.getContentPane().add(txtBillNumber);
		

		JButton btnDetailEnter = new JButton("ENTER");
		btnDetailEnter.setForeground(new Color(255, 255, 255));
		btnDetailEnter.setBackground(new Color(0, 0, 191));
		btnDetailEnter.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		btnDetailEnter.setBounds(1016, 81, 110, 46);
		frameAddStudent.getContentPane().add(btnDetailEnter);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 137, 1236, 25);
		frameAddStudent.getContentPane().add(separator_1);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(29, 74, 99));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(55, 118, 136)));
		panel.setBounds(20, 147, 300, 348);
		frameAddStudent.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel tct = new JLabel("Cosmetics");
		tct.setHorizontalAlignment(SwingConstants.LEFT);
		tct.setForeground(new Color(239, 222, 16));
		tct.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tct.setBounds(10, 0, 122, 13);
		panel.add(tct);

		txtBathSoap = new JTextField();
		txtBathSoap.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});

		txtBathSoap.setEnabled(false);
		txtBathSoap.setColumns(10);
		txtBathSoap.setBounds(116, 27, 140, 36);
		panel.add(txtBathSoap);

		txtFaceCrm = new JTextField();
		txtFaceCrm.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtFaceCrm.setEnabled(false);
		txtFaceCrm.setColumns(10);
		txtFaceCrm.setBounds(116, 93, 140, 36);
		panel.add(txtFaceCrm);

		txtFaceWash = new JTextField();
		txtFaceWash.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtFaceWash.setEnabled(false);
		txtFaceWash.setColumns(10);
		txtFaceWash.setBounds(116, 156, 140, 36);
		panel.add(txtFaceWash);

		txtHairSpray = new JTextField();
		txtHairSpray.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtHairSpray.setEnabled(false);
		txtHairSpray.setColumns(10);
		txtHairSpray.setBounds(116, 218, 140, 36);
		panel.add(txtHairSpray);

		txtBLotion = new JTextField();
		txtBLotion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtBLotion.setEnabled(false);
		txtBLotion.setColumns(10);
		txtBLotion.setBounds(116, 283, 140, 36);
		panel.add(txtBLotion);

		chckboxBathSoap = new JCheckBox("Bath Soap");
		chckboxBathSoap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckboxBathSoap.isSelected()) {
					txtBathSoap.setEnabled(true);
					txtBathSoap.setText("1");
					calculateBillingAmount();
					liveBillPrint();
					
				}else {
					txtBathSoap.setText("0");
					txtBathSoap.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckboxBathSoap.setForeground(new Color(255, 255, 255));
		chckboxBathSoap.setBackground(new Color(29, 74, 99));
		chckboxBathSoap.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckboxBathSoap.setBounds(10, 33, 93, 21);
		panel.add(chckboxBathSoap);
		
		

		 chckbxFaceCream = new JCheckBox("Face Cream");
		chckbxFaceCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFaceCream.isSelected()) {
					txtFaceCrm.setEnabled(true);
					txtFaceCrm.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtFaceCrm.setText("0");
					txtFaceCrm.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxFaceCream.setForeground(Color.WHITE);
		chckbxFaceCream.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxFaceCream.setBackground(new Color(29, 74, 99));
		chckbxFaceCream.setBounds(10, 99, 107, 21);
		panel.add(chckbxFaceCream);

		 chckbxFaceWash = new JCheckBox("Face Wash");
		chckbxFaceWash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFaceWash.isSelected()) {
					txtFaceWash.setEnabled(true);
					txtFaceWash.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtFaceWash.setText("0");
					txtFaceWash.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxFaceWash.setForeground(Color.WHITE);
		chckbxFaceWash.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxFaceWash.setBackground(new Color(29, 74, 99));
		chckbxFaceWash.setBounds(10, 163, 107, 21);
		panel.add(chckbxFaceWash);

		 chckbxHairSpray = new JCheckBox("Hair Spray");
		chckbxHairSpray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxHairSpray.isSelected()) {
					txtHairSpray.setEnabled(true);
					txtHairSpray.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtHairSpray.setText("0");
					txtHairSpray.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxHairSpray.setForeground(Color.WHITE);
		chckbxHairSpray.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxHairSpray.setBackground(new Color(29, 74, 99));
		chckbxHairSpray.setBounds(6, 225, 107, 21);
		panel.add(chckbxHairSpray);

		 chckbxBodyLotion = new JCheckBox("Body Lotion");
		chckbxBodyLotion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBodyLotion.isSelected()) {
					txtBLotion.setEnabled(true);
					txtBLotion.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtBLotion.setText("0");
					txtBLotion.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxBodyLotion.setForeground(Color.WHITE);
		chckbxBodyLotion.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxBodyLotion.setBackground(new Color(29, 74, 99));
		chckbxBodyLotion.setBounds(10, 290, 107, 21);
		panel.add(chckbxBodyLotion);

		JLabel lblNewLabel_1_2 = new JLabel("Cosmetics");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(new Color(239, 222, 16));
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(36, 149, 122, 13);
		frameAddStudent.getContentPane().add(lblNewLabel_1_2);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(55, 118, 136)));
		panel_1.setBackground(new Color(29, 74, 99));
		panel_1.setBounds(330, 147, 300, 348);
		frameAddStudent.getContentPane().add(panel_1);

		JLabel lblGrocery = new JLabel("Grocery");
		lblGrocery.setHorizontalAlignment(SwingConstants.LEFT);
		lblGrocery.setForeground(new Color(239, 222, 16));
		lblGrocery.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblGrocery.setBounds(10, 0, 122, 13);
		panel_1.add(lblGrocery);

		txtRice = new JTextField();
		txtRice.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtRice.setEnabled(false);
		txtRice.setColumns(10);
		txtRice.setBounds(116, 27, 140, 36);
		panel_1.add(txtRice);

		txtWheat = new JTextField();
		txtWheat.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtWheat.setEnabled(false);
		txtWheat.setColumns(10);
		txtWheat.setBounds(116, 93, 140, 36);
		panel_1.add(txtWheat);

		txtDaal = new JTextField();
		txtDaal.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtDaal.setEnabled(false);
		txtDaal.setColumns(10);
		txtDaal.setBounds(116, 156, 140, 36);
		panel_1.add(txtDaal);

		txtSugar = new JTextField();
		txtSugar.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtSugar.setEnabled(false);
		txtSugar.setColumns(10);
		txtSugar.setBounds(116, 218, 140, 36);
		panel_1.add(txtSugar);

		txtCoffee = new JTextField();
		txtCoffee.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtCoffee.setEnabled(false);
		txtCoffee.setColumns(10);
		txtCoffee.setBounds(116, 283, 140, 36);
		panel_1.add(txtCoffee);

		 chckbxRice = new JCheckBox("Rice");
		chckbxRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRice.isSelected()) {
					txtRice.setEnabled(true);
					txtRice.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtRice.setText("0");
					txtRice.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxRice.setForeground(Color.WHITE);
		chckbxRice.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxRice.setBackground(new Color(29, 74, 99));
		chckbxRice.setBounds(6, 33, 107, 21);
		panel_1.add(chckbxRice);

		 chckbxWheat = new JCheckBox("Wheat");
		chckbxWheat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxWheat.isSelected()) {
					txtWheat.setEnabled(true);
					txtWheat.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtWheat.setText("0");
					txtWheat.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxWheat.setForeground(Color.WHITE);
		chckbxWheat.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxWheat.setBackground(new Color(29, 74, 99));
		chckbxWheat.setBounds(3, 99, 107, 21);
		panel_1.add(chckbxWheat);

		 chckbxDaal = new JCheckBox("Daal");
		chckbxDaal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxDaal.isSelected()) {
					txtDaal.setEnabled(true);
					txtDaal.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtDaal.setText("0");
					txtDaal.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxDaal.setForeground(Color.WHITE);
		chckbxDaal.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxDaal.setBackground(new Color(29, 74, 99));
		chckbxDaal.setBounds(10, 163, 107, 21);
		panel_1.add(chckbxDaal);

		 chckbxSugar = new JCheckBox("Sugar");
		chckbxSugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSugar.isSelected()) {
					txtSugar.setEnabled(true);
					txtSugar.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtSugar.setText("0");
					txtSugar.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxSugar.setForeground(Color.WHITE);
		chckbxSugar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxSugar.setBackground(new Color(29, 74, 99));
		chckbxSugar.setBounds(10, 225, 107, 21);
		panel_1.add(chckbxSugar);

		 chckbxCoffee = new JCheckBox("Coffee");
		chckbxCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCoffee.isSelected()) {
					txtCoffee.setEnabled(true);
					txtCoffee.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtCoffee.setText("0");
					txtCoffee.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxCoffee.setForeground(Color.WHITE);
		chckbxCoffee.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxCoffee.setBackground(new Color(29, 74, 99));
		chckbxCoffee.setBounds(10, 290, 107, 21);
		panel_1.add(chckbxCoffee);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(55, 118, 136)));
		panel_1_1.setBackground(new Color(29, 74, 99));
		panel_1_1.setBounds(639, 147, 196, 348);
		frameAddStudent.getContentPane().add(panel_1_1);

		JLabel lblOther = new JLabel("Other");
		lblOther.setHorizontalAlignment(SwingConstants.LEFT);
		lblOther.setForeground(new Color(239, 222, 16));
		lblOther.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblOther.setBounds(10, 0, 122, 13);
		panel_1_1.add(lblOther);

		txtCoke = new JTextField();
		txtCoke.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtCoke.setEnabled(false);
		txtCoke.setColumns(10);
		txtCoke.setBounds(116, 27, 70, 36);
		panel_1_1.add(txtCoke);

		txtWbtl = new JTextField();
		txtWbtl.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtWbtl.setEnabled(false);
		txtWbtl.setColumns(10);
		txtWbtl.setBounds(116, 93, 70, 36);
		panel_1_1.add(txtWbtl);

		txtStationary = new JTextField();
		txtStationary.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtStationary.setEnabled(false);
		txtStationary.setColumns(10);
		txtStationary.setBounds(116, 156, 70, 36);
		panel_1_1.add(txtStationary);

		txtTshirt = new JTextField();
		txtTshirt.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtTshirt.setEnabled(false);
		txtTshirt.setColumns(10);
		txtTshirt.setBounds(116, 218, 70, 36);
		panel_1_1.add(txtTshirt);

		txtJeans = new JTextField();
		txtJeans.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				calculateBillingAmount();
				liveBillPrint();
			}
		});
		txtJeans.setEnabled(false);
		txtJeans.setColumns(10);
		txtJeans.setBounds(116, 283, 70, 36);
		panel_1_1.add(txtJeans);

		 chckbxCoke = new JCheckBox("Coke");
		chckbxCoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCoke.isSelected()) {
					txtCoke.setEnabled(true);
					txtCoke.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtCoke.setText("0");
					txtCoke.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxCoke.setForeground(Color.WHITE);
		chckbxCoke.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxCoke.setBackground(new Color(29, 74, 99));
		chckbxCoke.setBounds(10, 34, 107, 21);
		panel_1_1.add(chckbxCoke);

		 chckbxWaterBottle = new JCheckBox("Water Btl");
		chckbxWaterBottle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxWaterBottle.isSelected()) {
					txtWbtl.setEnabled(true);
					txtWbtl.setText("1");
					calculateBillingAmount();
					liveBillPrint();
					
				}else { 
					txtWbtl.setText("0");
					txtWbtl.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxWaterBottle.setForeground(Color.WHITE);
		chckbxWaterBottle.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxWaterBottle.setBackground(new Color(29, 74, 99));
		chckbxWaterBottle.setBounds(10, 100, 107, 21);
		panel_1_1.add(chckbxWaterBottle);

		 chckbxStationary = new JCheckBox("Stationary");
		chckbxStationary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxStationary.isSelected()) {
					txtStationary.setEnabled(true);
					txtStationary.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtStationary.setText("0");
					txtStationary.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxStationary.setForeground(Color.WHITE);
		chckbxStationary.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxStationary.setBackground(new Color(29, 74, 99));
		chckbxStationary.setBounds(10, 163, 107, 21);
		panel_1_1.add(chckbxStationary);

		 chckbxTshirt =  new JCheckBox("T-Shirt");
		chckbxTshirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxTshirt.isSelected()) {
					txtTshirt.setEnabled(true);
					txtTshirt.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtTshirt.setText("0");
					txtTshirt.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxTshirt.setForeground(Color.WHITE);
		chckbxTshirt.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxTshirt.setBackground(new Color(29, 74, 99));
		chckbxTshirt.setBounds(10, 225, 107, 21);
		panel_1_1.add(chckbxTshirt);

		 chckbxJeans = new JCheckBox("Jeans");
		chckbxJeans.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxJeans.isSelected()) {
					txtJeans.setEnabled(true);
					txtJeans.setText("1");
					calculateBillingAmount();
					liveBillPrint();
				}else { 
					txtJeans.setText("0");
					txtJeans.setEnabled(false);
					calculateBillingAmount();
					liveBillPrint();
				}
			}
		});
		chckbxJeans.setForeground(Color.WHITE);
		chckbxJeans.setFont(new Font("Times New Roman", Font.BOLD, 15));
		chckbxJeans.setBackground(new Color(29, 74, 99));
		chckbxJeans.setBounds(10, 290, 107, 21);
		panel_1_1.add(chckbxJeans);

		 txtReceipt = new JTextArea();
		txtReceipt.setBounds(861, 160, 353, 593);
		frameAddStudent.getContentPane().add(txtReceipt);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("EmailD");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1_1_1_1_1.setBounds(552, 102, 68, 25);
		frameAddStudent.getContentPane().add(lblNewLabel_1_1_1_1_1);

		txtMail = new JTextField();
		txtMail.setColumns(10);
		txtMail.setBounds(624, 106, 135, 19);
		frameAddStudent.getContentPane().add(txtMail);

		JPanel panel_2 = new JPanel();
		panel_2.setForeground(new Color(64, 128, 128));
		panel_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(64, 128, 128)));
		panel_2.setBackground(new Color(29, 74, 99));
		panel_2.setBounds(20, 516, 831, 237);
		frameAddStudent.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1_3 = new JLabel("Bill Menu");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_3.setForeground(Color.YELLOW);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(20, 0, 122, 33);
		panel_2.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_1_2 = new JLabel("Subtotal");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_2.setBounds(20, 43, 84, 25);
		panel_2.add(lblNewLabel_1_1_2);

		JLabel lblNewLabel_1_1_2_1 = new JLabel("SGST");
		lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_2_1.setBounds(20, 89, 84, 25);
		panel_2.add(lblNewLabel_1_1_2_1);

		JLabel lblNewLabel_1_1_2_2 = new JLabel("CGST");
		lblNewLabel_1_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2_2.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_2_2.setBounds(20, 127, 84, 25);
		panel_2.add(lblNewLabel_1_1_2_2);

		txtSubtotal = new JTextField();
		txtSubtotal.setColumns(10);
		txtSubtotal.setBounds(114, 32, 140, 36);
		panel_2.add(txtSubtotal);

		txtSGST = new JTextField();
		txtSGST.setColumns(10);
		txtSGST.setBounds(114, 78, 140, 36);
		panel_2.add(txtSGST);

		txtCGST = new JTextField();
		txtCGST.setColumns(10);
		txtCGST.setBounds(114, 124, 140, 36);
		panel_2.add(txtCGST);

		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Total Tax");
		lblNewLabel_1_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1_2_1_1.setBounds(20, 173, 84, 25);
		panel_2.add(lblNewLabel_1_1_2_1_1);

		txtTotalTax =  new JTextField();
		txtTotalTax.setColumns(10);
		txtTotalTax.setBounds(114, 170, 140, 36);
		panel_2.add(txtTotalTax);

		JLabel lblNewLabel_1_1_2_3 = new JLabel("Total Amount");
		lblNewLabel_1_1_2_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2_3.setForeground(new Color(242, 13, 18));
		lblNewLabel_1_1_2_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_2_3.setBounds(317, 63, 122, 25);
		panel_2.add(lblNewLabel_1_1_2_3);

		txtTotalAmount = new JTextField();
		txtTotalAmount.setHorizontalAlignment(SwingConstants.CENTER);
		txtTotalAmount.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtTotalAmount.setBackground(new Color(0, 0, 0));
		txtTotalAmount.setForeground(new Color(232, 232, 23));
		txtTotalAmount.setText("0.00 RS");
		txtTotalAmount.setColumns(10);
		txtTotalAmount.setBounds(317, 98, 140, 36);
		panel_2.add(txtTotalAmount);

		JButton btnNewButton = new JButton("Generate Bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtReceipt.setText(null);
				
				txtReceipt.append("\t      DMart Customer Billing System" +
				        "\n      S No 35/4, DMart, Datta Nagar Road,Ambegaon Bk,\n                                            Pune - 411041" + 
						"\n   ===============================================" +
						"\n   Bill No : " + billNo +
						"\n   Customer Name : " + txtName.getText() +
						"\n   Email Id : " + txtMail.getText() +
						"\n   Phone Number : " + txtPhnNumber.getText() +
						"\n   -------------------------------------------------------------------------------------" +
						"\n   Item Name                                                          Qty         Price " +
						"\n   -------------------------------------------------------------------------------------"); 
				
				if(chckboxBathSoap.isSelected()) {
					txtReceipt.append("\n   " + chckboxBathSoap.getLabel() + "                                                          "
							+ "   "  +  txtBathSoap.getText() +  "           "   + bathsoap);
				}
				
				if(chckbxFaceCream.isSelected()) {
					txtReceipt.append("\n   " + chckbxFaceCream.getLabel() + "                                                         "
							+ ""+ txtFaceCrm.getText() +  "            "   + facecream);
				}
				if(chckbxFaceWash.isSelected()) {
					txtReceipt.append("\n   " + chckbxFaceWash.getLabel() + "                                                          "
							+ " "  + txtFaceWash.getText() +  "             "   + facewash);
				}
				if(chckbxHairSpray.isSelected()) {
					txtReceipt.append("\n   " + chckbxHairSpray.getLabel() + "                                                           "
							+ "  "  + txtHairSpray.getText() +  "            "  + hairspray);
				}
				if(chckbxBodyLotion.isSelected()) {
					txtReceipt.append("\n   " + chckbxBodyLotion.getLabel() + "                                                         "
							+ "  "  + txtBLotion.getText() +  "            "  + bodylotion);
				}
				if(chckbxRice.isSelected()) {
					txtReceipt.append("\n   " + chckbxRice.getLabel() + "                                                            "
							+   "   \t   "  +    txtRice.getText()  + "            "  + rice);
				}
				if(chckbxWheat.isSelected()) {
					txtReceipt.append("\n   " + chckbxWheat.getLabel() + "                                                        "
							+ "  \t   "  + txtWheat.getText() +  "            "  + wheat);
				}
				if(chckbxDaal.isSelected()) {
					txtReceipt.append("\n   " + chckbxDaal.getLabel() + "                                                        "
							+ "  \t   "  + txtDaal.getText() +  "            "  + daal);
				}
				if(chckbxSugar.isSelected()) {
					txtReceipt.append("\n   " + chckbxSugar.getLabel() + "                                                        "
							+ "  \t   "  + txtSugar.getText() +  "            "  + sugar);
				}
				if(chckbxCoffee.isSelected()) {
					txtReceipt.append("\n   " + chckbxCoffee.getLabel() + "                                                        "
							+ "  \t   " + txtCoffee.getText() + "            "  + coffee);
				}
				if(chckbxCoke.isSelected()) {
					txtReceipt.append("\n   " + chckbxCoke.getLabel() + "                                                        "
							+ "  \t   " + txtCoke.getText() + "            "  + coke);
				}
				if(chckbxWaterBottle.isSelected()) {
					txtReceipt.append("\n   " + chckbxWaterBottle.getLabel() + "                                                        "
							+ "  \t   " + txtWbtl.getText() + "            "  + waterbottle);
				}
				if(chckbxStationary.isSelected()) {
					txtReceipt.append("\n   " + chckbxStationary.getLabel() + "                                                        "
							+ "  \t   " + txtStationary.getText() + "            "  +  pen);
				}
				if(chckbxTshirt.isSelected()) {
					txtReceipt.append("\n   " + chckbxTshirt.getLabel() + "                                                        "
							+ "  \t   "   + txtTshirt.getText() + "          "  +  tshirt);
				}
				if(chckbxJeans.isSelected()) {
					txtReceipt.append("\n   " + chckbxJeans.getLabel() + "                                                        "
							+ "  \t   "   + txtJeans.getText() + "          " + jeans);
				}
				txtReceipt.append("\n   @SGST 9.00%");
				txtReceipt.append("\n   @CGST 9.00%");
				txtReceipt.append("\n   -------------------------------------------------------------------------------------");
				txtReceipt.append("\n   Subtotal :                                                                       " + Subtotal + " Rs/-");
				txtReceipt.append("\n   @SGST :                                                                      " + (Subtotal*0.09) + " Rs/-");
				txtReceipt.append("\n   @CGST :                                                                      " + (Subtotal*0.09) + " Rs/-");
				txtReceipt.append("\n   Total Amount :                                                               " + txtTotalAmount.getText() + "/-");
				txtReceipt.append("\n   -------------------------------------------------------------------------------------");
				txtReceipt.append("\n                                  Thank You !! Please Do Visit Again");
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(572, 26, 205, 46);
		panel_2.add(btnNewButton);

		JButton btnClearBill = new JButton("Clear Bill");
		btnClearBill.setFont(new Font("Arial", Font.PLAIN, 18));
		btnClearBill.setBackground(Color.LIGHT_GRAY);
		btnClearBill.setBounds(572, 85, 205, 46);
		panel_2.add(btnClearBill);

		JButton btnNewButton_1 = new JButton("PRINT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"No Printer Found");
			}
		});
		btnNewButton_1.setBackground(new Color(128, 255, 0));
		btnNewButton_1.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		btnNewButton_1.setBounds(510, 177, 98, 36);
		panel_2.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("EXIT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Do you want to Exit?","EXIT",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(0);;
				}

			}
		});
		btnNewButton_1_1.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(new Color(245, 10, 16));
		btnNewButton_1_1.setBounds(618, 177, 98, 36);
		panel_2.add(btnNewButton_1_1);

		JButton btnNewButton_1_2 = new JButton("RESET");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtPhnNumber.setText("");
				txtBillNumber.setText("");
				txtMail.setText("");

				txtBathSoap.setEnabled(false);
				txtFaceCrm.setEnabled(false);
				txtFaceWash.setEnabled(false);
				txtHairSpray.setEnabled(false);
				txtBLotion.setEnabled(false);
				txtRice.setEnabled(false);
				txtWheat.setEnabled(false);
				txtDaal.setEnabled(false);
				txtSugar.setEnabled(false);
				txtCoffee.setEnabled(false);
				txtCoke.setEnabled(false);
				txtWbtl.setEnabled(false);
				txtStationary.setEnabled(false);
				txtTshirt.setEnabled(false);
				txtJeans.setEnabled(false);
				txtMail.setEnabled(false);
				txtSubtotal.setEnabled(false);
				txtSGST.setEnabled(false);
				txtCGST.setEnabled(false); 
				txtTotalTax.setEnabled(false);
				txtTotalAmount.setEnabled(false);

				txtBathSoap.setText("0");
				txtFaceCrm.setText("0");
				txtFaceWash.setText("0");
				txtHairSpray.setText("0");
				txtBLotion.setText("0");
				txtRice.setText("0");
				txtWheat.setText("0");
				txtDaal.setText("0");
				txtSugar.setText("0");
				txtCoffee.setText("0");
				txtCoke.setText("0");
				txtWbtl.setText("0");
				txtStationary.setText("0");
				txtTshirt.setText("0");
				txtJeans.setText("0");
				txtMail.setText("0");
				txtSubtotal.setText("0");
				txtSGST.setText("0");
				txtCGST.setText("0"); 
				txtTotalTax.setText("0");
				txtTotalAmount.setText("0");
				
				chckboxBathSoap.setSelected(false);
				chckbxFaceCream.setSelected(false);
				chckbxFaceWash.setSelected(false);
				chckbxHairSpray.setSelected(false);
				chckbxBodyLotion.setSelected(false);
				chckbxRice.setSelected(false);
				chckbxWheat.setSelected(false);
				chckbxDaal.setSelected(false);
				chckbxSugar.setSelected(false);
				chckbxCoffee.setSelected(false);
				chckbxCoke.setSelected(false);
				chckbxWaterBottle.setSelected(false);
				chckbxStationary.setSelected(false);
				chckbxTshirt.setSelected(false);
				chckbxJeans.setSelected(false);
				
				Subtotal=0;
				
			
			}
		});
		btnNewButton_1_2.setForeground(new Color(255, 255, 255));
		btnNewButton_1_2.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		btnNewButton_1_2.setBackground(new Color(0, 0, 191));
		btnNewButton_1_2.setBounds(726, 177, 98, 36);
		panel_2.add(btnNewButton_1_2);

	}
	
	public void calculateBillingAmount(){
		Subtotal = 0;
		
		if(chckboxBathSoap.isSelected()) {
			Subtotal += (bathsoap*Double.parseDouble(txtBathSoap.getText()));
		}
		if(chckbxFaceCream.isSelected()) {
			Subtotal += (facecream*Double.parseDouble(txtFaceCrm.getText()));
		}
		if(chckbxFaceWash.isSelected()) {
			Subtotal += (facewash*Double.parseDouble(txtFaceWash.getText()));
		}
		if(chckbxHairSpray.isSelected()) {
			Subtotal += (hairspray*Double.parseDouble(txtHairSpray.getText()));
		}
		if(chckbxBodyLotion.isSelected()) {
			Subtotal += (bodylotion*Double.parseDouble(txtBLotion.getText()));
		}
		if(chckbxRice.isSelected()) {
			Subtotal += (rice*Double.parseDouble(txtRice.getText()));
		}
		if(chckbxWheat.isSelected()) {
			Subtotal += (wheat*Double.parseDouble(txtWheat.getText()));
		}
		if(chckbxDaal.isSelected()) {
			Subtotal += (daal*Double.parseDouble(txtDaal.getText()));
		}
		if(chckbxSugar.isSelected()) {
			Subtotal += (sugar*Double.parseDouble(txtSugar.getText()));
		}
		if(chckbxCoffee.isSelected()) {
			Subtotal += (coffee*Double.parseDouble(txtCoffee.getText()));
		}
		if(chckbxCoke.isSelected()) {
			Subtotal += (coke*Double.parseDouble(txtCoke.getText()));
		}
		if(chckbxWaterBottle.isSelected()) {
			Subtotal += (waterbottle*Double.parseDouble(txtWbtl.getText()));
		}
		if(chckbxStationary.isSelected()) {
			Subtotal += (pen*Double.parseDouble(txtStationary.getText()));
		}
		if(chckbxTshirt.isSelected()) {
			Subtotal += (tshirt*Double.parseDouble(txtTshirt.getText()));
		}
		if(chckbxJeans.isSelected()) {
			Subtotal += (jeans*Double.parseDouble(txtJeans.getText()));
		}	
	}
	
	public void liveBillPrint() {
		txtReceipt.setText(null);
		txtSubtotal.setText(Double.toString(Subtotal));
		txtCGST.setText(Double.toString(Subtotal*0.09));
		txtSGST.setText(Double.toString(Subtotal*0.09));
		txtTotalAmount.setText(Double.toString((Subtotal)+ Subtotal*0.18) + " Rs");
		txtTotalTax.setText(Double.toString(Subtotal*0.18));
	}
	
}































