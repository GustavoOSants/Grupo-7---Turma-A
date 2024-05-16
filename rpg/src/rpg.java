import java.util.Scanner;

public class rpg {
    
    public static void main(String[] args) throws Exception {
           menuJogo();
    }
    public static void menuJogo(){
    Scanner input = new Scanner(System.in);
    int opcao;

    do{ 
      System.out.println("Menu");
      System.out.println("1 - Instruções");
      System.out.println("2 - Jogar");
      System.out.println("3 - Créditos");
      System.out.println("4 - Sair");
      System.out.println("Escolha uma opção: ");
      opcao = input.nextInt();

      switch (opcao){
        case 1:
          mostrarInstrucoes();
          break;
        case 2:
          jogar();
          break;
        case 3:
          mostrarCreditos();
          break;
        case 4:
          System.out.println("Saindo do jogo...");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
            
      }
         }while (opcao != 4);
  }
  public static void mostrarInstrucoes(){
    System.out.println("Instruções do jogo:");
  }
  public static void jogar(){
    System.out.println("Iniciando o jogo...");
  }
  public static void mostrarCreditos(){
    System.out.println("Desenvolvido por: (nome dos integrantes)");
  }
        
    }


