package com.sample;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

@SuppressWarnings("serial")
public class mainn extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainn frame = new mainn();
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
	public mainn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(357, 212, 652, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 616, 358);
		panel.setLayout(null);
		contentPane.add(panel);
		
		
		JLabel stronaStartowa = new JLabel("Doradca wyboru samochodu");
		stronaStartowa.setBounds(106, 140, 414, 44);
		panel.add(stronaStartowa);
		stronaStartowa.setFont(new Font("Tahoma", Font.PLAIN, 20));
		stronaStartowa.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("Rozpocznij ");
		btnNewButton.setBounds(213, 265, 194, 33);
		panel.add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new DroolsTest();
			}
		});
	}
}
