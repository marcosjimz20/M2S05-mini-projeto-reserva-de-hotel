package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
    int numeroQuarto;
    int diaEntrada;
    int mesEntrada;
    int anoEntrada;
    int diaSaida;
    int mesSaida;
    int anoSaida;

// CONSTRUCTOR
    public Reserva() {
        super();
    }

    public Reserva(int numeroQuarto, int diaEntrada, int mesEntrada, int anoEntrada, int diaSaida, int mesSaida, int anoSaida) {
        this.numeroQuarto = numeroQuarto;
        this.diaEntrada = diaEntrada;
        this.mesEntrada = mesEntrada;
        this.anoEntrada = anoEntrada;
        this.diaSaida = diaSaida;
        this.mesSaida = mesSaida;
        this.anoSaida = anoSaida;
    }


// GET & SET
    public int getNumeroQuarto() {
        return numeroQuarto;
    }
    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public int getDiaEntrada() {
        return diaEntrada;
    }
    public void setDiaEntrada(int diaEntrada) {
        this.diaEntrada = diaEntrada;
    }

    public int getMesEntrada() {
        return mesEntrada;
    }
    public void setMesEntrada(int mesEntrada) {
        this.mesEntrada = mesEntrada;
    }

    public int getAnoEntrada() {
        return anoEntrada;
    }
    public void setAnoEntrada(int anoEntrada) {
        this.anoEntrada = anoEntrada;
    }

    public int getDiaSaida() {
        return diaSaida;
    }
    public void setDiaSaida(int diaSaida) {
        this.diaSaida = diaSaida;
    }

    public int getMesSaida() {
        return mesSaida;
    }
    public void setMesSaida(int mesSaida) {
        this.mesSaida = mesSaida;
    }

    public int getAnoSaida() {
        return anoSaida;
    }
    public void setAnoSaida(int anoSaida) {
        this.anoSaida = anoSaida;
    }


    @Override
    public String toString() {
        //    Reserva: Quarto 8021, Entrada: 05/06/2023, Saída: 09/06/2023, 4 noites
        return "Reserva: " +
                "Quarto " + getNumeroQuarto() +
                ", " + entrada() +
                ", " + saida() +
                ", " + numeroNoites();
    }

// OUTROS MÉTODOS

    public String infoQuarto(){
        return "Número do quarto: " + getNumeroQuarto();
    }
    public String entrada() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String entradaFormatada = formatoData.format(new Date(this.anoEntrada - 1900, this.mesEntrada - 1, this.diaEntrada));

        return "Entrada: " + entradaFormatada;
    }

    public String dataEntrada() {
        String dataEntradaFormatada = entrada();

        return "Data de " + dataEntradaFormatada;
    }

    public String saida() {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String saidaFormatada = formatoData.format(new Date(this.anoSaida - 1900, this.mesSaida - 1, this.diaSaida));

        return "Saída: " + saidaFormatada;
    }

    public String dataSaida() {
        String dataSaidaFormatada = saida();

        return "Data de " + dataSaidaFormatada;
    }

    public String numeroNoites() {
        int diasReservados = (this.diaSaida - this.diaEntrada);
        return diasReservados + " noites";
    }


    /* FIM DA CLASS RESERVA */
}



