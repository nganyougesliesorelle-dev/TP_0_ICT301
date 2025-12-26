package OCP;

public class OCP_avant {

        public class Rectangle {
            public double width;
            public double height;
        }

        public class AreaCalculator {
            public double calculateArea(Rectangle rect) {
                return rect.width * rect.height;
            }

            // Si on veut ajouter un Cercle, on est OBLIGÉ de modifier cette classe :
            // public double calculateArea(Circle circle) { ... }
        }
    }
