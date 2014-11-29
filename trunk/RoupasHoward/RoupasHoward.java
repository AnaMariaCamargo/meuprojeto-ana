package roupashoward;

import javax.swing.JOptionPane;

public class RoupasHoward {

    public static void main(String[] args) {
        Prateleira p = new Prateleira();

        Astronauta r1 = new Astronauta();
        r1.setDescricao("Camiseta oficial da missão Marte Ataca");
        r1.setTipo("Camiseta");
        r1.setCor("Branco");
        r1.setCodigosecreto("1XD346");
        r1.setDia("1 de agosto");
        r1.setPreferida(true);

        p.getLista().add(r1);

        p.setNomeprateleira("A - Roupas de Astronauta");

        JOptionPane.showMessageDialog(null, "Prateleira " + p.getNomeprateleira() + "\n\n" + p.listarRoupas());

        p = new Prateleira();

        Roupa r2 = new Roupa();
        r2.setDescricao("Camisa xadrez");
        r2.setTipo("Camisa");
        r2.setCor("Vermelho");
        r2.setPreferida(false);
        
        Roupa r3 = new Roupa();
        r3.setDescricao("Camisa xadrez");
        r3.setTipo("Camisa");
        r3.setCor("Verde");
        r3.setPreferida(false);
        
        Roupa r4 = new Roupa();
        r4.setDescricao("Camisa xadrez");
        r4.setTipo("Camisa");
        r4.setCor("Amarelo");
        r4.setPreferida(false);
        
        Roupa r5 = new Roupa();
        r5.setDescricao("Camiseta simples");
        r5.setTipo("Camiseta");
        r5.setCor("Preto");
        r5.setPreferida(false);
        
        Roupa r6 = new Roupa();
        r6.setDescricao("Camiseta para exercícios físicos");
        r6.setTipo("Camiseta");
        r6.setCor("Cinza");
        r6.setPreferida(false);

        Roupa r7 = new Roupa();
        r7.setDescricao("Calça que ganhei em uma aposta");
        r7.setTipo("Calça");
        r7.setCor("Azul bebê");
        r7.setPreferida(false);

        p.getLista().add(r2);
        p.getLista().add(r3);
        p.getLista().add(r4);
        p.getLista().add(r5);
        p.getLista().add(r6);
        p.getLista().add(r7);

        p.setNomeprateleira("B - Camisas e Calças");

        JOptionPane.showMessageDialog(null, "Prateleira " + p.getNomeprateleira() + "\n\n" + p.listarRoupas());

        p = new Prateleira();

        Fantasia r8 = new Fantasia();
        r8.setDescricao("Camiseta");
        r8.setTipo("Camiseta");
        r8.setCor("Vermelho e azul");
        r8.setPersonagem("Superman");
        r8.setPreferida(false);
        
        Fantasia r9 = new Fantasia();
        r9.setDescricao("Bermuda do mal");
        r9.setTipo("Bermuda");
        r9.setCor("Verde e vermelho");
        r9.setPersonagem("Coringa");
        r9.setPreferida(false);

        p.getLista().add(r8);
        p.getLista().add(r9);

        p.setNomeprateleira("C - Fantasias");

        JOptionPane.showMessageDialog(null, "Prateleira " + p.getNomeprateleira() + "\n\n" + p.listarRoupas());

        p = new Prateleira();

        Roupa r10 = new Roupa();
        r10.setDescricao("Cuecão de seda");
        r10.setTipo("Cueca");
        r10.setCor("Laranja");
        r10.setPreferida(false);

        Roupa r11 = new Roupa();
        r11.setDescricao("Meia de dormir");
        r11.setTipo("Meia");
        r11.setCor("Preto");
        r11.setPreferida(false);

        p.getLista().add(r10);
        p.getLista().add(r11);

        p.setNomeprateleira("D - Cuecas e Meias");

        JOptionPane.showMessageDialog(null, "Prateleira " + p.getNomeprateleira() + "\n\n" + p.listarRoupas());

        p = new Prateleira();

        Roupa r12 = new Roupa();
        r12.setDescricao("Sapato formal");
        r12.setTipo("Sapato");
        r12.setCor("Marrom");
        r12.setPreferida(false);

        Roupa r13 = new Roupa();
        r13.setDescricao("Pantufa de cachorrinho");
        r13.setTipo("Pantufa");
        r13.setCor("Cinza");
        r13.setPreferida(false);

        p.getLista().add(r12);
        p.getLista().add(r13);

        p.setNomeprateleira("E - Sapatos");

        JOptionPane.showMessageDialog(null, "Prateleira " + p.getNomeprateleira() + "\n\n" + p.listarRoupas());
    }

}
