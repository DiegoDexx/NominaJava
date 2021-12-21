/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Sleer2.SLeer2;
import Sleer1.SLeer1;

/**
 *
 * @author Diego
 */
public class Nomina {

    private int diaIn = 0;
    private int diaFin = 0;
    private int mesIn = 0;
    private int mesFin = 0;
    private int anyoIn = 0;
    private int anyoFin = 0;
    private int numDia = 0;
    private double salarioBase = 0;
    private double complemento = 0;
    private double horasE = 0;//%dedducir
    private double tDevengado = 0;
    private double cc = 0;
    private double desempleo = 0;
    private double fp = 0;
    private double horasEx = 0;
    private double tAport = 0;
    private double irpf = 0;
    private double tDeducir = 0;
    private double tPercibir = 0;
    private double remens;
    private int diaFirma = 0;
    private int mesFirma = 0;
    private int anyoFirma = 0;
    private double bCSS = 0;
    private double atyep = 0;
    private double desempleoe = 0;
    private double fpe = 0;
    private double fgs = 0;
    private double tae = 0;

    public Nomina() {
    }

    public void pideFecIn() {
        do {
            diaIn = SLeer2.datoInt("Ingresa el día de incio en la empresa(1-31): ");
            if (diaIn < 1 || diaIn > 31) {
                System.err.println("Has introducido un día no valido.");
                diaIn = SLeer2.datoInt("Ingresa el día de inicio (1-31)");
            }
        } while (diaIn < 1 || diaIn > 31);
        do {
            mesIn = SLeer2.datoInt("Ingresa tu mes de inicio (1-12): ");
            if (mesIn < 1 || mesIn > 12) {
                System.err.println("Has introducido un mes no valido.");
                mesIn = SLeer2.datoInt("Ingresa tu més de inicio (1-12)");
            }
        } while (mesIn < 1 || mesIn > 12);
        do {
            anyoIn = SLeer2.datoInt("Introduce tu año de inicio en la empresa: ");
            if (anyoIn < 2020 || anyoIn > 2100) {
                System.err.println("Has introducido un año no valido.");
                anyoIn = SLeer2.datoInt("Introduce tu año de inicio en la empresa: ");
            }

        } while (anyoIn < 2020 || anyoIn > 2100);
    }

    public int getdiaIn() {
        return diaIn;
    }

    public int getMesIn() {
        return mesIn;
    }

    public int getAñoIn() {
        return anyoIn;
    }

    public void pideFecFin() {
        do {
            diaFin = SLeer2.datoInt("Introduce tu dia de finalización en la empresa(1-31): ");
            if (diaFin < 1 || diaFin > 31) {
                System.err.println("Has introducido un día no valido.");
                diaFin = SLeer2.datoInt("Introduce tu dia de finalización(1-31): ");
            }
        } while (diaFin < 1 || diaFin > 31);
        do {
            mesFin = SLeer2.datoInt("Introduce tu mes de finalización(1-12): ");
            if (mesFin < 1 || mesFin > 12) {
                System.err.println("Has introducido un mes no valido.");
                mesFin = SLeer2.datoInt("Introduce tu mes de finalización(1-12): ");
            }
        } while (mesFin < 1 || mesFin > 12);
        do {
            anyoFin = SLeer2.datoInt("Introduce tu año de finalización: ");
            if (anyoFin < 2020 || anyoFin > 2100) {
                System.err.println("Has introducido un año no valido.");
                anyoFin = SLeer2.datoInt("Introduce tu año de finalización: ");
            }

        } while (anyoFin < 2020 || anyoFin > 2100);
    }

    public int getDiaFin() {
        return diaFin;
    }

    public int getMesFin() {
        return mesFin;
    }

    public int getAñoFin() {
        return anyoFin;
    }

    public int calcDias() {
        numDia = 30;
        return numDia;
    }

