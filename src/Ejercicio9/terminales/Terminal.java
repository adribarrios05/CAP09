package Ejercicio9.terminales;

public class Terminal {
    private int timepoConversacion;
    private String numTelef;
    public Terminal(String telef){
        this.numTelef = telef;
        this.timepoConversacion = 0;
    }

    public int getTimepoConversacion() {
        return timepoConversacion;
    }

    public String getNumTelef() {
        return numTelef;
    }

    public void llama(Terminal t, int segundos){
        this.timepoConversacion+=segundos;
        t.timepoConversacion+=segundos;
    }

    @Override
    public String toString() {
        return String.format("Nº %s - %ss de conversación",
                this.numTelef,
                this.timepoConversacion);
    }
}
