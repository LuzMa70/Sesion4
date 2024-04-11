public class Auto {
     //Atributos
    String marca;
    int anio;

    //Metodos Constructores
    public Auto(String m, int a) {
        marca = m;
        anio = a;
    }
   //Sobreescritura

        @Override
        public String toString(){
            String cadena =
                    "Es un auto de la marca " + marca + " y del año " + anio;
            return cadena;

    }
}