    public double calcSalarioBase(int grupo) {

        switch (grupo) {
            case 1:
                salarioBase = 1572.30;
                break;
            case 2:
                salarioBase = 1303.80;
                break;
            case 3:
                salarioBase = 1134.30;
                break;
            case 4:
                salarioBase = 1125.90;
                break;
            case 5:
                salarioBase = 1125.90;
                break;
            case 6:
                salarioBase = 1125.50;
                break;
            case 7:
                salarioBase = 1125.90;
                break;
        }
        return salarioBase;
    }

    public void pideComplemento() {
        complemento = SLeer1.datoDouble("Introduce el valor de los complementos salariales(cantidad en euros): ");
        while (complemento < 0) {
            System.err.println("Has introducido un dato no valido.");
            complemento = SLeer1.datoDouble("Introduce el valor de los complementos salariales(cantidad en euros): ");
        }

    }

    public double getComplemento() {
        return complemento;
    }

    public void pideHorasEx(String mCant) {
        horasEx = SLeer2.datoDouble(mCant);
        while (horasEx < 0) {
            System.err.println("Has introducido un dato no valido.");
            horasEx = SLeer2.datoDouble(mCant);
        }
    }

    public double getHorasEx() {
        return horasEx;
    }

    public double calcTDevengado() {
        tDevengado = salarioBase + complemento + horasEx;
        return tDevengado;
    }

    public double calcCC() {
        cc = salarioBase * 4.70 / 100;
        return cc;
    }

    public double calcDesempleo() {
        desempleo = salarioBase * 1.70 / 100;
        return desempleo;
    }

    public double calcFP() {
        fp = salarioBase * 0.10 / 100;
        return fp;
    }

    public double calcHE() {
        horasE = horasEx * 4.70 / 100;
        return horasE;
    }

    public double calcTAport() {
        tAport = horasE + desempleo + fp + cc;
        return tAport;
    }

    public double calcIRPF() {

        return irpf = 0.02 * tDevengado;
    }

    public double calcTDeducir() {
        tDeducir = irpf + tAport;
        return tDeducir;
    }

    public double calcTPercibir() {
        tPercibir = tDevengado - tDeducir;
        return tPercibir;
    }

    public double getDevengado() {
        return tDevengado;
    }

    public void pideFechaFirma() {
        do {
            diaFirma = SLeer2.datoInt("Introduce el día de firma de contrato: ");
            if (diaFirma < 1 || diaFirma > 31) {
                System.err.println("Has introducido un día no valido.");
                diaFirma = SLeer2.datoInt("Introduce tu fecha de firma de contrato: ");
            }
        } while (diaFirma < 1 || diaFirma > 31);
        do {
            mesFirma = SLeer2.datoInt("Introduce tu mes de firma: ");
            if (mesFirma < 1 || mesFirma > 12) {
                System.err.println("Has introducido un mes no valido.");
                mesFirma = SLeer2.datoInt("Introduce tu mes de firma: ");
            }
        } while (mesFirma < 1 || mesFirma > 12);
        do {
            anyoFirma = SLeer2.datoInt("Introduce tu año de firma: ");
            if (anyoFirma < 2020 || anyoFirma > 2100) {
                System.err.println("Has introducido un año no valido.");
                anyoFirma = SLeer2.datoInt("Introduce tu mes de firma: ");
            }

        } while (anyoFirma < 2020 || anyoFirma > 2100);
    }

    public void getFecFirma() {
        System.out.println("\t-La fecha de firma de contrato es: " + diaFirma + "/" + mesFirma + "/" + anyoFirma);
    }

    public double calcBCSS() {
        bCSS = tDevengado * 23.60 / 100;
        return bCSS;
    }

    public double calcATyEP() {
        atyep = tDevengado * 1.50 / 100;
        return atyep;
    }

    public double calcDesempleoe() {
        desempleoe = tDevengado * 5.50 / 100;
        return desempleoe;
    }

    public double calcFPe() {
        fpe = tDevengado * 0.60 / 100;
        return fpe;
    }

    public double calcFGS() {
        fgs = tDevengado * 0.20 / 100;
        return fgs;
    }

    public double calcTAE() {
        tae = bCSS + atyep + desempleoe + fpe + fgs;
        return tae;
    }
}
