


/**


*/

// class in ....

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.*;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.util.MissingResourceException;


// class import


import javax.swing.JScrollBar;

import javax.swing.JTextArea;

import java.awt.AWTException;

import java.awt.Image;

import java.awt.Toolkit;

import java.util.Random;

import javax.swing.Box;

import javax.swing.ImageIcon;

import java.awt.KeyEventDispatcher;

import java.awt.KeyboardFocusManager;

import java.awt.event.KeyEvent;

import java.lang.Object;

import java.awt.Robot;

import java.lang.ArrayIndexOutOfBoundsException;

 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;
 
import java.awt.event.*;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.plaf.metal.MetalIconFactory;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JWindow;

import java.util.*;

import javax.swing.JScrollPane;

// class import




public class TextEditor extends JFrame
{
	
			//
		
	private   String info=" ";
		
		private String x=" ";
		
		private String keyString=" ";
		
		
		//
	
	private JFrame f;
	
	//
	
	private JTextArea TA;
	
	//
	
	  private JPanel  navigationMENU ;  
	  private JPanel  JTextAreaPanel ;  
	  private JPanel  JPanelsContainer ;
	
	
	
	//
	
	
	private JScrollPane scrollPane;
	
	
	//
	
	private  JMenuBar KBMenuBar;
        private  JMenu MENU;
	 private  JMenu ABOUT;
	 
	 //
	//  navigation menu jlabels
	
	private  JLabel  EXIT;  
	private  JLabel  saveTHEcontent;
	private  JLabel  programAuthor;
	
	//
	
