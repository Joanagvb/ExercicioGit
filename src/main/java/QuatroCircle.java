public class QuatroCircle extends QuatroPointClass{
    private  Point ponto;
    private double raio;
    private static final double raioDefault=1;
    public QuatroCircle(Point ponto,double raio){
        this.ponto=ponto;
        this.raio=raio;
    }
    QuatroCircle(){
        this.ponto=new Point();
        this.raio=raioDefault;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
}
