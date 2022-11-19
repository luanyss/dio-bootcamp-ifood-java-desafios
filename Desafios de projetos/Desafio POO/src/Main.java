import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        int i = 1;
        String respostaString;
        int respostaInt;

        Curso curso1 = new Curso();
        Mentoria mentoria1 = new Mentoria();
        Scanner scan = new Scanner(System.in);
        Bootcamp bootcamp1 = new Bootcamp();
        Dev dev1 = new Dev();

        System.out.println(" Bem vindo a Plataforma de Bootcamp! ");
        System.out.println(" ");
        System.out.println(" ");

        //AdicionandoBootcamp

        System.out.println("Nome para o Bootcamp: ");
        bootcamp1.setNomeBootcamp(scan.next());
        System.out.println("Descrição do Bootcamp: ");
        bootcamp1.setDescricaoBootcamp(scan.next());

        System.out.println(bootcamp1.getNomeBootcamp() + " cadastrado com Sucesso!");

        System.out.println("Adicione os cursos do Bootcamp");


        //CadastroCurso

        //    do {
        System.out.println("Digite o nome do curso: ");
        respostaString = scan.next();
        if (respostaString.equals("0")) {
            //   break;
        } else curso1.setNomeConteudo(respostaString);

        System.out.println("Descrição do curso: ");
        respostaString = scan.next();
        if (respostaString.equals("0")) {
            //   break;
        } else curso1.setDescricaoConteudo((respostaString));

        System.out.println("Carga horaria do curso: ");
        respostaInt = scan.nextInt();
        if (respostaInt == 0) {
            //  break;
        } else curso1.setCargaHoraria(respostaInt);

        System.out.println("- ");
        System.out.println(" ");

        bootcamp1.getConteudos().add(curso1);
        System.out.println("Cadastrado: " + curso1.toString());
        System.out.println(" ");


        //CadastroMentoria

        System.out.println("Digite o nome do Mentoria: ");
        respostaString = scan.next();
        if (respostaString.equals("0")) {
            //  break;
        } else mentoria1.setNomeConteudo(respostaString);

        System.out.println("Digite a descrição da Mentoria: ");
        respostaString = scan.next();
        if (respostaString.equals("0")) {
            //  break;
        } else mentoria1.setDescricaoConteudo(respostaString);

        mentoria1.setData(LocalDate.now());

        System.out.println(" ");
        System.out.println(" ");

        bootcamp1.getConteudos().add(mentoria1);
        System.out.println("Cadastrado: " + mentoria1.toString());
        System.out.println(" ");

        //       } while (i > 0);

        System.out.println(bootcamp1.toString());

        System.out.println(" ");

        //adicionarDevs;


        System.out.println("Nome do Dev ao se cadastrar nesse BootCamp? ");
        dev1.setNome(scan.next());

        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("  ");
        System.out.println("Conteudos Inscritos: " + dev1.getConteudosIncritos());
        System.out.println("Conteudos Concluídos: " + dev1.getConteudosConcluidos());


        do {
            System.out.println(" Progredir?  ");
            if (scan.next().equalsIgnoreCase("Sim"))
                dev1.progredir();
            else {
                System.out.println("Você não progrediu!");
                break;
            }
            System.out.println("Conteudos Inscritos: " + dev1.getConteudosIncritos());
            System.out.println("Conteudos Concluídos: " + dev1.getConteudosConcluidos());

        } while (i > 0);

    }
}
