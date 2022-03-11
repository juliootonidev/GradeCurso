import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Curso curso = new Curso();
        Professor professor = new Professor();
        Disciplina disciplina = new Disciplina();
        
        int op = 50;

        System.out.println("BEM-VINDO\nAPERTE PARA CADASTRAR:");
        while (op != 0) {
            System.out.println("<1>CURSO\n<2>PROFESSOR\n<3>DISCIPLINA");
            op = leitor.nextInt();
            if (op == 1) {
                System.out.println("CODIGO:");
                curso.setCodigo(leitor.nextInt());
                System.out.println("NOME:");
                curso.setNome(leitor.next());
                System.out.println("VAGAS:");
                curso.setVagasAnuais(leitor.nextInt());
                System.out.println("CONCEITO:");
                curso.setConceito(leitor.next());
                System.out.println("TURNO");
                curso.setTurno(leitor.next());
              
            }else if(op == 2){
                System.out.println("CODIGO:");
                professor.setCodigo(leitor.nextInt());
                System.out.println("NOME:");
                professor.setNome(leitor.next());
                System.out.println("LOGRADOURO:");
                professor.setLogradouro(leitor.next());
                System.out.println("NUMERO:");
                professor.setNumero(leitor.nextInt());
                System.out.println("COMPLEMENTO:");
                professor.setComplemento(leitor.next());
                System.out.println("BAIRRO:");
                professor.setBairro(leitor.next());
                System.out.println("CEP:");
                professor.setCep(leitor.next());
                System.out.println("CIDADE:");
                professor.setCidade(leitor.next());
                System.out.println("ESTADO:");
                professor.setEstado(leitor.next());
                System.out.println("CPF:");
                professor.setCpf(leitor.nextInt());
                System.out.println("RG:");
                professor.setRg(leitor.nextInt());
                System.out.println("EMAIL:");
                professor.setEmail(leitor.next());
                System.out.println("SALARIO:");
                professor.setSalario(leitor.nextFloat());
              

            }else if(op == 3){
               
                System.out.println("CODIGO:");
                disciplina.setCodigo(leitor.nextInt());
                System.out.println("NOME:");
                disciplina.setNome(leitor.next());
                System.out.println("CARGA HORARIA:");
                disciplina.setCargaHoraria(leitor.nextInt());


            }

        }
        leitor.close();

     System.out.println(curso.toString());
     System.out.println(disciplina.toString());
     System.out.println(professor.toString());

    }

}
