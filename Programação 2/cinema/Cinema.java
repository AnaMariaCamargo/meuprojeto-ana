package cinema;

import javax.swing.JOptionPane;

public class Cinema {

    public static void main(String[] args) {
        Filme f = new Filme();
        Ator a = new Ator();
        
        //FILME

        String nome, genero, atores;
        int classificacao, duracao, idade;

        nome = (JOptionPane.showInputDialog("Digite as informações do filme\nNome: "));
        classificacao = (Integer.parseInt(JOptionPane.showInputDialog("Classificação indicativa: ")));
        duracao = (Integer.parseInt(JOptionPane.showInputDialog("Duração (em minutos): ")));
        genero = (JOptionPane.showInputDialog("Gênero: "));
        atores = (JOptionPane.showInputDialog("Atores: "));
        idade = (Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: ")));

        
        f.atribuirNome(nome);
        f.atribuirClassificacao(classificacao);
        f.atribuirDuracao(duracao);
        f.atribuirGenero(genero);
        f.atribuirAtores(atores);
        f.atribuirIdade(idade);
                
        JOptionPane.showMessageDialog(null, "Dados do Filme\n\nNome: " + nome + "\nClassificação Indicativa: " + classificacao + " anos\nDuração: "
                + duracao + " min\nGênero: " + genero + "\nAtores: " + atores);

        f.indicado(idade, classificacao);
        f.duracaofilme(duracao);
        
        //ATOR
        
        String nomeator, nacional, oscar, datanasc, totalfilme;
        float cache, filmeultimoano;
        Boolean osc = true;

        nomeator = (JOptionPane.showInputDialog("Digite as informações do ator\nNome: "));
        nacional = (JOptionPane.showInputDialog("Nacionalidade: "));
        cache = ((Float.parseFloat(JOptionPane.showInputDialog("Cachê: R$ "))));
        datanasc = (JOptionPane.showInputDialog("Data de nascimento: "));
        totalfilme = (JOptionPane.showInputDialog("Total de filmes: "));
        filmeultimoano = ((Float.parseFloat(JOptionPane.showInputDialog("Quantidade de filmes do último ano: "))));
        oscar = (JOptionPane.showInputDialog("Ele já ganhou o oscar? Sim ou Não? "));
        
        a.atribuirNomeator(nomeator);
        a.atribuirNacional(nacional);
        a.atribuirCache(cache);
        a.atribuirDatanasc(datanasc);
        a.atribuirTotalfilme(totalfilme);
        a.atribuiFilmeultimoano(filmeultimoano);
        a.atribuirOscar(oscar);

        if (oscar.equalsIgnoreCase("sim")) {
            osc = true;
        } else {
            osc = false;
        }

        JOptionPane.showMessageDialog(null, "Dados do Ator\n\nNome: " + nomeator + "\nNacionalidade: "
                + nacional + "\nData de nascimento: " + datanasc + "\nCachê: R$ " + cache + "\nTotal de fil"
                + "mes realizados: " + totalfilme + "\nTotal de filmes do ultimo ano: " + filmeultimoano
                + "\nEsse ator já ganhou o oscar - True: Verdadeiro - Sim, False: Falso - Não : " + osc);
        a.ganhosultimoano(cache, filmeultimoano);

    }
}
    