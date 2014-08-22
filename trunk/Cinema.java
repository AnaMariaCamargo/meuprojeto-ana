
package cinema;
import javax.swing.JOptionPane;

public class Cinema {

 
    public static void main(String[] args) {
     Filme f = new Filme();
     String nome,genero,atores;
     int clas, idade, dur;
     
     nome = JOptionPane.showInputDialog("Digite as informações do filme \n nome:");
     dur = Integer.parseInt(JOptionPane.showInputDialog("duracão:"));
     clas = Integer.parseInt(JOptionPane.showInputDialog("clasificação:"));
     genero = JOptionPane.showInputDialog("gênero:");
     atores = JOptionPane.showInputDialog("atores:");
     idade = Integer.parseInt(JOptionPane.showInputDialog("informe sua idade:"));
     
     f.atribuirnome(nome);
     f.atribuirclas(clas);
     f.atribuiratores(atores);
     f.atribuirdur(dur);
     f.atribuirgenero(genero);
     f.atribuiridade (idade);
     
     JOptionPane.showMessageDialog(null, "Dados do Filme\nNome: " + nome + 
             "\nClassificação Indicativa: " + clas + " anos\nDuração: "
                + dur + " min\nGênero: " + genero + "\nAtores: " + atores);
     
     f.indicado(idade, clas);
     f.duracao(dur);
}

}
