package cuentas;
/**
 * Clase con los datos de una cuenta corriente y las operaciones que se realizan con ella.
 * 
 * @author Blas Solier Perez
 * @version 1.5
 * @since 1.0
 */
public class CCuenta {

    //Atributos de clase
    private String nombre; //Nombre del titular de la cuenta
    private String cuenta; //Codigo de la cuenta
    private double saldo; //Saldo en euros de la cuenta
    private double tipoInteres; //Tipo de interes de la cuenta

    //Método constructor vacío
    public CCuenta()
    {
    }

    //Segundo método constructor
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Consulta el estado de la cuenta.
     * 
     * @return Saldo de la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Suma la cantidad introducida al saldo de la cuenta.
     * 
     * @param cantidad Cantidad a añadir.
     * @throws Exception Arroja un error en caso de que la cantidad sea negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Resta la cantidad introducida al saldo de la cuenta.
     * 
     * @param cantidad Cantidad a sustraer.
     * @throws Exception Arroja un error en caso de que la cantidad sea negativa o no haya suficiente saldo en la cuenta.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * Metodo get de Nombre
     * 
     * @return El nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set de Nombre
     * 
     * @param nombre Nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get de Cuenta
     * 
     * @return El codigo de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo set de Cuenta
     * 
     * @param cuenta El codigo de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo get de Saldo
     * 
     * @return El saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo set de Saldo
     * 
     * @param saldo El saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo get de TipoInteres
     * 
     * @return El tipo de interes de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Metodo set de TipoInteres
     * 
     * @param tipoInteres El tipo de interes de la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
}
