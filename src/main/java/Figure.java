
public abstract class Figure {

        private Color color;


        public abstract double area();

        public abstract double perimeter();

        public Color getColor() {
                return color;
        }

        public void setColor(Color color) {
                this.color = color;
        }

}
