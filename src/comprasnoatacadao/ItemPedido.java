package comprasnoatacadao;

public class ItemPedido {
    private double total = 0.00;
    private Integer quantProduto;
    private Integer codProduto;
    private Produto produto;
    private double compraComDesc = 0;

    public ItemPedido(int codProduto, int quantProduto) {
        this.codProduto = codProduto;
        this.quantProduto = quantProduto;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Produto codProduto) {
        this.codProduto = codProduto.getCod();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantProduto() {
        return quantProduto;
    }

    public void setQuantProduto(int quantProduto) {
        this.quantProduto = quantProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getCompraComDesc() {
        return compraComDesc;
    }

    public void setCompraComDesc(double compraComDesc) {
        this.compraComDesc = compraComDesc;
    }

    public double descontoPorQuantidade(double valorCompra){
        if (quantProduto<5){
            compraComDesc = valorCompra;
        } else if(quantProduto>=5 && quantProduto<15){
            compraComDesc = valorCompra - (valorCompra * 0.10);
        } else if(quantProduto>=15 && quantProduto<25){
            compraComDesc = valorCompra - (valorCompra * 0.20);
        } else {
            compraComDesc = valorCompra - (valorCompra * 0.25);
        }
        return compraComDesc;
    }

}
