
package cinema;
import javax.swing.JOptionPane;

public class Filme {
   String nome,genero,atores;
   int clas, idade, dur;
   
   void atribuirnome (String valor) {
       nome=valor;
   }
   String returnnome (){
       return nome;
   }
    
   
   void atribuirdur (Integer valor){
       dur=valor;   
   }
   Integer returndur(){
       return dur;
   }
   
   
   void atribuirclas (int valor){
       clas=valor;   
   }
   int returnclas(){
       return clas;
       
   }
   
   
   void atribuirgenero (String valor){
       genero=valor;   
   }
   String returngenero(){
       return genero;
   }
   
   
   void atribuiratores (String valor){
       atores=valor;   
   }
   String returnatores(){
       return atores;
       
   }
  
   
   void atribuiridade (Integer valor){
       idade=valor;   
   }
   Integer returnidade(){
       return idade;
       
   }
   
   public static boolean indicado(int idade,int clas){
        boolean teste;
        if (idade >= clas){
            teste=true;
            JOptionPane.showMessageDialog(null, "\nVocê pode assistir esse filme.");
        }else {
            teste=false;
        JOptionPane.showMessageDialog(null, "\nVocê não pode assistir esse filme.");
            
        }
        return teste;
    }
   
   public static void duracao(int dur){
       if (dur >= 60){
           JOptionPane.showMessageDialog(null, "esse é um filme de longa duração");
       } else {
           JOptionPane.showMessageDialog(null, "esse é um filme de curta duração");
       }
   }

  
}

   
