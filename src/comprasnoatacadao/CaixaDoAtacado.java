package comprasnoatacadao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CaixaDoAtacado {

   public static void main(String[] args) throws IOException {

      double valorCompra = 0.00;
      double valorTotal = 0.00;
      double valorFinal;

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

      //COM ARQUIVO//////////////////////////////////////////////////////////////////////////////////////////////
      String path = "C:\\Desenvolvimento\\Projeto_Sementes\\DesafiosTrilhaPOO\\src\\comprasnoatacadao\\Pedido.txt";

      BufferedReader buffRead = new BufferedReader(new FileReader(path));
      String linha = buffRead.readLine();
      String formaPagamento = linha;
      System.out.println("Forma de Pagamento:" + formaPagamento);

      int codProd;
      int qtdProd;
      String separador = ",";

      ArrayList<ItemPedido> itens = new ArrayList<>();

      while (true) {
         linha = buffRead.readLine();
         if (linha != null) {
            String[] values = linha.split(separador);
            codProd = Integer.parseInt(values[0]);
            qtdProd = Integer.parseInt(values[1]);
            System.out.println("COD " + codProd);
            System.out.println("QTD " + qtdProd);
            ItemPedido aux = new ItemPedido(codProd, qtdProd);
            itens.add(aux);

         } else
            break;
      }
      buffRead.close();
      //FIM ARQUIVO ///////////////////////////////////////////////////////////////////////////////////////////////

      for (Produto catalogo : produtos) {
         for (ItemPedido itemPedido : itens) {
            if (catalogo.getCod() == itemPedido.getCodProduto()) {
               valorCompra = catalogo.getValor() * itemPedido.getQuantProduto();
               System.out.println("Valor do produto " + valorCompra);
               System.out.println("Valor com desconto " + itemPedido.descontoPorQuantidade(valorCompra));
               valorTotal += itemPedido.descontoPorQuantidade(valorCompra);
            }
         }
      }
      System.out.println("Total das compras com desconto por quantidade: R$ " + valorTotal);

      ArrayList<Pedido> pedido = new ArrayList<>();
      Pedido compra = new Pedido(valorTotal, formaPagamento);
      pedido.add(compra);

      valorFinal = compra.FormaPagamento(valorTotal, compra.getFormaPagamento());
      System.out.println("Total Final com desconto de forma de pagamento: R$ " + valorFinal);

   }
}


