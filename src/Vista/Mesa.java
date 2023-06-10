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

public class Mesa extends JFrame {

	private JPanel contentPane;

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
	
	public  Mesa() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
	}
	public void initComponents() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 502);
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
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(234, 86, 47, 32);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(333, 86, 47, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setBackground(Color.PINK);
		lblNewLabel_2.setBounds(292, 90, 29, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel imgEmapana = new JLabel("");
		imgEmapana.setBounds(12, 47, 130, 115);
		this.Setlabelsize(imgEmapana, "src//imagenes/empanada.png");
		contentPane.add(imgEmapana);
	
		
	}
}
