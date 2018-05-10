package gui;

import java.awt.EventQueue;

import recept.Kuvar;

public class GuiKontroler {
	public static GlavniProzor gp;
	public static Kuvar kuvar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gp = new GlavniProzor();
					gp.setVisible(true);
					kuvar=new Kuvar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
