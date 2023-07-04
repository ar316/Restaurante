package Vista;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Mesa extends JFrame {

	private JPanel contentPane;
	JLabel lblTotal = new JLabel("");
	JSpinner CantLimonada = new JSpinner();
	JSpinner CantPasteles = new JSpinner();
	JSpinner CantEmpanada = new JSpinner();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					new Mesa().setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */

	
	public void Setlabelsize(JLabel e, String root) {
		ImageIcon img = new ImageIcon(root);
		Icon icon = new ImageIcon(img.getImage().getScaledInstance(e.getWidth(), e.getHeight(), Image.SCALE_DEFAULT)
				);
		e.setIcon(icon);
		this.repaint();
	}
	public void CalcularTotal() {
		int cantempanada = Integer.parseInt(CantEmpanada.getValue().toString());
		int cantLimo = Integer.parseInt(CantLimonada.getValue().toString());
		int cantPast = Integer.parseInt(CantPasteles.getValue().toString());
		double precio = (cantempanada*2500) + (cantLimo*2000)+(cantPast*3000 );
		lblTotal.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		lblTotal.setText(aMoneda(precio));
		
	}
	
	public String aMoneda(double pres) {
		return "$ " +Math.round( pres*100.0)/100.0+ " COP";
	}
	
	public  Mesa() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}
	public void initComponents() {
	
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 311, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Realizar pedido");
		lblNewLabel.setBounds(171, 13, 97, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Empanadas");
		lblNewLabel_1.setBounds(151, 90, 83, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel imgEmapana = new JLabel("");
		imgEmapana.setBounds(12, 47, 130, 115);
		this.Setlabelsize(imgEmapana, "src//imagenes/empanada.png");
		contentPane.add(imgEmapana);
		CantEmpanada.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CalcularTotal();
			}
		});
		
		
		CantEmpanada.setModel(new SpinnerNumberModel(0, 0, 25, 1));
		CantEmpanada.setBounds(237, 87, 47, 22);
		contentPane.add(CantEmpanada);
		
		JLabel imgPastel = new JLabel("");
		imgPastel.setBounds(12, 47, 130, 115);
		Setlabelsize(imgPastel, "src//imagenes/pastel.png");
		
		
		imgPastel.setBounds(12, 194, 130, 115);
		contentPane.add(imgPastel);
		
		JLabel lblPastel = new JLabel("Pasteles");
		lblPastel.setBounds(151, 241, 83, 16);
		contentPane.add(lblPastel);
		
		
		CantPasteles.setModel(new SpinnerNumberModel(0, 0, 40, 1));
		CantPasteles.setBounds(237, 238, 47, 22);
		contentPane.add(CantPasteles);
		CantPasteles.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CalcularTotal();
			}
		});
		
		
		JLabel imgLimonada = new JLabel("");
		imgLimonada.setBounds(12, 338, 130, 115);
		Setlabelsize(imgLimonada, "src//imagenes/limonada.png");
		contentPane.add(imgLimonada);
		
		CantLimonada.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		CantLimonada.setBounds(237, 386, 47, 22);
		contentPane.add(CantLimonada);
		CantLimonada.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				CalcularTotal();
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Total");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(12, 511, 116, 37);
		contentPane.add(lblNewLabel_2);
		
		
		lblTotal.setBounds(75, 511, 209, 37);
		contentPane.add(lblTotal);
		
		JLabel lblLimonada = new JLabel("Limonada");
		lblLimonada.setBounds(151, 389, 83, 16);
		contentPane.add(lblLimonada);
		
		JLabel lblNewLabel_1_1 = new JLabel("$2,500");
		lblNewLabel_1_1.setBounds(151, 113, 83, 16);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("3,000");
		lblNewLabel_1_1_1.setBounds(151, 258, 83, 16);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("2,000");
		lblNewLabel_1_1_2.setBounds(151, 407, 83, 16);
		contentPane.add(lblNewLabel_1_1_2);
		CalcularTotal();
	
		
	}
}
