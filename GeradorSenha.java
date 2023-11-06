/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geradorsenha;

import java.util.Scanner;

/**
 *
 * @author evert
 */
public class GeradorSenha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho da senha: ");
        int num = scanner.nextInt();
        scanner.close();

        String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Lowcase = "abcdefghijklmnopqrstuvwxyz";
        String Numbers = "0123456789";
        String SpecialCharacter = "!@#$%^&*-_+/<>?";

        String characters = Uppercase + Lowcase + Numbers + SpecialCharacter;
        String senha = "";

        for (int c = 0; c < num; c++) {
            int rand1 = (int) (Math.random() * Uppercase.length());
            int rand2 = (int) (Math.random() * Lowcase.length());
            int rand3 = (int) (Math.random() * Numbers.length());
            int rand4 = (int) (Math.random() * SpecialCharacter.length());

            int randCategory = (int) (Math.random() * 4);

            if (randCategory == 0) {
                senha += Uppercase.charAt(rand1);
            } else if (randCategory == 1) {
                senha += Lowcase.charAt(rand2);
            } else if (randCategory == 2) {
                senha += Numbers.charAt(rand3);
            } else if (randCategory == 3) {
                senha += SpecialCharacter.charAt(rand4);
            }
        }

        System.out.println("Senha gerada: " + senha);
    }
    
}
