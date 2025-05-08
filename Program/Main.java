package Program;
import Entities.Post;
import Entities.Comment;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            // Criar Post 1 e adicionar comentários
            Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
                             "Traveling to New Zealand  ", 
                             "I'm going to visit this wonderful country!  ", 
                             12);
            
            Comment c1 = new Comment("Have a nice trip bro!");
            Comment c2 = new Comment("Wow that's awesome!");
            
            // Adicionar comentários ao post 1
            p1.addComent(c1);
            p1.addComent(c2);
            
            // Criar Post 2 e adicionar comentários
            Post p2 = new Post(sdf.parse("06/05/2025 16:40:00"), 
                             "INDO VIAJAR", 
                             "finalmente, dps de 18 anos consegui tirar meu visto, estou indo para o aeroporto!", 
                             250);
            
            Comment c1p2 = new Comment("parabens");
            Comment c2p2 = new Comment("kkkkkk finalmente");
            
            // Adicionar comentários ao post 2
            p2.addComent(c1p2);
            p2.addComent(c2p2);
            System.out.println("--------------------------------------------------------------------------------------");
            // Imprimir resultados
            System.out.println(p1.getMoment());
            System.out.println(p1.getTitle());
            System.out.println(p1.getContent());
            System.out.println(p1);
            System.out.println("Comentários:");
            p1.getComments().forEach(System.out::println);
            
            System.out.println("--------------------------------------------------------------------------------------");
            
            System.out.println(p2.getMoment());
            System.out.println(p2.getTitle());
            System.out.println(p2.getContent());
            System.out.println(p2);
            System.out.println("Comentários:");
            p2.getComments().forEach(System.out::println);
            
        } catch (ParseException e) {
            System.err.println("Erro ao parsear data: " + e.getMessage());
        }
    }
}