	void TextEditor()
	{
		
		
		//
		
		f=new JFrame(" Text Editor Version 1.00 ");
		
			// initializing jpanels 
	
       navigationMENU=new JPanel();  
	 JTextAreaPanel=new JPanel();  
	JPanelsContainer=new JPanel();
		
		
	//	
		
		
		
		navigationMENU.setLayout(new FlowLayout(FlowLayout.LEFT));
		navigationMENU.setBackground(Color.ORANGE);
		  navigationMENU.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		
		//
		
		
		
		JTextAreaPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		JTextAreaPanel.setBackground(Color.ORANGE);
		  JTextAreaPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		  
		
		  
				  //
			  
			  
		  
		  JPanelsContainer.setLayout((new BoxLayout(JPanelsContainer, BoxLayout.Y_AXIS)));
		JPanelsContainer.setBackground(Color.RED);
		
				//
		// Program Menu  
		//    Create the menu bar
		//
		
		
        KBMenuBar = new JMenuBar();
        
        // initialize the main menu 
        
        MENU = new JMenu("MENU");
		MENU.setForeground(Color.BLACK);
		MENU.setBackground(Color.WHITE);
		
	ABOUT = new JMenu("HELP");
	ABOUT.setForeground(Color.BLACK);
	ABOUT.setBackground(Color.WHITE); 
			
		 KBMenuBar.add(MENU);
		 KBMenuBar.add(ABOUT);
				
			//
			
			
		saveTHEcontent=new JLabel("save the text area content");
	  saveTHEcontent.setBackground(Color.WHITE);
	   saveTHEcontent.setForeground(Color.BLACK);
	 saveTHEcontent.setEnabled(true);
    saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =saveTHEcontent.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           saveTHEcontent.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          saveTHEcontent.setForeground(oldcolor);
         }
      }
      );
	saveTHEcontent.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
		
		//
		
		String FILEname = JOptionPane.showInputDialog(null, "Please enter your preferred file name and file extension \n ex. someFileName.txt \n  ");
		
		//
		
		
				String[] lines = TA.getText().split("\n"); 
			
                                  /*
		
				for(int i = 0 ; i<lines.length; i++)
				{
                                   System.out.println(lines[i]);
				}
		
				*/
		
		//
		
		  
	
         try 
	{
	
            BufferedWriter out = new BufferedWriter(new FileWriter(FILEname));
          
		
	for(int i=0;i<lines.length;i++)
	    {
		    
            out.write(lines[i]);
		    
		     out.newLine(); 
		    
	    }
	    
            out.close();
	    
        }
        catch (IOException expn)
        {
            
             expn.printStackTrace();
		
        }
	
	
				
		
	//
		 		
        }
		
      }
      );
       MENU.add(new JSeparator());//add a seperator line
	 MENU.add(saveTHEcontent);	
       MENU.add(new JSeparator());//add a seperator line
				
				 //
				
		
			EXIT=new JLabel("exit the program");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
		 		
	System.exit(0);
		 		
        }
		
      }
      );
       MENU.add(new JSeparator());//add a seperator line
	 MENU.add(EXIT);	
       MENU.add(new JSeparator());//add a seperator line
				
				 //
		
		 programAuthor=new JLabel("program creator");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
	public void mousePressed(MouseEvent e)
	{
	
    		
	JOptionPane.showMessageDialog(null,
		" \n Program created by: \n Constantinos < tinoC23 /> Constantinou \n @ 06/2017 \n email : c.constantinou.24@gmail.com \n </[-_-]/> \n ",
		"INFORMATION MESSAGE",
		JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
 ABOUT.add(new JSeparator());//add a seperator line
      ABOUT.add(programAuthor);
       ABOUT.add(new JSeparator());//add a seperator line
		
		
		            //
      
      		navigationMENU.add(KBMenuBar);

      //
      // check the pc keyboard -> caps lick button probability ....... 
		
		TA=new JTextArea(" ");
			TA.setEditable(true);
			  //  TA.setPreferredSize(new Dimension(550,250));
                     TA.setBounds(5,5,650,650);
			  TA.setMaximumSize(getPreferredSize());
		Border border = BorderFactory.createLineBorder(Color.BLACK);
        TA.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
            TA.setLineWrap(true);
               TA.setWrapStyleWord(false);
	       TA.setCaretPosition(TA.getDocument().getLength());
		TA.setFont(new Font("Serif",Font.PLAIN,12));
		TA.addKeyListener(new KeyListener()
			 {
				 
				 
				 //			 
				 
    public void keyReleased(KeyEvent e)
        {
	    
	if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
         {
			
          TA.setText(TA.getText().substring(0,TA.getText().length()-1));
		 
        } 
	    
	}
    
    //
    
    public void keyPressed(KeyEvent e)
	{
		
		
      int id = e.getID();
	    
       
	    
        if (id == KeyEvent.KEY_TYPED)
         {
			
	char c = e.getKeyChar();
			
	keyString=String.valueOf(c);
		 
	x=new StringBuilder().append(TA.getText()).append(keyString).toString();
	
	TA.setText(x);
		 
        } 		
		
	try
	{
		
	if (e.getKeyCode()==KeyEvent.VK_BACK_SPACE)
         {
			
          TA.setText(TA.getText().substring(0,TA.getText().length()-1));
		 
        }
	
        }
	catch(StringIndexOutOfBoundsException StringIndexOutOfBoundsException)
	{
		
		StringIndexOutOfBoundsException.printStackTrace();
		
	}
		
	}
    
    //
	    
	                    
			
	public void keyTyped(KeyEvent e) 
	{
		/*		
        
         int id = e.getID();
	    
       
	    
        if (id == KeyEvent.KEY_TYPED)
         {
		 
		 
			
            char c = e.getKeyChar();
			
            keyString=String.valueOf(c);

		 
		 
		 
	x=new StringBuilder().append(TA.getText()).append(keyString).toString();
	
	TA.setText(x);
		 
		 
		 
        } 
	else 
	{
		
		
		
           int keyCode = e.getKeyCode();
            
		keyString = "key code = " + keyCode+ " ("+ KeyEvent.getKeyText(keyCode)+ ")";
		
		x=new StringBuilder().append(x).append(TA.getText()).append(keyString).toString();
	
	      TA.setText(x);
		
		
		
        }
	
                */
			
	}
	
	
			
		//
	    
		
				 
			 });
		// JTextAreaPanel.add(TA);
		scrollPane = new JScrollPane(TA,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		 scrollPane.setPreferredSize(new Dimension(650, 650));
		scrollPane.setBounds(5, 5, 650, 650);
                scrollPane.setBorder(BorderFactory.createTitledBorder("  Text Editor Area  "));
		scrollPane.setViewportView(TA);			 
		// JScrollBar sb = scrollPane.getVerticalScrollBar();
                //  sb.setValue( sb.getMaximum() );
		// Box box=Box.createHorizontalBox();
		// box.add(scrollPane);
		JTextAreaPanel.add(scrollPane);
			 
			 
		
			 
		
		
		
		    //
		
		JPanelsContainer.add(navigationMENU);
		 JPanelsContainer.add(JTextAreaPanel);
		   
	//   
	
                   // JPanelsContainer.revalidate();
		
		//
		
	
		
		f.add(JPanelsContainer);
		
		f.setDefaultLookAndFeelDecorated(true);
		
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		f.setVisible(true);
		
		f.setResizable(false);
		
		f.setLocationRelativeTo(null);
		
		// frame.setSize(800,600);
		
		// frame.revalidate();
		
	        f.pack();
		
                      //
      
      
		
		
		
		//
		
		
	}
	
	
	
	
	public static void main( String [] TE )
	{
		
		TextEditor te = new TextEditor();
		te.TextEditor();
		
	}
	
	
	
}



