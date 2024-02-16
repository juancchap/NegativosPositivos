package negativos.positivos;

import javax.swing.JOptionPane;

public class NegativosPositivos {

    public static void main(String[] args) {

        int numero, suma_pos = 0, conteo_pos = 0, suma_neg = 0;
        int conteo_neg = 0, conteo_cerros = 0;
        float media_pos, media_neg;
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero: "));

            if (numero == 0) {
                conteo_cerros++;
            } else if (numero > 0) {
                suma_pos = suma_pos + numero;
                conteo_pos++;
            } else {
                suma_neg = suma_neg + numero;
                conteo_neg++;
            }
        }
        if (conteo_pos == 0) {
            System.out.println("No se puede calcular la media");
        } else {
            media_pos = (float) suma_pos / conteo_pos;
            System.out.println("La media es: " + media_pos);
        }
        if (conteo_neg == 0) {
            System.out.println("No se puede Calcular la media");
        } else {
            media_neg = (float) suma_neg / conteo_neg;
            System.out.println("La media es: " + media_neg);
        }

        System.out.println("La cantidad de ceros es: " + conteo_cerros);

    }

}
