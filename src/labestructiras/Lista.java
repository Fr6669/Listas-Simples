package labestructiras;
public class Lista {
    private Nodo primero;
    private Nodo ultimo;
    private Nodo nuevo;
    Nodo p;
    //Constructor de la clase
    public Lista(){
        this.primero=null;
        this.ultimo=null;
    }
    //Se anexa un nodo al inicio de la lista
    public void anexarInicioLista(int dato){
        nuevo=new Nodo(dato);
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            nuevo.setEnlace(primero);
            primero=nuevo;
        }
    }
    public void anexarFinalLista(int dato){
        nuevo=new Nodo(dato);
        if(primero==null){
            primero=nuevo;
            ultimo=nuevo;
        }else{
            ultimo.setEnlace(nuevo);
            ultimo=nuevo;
            ultimo.setEnlace(null);
        }
        
    }
    //Se evalua si la lista es vacia
    public boolean esVacia(){
        return (primero==null);
    }
    //Busca un valor en los nodos de la lista
    public boolean buscarNodo(int dato){
        boolean encontro=false;
        p=primero;
        while(p.getEnlace()!=null && encontro==false){
            if(p.getDato()==dato){
                encontro=true;
            }
            p=p.getEnlace();
        }
        return encontro;
    }
    public boolean borrarNodoInicio(){
        if(esVacia())
            return false;
        if(primero.getEnlace()==null){
            primero=null;
            ultimo=null;
            return false;
        }else{
            Nodo temp=primero;
            primero=primero.getEnlace();
            temp.setEnlace(null);
            return true;
        }
    }
    //Metodo que borra un nodo al final de la lista
    public boolean borrarNodoFinal(){
        if(esVacia())
            return false;
        if(primero.getEnlace()==null){
            primero=null;
            ultimo=null;
            return false;
        }else{
            Nodo temp=primero;
            Nodo aux=primero;
            while(temp.getEnlace()!=null){
                aux=temp;
                temp=temp.getEnlace();
            }
            ultimo=aux;
            ultimo.setEnlace(null);
            return true;
        }
    }
    //Metodo que almacena en un string los nodos de la lista
    
    public String imprimirLista(){
        String str="Lista: ";
        if(primero==null){
            str="Lista vacia";
        }else{
            p=primero;
            do{
                str+=p.getDato()+" ";
                p=p.getEnlace();
            }while(p!=null);
            
        }
        return str;
    }
}
