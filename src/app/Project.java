package app;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.util.*;
//import javax.swing.WindowConstants;

public class Project {

	  public static void main(String[] args) {

	    JFrame f = new JFrame("Anime woman generator for Terrible Hack XIV");
	    f.setSize(500, 500); f.setLocation(300,200);
	    final JTextArea textArea = new JTextArea(20, 80);
	    f.getContentPane().add(BorderLayout.CENTER, textArea);
	    final JButton button = new JButton("Click to generate anime woman");
	    f.getContentPane().add(BorderLayout.CENTER, button);
	    button.addActionListener(new ActionListener() {

	        public void actionPerformed(ActionEvent e) {
	        	JFrame apology = new JFrame("sorry");
	        	apology.setSize(500, 500); apology.setLocation(50,0);
	        	final JTextArea textArea23 = new JTextArea(20, 80);
	        	apology.getContentPane().add(BorderLayout.CENTER, textArea23);
	        	textArea23.append("sorry the code is basic i learned to code in java 3 hours ago\n");
	        	
	        	apology.setVisible(true);
	        	JFrame b = new JFrame("Pick eye type");
	    	    b.setSize(350, 350); b.setLocation(500,0);
	    	    JButton buttone = new JButton("1");
	    	    JButton buttone1 = new JButton("2");
	    	    JButton buttone2 = new JButton("3");
	    	    b.getContentPane().add(BorderLayout.CENTER, buttone);
	            b.getContentPane().add(BorderLayout.SOUTH, buttone1);
	            b.getContentPane().add(BorderLayout.NORTH, buttone2);
	            b.setVisible(true);
	            
	            buttone2.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame co = new JFrame("PLEASE");
						co.setSize(350, 350); co.setLocation(700,100);
						final JTextArea textArea3 = new JTextArea(18, 81);
			        	co.getContentPane().add(BorderLayout.NORTH, textArea3);
			        	textArea3.append("not implemented, please try another option\n");
			        	co.setVisible(true);
						
					}
	            });
	            
	            buttone1.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						JFrame co = new JFrame("PLEASE");
						co.setSize(350, 350); co.setLocation(700,100);
						final JTextArea textArea3 = new JTextArea(18, 81);
			        	co.getContentPane().add(BorderLayout.NORTH, textArea3);
			        	textArea3.append("not implemented, please try another option\n");
			        	co.setVisible(true);
						
					}
	            });
	            
	            buttone.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent arg0) {
						JFrame co = new JFrame("Pick face shape");
			    	    co.setSize(350, 350); co.setLocation(429,120);
			    	    final JButton button32 = new JButton("SHAPE 1");
			    	    final JButton button4 = new JButton("SHAPE 2");
			    	    co.getContentPane().add(BorderLayout.NORTH, button32);
			            co.getContentPane().add(BorderLayout.SOUTH, button4);
			            co.setVisible(true);
			            
			            button32.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								JFrame co = new JFrame("trojan");
								co.setSize(250, 150); co.setLocation(1000,400);
								final JTextArea textArea3 = new JTextArea(18, 81);
					        	co.getContentPane().add(BorderLayout.NORTH, textArea3);
					        	textArea3.append("installing trojan on hard drive...");
					        	co.setVisible(true);
					        	
					        	JFrame cok = new JFrame("Hair Type");
								cok.setSize(450, 350); cok.setLocation(500,300);
								JButton buttone1 = new JButton("HAir 1");
					    	    JButton buttone2 = new JButton("HAIR 2");
					    	    JButton buttone3 = new JButton("HAIR 3");
					            cok.getContentPane().add(BorderLayout.SOUTH, buttone1);
					            cok.getContentPane().add(BorderLayout.NORTH, buttone2);
					            cok.getContentPane().add(BorderLayout.CENTER, buttone3);
					            cok.setVisible(true);
					            
					            buttone1.addActionListener(new ActionListener() {

									public void actionPerformed(ActionEvent e) {
										JFrame co = new JFrame("PLEASE");
										co.setSize(350, 350); co.setLocation(700,100);
										final JTextArea textArea3 = new JTextArea(18, 81);
							        	co.getContentPane().add(BorderLayout.NORTH, textArea3);
							        	textArea3.append("not implemented, please try another option\n");
							        	co.setVisible(true);
										
									}
					            });
					            
					            buttone2.addActionListener(new ActionListener() {

									public void actionPerformed(ActionEvent e) {
										JFrame co = new JFrame("PLEASE");
										co.setSize(350, 350); co.setLocation(700,100);
										final JTextArea textArea3 = new JTextArea(18, 81);
							        	co.getContentPane().add(BorderLayout.NORTH, textArea3);
							        	textArea3.append("not implemented, please try another option\n");
							        	co.setVisible(true);
										
									}
					            });
					            
					            buttone3.addActionListener(new ActionListener() {

									public void actionPerformed(ActionEvent e) {
										
										JFrame cob = new JFrame("trojan installed.");
										cob.setSize(500, 500); cob.setLocation(700,100);
										final JButton buttone3 = new JButton("installation complete. Virus initiating");
										final JButton buttone4 = new JButton("OK");
							            cob.getContentPane().add(BorderLayout.SOUTH, buttone3);
							            cob.getContentPane().add(BorderLayout.CENTER, buttone4);
							            cob.setVisible(true);
							            
							            buttone4.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
							            
							        	int count = 0;
							        	int height = 100;
							        	
										for(int i = 0; i < 220; i++) {
											JFrame vir = new JFrame("VIRUS");
											vir.setSize(200, 200); vir.setLocation(count,height);
											final JTextArea textArea3 = new JTextArea(18, 81);
								        	vir.getContentPane().add(BorderLayout.NORTH, textArea3);
								        	textArea3.append("installing trojan on hard drive...");
								        	
											vir.setVisible(true);
											if(i < 100) {
											count += 15;
											}
											else {
												count -= 15;
											}
											if(i == 100) {
												height = 300;
											}
										}
										
										height += 300;
										for(int i = 0; i < 240; i++) {
											JFrame vir = new JFrame("VIRUS");
											vir.setSize(200, 200); vir.setLocation(count,height);
											final JTextArea textArea3 = new JTextArea(18, 81);
								        	vir.getContentPane().add(BorderLayout.NORTH, textArea3);
								        	textArea3.append("installing trojan on hard drive...");
											vir.setVisible(true);
											if(i < 120) {
											count += 15;
											}
											else {
												count -= 15;
											}
											if(i == 100) {
												height -= 600;
											}
										}
										
										height = 450;
										for(int i = 0; i < 170; i++) {
											JFrame vir = new JFrame("VIRUS");
											vir.setSize(200, 200); vir.setLocation(count,height);
											final JTextArea textArea3 = new JTextArea(18, 81);
								        	vir.getContentPane().add(BorderLayout.NORTH, textArea3);
								        	textArea3.append("installing trojan on hard drive...");
											vir.setVisible(true);
											
											count += 15;
											
										}
										
										JFrame vir = new JFrame("Computer Information");
										vir.setSize(500, 500); vir.setLocation(500,200);
										final JTextArea textArea3 = new JTextArea(18, 81);
							        	vir.getContentPane().add(BorderLayout.NORTH, textArea3);
							        	textArea3.append("Specs:\nAvailable Processors: " + Runtime.getRuntime().availableProcessors() + "\nFree Memory (bytes): " + Runtime.getRuntime().freeMemory() + "\nSystem32: Exists");
							        	JButton buttonee3 = new JButton("UPDATE SPECS");
							            vir.getContentPane().add(BorderLayout.CENTER, buttonee3);
										vir.setVisible(true);
										
										buttonee3.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent e) {
												System.exit(0);
											}
							            });
										}
							           });
									}
					            });
							}
			            });
			            button4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								JFrame co = new JFrame("PLEASE");
								co.setSize(350, 350); co.setLocation(700,100);
								final JTextArea textArea3 = new JTextArea(18, 81);
					        	co.getContentPane().add(BorderLayout.NORTH, textArea3);
					        	textArea3.append("not implemented, please try another option\n");
					        	co.setVisible(true);
								
							}
			            });
					}
	            });
	        }
	    });
	    f.setVisible(true);
	  }
	}

/**
 * 
 * public void actionPerformed(ActionEvent arg0) {
						JFrame co = new JFrame("EXIT");
			    	    co.setSize(350, 350); co.setLocation(10,0);
			    	    final JButton button3 = new JButton("END");
			    	    co.getContentPane().add(BorderLayout.SOUTH, button3);
			    	    final JTextArea textArea3 = new JTextArea(18, 81);
			        	co.getContentPane().add(BorderLayout.NORTH, textArea3);
			        	textArea3.append("end of code\n");
			            co.setVisible(true);
			            button3.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								System.exit(0);
								
							}
			            });
			            
			            	//try {
											//	TimeUnit.MILLISECONDS.sleep(20);
											//} catch (InterruptedException e1) {
											//	
											//	e1.printStackTrace();
											//}
*/