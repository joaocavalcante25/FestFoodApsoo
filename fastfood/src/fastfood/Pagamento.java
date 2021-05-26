package fastfood;

public class Pagamento {
	
	private double pagamentoAutorizado;
	private String tipoDePag;

	public Pagamento() {
		// TODO Auto-generated constructor stub
	}

	public double getPagamentoAutorizado() {
		return pagamentoAutorizado;
	}

	public void setPagamentoAutorizado(double pagamentoAutorizado) {
		this.pagamentoAutorizado = pagamentoAutorizado;
	}

	public String getTipoDePag() {
		return tipoDePag;
	}

	public void setTipoDepag(String tipoDepag) {
		if (tipoDepag.equals("Cart�o") || tipoDepag.equals("QrCode") )
			this.tipoDePag = tipoDepag;
		else 
			System.out.println("tipo inv�lido");
	}
	
	private boolean pagComCartao() {
		if (this.getTipoDePag().equals("Cart�o"))
			return true;
		else 
		return false;
	}
	
	private boolean pagComQrCode() {
		if (this.getTipoDePag().equals("QrCode"))
			return true;
		else 
		return false;
	}
}
