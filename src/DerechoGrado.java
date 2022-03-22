public class    DerechoGrado extends Liquidacion{
    public DerechoGrado(LiquidacionServicio liq){
        super.setTipo("Derecho Grado");
        super.setTotal(liq.valorDerecho());
    }
}
