/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testnomina;

import Sleer2.SLeer2;
import Sleer1.SLeer1;
import Utilidades.Empresa;
import Utilidades.Nomina;
import Utilidades.Trabajador;

/**
 *
 * @author Diego
 */
public class Test_Nomina {

    static int b = 0;

    public static double Redondear(double num) {
        return Math.round(num * 10.0) / 10.0;
    }

    public static void main(String[] args) {
        Nomina n1;
        Trabajador t1;
        Empresa e1;
        n1 = new Nomina();
        t1 = new Trabajador();
        e1 = new Empresa();

        b = SLeer1.datoInt("Introduce un número para continuar, 0 para salir: ");
        while (b != 0) {
            if (b == 0) {
                b = 1;
            } else {
                System.out.println("\t*****NÓMINA******");
            }
            SLeer1.limpiar();
            t1.setNom("Introduce tu nombre: ");
            t1.setNIF("Introduce tu NIF: ");
            SLeer1.limpiar();
            t1.setNUS("Intoduce tu Numero de seguridad Social: ");
            t1.setGCot("Introduce tu Grupo de Cotización: ", "Has introducido un grupo de cotización no valido");
            SLeer1.limpiar();
            e1.setNom("Introduce el nombre de la empresa: ");
            e1.setCIF("Introduce el CIF de la empresa: ");
            e1.setDom("Introduce el domicilio de la empresa: ");
            e1.setCCC("Introduce el número CCC de la empresa: ");
            n1.pideFecIn();
            n1.pideFecFin();
            t1.getGCot();
            n1.pideComplemento();
            n1.getComplemento();
            n1.pideHorasEx("Introduce las horas extra en caso de haberlas(cantidad en euros): ");
            n1.calcTDevengado();
            n1.calcIRPF();
            n1.calcTDeducir();
            n1.calcTPercibir();
            n1.pideFechaFirma();

            System.out.println("\n\t****DATOS RECOGIDOS DE TU NÓMINA*****");
            System.out.println("\n\t***Datos del trabajador:");
            System.out.println("\t-Nombre del trabajador : " + t1.getNom());
            System.out.println("\t-NIF : " + t1.getNIF());
            System.out.println("\t-NUS: " + t1.getNUS());
            System.out.println("\t-Grupo profesional: " + t1.getGProf());
            System.out.println("\t-Grupo de Cotización: " + t1.getGCot());
            System.out.println("\n\t***Datos empresa:");
            System.out.println("\t-Nombre de la empresa: " + e1.getNom());
            System.out.println("\t-Domicilio de la empresa: " + e1.getDom());
            System.out.println("\t-CIF: " + e1.getCIF());
            System.out.println("\t-CCC de la empresa: " + e1.getCCC());
            System.out.println("\n\t***Periodo liquidación: ");
            System.out.println("\t-La fecha de inicio periodo de liquidación: " + n1.getdiaIn() + "/" + n1.getMesIn() + "/" + n1.getAñoIn());
            System.out.println("\t-La fecha de finalización periodo de liquidación: " + n1.getDiaFin() + "/" + n1.getMesFin() + "/" + n1.getAñoFin());
            System.out.println("\t-Días trabajados: " + n1.calcDias());
            System.out.println("\n\t***Devengos: ");
            System.out.println("\t-Salario base: " + n1.calcSalarioBase(t1.getGCot()) + "€");
            System.out.println("\t-Remuneración complementos salariales: " + n1.getComplemento() + "€");
            System.out.println("\t-Remuneración de horas extra: " + n1.getHorasEx() + "€");
            System.out.println("\t-Total devengado: " + n1.calcTDevengado() + "€");
            System.out.println("\n\t***Deducciones: ");
            System.out.println("\t-Bases de contingencias comunes (Fijado en un 4,70%): " + Redondear(n1.calcCC()) + "€");
            System.out.println("\t-IRPF Descontado (Fijado en un 2%): " + Redondear(n1.calcIRPF()) + "€");
            System.out.println("\t-Desempleo (Fijado en un 1,60%): " + Redondear(n1.calcDesempleo()) + "€");
            System.out.println("\t-Formación profesional (Fijado en un 0,10%): " + Redondear(n1.calcFP()) + "€");
            System.out.println("\t-Horas extraordinarias (Fijado en un 4,70%): " + Redondear(n1.calcHE()) + "€");
            System.out.println("\t*** Total aportaciones: " + Redondear(n1.calcTAport()) + "€");
            System.out.println("\t*** Total a deducir: " + Redondear(n1.calcTDeducir()) + "€");
            System.out.println("\t***Líquido total a percibir: " + Redondear(n1.calcTPercibir()) + "€");
            System.out.println("\t\n***BASES DE COTIZACIÓN");
            System.out.println("\tBases de cotización a la S.Soc.: " +n1.getDevengado()+"€ "+"23,60% "+ Redondear(n1.calcBCSS()) + "€");
            System.out.println("\tBases de cotización AT y EP (Fijado en un 1,50%): " + Redondear(n1.calcATyEP()) + "€");
            System.out.println("\tBases de cotización Desempleo (Fijado en un 5,50%): " + Redondear(n1.calcDesempleoe()) + "€");
            System.out.println("\tBases de cotizacion Formación profesional (Fijado en un 0,60%): " + Redondear(n1.calcFPe()) + "€");
            System.out.println("\tBases de cotización Fondo Garantía Salarial (Fijado en un 0,20%): " + Redondear(n1.calcFGS()) + "€");
            System.out.println("\tTotal aportación empresarial: " + Redondear(n1.calcTAE()) + "€");
            n1.getFecFirma();
            b = SLeer1.datoInt("Introduce un número para continuar, 0 para salir: ");

        }
    }
}
