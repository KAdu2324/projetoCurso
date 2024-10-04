/*
 * package br.com.qwasolucoes.mentoria.curso.exercicioFunc2;
 * 
 * import java.text.ParseException; import java.text.SimpleDateFormat;
 * 
 * import entities.Comment; import entities.Post;
 * 
 * public class Program {
 * 
 * public static void main(String[] args) throws ParseException {
 * 
 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
 * 
 * Comment c1 = new Comment("Fazer uma boa viagem!"); Comment c2 = new
 * Comment("Como isso é incrível!" + "");
 * 
 * Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
 * "Viajar para a Nova Zelândia", "Vou visitar um país maravilhoso!", 12);
 * p1.addComment(c1); p1.removeComment(c2);
 * 
 * Comment c3 = new Comment("Boa noite"); Comment c4 = new
 * Comment("que a força esteja com você!" + "");
 * 
 * Post p2 = new Post(sdf.parse("28/07/2018 23:05:44"), "Boa noite pessoal",
 * "vejo você amanhã", 5); p2.addComment(c3); p2.removeComment(c4);
 * 
 * System.out.println(p1); System.out.println(p2); }
 * 
 * }
 */