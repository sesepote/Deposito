package cuentas;

/** Cuenta bancaria */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Constructor vacío */
    public CCuenta()
    {
    }

    /** Parámetros iniciales */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }

    /** Devuelve saldo actual */
    public double estado()
    {
        return saldo;
    }

    /** Ingresar dinero en cuenta */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /** Retirar dinero de cuenta */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}