package labestructiras;
import java.util.Scanner;

public class AplicacionLista{

    private Lista lst;
    private String menuOpciones;
    private String opcion;
    private int numero;
    private int dato;
    private int datoInicio;
    private Scanner input;
    /**
     * constructor de la clase ListaApp
     */
    public AplicacionLista() {
        this.lst = new Lista();
        this.menuOpciones = "\n\nListas Enlazadas Simples\n"+ "=========================\n"+ 
                            "1. Crear lista"+ 
                          "\n2. Imprimir lista"+ 
                          "\n3. Anexar nodos Inicio"+
                          "\n4. Anexar nodos final"+
                          "\n5. Buscar nodos"+
                          "\n6. Borrar nodo inicio" + 
                          "\n7. Borrar nodo final"+
                          "\n8. Salir";
        this.opcion = "";
        this.dato = 0;
        this.numero = 0;
        this.datoInicio = 0;
        this.input = new Scanner(System.in);
    }
    /**
     * Metodo que tiene las opciones del menu de la lista
     */
    public void leerMenu() {
        do {
            listarMenu(menuOpciones);
            System.out.print("Introduzca la opcion: ");
            numero = input.nextInt();
            switch (numero) {
                case 1:
                    crearLista();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    anexarNodoInicio();
                    break;
                case 4:
                    anexarNodoFinal();
                    break;
                case 5:
                    buscarNodo();
                    break;
                case 6:
                    borrarDatoInicio();
                    break;
                case 7:
                    borrarDatoFinal();
                    break;
            }
        } while (numero != 8);
    }
    /**
     * Metodo que imprime el menu de opciones de la aplicacion
     *
     * @param menu
     */
    public void listarMenu(String menu) {
        System.out.println(menu);
    }
    /**
     * creacion de la lista con 10 nodos
     */
    public void crearLista() {
        lst = new Lista();
        for (int datos = 1; datos <= 10; datos++) {
            System.out.println("Dato "+datos+" ingresado en la lista");
            lst.anexarFinalLista(datos);
        }
        listar();
    }
    /**
     * Se anexa un nodo al inicio de la lista
     */
    public void anexarNodoInicio() {
        System.out.print("Que dato desea ingresar al inicio de la lista: ");
        this.datoInicio= input.nextInt();
        lst.anexarInicioLista(datoInicio);
        listar();
        
    }
    /**
     * Se anexa un nodo al final de la lista
     */
    public void anexarNodoFinal() {
        System.out.print("Que dato desea ingresar al final de la lista: ");
        dato= input.nextInt();
        lst.anexarFinalLista(dato);
        listar();
    }
    /**
     * Se imprime la lista
     */
    public void listar() {
        String laLista = lst.imprimirLista();
        System.out.println(laLista);
    }
    /**
     * metodo que a partir de un valor invoca el metodo a buscar este numero en
     * la lista
     */
    public void buscarNodo() {
        int n = 0;
        System.out.print("Digite el numero a buscar: ");
        n = input.nextInt();
        if (lst.buscarNodo(n)) {
            System.out.println("Valor encontrado\n");
        } else {
            System.out.println("Valor no encontrado\n");
        }
        listar();
    }
    /**
     * metodo que borra el primer nodo de la lista
     */
    public void borrarDatoInicio() {
        if (lst.borrarNodoInicio()) {
            System.out.println("Nodo borrado");
        } else {
            System.out.println("Valor no borrado");
        }
        listar();
    }
    /**
     * metodo que borra el nodo al final de la lista
     */
    public void borrarDatoFinal() {
        if (lst.borrarNodoFinal()) {
            System.out.println("Nodo borrado");
        } else {
            System.out.println("Valor no borrado");
        }
        listar();
    }

    public static void main(String[] args) {
        AplicacionLista lista = new AplicacionLista();
        lista.leerMenu();
    }
}
