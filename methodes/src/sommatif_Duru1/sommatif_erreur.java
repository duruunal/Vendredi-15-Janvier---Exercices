/*
 * @Author: duruunal
 * @ Date: Dec. 13, 2020
 * @Description: Dans cette Java Class je corrigerai une erreur qui a été faite 
 * dans le code et ecrire la correcte methode permettant de saluer un ami en
 * utilisant son nom
 */

package sommatif_Duru1;

public class sommatif_erreur 
{
	public void main(String[] args)
	{
		ecrire();
		System.out.println(saluerAmi("John"));
		
		/*
		 * Methode permettant de saluer un ami en 
		 * utilisant son nom
		 */
		
		static void ecrire()
		{

			System.out.println("entrer nom"); //on demande la code de dire entrer nom
			System.out.println("Bonjour" + nom); //on demande la code de dire bonjour avec la nom
	
		}
		
	}

	private char[] saluerAmi(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
