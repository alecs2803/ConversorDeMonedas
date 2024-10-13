import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        double cantidadIngresada = 0;
        String opciones= "";
        Scanner lectura = new Scanner(System.in);
        String sal = "salir";
        String menuOpciones = """
                    -----INGRESA LA DIVISA PRINCIPAL---------
                    
                     "MXN"--> PESO MEXICANO
                     "COP"--> PESO COLOMBIANO
                     "BRL"--> REAL BRASILERO
                     "ARS"--> PESO ARGENTINO
                     "USD"--> DOLAR E.U.A.
                    ________________________________________
                    """;
        String menuOpciones2 = """
                   ------INGRESA LA DIVISA A CONVERTIR-------
                    
                     "MXN"--> PESO MEXICANO
                     "COP"--> PESO COLOMBIANO
                     "BRL"--> REAL BRASILERO
                     "ARS"--> PESO ARGENTINO
                     "USD"--> DOLAR E.U.A.
                   ________________________________________
                    """;
        while (!opciones.equalsIgnoreCase(sal)) {
            System.out.println("******************************************************");
            System.out.println("***********Conversor de Moneda Internacional***********");
            System.out.println("******************************************************");

            Busqueda buscar = new Busqueda();
            System.out.println(menuOpciones);
            String moneda1 = lectura.nextLine();
            System.out.println(menuOpciones2);
            String moneda2 = lectura.nextLine();

            System.out.println("INGRESE LA CANTIDAD DE $"+moneda1+ " QUE DECEA CONVERTIR");
            cantidadIngresada = Double.parseDouble(lectura.nextLine());

            Caracteristicas caracter = buscar.buscaMoneda(moneda1, moneda2);
            System.out.println("UNOS: $" + cantidadIngresada
                    + moneda1 + " SON AL EQUIVALENTE A: $"
                    +(caracter.conversion_rate() * cantidadIngresada) + moneda2);

            System.out.println("¿OCUPAS HACER OTRA CONSULTA? " +
                    "PRESIONA ENTER PARA CONTINUAR" +
                    "O ESCRIBE SALIR PARA FINALIZAR");
            opciones = lectura.nextLine();
        }
        System.out.println("HA SIDO UN HONOR EL PODER AYUDARLO BUEN DIA =) ");
        lectura.close();



    }



}




