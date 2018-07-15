/**
 * 
 */
package projetAfpa.exercices.tableaux;

/**
 * @author Abdelkarim AFEISSA
 *
 */
public class ExerciceTableaux {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer strB =new StringBuffer();
		if(args.length!=0) {
//			for(int i=0; i<args.length; i++) {
//				System.out.println(args[i]);
//			}
			for(String arg : args) {
				strB.append(arg);
				strB.append(" ");
			}
		} else {
			System.out.println("Vous n'avez passé aucun paramétre !");
		}
		System.out.println(strB);
	}

}
