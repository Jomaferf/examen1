package desin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaRepaso {

	private JFrame frame;
	private JTextField tf_examen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRepaso window = new VentanaRepaso();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaRepaso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf_examen = new JTextField();
		tf_examen.setBounds(134, 36, 161, 20);
		frame.getContentPane().add(tf_examen);
		tf_examen.setColumns(10);
		
		JButton btn_tipoExamen = new JButton("Examen");
		btn_tipoExamen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tf_examen.setText("Examen de Desin - Eval 2");
			}
		});
		btn_tipoExamen.setBounds(134, 113, 161, 23);
		frame.getContentPane().add(btn_tipoExamen);
	}

}
