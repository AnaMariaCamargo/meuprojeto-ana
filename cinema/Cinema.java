package cinema;

import javax.swing.JOptionPane;

public class Cinema {

    public static void main(String[] args) {
        Filme f = new Filme();
        Ator a = new Ator();

        String nome, genero, atores;
        int classificacao, duracao, idade;

        String nomeat, nacionalidade, oscar, datanasc, totalfil;
        float cache, filmeultimo;
        Boolean osc = true;

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

        f.clasindicativa(idade, classificacao);
        f.dur(duracao);

        nomeat = (JOptionPane.showInputDialog("Digite as informações do ator\nNome: "));
        nacionalidade = (JOptionPane.showInputDialog("Nacionalidade: "));
        cache = ((Float.parseFloat(JOptionPane.showInputDialog("Cachê: R$ "))));
        datanasc = (JOptionPane.showInputDialog("Data de nascimento: "));
        totalfil = (JOptionPane.showInputDialog("Total de filmes: "));
        filmeultimo = ((Float.parseFloat(JOptionPane.showInputDialog("Quantidade de filmes do último ano: "))));
        oscar = (JOptionPane.showInputDialog("Ele já ganhou o oscar? Sim ou Não? "));
        
        a.atribuirNomeat(nomeat);
        a.atribuirNacionalidade(nacionalidade);
        a.atribuirCache(cache);
        a.atribuirDatanasc(datanasc);
        a.atribuirTotalfil(totalfil);
        a.atribuiFilmeultimo(filmeultimo);
        a.atribuirOscar(oscar);

        if (oscar.equalsIgnoreCase("Sim")) {
            osc = true;
        } else {
            osc = false;
        }

        JOptionPane.showMessageDialog(null, "Dados do Ator\n\nNome: " + nomeat + "\nNacionalidade: "
                + nacionalidade + "\nData de nascimento: " + datanasc + "\nCachê: R$ " + cache + "\nTotal de fil"
                + "mes realizados: " + totalfil + "\nTotal de filmes do ultimo ano: " + filmeultimo
                + "\nEsse ator já ganhou o oscar - True: Verdadeiro - Sim, False: Falso - Não : " + osc);

        a.ganhos(cache, filmeultimo);

    }
}
    