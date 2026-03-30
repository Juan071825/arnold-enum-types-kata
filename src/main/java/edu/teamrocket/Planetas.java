package edu.teamrocket;

import java.util.EnumSet;

public enum Planetas {
    
    MERCURIO(3.303e+23, 2.4397e+6),
    VENUS(4.869e+24, 6.0518e6),
    TIERRA(5.976e+24, 6.37814e6),
    MARTE(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27,   7.1492e7),
    SATURNO(5.688e+26, 6.0268e7),
    URANO(8.686e+25, 2.5559e7),
    NEPTUNO(1.024e+26, 2.4746e7);


    public static final double G = 6.67400e-11;

    private double masa;
    private double radio;

    private Planetas(double masa, double radio){
        this.masa = masa;
        this.radio = radio;
    }


    

}





