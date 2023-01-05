package Diario1;

public class Principal {
    public static void main(String[] args){    
    Diario1 diario = new Diario1("GAC111");
    Alunos1 a;
    a = new Alunos1("Jose",85,12);
    diario.adicionarAluno(a);
    a = new Alunos1("Pedro",45,10);
    diario.adicionarAluno(a);
    a = new Alunos1("Regina",75,15);
    diario.adicionarAluno(a);
    diario.gerarDiarioTurma();
    }
   }
   