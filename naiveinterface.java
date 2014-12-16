import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;


public class naiveinterface extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JTextField zonerecherche = null;

	private JButton bouttonrecherche = null;

	private JLabel jLabel = null;
	String chaine = "";
	String fichier = "c://texte.txt";

	private JLabel jLabel1 = null;

	private JLabel jLabel2 = null;

	/**
	 * This is the default constructor
	 */
	public naiveinterface() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("Recherche naive");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel2 = new JLabel();
			jLabel2.setText(" ");
			jLabel1 = new JLabel();
			jLabel1.setText(" ");
			jLabel = new JLabel();
			jLabel.setText(" ");
			BorderLayout borderLayout = new BorderLayout();
			borderLayout.setHgap(21);
			borderLayout.setVgap(41);
			jContentPane = new JPanel();
			jContentPane.setLayout(borderLayout);
			jContentPane.add(getZonerecherche(), BorderLayout.NORTH);
			jContentPane.add(getBouttonrecherche(), BorderLayout.CENTER);
			jContentPane.add(jLabel, BorderLayout.SOUTH);
			jContentPane.add(jLabel1, BorderLayout.EAST);
			jContentPane.add(jLabel2, BorderLayout.WEST);
		}
		return jContentPane;
	}

	/**
	 * This method initializes zonerecherche	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getZonerecherche() {
		if (zonerecherche == null) {
			zonerecherche = new JTextField();
		}
		return zonerecherche;
	}

	/**
	 * This method initializes bouttonrecherche	
	 * 	
	 * @return javax.swing.JButton	
	 * 
	 */
	
	private JButton getBouttonrecherche() {
		if (bouttonrecherche == null) {
			bouttonrecherche = new JButton();
			bouttonrecherche.setText("Recherche");
			bouttonrecherche.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String mm=zonerecherche.getText();
					naive n= new naive();
					jLabel.setText(n.cherche(mm));
				}

				
			});
			
		}
		return bouttonrecherche;
	}

}  //  @jve:decl-index=0:visual-constraint="101,54"
