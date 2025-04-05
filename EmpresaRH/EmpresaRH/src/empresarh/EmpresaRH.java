package empresarh;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaRH {
     
    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);
        Scanner dadosFuncionario = new Scanner(System.in);
        
        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Digite a opção correspondente ao tipo de Funcionario");
            System.out.println("1) Assalariado\n2) Horista\n3) Aplicar aumento");
            System.out.println("Opção: ");
            int escolha = opcao.nextInt();
            
             if(escolha==3) {
                System.out.println("...AJUSTANDO PARA AUMENTO...\n");
                    break;   
            }

            System.out.println("Nome do funcionário: ");
            String nome = dadosFuncionario.nextLine();
            dadosFuncionario.nextLine();
            
            
            System.out.println("CPF: ");
            String cpf = dadosFuncionario.nextLine();
            
            System.out.println("Endereço: " );
            String endereco = dadosFuncionario.nextLine();
            
            System.out.println("Telefone: " );
            String  telefone = dadosFuncionario.nextLine();
            
            System.out.println("Setor: " );
            String setor = dadosFuncionario.nextLine();
            
            if (escolha == 1){
                System.out.println("Informe o seu salário mensal\nExemplo: 1500,50\n");
                System.out.println("Valor: ");
                double salarioMensal = dadosFuncionario.nextDouble();
                
                funcionarios.add(new FuncionarioAssalariado (nome,cpf,endereco,telefone,setor,salarioMensal));
                System.out.println("Funcionario cadastrado com Sucesso!\n");
            }  
                else if (escolha==2){
                System.out.println("Informe suas horas trabalhas: ");
                int horas = dadosFuncionario.nextInt();
                
                System.out.println("\nInforme agora o valor diário: ");
                double valorHoras = dadosFuncionario.nextDouble();               
                
                System.out.println("Funcionario cadastrado com Sucesso!\n");
                funcionarios.add(new FuncionarioHorista (nome,cpf,endereco,telefone,setor,horas,valorHoras));
            }
             System.out.println("");   
         }
        
        //LISTAR OS FUNCIONARIOS ANTES DO AUMENTO
          for (Funcionarios funcionario: funcionarios){
            funcionario.dadosFuncionarios();
            System.out.println("Pagamento: R$ " + funcionario.calcularPagamento());
            System.out.println();
                }
        
          
          //PREEENCHIMENTO DE PORCENTAGEM DE AUMENTO
            Scanner aumentoFuncionarios = new Scanner(System.in);
        System.out.print("Digite o percentual de aumento para todos os funcionários: ");
        double aumentoPercentual = aumentoFuncionarios.nextDouble();
        
            for (Funcionarios funcionario : funcionarios) {
            funcionario.aplicarAumento(aumentoPercentual);
            }


        /* VAI mostrar os dados e o pagamento após o aumento 
            (acontecerá após a confimrarção da opção "3" 
            e se encerrará listando os funcionarios após seu aumento)*/
  
        System.out.println("\n---- Salários após o aumento ----");
        for (Funcionarios funcionario : funcionarios) {
            funcionario.dadosFuncionarios();
            System.out.println("Pagamento: R$ " + funcionario.calcularPagamento());
            System.out.println();
             }
          }
        }
