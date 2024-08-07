package agendatelefonica;

import comprasnoatacadao.Produto;

import java.util.ArrayList;

public class AgendaTelefonica {

    ArrayList<Contato> agenda = new ArrayList<>();

    public ArrayList<Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contato> agenda) {
        this.agenda = agenda;
    }

    public void adicionarContato(Contato contato){
        agenda.add(contato);
    }

    public void removerContato(String nome){
        int i=0;
        for (Contato contatos : agenda){
            if(contatos.getNome().equals(nome)){
              agenda.remove(i);
            }
            i++;
        }
    }

    public void buscarContato(String nome){
        for (Contato contatos : agenda) {
            if (contatos.getNome().equals(nome)) {
                System.out.println(contatos.getNome() + ": " + contatos.getTelefone());
            }
        }
    }

    public void atualizarContato(String nome, Contato novoContato){
        int i=0;
        for (Contato contatos : agenda) {
            if (contatos.getNome().equals(nome)) {
                agenda.set(i, novoContato);
            }
            i++;
        }
    }

    public void listarContatos(){
        for (Contato contatos : agenda){
            System.out.println(contatos.getNome() + ": " + contatos.getTelefone());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "AgendaTelefonica{" + super.toString() +
                "agenda=" + agenda +
                '}';
    }
}
