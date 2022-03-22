public class LiquidacionEAFIT implements LiquidacionServicio{

    public boolean descuentoelect;
    @Override
    public int valorMatricula() {
        return 100;
    }

    @Override
    public int valorInscripcion() {
        if (descuentoelect){
            return 50-10;
        }
        else {
            return 50;
        }
    }
    @Override
    public int valorDerecho() {
        return valorMatricula() *15/100;
    }
}
