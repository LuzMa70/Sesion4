public class Ejemplo1 {
    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        a1.setCurso("Java");
        a1.setCurso("Python");
        System.out.println(a1.getCurso());

        Alumno a2 = new Alumno();
        System.out.println(a2.getCurso());
    }
}
