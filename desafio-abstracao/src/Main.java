import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Python");
        curso1.setDescricao("Descrição curso Python");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C++");
        curso2.setDescricao("Descrição curso C++");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Design Patterns");
        mentoria.setDescricao("Descrição mentoria Design Patterns");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Full Stack Developer");
        bootcamp.setDescricao("Descrição Bootcamp Full Stack Developer");
        bootcamp.adicionarConteudo(curso1);
        bootcamp.adicionarConteudo(curso2);
        bootcamp.adicionarConteudo(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana: " + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana: " + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana: " + devAna.getConteudosConcluidos());
        System.out.println("XP Total: " + devAna.calcularTotalXp());
        System.out.println("XP Restante: " + devAna.calcularXpRestante());

        System.out.println("-------");

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruno: " + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruno: " + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bruno: " + devBruno.getConteudosConcluidos());
        System.out.println("XP Total: " + devBruno.calcularTotalXp());
        System.out.println("XP Restante: " + devBruno.calcularXpRestante());
    }
}
