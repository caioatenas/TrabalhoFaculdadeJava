/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author Atenas
 */
public class Main {

    private static int i;
    public static void main (String[] args){
        int opc, qntNotas;
        float nota = 0;
        String nome, cpf;
        Faculdade novoFaculdade = new Faculdade();
        Aluno novoAluno = new Aluno();
        Scanner teclado;
        
        Pessoa pessoa = new Pessoa();
        Pessoa professor = new Professor();
        
        teclado = Scanner(System.in);
        
        do{
            System.out.println("\n------------------------");
            System.out.println("    MENU");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Pessoa Fisica");
            System.out.println("2 - Pessoa Juridica");
            System.out.println("3 - Diretoria");
            System.out.println("4 - Secretaria");
            System.out.println("5 - Conta");
            System.out.println("0 - Sair");
            
            opc= teclado.nextInt();
        teclado.nextLine();
        
        switch(opc){
            case 1:

                System.out.println("\nNome: ");
                nome = teclado.nextLine();
                System.out.println("\nCPF: ");
                cpf = teclado.nextLine();
                
                novoAluno = new Aluno (nome, cpf);
                
                System.out.println("\nQuantidade notas?");
                qntNotas = teclado.nextInt();
                
                for (int = 0; i <qntNotas; i++){
                    System.out.println("\nNota" + (i + 1));
                    nota = teclado.nextFloat();
                    novoAluno.insereNotas(nota);
            }
                novaFaculdade.insereAluno(novoAluno);
                break;
            case 2:
                novaFaculdade.listarAlunos();
                break;
            case 3:
                novaFaculdade.listarSituacoes();
                break;
            case 0:
                System.out.println("\nSaindo.....");
                break;
            default:
                System.out.println("\nOpção invalida!");
         }
                
        }while (opc !=0);
        }

    private static Scanner Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Professor extends Pessoa {

        public Professor() {
        }
    }
}
        
    