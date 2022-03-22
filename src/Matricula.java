public class Matricula extends Liquidacion {

    public Matricula(LiquidacionServicio liq) {
        super.setTipo("Matrìcula");
        super.setTotal(liq.valorMatricula());
    }
}


