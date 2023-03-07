package aplicacao;

import java.util.Date;

import entidades.Ordem;
import entidades.enums.StatusDoPedido;

public class Programa {

	public static void main(String[] args) {
		
		Ordem ordem = new Ordem(1080, new Date(), StatusDoPedido.pagamento_pendente);
		
		System.out.println(ordem);
		
		StatusDoPedido os1 = StatusDoPedido.entregue;
		StatusDoPedido os2 = StatusDoPedido.valueOf("entregue");
		
		System.out.println(os1);
		System.out.println(os2);
		

	}

}
