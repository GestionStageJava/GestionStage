package Controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Label;
import java.awt.BorderLayout;

public class ClicAjouterStagiaire {

	private JFrame frmGestionStage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClicAjouterStagiaire window = new ClicAjouterStagiaire();
					window.frmGestionStage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClicAjouterStagiaire() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionStage = new JFrame();
		frmGestionStage.setTitle("Gestion Stage");
		frmGestionStage.setBounds(100, 100, 450, 300);
		frmGestionStage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmGestionStage.setJMenuBar(menuBar);
		
		JMenu mnStagiaire = new JMenu("Stagiaire");
		menuBar.add(mnStagiaire);
		
		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		
		mnStagiaire.add(mntmAjouter);
		
		JMenuItem mntmGrer = new JMenuItem("Gérer");
		mnStagiaire.add(mntmGrer);
		
		JMenu mnStage = new JMenu("Stage");
		menuBar.add(mnStage);
		
		JMenuItem mntmAjouter_1 = new JMenuItem("Ajouter");
		mnStage.add(mntmAjouter_1);
		
		JMenuItem mntmGrer_1 = new JMenuItem("Gérer");
		mnStage.add(mntmGrer_1);
		
		JMenu mnLieu = new JMenu("Lieu");
		menuBar.add(mnLieu);
		
		JMenuItem mntmAjouter_2 = new JMenuItem("Ajouter");
		mnLieu.add(mntmAjouter_2);
		
		JMenuItem mntmGrer_2 = new JMenuItem("Gérer");
		mnLieu.add(mntmGrer_2);
		
		JMenu mnSemaines = new JMenu("Semaines");
		menuBar.add(mnSemaines);
		
		JMenuItem mntmGrer_3 = new JMenuItem("Gérer");
		mnSemaines.add(mntmGrer_3);
		
		Label label = new Label("New label");
		frmGestionStage.getContentPane().add(label, BorderLayout.NORTH);
	}

}
