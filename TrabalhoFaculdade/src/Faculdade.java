
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Atenas
 */
public class Faculdade {
    ArrayList<Aluno> listaDeAlunos;
    
    public Faculdade(){
        this.listaDeAlunos = new ArrayList<>();
        
    }
    void insereAluno(Aluno novoAluno){
        novoAluno.calcularNotas();
        listaDeAlunos.add(novoAluno);
        
    }
    void listarAlunos(){
        System.out.println("\nLista de alunos");
        for(Aluno alunoNaLista:listaDeAlunos){
            alunoNaLista.listar();
            
        }

}
    void listarSituacoes(){
        System.out.println("\nSituacoes");
        
        for(Aluno alunoNaLista:listaDeAlunos){
            alunoNaLista.mostraSituacao();
        }
    }
    
}
