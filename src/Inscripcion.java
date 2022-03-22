public class Inscripcion extends Liquidacion {
    public Inscripcion(LiquidacionServicio liq){
        super.setTipo("Inscripcion");
        super.setTotal(liq.valorInscripcion());
    }
}

