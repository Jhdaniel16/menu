
package menuordenamientos;


import javax.swing.JOptionPane;


public class MenuOrdenamientos {

   
    public static void main(String[] args) {
        int opcion;
        int n1, n2, n3, n4, n5;
        do{
        opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                "      ELIJA EL ORDENAMIENTO    \n"+
                "1. Ordenamiento Burbuja\n"+
                "2. Ordenamiento Shell\n"+
                "3. Ordenamiento Quicksort\n"+
                "4. Salir\n"));
        switch (opcion){
            case 1: 
                int op;
                op=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Ingrese datos\n"+
                        "2. Listar\n"+
                        "3. Ordenar\n"));
             n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 1"));
             n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 2"));
             n3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 3"));
             n4=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 4"));
             n5=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 5"));
             JOptionPane.showMessageDialog(null, "el ordenamiento es: "+burbuja (n1, n2, n3, n4, n5));
                   break;
            case 2: 
                op=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Ingrese datos\n"+
                        "2. Listar\n"+
                        "3. Ordenar\n"));
            n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 1"));
             n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 2"));
             n3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 3"));
             n4=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 4"));
             n5=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 5"));
             JOptionPane.showMessageDialog(null, "el ordenamiento es: "+shell (n1, n2, n3, n4, n5));
                   break;
            
            case 3: 
                op=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Ingrese datos\n"+
                        "2. Listar\n"+
                        "3. Ordenar\n"));
                n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 1"));
             n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 2"));
             n3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 3"));
             n4=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 4"));
             n5=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 5"));
             JOptionPane.showMessageDialog(null, "el ordenamiento es: "+quicksort (n1, n2, n3, n4, n5));
                   break;
            case 4: JOptionPane.showMessageDialog(null, "usted seleccion salir");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "usted seleccion una opcion invalida");
                   break;
        }
        }while(opcion!=4);
    }


   
    public static String burbuja(int n1, int n2, int n3, int n4, int n5) {
        int arreglo[]=new int [5];
      
        int temp;
        
        for(int i=1;i < arreglo.length;i++){
            for (int j=0 ; j < arreglo.length- 1; j++){
                if (arreglo[j] < arreglo[j+1]){
                    temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }}
                for(int i=0;i < arreglo.length;i++){
                
                JOptionPane.showMessageDialog(null, arreglo[i]);
                
                }
        return null;
    }

    public static String shell(int n1, int n2, int n3, int n4, int n5) {
        int[] A =new int[5];
         shell(A);
        for (int i = 0; i < 6; i++) {
            JOptionPane.showMessageDialog(null, A[i]);
             
        }
        return null;
    }
    private static void shell(int[] A) {
        int salto, aux, i;
   boolean cambios;
   for(salto=A.length/2; salto!=0; salto/=2){
           cambios=true;
           while(cambios){ 
                       cambios=false;
                       for(i=salto; i< A.length; i++) 
                               if(A[i-salto]>A[i]){  
                                     aux=A[i]; 
                                     A[i]=A[i-salto];
                                     A[i-salto]=aux;
                                     cambios=true; 
                               }
                        }
            }
    }

    private static String quicksort(int n1, int n2, int n3, int n4, int n5) {
        int i;
      int array[] = new int [5];
       JOptionPane.showMessageDialog(null,"    Quick Sort\n");
      JOptionPane.showMessageDialog(null,"Valores antes de QuickSort:\n");
      for(i = 0; i < array.length; i++)
  
          JOptionPane.showMessageDialog(null, array[i]+"  ");
      JOptionPane.showMessageDialog(null, " ");
      quick_srt(array,0,array.length-1);
       JOptionPane.showMessageDialog(null,"\n\n\nValores despues de QuickSort:\n\n");
  
      for(i = 0; i <array.length; i++)
          JOptionPane.showMessageDialog(null, array[i]+"  ");
       JOptionPane.showMessageDialog(null, " ");
        return null;
    }

    private static void quick_srt(int[] array, int i, int i0) {
        int primero = 0;
         int izquierda = primero;
        int ultimo = 0;
      
      int derecha = ultimo;
      JOptionPane.showMessageDialog(null,"la derecha es " +derecha);
      JOptionPane.showMessageDialog(null,"la izquierdad es " +derecha);
      if (izquierda>= ultimo) {
          return;
      }
      int mitad = array[(izquierda + derecha) / 2];
      JOptionPane.showMessageDialog(null,"la mitad es " +mitad);
      while (izquierda< derecha) {
         
          while (izquierda<derecha && array[izquierda] < mitad) {
              izquierda++;
          }
          while (izquierda<derecha && array[derecha] > mitad) {
              derecha--;
          }
          
          if (izquierda< derecha) {
              int T = array[izquierda];
              array[izquierda] = array[derecha];
              array[derecha] = T;
          }
      }
      if (derecha < izquierda) {
          int T = derecha;
          derecha = izquierda;
          izquierda = T;
      }
      quick_srt(array, primero, izquierda);
    }
    
}
