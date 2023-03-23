import java.time.LocalDate;

import Conteúdo.Bootcamp;
import Conteúdo.Curso;
import Conteúdo.Dev;
import Conteúdo.Mentoria;

public class main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(("Conteúdos Inscritos") + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println(("Conteúdos Inscritos") + devCamila.getConteudosInscritos());
        System.out.println(("Conteúdos Concluidoss") + devCamila.getConteudoConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        
        System.out.println("-----------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(("Conteúdos Inscritos") + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println(("Conteúdos Inscritos") + devJoao.getConteudosInscritos());
        System.out.println(("Conteúdos Concluidos") + devJoao.getConteudoConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        
    }
}