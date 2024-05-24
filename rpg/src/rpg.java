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

  public static void comb3(int danoDec, int vida_player, String ataque1, String ataque2, String ataque3, String desc1, String desc2, String desc3, String erro1, String erro2) throws InterruptedException{
    int i = 0, dado_inimigo, dano, decisao;
    String botao;
    int defesa_player = 17;
    int defesa_inimigo = 12;
    int acerto;
    int vida_gorila = 50;
    Random random = new Random();
    int r=0;
    int tre = 0;
    do {
      sout("SEU TURNO!\n" +
              "Sua vida= " + vida_player +
              "\nVida do boss= " + vida_gorila + "\n");
      botao = escolhaHabilidade(ataque1, ataque2, ataque3, r, tre, danoDec);
      switch (botao) {
        case "1":
          acerto = acerto(defesa_inimigo);
          if (acerto == 1) {
            dano = ataque_1(danoDec);
            vida_gorila -= dano;
            sout(desc1);
            sout("tirando " + dano + " de dano\n\n");
          } else if (acerto == 2) {
            dano = ataque_1(danoDec) + 2;
            vida_gorila -= dano;
            sout(desc1);
            sout("Acertando um crítico que tira " + dano + " de dano\n\n");
          } else {
            sout(erro1);
          }
          break;
        case "2":
          if (danoDec == 1) {
            sout(desc2);
            dano = ataque_2(danoDec);
            vida_gorila -= dano;
            sout("tirando " + dano + " de dano \n\n");
          } else if (danoDec == 2) {
            i = 10;
            acerto = acerto(defesa_inimigo);
            if (acerto == 1) {
              dano = ataque_2(danoDec);
              vida_gorila -= dano;
              sout(desc2);
              sout("tirando " + dano + " de dano\n\n");
            } else if (acerto == 2) {
              dano = ataque_2(danoDec) + 2;
              vida_gorila -= dano;
              sout(desc2);
              sout("Acertando um crítico que tira " + dano + " de dano\n\n");
            } else {
              sout(erro2);
            }
          }
          r = 1;
          break;
        case "3":
          sout(desc3);
          dano = ataque_3(danoDec);
          vida_gorila -= dano;
          sout("Tirando " + dano + " de dano\n\n");
          tre = 1;
          break;
        default:
          sout("Escolha uma opção valida!");
      }
      if (vida_gorila > 0) {
        sout("O Gorila se prepara para atacar\n");
        decisao = (int) (Math.random() * 3) + 1;
        dado_inimigo = random.nextInt(20) + 12;
        if (i == 10) {
          dado_inimigo += 2;
          i = 0;
        }
        switch (decisao) {
          case 1:
            //palmas
            vida_player -= palmas(defesa_player,dado_inimigo);
            break;
          case 2:
            // punho
            vida_player -= punho(defesa_player, dado_inimigo);
            break;
          case 3:
            // cabeçada
            vida_player -= cabeca(defesa_player,dado_inimigo);
            break;
        }
        if (vida_player<=0){
          sout("Com um último suspiro, você tomba no chão, suas feridas fatais cobrando seu preço. Seus olhos se fecham lentamente, e o silêncio da solidão envolve seu último momento.");
          System.exit(0);
        }
      } else {
        sout("O imponente gorila solta um rugido final, seu corpo colossal tombando pesadamente ao chão. \n" +
                "Seus olhos, uma vez cheios de fúria e selvageria, agora perdem seu brilho, refletindo apenas o vazio da morte. \n" +
                "O silêncio preenche a clareira da floresta, enquanto você observa o gigante caído.");

      }
    }
    while (!(vida_player <= 0) && !(vida_gorila <= 0)) ;
  }

  public static String escolhaHabilidade(String ataque1, String ataque2, String ataque3, int r, int tre, int danoDec) throws InterruptedException {
    String botao;
    Scanner input = new Scanner(System.in);
    do {
      sout("Escolha qual ataque você irá usar\n");
      sout("1 - " + ataque1 +
              "\n2 - " + ataque2 +
              "\n3 - " + ataque3 + "\n");
      botao = input.next();
      if(!botao.equals("1") && !botao.equals("2") && !botao.equals("3")){
        sout("Selecione uma opção valida!\n");
      } else if (botao.equals("2") && r==1 && danoDec==1){
        sout("Você só pode usar essa habilidade uma vez por comabte!\n");
        botao = "0";
      } else if (botao.equals("3") && tre==1){
        sout("Você só pode usar essa habilidade uma vez por comabte!\n");
        botao = "0";
      }
    } while(!botao.equals("1") && !botao.equals("2") && !botao.equals("3"));
    return botao;
  }
  public static int acerto(int defesa_inimigo) throws InterruptedException {
    Scanner input = new Scanner(System.in);
    int acerto;
    sout("Pressione qualquer tecla para rodar o dado\n");
    String l = input.next();
    int dado = (int) (Math.random() * 20) + 6;
    sout("Você tirou: " + dado + "\n");
    if (dado == 25){
      acerto = 2;
    } else if (dado>=defesa_inimigo){
      acerto = 1;
    } else{
      acerto = 0;
    }
    return acerto;
  }
  public static int ataque_1(int danoDec){
    int dano;
    if (danoDec==1){
      dano = (int) (Math.random() * 12) + 3 +3;
    } else{
      dano = (int) (Math.random() * 8) + 3 + 4;
    }
    return dano;
  }

    }


