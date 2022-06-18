package recuperatorio;

public class Feria {
    private String nombre, fechaInicio, fechaFin;
    private int nroParticipantes;
    private final Participante[] participantes = new Participante[30];
    private int nroStand;
    private final Stand[] stands = new Stand[30];

    public Feria(String nombre, String fechaInicio, String fechaFin, int nroParticipantes, int nroStand) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nroParticipantes = nroParticipantes;
        this.nroStand = nroStand;
    }

    public void mostrar() {
        System.out.println("Feria: " + nombre);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha fin: " + fechaFin);
        System.out.println("Número de participantes: " + nroParticipantes);
        System.out.println(".............................................");
        for (int i = 0; i < nroParticipantes; i++) {
            if (participantes[i] != null) {
                System.out.println(participantes[i]);
            }
        }
        System.out.println("Número de stands: " + nroStand);
        System.out.println(".............................................");
        for (int i = 0; i < nroStand; i++) {
            if (stands[i] != null) {
                System.out.println("----------> STAND" + (1 + i));
                stands[i].mostrar();
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getNroParticipantes() {
        return nroParticipantes;
    }

    public void setNroParticipantes(int nroParticipantes) {
        this.nroParticipantes = nroParticipantes;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }

    public void setParticipante(Participante participante) {
        for (int i = 0; i < nroParticipantes; i++) {
            if (participantes[i] == null) {
                participantes[i] = participante;
                break;
            }
        }
    }

    public int getNroStand() {
        return nroStand;
    }

    public void setNroStand(int nroStand) {
        this.nroStand = nroStand;
    }

    public Stand[] getStands() {
        return stands;
    }

    public void setStand(Stand stand) {
        for (int i = 0; i < nroStand; i++) {
            if (stands[i] == null) {
                stands[i] = stand;
                break;
            }
        }
    }
}
