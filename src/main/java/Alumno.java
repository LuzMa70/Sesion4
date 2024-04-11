public class Alumno {
    //Atributos
    String curso;
    int sesion;
    String objetivo;

    //Bloque de inicializacion
    {
        curso ="Java";
        System.out.println("Esta vivo!!!");

    }


    //Metodos
    //Getters
    public String getCurso(){
        return curso;
    }

    public int getSesion(){
        return sesion;
            }
    public String getObjetivo(){
        return objetivo;
    }

    //Setters : Modificación
    public void setCurso(String nuevoCurso){
        curso = nuevoCurso;

    }


}

