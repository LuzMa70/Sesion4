public class Rectangulo {
    int alto;
    int ancho;

    public Rectangulo() {
        alto = 0;
        ancho = 0;
    }
    public Rectangulo(int v) {
        alto = v;
        ancho = v;
    }
    public Rectangulo(int x, int y) {
        alto = x;
        ancho = y;
    }
    public int getAlto() {
        return alto;
    }
    public int getAncho() {
        return ancho;
    }
    public int area() {
        return ancho * alto;
    }
    public boolean equals(Rectangulo r) {
        return (getAlto() == alto) && (r.getAncho() == ancho);
    }
}

