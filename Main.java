import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nameLabel = new JLabel("Employee Sphere");
		nameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 47));
		nameLabel.setBounds(75, 62, 405, 76);
		contentPane.add(nameLabel);
		
		JButton addButton = new JButton("Add Employee");
		addButton.setBounds(166, 170, 191, 29);
		contentPane.add(addButton);
		
		JButton deleteButton = new JButton("Delete Employee");
		deleteButton.setBounds(166, 211, 191, 29);
		contentPane.add(deleteButton);
		
		JButton displayButton = new JButton("Display");
		displayButton.setBounds(166, 254, 191, 29);
		contentPane.add(displayButton);
		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(166, 295, 191, 29);
		contentPane.add(searchButton);
		
		JButton promotionButton = new JButton("Promotion and Raise");
		promotionButton.setBounds(166, 336, 191, 29);
		contentPane.add(promotionButton);
	}
}
