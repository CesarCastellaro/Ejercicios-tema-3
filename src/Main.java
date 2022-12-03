public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(10 , 30 , 20);
        System.out.println(resultado);

        coche micoche = new coche();
        micoche.agregarPuerta();
        micoche.agregarPuerta();
        micoche.agregarPuerta();

        System.out.println(micoche.puertas);
    }
    public static int suma (int a , int b , int c) {
        return a + b + c;
    }

    public static class coche{
        public int puertas = 0;
        public void agregarPuerta () {
            this.puertas++;
        }
    }
}