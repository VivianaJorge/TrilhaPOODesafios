package comprasnoatacadao;

public class Pedido {

    private double total = 0.00;
    private ItemPedido item;
    private int formaPagamento;

    public Pedido(double total, int formaPagamento) {
        this.total = total;
        this.formaPagamento = formaPagamento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double FormaPagamento(double totalCompra, int pagamento) {
        if(pagamento == 3){
            total = totalCompra + (totalCompra * 0.03);
        } else if (pagamento==2){
            total = totalCompra - (totalCompra * 0.05);
        } else{
            total = totalCompra;
        }
        return total;
    }
}
