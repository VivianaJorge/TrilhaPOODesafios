package comprasnoatacadao;

import java.util.ArrayList;

public class CaixaDoAtacado {

    public static void main(String[] args) {

       double valorCompra = 0.00;
       double valorTotal = 0.00;
       double valorFinal =0.00;

       ArrayList<Produto> produtos = new ArrayList<>();

       Produto prodA = new Produto(1, "Café 1kg", 53.00);
       Produto prodB = new Produto(2, "Sabão em pó", 36.00);
       Produto prodC = new Produto(3, "Caixa de Leite", 82.00);
       Produto prodD = new Produto(4, "Refrigerate", 8.50);

       produtos.add(prodA);
       produtos.add(prodB);
       produtos.add(prodC);
       produtos.add(prodD);

       for (Produto catalogo : produtos) {
          System.out.println(catalogo.getCod() + "|" + catalogo.getNome() + "|" + catalogo.getValor());
       }

       ArrayList<ItemPedido> item = new ArrayList<>();
       ItemPedido item1 = new ItemPedido(1,10);
       ItemPedido item2 = new ItemPedido(2,20);
       ItemPedido item3 = new ItemPedido(3,5);

       item.add(item1);
       item.add(item2);
       item.add(item3);

       for (ItemPedido itemPedido : item) {
          System.out.println(itemPedido.getCodProduto() + "," + itemPedido.getQuantProduto());
       }


       for (Produto catalogo : produtos) {
          for (ItemPedido itemPedido : item) {
             if(catalogo.getCod()==itemPedido.getCodProduto()){
               valorCompra = catalogo.getValor()*itemPedido.getQuantProduto();
               System.out.println("Valor do produto " + valorCompra);
               System.out.println("Valor com desconto " + itemPedido.descontoPorQuantidade(itemPedido.getQuantProduto(),valorCompra));
               valorTotal += itemPedido.descontoPorQuantidade(itemPedido.getQuantProduto(),valorCompra);
             }
          }
       }
       System.out.println("Total das compras com desconto por quantidade: R$ " + valorTotal);

       ArrayList<Pedido> pedido = new ArrayList<>();
       Pedido compra = new Pedido(valorTotal,2);
       pedido.add(compra);

       valorFinal = compra.FormaPagamento(valorTotal,compra.getFormaPagamento());
       System.out.println("Total Final com desconto de forma de pagamento: R$ " + valorFinal);




         //INPUT EM TELA

    /*   Scanner t = new Scanner(System.in);
       String resposta;
       double valorCompra = 0.00;
       double valorComDesc = 0.00;
       double valorTotal = 0.00;
       do{
          System.out.println("Informe código do produto desejado");
          int codigo = t.nextInt();
          System.out.println("Informe a quantidade desejada do produto");
          int quantidade = t.nextInt();

          for (Produto catalogo : produtos) {
             if(catalogo.getCod()==codigo){
               valorCompra = catalogo.getValor()*quantidade;
               valorComDesc = catalogo.descontoPorQuantidade(quantidade,valorCompra);
                System.out.println(catalogo.descontoPorQuantidade(quantidade,valorCompra));
             }
          }
          valorTotal += valorComDesc;
          System.out.println("Deseja mais produtos? [S/N]");
          resposta = t.next();
       } while (resposta.equals("S"));
       System.out.println("Total das compras com desconto por quantidade: R$ " + valorTotal);

       System.out.println("Informe o código correspondente à forma de Pagamento:");
       System.out.println("1 - Débito");
       System.out.println("2 - Dinheiro");
       System.out.println("3 - Crédito");
       int pagamento = t.nextInt();
       Compra descPagamento = new Compra();
       double totalFinal = descPagamento.FormaPagamento(pagamento,valorTotal);
       System.out.println("Valor Final: R$ " + totalFinal);
     */

       //TENTATIVA COM ARQUIVO

/*       String arquivo = "C:\\Desenvolvimento\\Projeto_Sementes\\DesafiosTrilhaPOO\\src\\comprasnoatacadao\\Compra.csv";
       String linha = "";
       String csvSeparator = ",";


       try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
          while ((linha = br.readLine()) != null) {
          //   String[] itemPedido = linha.split(csvSeparator);
             System.out.println(linha);


          }
       } catch (IOException e) {
          e.printStackTrace();
      } finally {
         try {
            if (br != null)
               br.close();
         } catch (IOException e) {
            e.printStackTrace();
         }
     }
 */

       }
    }

