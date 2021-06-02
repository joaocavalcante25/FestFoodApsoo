package fastfood;

import java.sql.Date;

public class Pedido {
	private int codPedido;
	private  Date horarioPedido;
	private String descricao;
	private String statusPedido;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Pedido buscarPedido(int codPedido) {
		//implementar
		return null;
		
	}
	
	public void emitirComprovantePedido(Pagamento pagamentoAutorizado) {
		//implementar
		
	}

	public int getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(int codPedido) {
		//implementar regra
		this.codPedido = codPedido;
	}

	public Date getHorarioPedido() {
		
		return horarioPedido;
	}

	public void setHorarioPedido(Date horarioPedido) {
		//implementar regra
		this.horarioPedido = horarioPedido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		//implementar regra
		this.descricao = descricao;
	}



	public String getStatusPedido() {
		return statusPedido;
	}



	public void setStatusPedido(String statusPedido) {
		//implementar regra
		this.statusPedido = statusPedido;
	}
	


}
