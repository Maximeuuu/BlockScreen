package blockscreen.vue;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 * @author Maximeuuu
 */
public class JBloc extends JDialog
{
	private PanelBloc panelBloc;

	public JBloc( String type, int x, int y, int tailleX, int tailleY, int tailleImgX, int tailleImgY, int cassable )
	{
		/* Propriétés */
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setLocation(x,y);

		/* Dimensions */
		this.setResizable(false);
		this.setSize(tailleX, tailleY);

		/*Composants*/
		this.panelBloc = new PanelBloc( this, type, tailleImgX, tailleImgY, cassable );
		this.add( this.panelBloc );

		/* Activation */
		this.setVisible(true);
		this.setAlwaysOnTop(true);

		try
        {
             setCursor(
                  Toolkit
                  .getDefaultToolkit()
                  .createCustomCursor(
                         new ImageIcon("./../lib/images/objets/"+"Diamond_Pickaxe_2.png").getImage(),
                         new Point(50,150),
                         "pioche"
                  )
             );
        }catch(Exception e){}
	}

	public JBloc( String type, int x, int y, int taille, int cassable )
	{
		this(type, x, y, taille, taille, taille, taille, cassable );
	}

}
