package parts;
public class Tienda {
    private Vendedor vendedor;
    private Cliente cliente;
    private int stock;
    public Tienda(Vendedor vendedor, Cliente cliente, int stock) {
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.stock = stock;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
    public String existeStock() {
        return  "El stock es " + getStock();
    }

}