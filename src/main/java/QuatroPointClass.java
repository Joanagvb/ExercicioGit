import java.util.Objects;

public class QuatroPointClass {
    private double x,y;
    private String descricao;
    private static final double xDefault=0;
    private static final double yDefault=0;
    private static final String descricaoDefault="Default";

    public QuatroPointClass(double x,double y ,String descricao){
        this.x=x;
        this.y=y;
        this.descricao=descricao;
    }
    public QuatroPointClass(){
        this.x=xDefault;
        this.y=yDefault;
        this.descricao=descricaoDefault;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
     return String.format("Nome %s\nCoordenada x: %.2f\nCoordenada y :%.2f",descricao,x,y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuatroPointClass that = (QuatroPointClass) o;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0 && Objects.equals(descricao, that.descricao);
    }

}
