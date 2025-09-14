package tp3;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAXIMA = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= CAPACIDAD_MAXIMA && combustibleInicial >= 0) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = 0;
            System.out.println("Combustible inicial inválido. Se establece en 0.");
        }
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println("La nave" + nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia / 2;
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave" + nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a recargar debe ser positiva.");
            return;
        }

        if (combustible + cantidad > CAPACIDAD_MAXIMA) {
            combustible = CAPACIDAD_MAXIMA;
            System.out.println("Combustible recargado al máximo (" + CAPACIDAD_MAXIMA + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades. Combustible actual: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + CAPACIDAD_MAXIMA);
    }
}
