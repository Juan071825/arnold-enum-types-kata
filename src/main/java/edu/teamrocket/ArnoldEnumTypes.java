package edu.teamrocket;

/**
 * Hello world!
 */
public class ArnoldEnumTypes {
    public static void main(String[] args) {

        double peso = 175.0;
        

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
