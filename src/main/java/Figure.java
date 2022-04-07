
public abstract class Figure {

        private Color color;


        public Color getColor() {
                return color;
        }

        public void setColor(Color color) {
                this.color = color;
        }


        public abstract double perimeter();

        public abstract double area();

}
