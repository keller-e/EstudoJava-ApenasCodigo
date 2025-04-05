package atividade1.pkg1auditorio;

import java.util.Scanner;

public class Atividade11Auditorio {

    public static void main(String[] args) {
        int alfa=150, beta=350, cadeirasExtras=70;
        Scanner auditorio = new Scanner(System.in);
        
        System.out.println("Bem vindo ao Auditório\nDigite a quantidade de convidados: ");
        int convidados= auditorio.nextInt();
        
        if(convidados<0 || convidados>350){
            System.out.println("Número de convidados invalido");
        } else{
                    if(convidados<=alfa + cadeirasExtras){
                System.out.println("Utilize o auditório Alfa");
                
                if(convidados>alfa){
                    int CadeiraNecessaria= convidados - alfa;
                    System.out.println("Será necessário " + CadeiraNecessaria + " extras");   
                }
                else{
                        System.out.println("Não será necessário cadeiras adicionais");
                }
              }else if(convidados<=beta){
                    System.out.println("Utilize o auditorio Beta"); 
                }
            }
        }
    }