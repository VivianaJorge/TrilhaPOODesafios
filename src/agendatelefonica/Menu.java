package agendatelefonica;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcaoMenu = 0;
        AgendaTelefonica agenda = new AgendaTelefonica();

        do {
            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Adicionar um novo contato");
            System.out.println("2 - Remover um contato existente");
            System.out.println("3 - Buscar um contato pelo nome");
            System.out.println("4 - Atualizar informações de um contato");
            System.out.println("5 - Listar todos os contatos na agenda");
            System.out.println("6 - Sair do programa");
            opcaoMenu = teclado.nextInt();

            if(opcaoMenu==1){
                System.out.println("Informe o nome do contato: ");
                String nome = teclado.next();
                System.out.println("Informe o telefone de " + nome);
                int telefone = teclado.nextInt();
                Contato contato = new Contato(nome,telefone);
                agenda.adicionarContato(contato);
            } else if(opcaoMenu==2){
                System.out.println("Informe o nome do contato a ser excluído:");
                String nome = teclado.next();
                agenda.removerContato(nome);
            } else if(opcaoMenu==3){
                System.out.println("Informe o nome do contato a ser exibido:");
                String nome = teclado.next();
                agenda.buscarContato(nome);
            } else if(opcaoMenu==4){
                System.out.println("Informe o nome do contato a ser alterado:");
                String nome = teclado.next();
                System.out.println("Informe o novo nome:");
                String nomeNovo = teclado.next();
                System.out.println("Informe o novo telefone:");
                int telefone = teclado.nextInt();
                Contato contato = new Contato(nomeNovo,telefone);
                agenda.atualizarContato(nome,contato);
            } else if(opcaoMenu==5){
                agenda.listarContatos();
            } else if(opcaoMenu==6){
                System.out.println("Fechando menu...");
            } else {
                System.out.println("Código inválido!");
            }
        } while (opcaoMenu != 6);

    }
}
