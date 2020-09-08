import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by Gauseeban on 12.07.2020.
 */
public class SummenAvTall {
    public static void main(String[] args){
        int nedreGrense = 0;
        int ovreGrense = 0;
        showMessageDialog(null, "Skriv inn to verdier, en endre og en øvre grense. Øvre må være større enn nedre.");
        while (nedreGrense >= ovreGrense){
            try {
                String nedreInnStreng = showInputDialog("Skriv inn nedre grense");
                nedreGrense = Integer.parseInt(nedreInnStreng);

                String ovreInnStreng = showInputDialog("Skriv inn øvre grense\n Større enn " + nedreGrense);
                ovreGrense = Integer.parseInt(ovreInnStreng);
            }
            catch (Exception e){
                showMessageDialog(null, "Du må skrive inn to gyldige verdier, der øvre grense er større enn nedre " +
                        " grense");
            }
        }

        int sum = 0;
        int teller = 0;

        for (int i = nedreGrense; i < ovreGrense; i++){
            if(teller == 10){
                System.out.print("\n");
                teller=0;
            } else {
                teller++;
                sum += i;
                System.out.print(i + " + ");
            }
        }
        sum += ovreGrense;
        System.out.print(ovreGrense+" = " + sum);
    }

}
