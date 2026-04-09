package edu.teamrocket;

/**
 * Hello world!
 */
public class ArnoldEnumTypes {
    public static void main(String[] args) {

        Double peso = 0.0;

        try {
            peso = Double.parseDouble(args[0]);
        } 
        catch (NumberFormatException exception){
            System.err.println("Peso incorrecto, no es un número.");
            System.out.println("Se establece el valor por defecto 1.");
            peso = 1.0;
        }


        System.out.println("Tu peso en los planetas terrestres");
        for(Planetas planeta : Planetas.getPlanetasTerrestres()){
            String resultado = String.format("Tu peso en %s es %f", planeta.name(), planeta.pesoPersonaSuperficie(peso));
            System.out.println(resultado);
        }


        System.out.println("Tu peso en los gigantes gaseosos");
        for(Planetas planeta : Planetas.getGigantesGaseosos()){
            String resultado = String.format("Tu peso en %s es %f", planeta.name(), planeta.pesoPersonaSuperficie(peso));
            System.out.println(resultado); /* name() devuelve el nombre como string */
        }

        System.out.println("Tu peso en los gigantes de hielo");
        for(Planetas planeta : Planetas.getPlanetasHelados()){
            String resultado = String.format("Tu peso en %s es %f", planeta.name(), planeta.pesoPersonaSuperficie(peso));
            System.out.println(resultado);
        }


    }
}
