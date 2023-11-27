package blockscreen.vue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 * @author Maximeuuu
 */
public class PanelBloc extends JPanel  implements MouseListener
{
	private int cpt;
	private JBloc frame;
	private String type;
	private int tailleImgX;
	private int tailleImgY;
	private int cassable;
		
	public PanelBloc( JBloc frame, String type, int tailleImgX, int tailleImgY, int cassable )
	{
		this.tailleImgX = tailleImgX;
		this.tailleImgY = tailleImgY;
		this.type = type;
		this.frame = frame;
		this.cassable = cassable;
		this.cpt=0;
		
		if( this.cassable != -1 )
		{
			this.addMouseListener( this );
		}
		
		this.repaint();
	}

	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		
		String image="";
		
		g = (Graphics2D)(g);
		g.drawImage( getToolkit().getImage ( "./../lib/images/blocs/"+this.type ), 0,0, this.tailleImgX,this.tailleImgY,this );
		if( this.cpt > 0 )
		{
			g.drawImage( getToolkit().getImage ( "./../lib/images/animations/"+"destroy-block-textures_"+(this.cpt)+".png" ), 0,0, this.tailleImgX, this.tailleImgY, this );
		}
		
	}
	
	public void mousePressed(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	public void mouseClicked(MouseEvent e)
	{
		if( this.cpt < 10 )
		{
			this.cpt = this.cpt + 1*(10/this.cassable);
			this.repaint();
		}
		else
		{
			this.frame.dispose();
		}
	}
	
	/*
	11 étapes
	cpt 0 -> 10
	
	cpt 
	
	*/

}
