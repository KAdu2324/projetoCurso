/*
 * package
 * br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoEnumeracoesComposicao.
 * etities;
 * 
 * import java.text.SimpleDateFormat; import java.util.ArrayList; import
 * java.util.Date; import java.util.List;
 * 
 * import entities.enums.OrderStatus;
 * 
 * public class Ordem {
 * 
 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
 * 
 * private Date momento; private OrderStatus status;
 * 
 * private Cliente cliente;
 * 
 * private List<OrdemItem> items = new ArrayList<>();
 * 
 * public Ordem() {
 * 
 * }
 * 
 * public Ordem(Date momento, OrderStatus status, Cliente cliente) {
 * this.momento = momento; this.status = status; this.cliente = cliente; }
 * 
 * public Date getMomento() { return momento; }
 * 
 * public void setMomento(Date momento) { this.momento = momento; }
 * 
 * public OrderStatus getStatus() { return status; }
 * 
 * public void setStatus(OrderStatus status) { this.status = status; }
 * 
 * public Cliente getCliente() { return cliente; }
 * 
 * public void setCliente(Cliente cliente) { this.cliente = cliente; }
 * 
 * public void addItem(OrdemItem item) { items.add(item);
 * 
 * }
 * 
 * public void removeItem(OrdemItem item) { items.remove(item); }
 * 
 * public double totalPedido() { double sum = 0.0; for(OrdemItem it : items) {
 * sum += it.subTotal(); } return sum; }
 * 
 * @Override public String toString() { StringBuilder sb = new StringBuilder();
 * sb.append("Ordem pedido: "); sb.append(sdf.format(momento) + "\n");
 * sb.append("Ordem status: "); sb.append(status + "\n");
 * sb.append("Cliente: "); sb.append(cliente + "\n");
 * sb.append("Ordem items:\n"); for (OrdemItem item : items) { sb.append(item +
 * "\n "); } sb.append("Total preço: $"); sb.append(String.format("%.2f",
 * totalPedido())); return sb.toString(); } }
 */