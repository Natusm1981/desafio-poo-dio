import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaSCRIPT");
        curso2.setDescricao("Descrição do curso JavaSCRIPT");
        curso2.setCargaHoraria(18);


        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("Mentoria de JAVA");
        mentoria.setTitulo("TITULO DA MENTORIA JAVA");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição do Bootcamp JavaDev");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devNatus = new Dev();
        devNatus.setNome("natus");
        devNatus.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos Natus" + devNatus.getConteudosInscritos());
        devNatus.progredir();
        System.out.println("Conteudos Inscritos Natus" + devNatus.getConteudosInscritos());
        System.out.println("conteudos Concluidos Natus" + devNatus.getConteudosConcluidos());
        System.out.println("XP Natus: "+ devNatus.calcularTotalXp());


        System.out.println("----------------------------------");
        Dev devLili = new Dev();
        devLili.setNome("Lili");
        devLili.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos inscritos Lili" + devLili.getConteudosInscritos());
        devLili.progredir();
        devLili.progredir();
        devLili.progredir();
        //devLili.progredir();
        System.out.println("Conteudos inscritos Lili" + devLili.getConteudosInscritos());
        System.out.println("conteudos Concluidos Lili" + devLili.getConteudosConcluidos());
        System.out.println("XP Lili: "+ devLili.calcularTotalXp());



    }
}