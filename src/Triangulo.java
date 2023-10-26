class Triangulo extends FiguraGeometrica{
    private String nombre;
    private String color;
    private double lado1;
    private double lado2;

    /**
     * Constructor de la clase Triangulo
     *
     * @param nombre
     * @param color
     * @param lado1 lado 1 del triangulo
     * @param lado2 lado 2 del triangulo
     *
     * Complejidad Temporal: O(1) Tiempo constante
     */

    public Triangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre,color);
        this.lado1 = lado1;
        this.lado2= lado2;
    }

    /**
     * Metodo para obtener el nombre de la figura
     *
     * @return Retorna el nombre de la figura
     *
     * Complejidad Temporal: O(1) Tiempo constante
     */

    public String getNombre() {
        return this.nombre;
    }

    /**
     * Metodo para obtener el color de la figura
     *
     * @return Retorna el color de la figura
     *
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Metodo para obtener el lado 1 de la figura
     *
     * @return Retorna el lado 1 de la figura
     *
     * Complejidad Temporal: O(1) Tiempo constante
     */

    public double getLado1() {
        return this.lado1;
    }
    /**
     * Metodo para obtener el lado 2 de la figura
     *
     * @return Retorna el lado 2 de la figura
     *
     * Complejidad Temporal: O(1) Tiempo constante
     */
    public double getLado2() {
        return this.lado2;
    }
    /**
     * Metodo para calcular el área de el triangulo
     *
     * @return Área del triangulo
     *
     * Complejidad Temporal: O(1) Tiempo constante
     */

    public double getArea () {
        return lado1 * lado2 / 2;
    }

    /**
     * Metodo para calcular el perimetro de el triangulo
     *
     * @return Perimetro del triangulo
     *
     * Complejidad Temporal: O(1) Tiempo constante
     */

    public double getPerimetro () {
        return lado2 + lado2 + lado1;
    }
}
