/*
 * package
 * br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoEnumeracoesComposicao.
 * application;
 * 
 * import java.text.ParseException; import java.text.SimpleDateFormat; import
 * java.util.Date; import java.util.Locale; import java.util.Scanner;
 * 
 * import br.com.qwasolucoes.mentoria.curso.Enum.etities.OrderStatus; import
 * br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoEnumeracoesComposicao.
 * etities.Cliente; import
 * br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoEnumeracoesComposicao.
 * etities.Ordem; import
 * br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoEnumeracoesComposicao.
 * etities.OrdemItem; import
 * br.com.qwasolucoes.mentoria.curso.ExercicioFixacaoEnumeracoesComposicao.
 * etities.Produto;
 * 
 * public class Program {
 * 
 * public static void main(String[] args) throws ParseException {
 * 
 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
 * 
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Entre com o nome do cliente: ");
 * System.out.print("Nome: "); String nome = sc.nextLine();
 * System.out.print("Email: "); String email = sc.nextLine();
 * System.out.print("Data de Nascimento (dd/MM/yyyy): "); Date dataNascimento =
 * sdf.parse(sc.next());
 * 
 * Cliente cliente = new Cliente (nome, email, dataNascimento);
 * 
 * System.out.println("Entre com os dados do Pedido:  ");
 * System.out.print("Status: "); OrderStatus status =
 * OrderStatus.valueOf(sc.next());
 * 
 * Ordem ordem = new Ordem(dataNascimento, status, cliente);
 * 
 * System.out.println("Quantos itens para este pedido"); int N = sc.nextInt();
 * for(int i=1; i<=N; i++) { System.out.println("# "+ i +" - item da lista: ");
 * System.out.print("nome do Produto: "); sc.nextLine(); String nmProduto =
 * sc.nextLine(); System.out.print("Preço do produto: "); double preco =
 * sc.nextDouble(); System.out.print("Quantidade: "); int quantidade =
 * sc.nextInt();
 * 
 * Produto produto = new Produto(nmProduto, preco);
 * 
 * OrdemItem it = new OrdemItem(quantidade , preco, produto);
 * 
 * ordem.addItem(it); } System.out.println(); System.out.println(ordem);
 * 
 * sc.close(); } }
 * 
 * 
 */