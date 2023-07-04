package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 537);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button btnMesa1 = new Button("Mesa 1");
		btnMesa1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mesa mesa1 = new Mesa();
				mesa1.setVisible(true);
				btnMesa1.setBackground(Color.red);

			}
		});
		btnMesa1.setBackground(Color.GREEN);
		btnMesa1.setForeground(Color.BLACK);
		btnMesa1.setBounds(31, 69, 79, 36);
		contentPane.add(btnMesa1);
		
		JLabel lblNewLabel = new JLabel("Mesas");
		lblNewLabel.setBounds(201, 13, 83, 36);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 31));
		contentPane.add(lblNewLabel);
		
		Button btnMesa2 = new Button("Mesa 2");
		btnMesa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMesa2.setForeground(Color.BLACK);
		btnMesa2.setBackground(Color.GREEN);
		btnMesa2.setBounds(161, 69, 79, 36);
		contentPane.add(btnMesa2);
		
		Button btnMesa3 = new Button("Mesa 3");
		btnMesa3.setForeground(Color.BLACK);
		btnMesa3.setBackground(Color.GREEN);
		btnMesa3.setBounds(288, 69, 79, 36);
		contentPane.add(btnMesa3);
		
		Button btnMesa4 = new Button("Mesa 4");
		btnMesa4.setForeground(Color.BLACK);
		btnMesa4.setBackground(Color.GREEN);
		btnMesa4.setBounds(406, 69, 79, 36);
		contentPane.add(btnMesa4);
	}
}
