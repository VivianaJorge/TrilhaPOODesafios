package comprasnoatacadao;

public class Pedido {

    private double total = 0.00;
    private ItemPedido item;
    private String formaPagamento;

    public Pedido(double total, String formaPagamento) {
        this.total = total;
        this.formaPagamento = formaPagamento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double FormaPagamento(double totalCompra, String formaPagamento) {
        if(formaPagamento.equals("credito")){
            total = totalCompra - (totalCompra * 0.03);
        } else if (formaPagamento.equals("dinheiro")){
            total = totalCompra - (totalCompra * 0.05);
        } else{
            total = totalCompra;
        }
        return total;
    }
}
