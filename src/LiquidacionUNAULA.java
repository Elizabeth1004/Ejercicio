public class LiquidacionUNAULA implements LiquidacionServicio{
    public boolean descuentoelect;

    @Override
    public int valorMatricula() {
        if (descuentoelect){
            return 80-10;
        }
        else {
            return 80;
        }
    }
    @Override
    public int valorInscripcion() {
        return 40;
    }

    @Override
    public int valorDerecho() {
        return valorMatricula() *20/100;
    }
}
