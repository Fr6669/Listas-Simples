package labestructiras;
public class Nodo {
    private int dato;
    //Auto referencia
    private Nodo enlace;
    //Constructor odo
   public Nodo(){
       this.dato=0;
       this.enlace=null;
   }
   //Constructor nodo con atributo
   public Nodo(int dato){
       this.dato=dato;
       this.enlace=null;
   }
   //Se obtiene el dato del nodo 
   public int getDato(){
       return dato;
   }
   //Se actualiza el dato
   public void setDato(int dato){
       this.dato=dato;
   }
   //Obtiene el valor de la referencia
   public Nodo getEnlace(){
       return enlace;
   }
   //Se actualiza la referencia
   public void setEnlace(Nodo enlace){
       this.enlace=enlace;
   }
}
