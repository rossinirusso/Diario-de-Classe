package Diario1;

public class Alunos1{
    private String nome;
    private int nota;
    private int faltas;

   public Alunos1(String nome, int nota, int faltas){
   this.nome = nome;
   this.nota = nota;
   this.faltas = faltas;
  }

 public String getNome(){
     return nome;
  }

 public int getNota(){
    return nota;
}

 public int getFaltas(){
     return faltas;
   
}
}