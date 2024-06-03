import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class rpg {
    public static void main(String[] args) throws Exception {
           menuJogo();
    }
    public static void menuJogo() throws InterruptedException {
    Scanner input = new Scanner(System.in);
    String opcao;
    do{ 
      sout("Menu\n" +
              "1 - Instruções\n" +
              "2 - Jogar\n" +
              "3 - Créditos\n" +
              "4 - Sair\n" +
              "Escolha uma opção: \n");
      opcao = input.next();
      switch (opcao){
        case "1":
          mostrarInstrucoes();
          break;
        case "2":
          jogar();
          break;
        case "3":
          mostrarCreditos();
          break;
        case "4":
          sout("Saindo do jogo...");
          break;
        default:
          sout("Opção inválida. Tente novamente.\n");
      }
         }while (!opcao.equals("4"));
  }
  public static void mostrarInstrucoes()throws InterruptedException{
    Scanner input = new Scanner(System.in);
    sout("Instruções do jogo: \n" +
            "Heart of the dragon é um jogo que se baseira em dados para que ação aconteça como um rpg de mesa.\n" +
            "Durente os combates os seus acertos e danos irão se basear neles\n" +
            "Existem ataques que não necessitam de uma rolagem de acerto, mas elas só podem ser usadas uma vez, então as use com sabedoria\n");
    sout("Digite qualquer tecla para retornar ao menu.\n");
    String j = input.next();
  }
  public static void jogar()throws InterruptedException{
      Scanner input = new Scanner(System.in);
      int vida_player = 25, danoDec = 0;
      String ataque1 = null, desc1 = null ,ataque2 = null,desc2=null,ataque3=null,desc3=null, erro1=null, erro2=null, escolha;
      do {
        sout("Antes de começarmos, Você precisa decidir arma você ira usar em combate\n" +
                "1 - Espada\n" +
                "2 - Machado Grande\n" +
                "A sua escolha afetará diretamente o seu estilo de jogo\n");
        escolha = input.next();
        switch (escolha) {
          case "1":
            danoDec = 1;
            ataque1 = "Golpear com a espada";
            desc1 = "Você avança com sua espada, cortando o ar com um golpe poderoso que se choca contra o inimigo!\n";
            erro1="Você tenta atingir seu inimigo, mas ele se esquiva no último momento, evitando o golpe.\n\n";
            ataque2 = "Rajada de veneno";
            desc2 = "Você lança um frasco de veneno, que se estilhaça sobre o inimigo, cobrindo-o com uma nuvem tóxica que causa danos ao longo do tempo.\n";
            ataque3 = "Rajada Mistica";
            desc3 = "Você invoca uma rajada de energia arcano que atinge o inimigo, envolvendo-o em chamas mágicas e causando danos devastadores.\n";
            break;
          case "2":
            danoDec = 2;
            ataque1 = "Atacar com o machado";
            desc1 = "Você avança furiosamente com seu machado, desferindo um golpe poderoso que corta o ar e se choca contra o inimigo com força devastadora.\n";
            erro1 = "Seu golpe não atinge o alvo, seu machado passa rente ao inimigo sem causar dano.\n\n";
            ataque2 = "Ataque Descuidado";
            desc2 = "Você se lança de forma imprudente em direção ao inimigo, ignorando sua própria defesa em troca de ataques mais poderosos. Seu golpe desajeitado atinge o alvo com força esmagadora\n";
            erro2 = "Sua investida desajeitada não alcança o alvo, deixando-o exposto aos contra-ataques inimigos.\n\n";
            ataque3 = "Espirito animal";
            desc3 = "Você invoca o espírito de seu animal guia. Um lobo. que surge ao seu lado em uma manifestação etérea de sua fúria. \n" +
                    "O espírito avança em direção ao inimigo com garras ou presas afiadas, desferindo golpes poderosos\n";
            break;
          default:
            sout("Escolha uma opção valida!");
        }
      }while(!escolha.equals("1") && !escolha.equals("2"));
      sout("Em um reino distante, um jovem herói perde seus pais após um ataque do dragão Astaroth. \nCom a possibilidade de um novo dragão ameaçando seu vilarejo, você parte em uma jornada solitária para salvar seu povo, quebrar a maldição e encontrar sua mãe desaparecida.");
    floresta(danoDec,vida_player,ataque1,ataque2,ataque3,desc1,desc2,desc3,erro1,erro2);
    pantano();
  }
  public static void mostrarCreditos() throws InterruptedException{
      Scanner input = new Scanner(System.in);
    sout("Desenvolvido por:\n" +
            "João Pedro Zabarella Muniz\n" +
            "Julia Souza Soares\n" +
            "Maria Beatriz Monteiro Braga\n" +
            "Gustavo Oliveira dos Santos\n");
    sout("Digite qualquer tecla para retornar ao menu.\n");
    String j = input.next();
  }

  public static void sout(String texto) throws InterruptedException {
    for (char caractere : texto.toCharArray()) {
      System.out.print(caractere);
      TimeUnit.MILLISECONDS.sleep(37);
    }
  }

    public static void floresta(int danoDec, int vida_player, String ataque1, String ataque2, String ataque3, String desc1, String desc2, String desc3, String erro1, String erro2) throws InterruptedException{
      Scanner input = new Scanner(System.in);
      String f;
          sout("Após dias percorrendo o caminho para caverna,  se deparada com seu primeiro desafio: A floresta esmeralda.\n");
          sout("O sol estava se pondo, lançando uma luz dourada sobre as árvores majestosas que se erguiam diante dele. \nAo tentar entrar, sentiu uma pressão invisível, como se uma barreira mágica o impedisse de continuar. \nEra como bater contra uma parede de ar sólido.\n");
          sout("De repente, uma figura colossal surgiu diante dele. Era Grom, , com pele de rocha e olhos verdes brilhantes como esmeraldas. Sua voz ecoou como um trovão:\n");
          sout("\"Para entrar na Floresta de Esmeralda, deve provar sua força e determinação. Eu sou Grom,  o guardião da floresta. Mostre-me que é digno!\"\n\n");
        // Desafio 1 e 2 de logica, zoio da commit e dps apaga aqui.
          sout("Impressionado pela habilidade e coragem, Grom abaixou sua cabeça em respeito. \"Você provou ser digno. Pode passar.\"\n\n");
          sout("A partir daquele momento, passou a se questionar sobre o que mais enfrentaria...\n");
          do {
            sout("O que você vai fazer? \n1 - Continuar pela floresta\n");
            f = input.next();
            if(!f.equals("1")){
              sout("Você fica parado esperando algo acontecer\n");
            }
          }while(!f.equals("1"));
          sout("Ao adentrar sobre a floresta, o cenário foi mudando, o ar estava pesado e úmido, com um cheiro terroso e de decomposição que se entranhava nas narinas. \nO silêncio era quase total, interrompido apenas pelo ocasional farfalhar das folhas ou pelo som distante de um animal desconhecido. \nUma névoa rasteira envolvia o chão da floresta, uma camada fina e misteriosa que tornava difícil ver onde se pisava. \nA cada passo, tinha a sensação de estar sendo observado, olhos invisíveis seguindo seus movimentos.\n");
          sout("Prosseguindo pela trilha, depois de alguns minutos de caminhada, chega ao coração da floresta. \nO coração é um refúgio de mistério e escuridão, onde árvores imponentes e densas barreiras desafiam a luz solar. \nNo centro, uma clareira pequena revela feixes fracos de luz, criando uma atmosfera de encanto sombrio, onde a natureza exala uma aura de mistério e intriga. \nEste é um lugar de beleza selvagem e perigo latente, onde corajosos se aventuram em busca de segredos antigos.\n");
          sout("No centro deste círculo, encontra uma criatura imponente: um gorila de pelagem espessa e dentes afiados, grunhindo em desafio e batendo no peito com suas enormes mãos. \nSeus olhos brilham com uma mistura de fúria e inteligência, indicando sua supremacia na selva.\n");
          comb3(danoDec, vida_player, ataque1, ataque2, ataque3, desc1, desc2, desc3, erro1, erro2);
          sout("Com a vitória, uma onda de energia percorre seu corpo, elevando-o de nível e fortalecendo suas habilidades.");
          sout("Finalmente, após superar todos os desafios, percebesse um baú escondido.");
          do {
            sout("1 - Abrir o bau");
            f = input.next();
            if (!f.equals("1")) {
              sout("Você fica parado esperando algo acontecer\n");
            }
          }while(!f.equals("1"));
          sout("Você abre-o com cautela, revelando seu precioso conteúdo: um fragmento de uma espada antiga, cujo brilho é tão intenso que parece desafiar a escuridão ao seu redor.\n");
          sout("Este fragmento de espada não é apenas uma recompensa material, mas também um símbolo do seu poder e da sua coragem.\n");
          sout("Aquele fragmento trouxe memorias de seu pai, um respeitado guerreiro, ensinava-lhe desde cedo a arte da espada e do escudo. \nVocês treinavam juntos nas clareiras perto do vilarejo, onde, além de técnicas de combate, o pai transmitia valores como coragem, determinação e honra.\n");
          sout("Com ele em mãos, você se prepara para continuar sua jornada, sabendo que cada desafio enfrentado o tornará mais forte e mais determinado em sua busca pelo triunfo final.\n");
          sout("Pressione qualquer tecla para continuar\n");
          f = input.next();
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
  public static int ataque_2(int danoDec){
    int dano;
    if (danoDec==1){
      dano = (int) (Math.random() * 12) + 1;
    } else{
      dano = (int) (Math.random() * 8) + 1 + 6;
    }
    return dano;
  }

  public static int ataque_3(int danoDec) {
    int dano;
    if (danoDec == 1) {
      dano = (int) (Math.random() * 10) + 1;
    } else {
      dano = (int) (Math.random() * 15) + 1;
    }
    return dano;
  }
  public static int punho (int defesa_player, int dado_inimigo) throws InterruptedException {
    int dano = 0;
    if (dado_inimigo >= defesa_player) {
      dano = (int) (Math.random() * 6) + 1;
      sout("O gorila avança com um rugido ensurdecedor, lançando seu punho com força avassaladora em sua direção.\n" +
              "O soco conecta-se com um impacto tremendo, lançando-o para trás!\n");
      sout("Tirando " + dano + " de dano\n\n");
    } else if (defesa_player > dado_inimigo) {
      sout("O gorila avança com ferocidade, seu punho erguido como um martelo prestes a cair.\n" +
              "Porém, você consegue se mover habilmente para o lado no último momento, evitando o impacto por uma fração de segundo!\n\n");
    }
    return dano;
  }

  public static int cabeca (int defesa_player, int dado_inimigo) throws InterruptedException {
    int dano = 0;
    if (dado_inimigo >= defesa_player) {
      dano = (int) (Math.random() * 12) + 1;
      sout("Então, ele avança com um rugido ensurdecedor, sua cabeça se lançando em sua direção com uma força tremenda.\n");
      sout("Tirando " + dano + " de dano\n\n");
    } else if (defesa_player > dado_inimigo) {
      sout("O gorila avança com sua cabeça baixa, mas você consegue recuar a tempo, escapando do caminho do ataque.\n" +
              "Sua cabeça passa zumbindo pelo ar, falhando em seu intento de acertá-lo.\n\n");
    }
    return dano;
  }
  public static int palmas (int defesa_player, int dado_inimigo) throws InterruptedException {
    int dano = 0;
    if (dado_inimigo >= defesa_player) {
      dano = (int) (Math.random() * 8) + 1;
      sout("Em um piscar de olhos, ele desfere um tapa brutal, o impacto ecoando pelo ar enquanto você sente o arremesso de força, ameaçando desequilibrá-lo.\n" +
              "Tirando " + dano + " de dano\n\n");
    } else if (defesa_player > dado_inimigo) {
      sout("gorila se ergue, suas mãos se movendo como enormes garras em sua direção.\n" +
              "Você consegue se esquivar habilmente, desviando-se do tapa com agilidade enquanto ele passa ao seu lado!\n\n");
    }
    return dano;
  }


  public static void pantano() throws InterruptedException {
      sout("Você superou seu primeiro obstáculo, conquistando o primeiro pedaço da espada, e agora enfrentará: o pântano.\n");
      sout("Após alguns dias de jornada, você finalmente avista a entrada do pântano. A vegetação densa e a neblina  tornam o ambiente sombrio e desolador. \nAo adentrar, afundando na lama úmida que suga seus pés a cada passo. O ar é espesso, impregnado com o cheiro de decomposição e o eco de ruídos estranhos que ecoam entre as árvores retorcidas, e se questiona se algum ser vivo poderia habitar aquele lugar. \nAs lendas contam que todos aqueles que tentaram atravessar o pântano enlouqueceram ou desapareceram.\n");
      //Desafio 3,4,5 aqui Zoio, da commit e dps apaga aqui
    sout("À medida que avança, nota-se  uma luz fraca brilhando entre a densa vegetação à sua frente. Você se aproxima com cuidado, quando emerge em uma clareira, se depara com o mago corrompido:\n");
    sout("Mordekai ergue a cabeça lentamente, seus olhos ardendo com uma intensidade que parece perfurar a sua alma, seu manto escuro se mistura com as sombras do pântano, e ele parece uma extensão sinistra do ambiente ao seu redor. \nUm sorriso estranho se forma em seus lábios enquanto ele anda em sua direção com uma voz que ecoa como o sussurro de sombras.\n");
    sout("\"Ah, mais um intruso ousado se aventurando em meus domínios\", diz Mordekai, sua voz carregada com um tom de desdém. \"Você não teme o perigo que espreita neste lugar sombrio?\"\n");
    sout("Seus dedos cerram-se em torno do fragmento corrompido da espada, e a luz sinistra que emana dela parece pulsar em resposta à sua presença.\n");
    sout("\"Sou Mordekai, o mago deste pantano amaldiçoado\", continua ele, sua voz ecoando entre as árvores como um eco distorcido. \"\nE quem ousa desafiar minha autoridade deve estar disposto a pagar o preço com sangue e alma.\"\n");
    sout("Seus olhos brilham com uma malícia sombria enquanto ele te avalia, como se buscasse penetrar em sua mente e descobrir suas fraquezas mais profundas.\n");
    sout("\"E você, guerreiro, o que o traz a este lugar condenado? Busca riquezas? Glória? Ou talvez esteja apenas buscando a morte nas garras da escuridão?\"");
    sout("O combate precisa ainda não está finalizado!\n");
    sout("Com a morte de Mordekai, sua forma física se desintegra lentamente, e sua alma, finalmente libertada da corrupção, se dissipa em um brilho etéreo. \nVocê foi protegido da loucura pelo primeiro fragmento da espada que conquistou na floresta, e toma posse do fragmento corrompido de Mordekai. Sem o poder protetor desse primeiro fragmento, não teria conseguido vencer o mago. \n");
    sout("Ao juntar os fragmentos, a espada se reconstruiu magicamente em suas mãos, emanando uma luz intensa. \nNesse momento, a espada revelou uma visão do passado: a batalha final entre seu pai e o dragão Astaroth. Viu seu pai lutando bravamente, usando a espada com destreza e coragem. \nNo momento decisivo, seu pai cravou a espada no coração do dragão, sacrificando-se para garantir a vitória.\n");
    sout("A visão mostrou que o sacrifício de seu pai não foi em vão. Astaroth foi derrotado.\n");
    sout("Com a espada em mãos, você está preparado para enfrentar qualquer ameaça e proteger seu vilarejo.\n");

  }

    }


