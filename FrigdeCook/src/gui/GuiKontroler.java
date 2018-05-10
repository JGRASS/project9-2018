package gui;

import java.awt.EventQueue;

import recept.Kuvar;

public class GuiKontroler {
	public static GlavniProzor gp;
	public static Kuvar kuvar;
	public static PretraziProzor pp;
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
	public static void  otvoriP() {
		pp=new PretraziProzor();
		pp.setVisible(true);
	}
	
}
