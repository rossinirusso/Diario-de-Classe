package Diario1;

import java.util.ArrayList;
import java.util.Comparator;

public class Diario1{

    private String codigo;
    private ArrayList<Alunos1> a;


    public Diario1(String c){
     codigo = c;
     a = new ArrayList<>();
     

   }

   public void adicionarAluno(Alunos1 x){
    a.add(x);
  }

  public void gerarDiarioTurma(){
  String situacao = null;
  a.sort(getComparator());
  
  System.out.printf("Disciplina: %s \n",codigo);
  System.out.println("Nome | Nota | Faltas | Situação");
  for(Alunos1 x: a){
    if(x.getNota()>59 && x.getFaltas()<19){
    situacao = "Aprovado";
                                      }
    else{
    situacao = "Reprovado";
        }
    System.out.printf("%s | %d | %d | %s \n",x.getNome(),x.getNota(),x.getFaltas(),situacao);
              }
     
  }

  public Comparator getComparator(){
    Comparator<Alunos1> comparador = new Comparator<>(){
     @Override
     public int compare(Alunos1 a1, Alunos1 a2){
       return (a1.getNota() - a2.getNota())*(-1);
     }
   
    };
      return comparador;
  }
  
}