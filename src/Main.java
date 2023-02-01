import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("Mentoria de JAVA");
        mentoria.setTitulo("TITULO DA MENTORIA JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);


    }
}