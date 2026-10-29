/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigoalgoritmos;

/**
 *
 * @author fing.labcom
 */
public class Main {
    public static void main(String[] args) {

        String[] names = {
            "Ana", "Luis", "Maria", "Pedro", "Sofia"
        };

        double[] grades = {
            18.5, 16.0, 19.2, 15.7, 18.5
        };

        boolean[] selected = new boolean[names.length];

        for (int pass = 0; pass < 3; pass++) {

            double highestGrade = -1;
            int bestIndex = -1;

            for (int i = 0; i < grades.length; i++) {

                if (!selected[i] && grades[i] > highestGrade) {
                    highestGrade = grades[i];
                    bestIndex = i;
                }
            }

            if (bestIndex != -1) {
                selected[bestIndex] = true;

                System.out.println(
                    (pass + 1) + ". " +
                    names[bestIndex] + " - " +
                    grades[bestIndex]
                );
            }
        }
    }
}
