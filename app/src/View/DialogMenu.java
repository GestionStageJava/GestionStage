package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Controller.ClicAjouterStagiaire;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DialogMenu {

	private JFrame frmGestionDeStage;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogMenu window = new DialogMenu();
					window.frmGestionDeStage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DialogMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDeStage = new JFrame();
		frmGestionDeStage.setIconImage(Toolkit.getDefaultToolkit().getImage(DialogMenu.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		frmGestionDeStage.setTitle("Gestion de Stage");
		frmGestionDeStage.setBounds(100, 100, 450, 300);
		frmGestionDeStage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmGestionDeStage.setJMenuBar(menuBar);
		
		JMenu mnStagiaire = new JMenu("Stagiaire");
		menuBar.add(mnStagiaire);
		
		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mntmAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//marche pas
			}
		});
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
	}
}
