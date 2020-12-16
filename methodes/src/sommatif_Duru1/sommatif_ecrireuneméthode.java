/*
 * @Author: duruunal
 * @ Date: Dec. 13, 2020
 * @Description: Cette tableu contient la methode pour declarer la moyenne des nombres 
 * qui sont impairs dans un tableau qui contient 20 nombres entiers commis au hasard
 * Je dois déclarer le tableau avec les numeros dans le main puis appeler ma méthode 
 * qui va permettre d’afficher la moyenne des nombres impairs contenus dans mon tableau.
 */

package sommatif_Duru1;

import java.util.Scanner;

public class sommatif_ecrireuneméthode
{
	int []myTab= {15,3,8,5,7,9,27,45,65,34,2,6,11,12,99,86,77,43,18,20}; //cette partie de ma code declare les variables dans mon tab


/*=============================================================================
Methode pour afficher la moyenne des nombres impairs contenus dans le tableau.
===============================================================================
*/

static int nombreimpairs(int []a)
{
	int cpt=0; //cette partie de ma code compte 
	for(int i=0;i<a.length;i++)
	{
		if (a[i]%2==1) //cette partie de ma code determine si le nombre est impair
			cpt++; 
	}
	return cpt; //cette partie de ma code retourne les resultats de la code du code ci-dessus
}
static int calculerSomme(int []a)
{
	int somme=0;
	for(int i=0;i<a.length;i++)
		somme+=a[i]; //cette partie de ma code addition les elements
	return somme; //cette partie de ma code donne mes elements
}

}

