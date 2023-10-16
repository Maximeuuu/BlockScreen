package blockscreen.modele;

import blockscreen.vue.*;

/**
 * @author Maximeuuu
 */
public class Monde
{
	/*private final GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];

	//private int largeurEcran;
	//private int hauteurEcran;*/

	public static void main( String[] args )
	{
		int resolX = 1920;
		int resolY = 1080;
		
		int taille = resolX/10;
		
		for( int cptX=0; cptX<10; cptX++ )
		{
			new JBloc("herbe.jpg", cptX*taille, 0*taille, taille, 4 );
		}
		
		for( int cptX=0; cptX<10; cptX++ )
		{
			new JBloc("terre.jpg", cptX*taille, 1*taille, taille, 3 );
		}
		
		for( int cptX=0; cptX<10; cptX++ )
		{
			for( int cptY=2; cptY<5; cptY++ )
			{
				new JBloc("pierre_lisse.png", cptX*taille, cptY*taille, taille, 10);
			}
		}
		
		for( int cptX=0; cptX<10; cptX++ )
		{
			new JBloc("bedrock.png", cptX*taille, 5*taille, taille, resolY%taille-40, taille, taille, -1);
		}
	}
}
