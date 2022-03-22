public class GenerarLiquidacion {
    public static void main (String args[]) {
        Liquidacion LiquidacionMatriculaEAFIT = new Matricula(new LiquidacionEAFIT());
        System.out.println("El valor de su Liquidacion de " + LiquidacionMatriculaEAFIT.getTipo() + " en EAFIT es " + LiquidacionMatriculaEAFIT.getTotal());

        Liquidacion liquidacionMatriculaUNAULA = new Matricula(new LiquidacionUNAULA());
        System.out.println("El valor de su Liquidacion de " + liquidacionMatriculaUNAULA.getTipo() + " en UNAULA es " + liquidacionMatriculaUNAULA.getTotal());

        Liquidacion liquidacionMatriculaLIBERTADORES = new Matricula(new LiquidacionLIBERTADORES());
        System.out.println("El valor de su Liquidacion de " + liquidacionMatriculaLIBERTADORES.getTipo() + " en LIBERTADORES es " + liquidacionMatriculaLIBERTADORES.getTotal());

        Liquidacion LiquidacionInscripcionEAFIT = new Inscripcion(new LiquidacionEAFIT());
        System.out.println("El valor de su Liquidacion de " + LiquidacionInscripcionEAFIT.getTipo() + " en EAFIT es " + LiquidacionInscripcionEAFIT.getTotal());

        Liquidacion liquidacionInscripcionUNAULA = new Inscripcion(new LiquidacionUNAULA());
        System.out.println("El valor de su Liquidacion de " + liquidacionInscripcionUNAULA.getTipo() + " en UNAULA es " + liquidacionInscripcionUNAULA.getTotal());

        Liquidacion liquidacionInscripcionLIBERTADORES = new Inscripcion(new LiquidacionLIBERTADORES());
        System.out.println("El valor de su Liquidacion de " + liquidacionInscripcionLIBERTADORES.getTipo() + " en LIBERTADORES es " + liquidacionInscripcionLIBERTADORES.getTotal());

        Liquidacion LiquidacionDerechoEAFIT = new DerechoGrado(new LiquidacionEAFIT());
        System.out.println("El valor de su Liquidacion de " + LiquidacionDerechoEAFIT.getTipo() + " en EAFIT es " + LiquidacionDerechoEAFIT.getTotal());

        Liquidacion liquidacionDerechoUNAULA = new DerechoGrado(new LiquidacionUNAULA());
        System.out.println("El valor de su Liquidacion de " + liquidacionDerechoUNAULA.getTipo() + " en UNAULA es " + liquidacionDerechoUNAULA.getTotal());

        Liquidacion liquidacionDerechoLIBERTADORES = new DerechoGrado(new LiquidacionLIBERTADORES());
        System.out.println("El valor de su Liquidacion de " + liquidacionDerechoLIBERTADORES.getTipo() + " en LIBERTADORES es " + liquidacionDerechoLIBERTADORES.getTotal());
      }
}