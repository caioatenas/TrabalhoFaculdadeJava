
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Atenas
 */
public class Aluno {
    float total;
    String nome, cpf, situacao = "reprovado";
    ArrayList<Float> notasAluno = new ArrayList<>();

   
   public Aluno(){
       
   }
	
    public Aluno (String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
        
    }

    
    void insereNotas(float nota){
        notasAluno.add(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    void lista(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        
        for (int i = 0; i < notasAluno.size(); i++){
            System.out.println("Nota " + ( i + 1)+": " + this.notasAluno.get(i));
            
        }
    }
    void mostraSituacao(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nTotal: " + this.total);
        System.out.println("\nituação: " + this.situacao);
    }
    
    void calcularNotas(){
        for(float notaDaLista:notasAluno){
            total = total + notaDaLista;
        }
        if (total >= 70){
            this.situacao = "aprovado";
        }else{
            this.situacao = "reprovado";
            
        }
    }

    public ArrayList<Float> getNotasAluno() {
        return notasAluno;
    }

    public void setNotasAluno(ArrayList<Float> notasAluno) {
        this.notasAluno = notasAluno;
    }
    
    
}
