package main;

import LogicaClasificacion;
import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        invertirColaNombres colaNombres = new invertirColaNombres();
        verificarPalindromoCola verificarCola = new verificarPalindromoCola();


        colaNombres.invertirColaNombres("Ana");
        colaNombres.inveritrColaNombres("Luis");
        colaNombres.invertirColaNombres("Marta");

        verificarCola.verificarPalindromoCola("radar");


        System.out.println("--------------Cola---------------")
        System.out.println("Cola invertida: " + colaNombres.invertirColaNombres());

        System.out.println("-----------Palíndromo------------")
        System.out.println("Se cumple el palíndromo: " + verificarcola.verificarPalindromoCola());

        

    }
}
