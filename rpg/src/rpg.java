import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class rpg {
    public static void main(String[] args) throws Exception {
           menuJogo();
    }
    //Menu de opções do jogo.
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
    //Função das instruções do Jogo
public static void mostrarInstrucoes()throws InterruptedException{
 Scanner input = new Scanner(System.in);
 sout("Instruções do jogo: \n" +
         "Heart of the dragon é um jogo que se baseia em dados para que ação aconteça como um rpg de mesa.\n" +
         "Durente os combates os seus acertos e danos irão se basear neles\n" +
         "Existem ataques que não necessitam de uma rolagem de acerto, mas elas só podem ser usadas uma vez, então as use com sabedoria\n");
 sout("Digite qualquer tecla para retornar ao menu.\n");
 String j = input.next();
}
    //Função para começar a Jogar.
public static void jogar()throws InterruptedException{
   Scanner input = new Scanner(System.in);
   int vida_player = 25, danoDec = 0;
   String ataque1 = null, desc1 = null ,ataque2 = null,desc2=null,ataque3=null,desc3=null, erro1=null, erro2=null, escolha;
   do {
     sout("Antes de começarmos, qual arma deseja usar em combate?\n" +
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
         sout("Escolha uma opção valida!\n");
     }
   }while(!escolha.equals("1") && !escolha.equals("2"));
   sout("Em um reino distante, voce,  perde seus pais após um ataque do dragão Astaroth em seu vilarejo. \nCom a possibilidade de um novo dragão ameaçando o vilarejo,  parte em uma jornada solitária para salvar seu povo, quebrar a maldição e encontrar sua mãe desaparecida.\n");
 floresta(danoDec,vida_player,ataque1,ataque2,ataque3,desc1,desc2,desc3,erro1,erro2);
 pantano(danoDec, ataque1, ataque2,ataque3,desc1,desc2,desc3,erro1,erro2);
 caverna(danoDec, ataque1, ataque2,ataque3,desc1,desc2,desc3,erro1,erro2);
}
    //Função dos créditos.
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
    //Função responsável para aparecer os caracteres de texto lentamente.
public static void sout(String texto) throws InterruptedException {
 for (char caractere : texto.toCharArray()) {
   System.out.print(caractere);
   TimeUnit.MILLISECONDS.sleep(20); //Para rodar o jogo sem delay, troque esse valor para 0
 }
}


    //Função responsável pela parte da floresta.
public static void floresta(int danoDec, int vida_player, String ataque1, String ataque2, String ataque3, String desc1, String desc2, String desc3, String erro1, String erro2) throws InterruptedException{
    Scanner input = new Scanner(System.in);
    boolean passou;
   String f;
       sout("Após dias percorrendo o caminho para caverna,  se deparada com seu primeiro desafio: A floresta esmeralda.\n");
       sout("O sol ja estava se pondo, lançando uma luz dourada sobre as árvores majestosas que se erguiam diante dele. \nAo tentar entrar na floresta, sente uma pressão invisível, como se uma barreira mágica o impedisse de continuar. \nEra como bater contra uma parede de ar sólido.\n");
       sout("De repente, uma figura colossal surgiu diante dele. Era Grom, , com pele de rocha e olhos verdes brilhantes como esmeraldas. Sua voz ecoou como um trovão:\n");
       sout("\"Para entrar na Floresta de Esmeralda, deve provar sua força e determinação. Eu sou Grom,  o guardião da floresta. Mostre-me que é digno!\"\n\n");
 if (!desafio1(input)) {
   sout("Você falhou no desafio1 e foi forçado a recuar.\n");
   return;
 }

 if (!desafio2(input)) {
   sout("Você falhou no desafio2 e foi forçado a recuar.\n");
   return;
 }
       sout("Impressionado pela habilidade e coragem, Grom abaixa sua cabeça em respeito. \"Você provou ser digno. Pode passar.\"\n\n");
       sout("A partir daquele momento, passou a se questionar sobre o que mais enfrentaria...\n");
       do {
         sout("O que você vai fazer? \n1 - Continuar pela floresta\n");
         f = input.next();
         if(!f.equals("1")){
           sout("Você fica parado esperando algo acontecer\n");
         }
       }while(!f.equals("1"));
       sout("Ao adentrar sobre a floresta, o cenário foi mudando, o ar estava pesado e úmido, com um cheiro terroso e de decomposição que se entranhava nas narinas. \nO silêncio era quase total, interrompido apenas pelo ocasional barulho das folhas ou pelo som distante de um animal desconhecido. \nUma névoa rasteira envolvia o chão da floresta, uma camada fina e misteriosa que tornava difícil ver onde se pisava. \nA cada passo, tem a sensação de estar sendo observado, olhos invisíveis seguindo seus movimentos.\n");
       sout("Mesmo assim, continua pela trilha... depois de alguns minutos de caminhada, chega ao coração da floresta. \nO coração é um refúgio de mistério e escuridão, onde árvores imponentes e densas barreiras desafiam a luz solar. \nNo centro, uma clareira pequena revela feixes fracos de luz, criando uma atmosfera de encanto sombrio, onde a natureza exala uma aura de mistério e intriga. \nEste é um lugar de beleza selvagem e perigo latente, onde corajosos se aventuram em busca de segredos antigos.\n");
       sout("No centro deste círculo, encontra uma criatura imponente: um gorila de pelagem espessa e dentes afiados, grunhindo em desafio e batendo no peito com suas enormes mãos. \nSeus olhos brilham com uma mistura de fúria e inteligência, indicando sua supremacia na selva.\n");
    do{
        passou = comb3(danoDec, vida_player, ataque1, ataque2, ataque3, desc1, desc2, desc3, erro1, erro2);
    } while(passou); // O uso do while permite com que o jogador possa morrer no combate sem ter que reinicar ele do zero
       sout("Com a vitória, uma onda de energia percorre seu corpo, elevando-o de nível e fortalecendo suas habilidades.\n");
       sout("Finalmente, após superar todos os desafios, percebesse um baú escondido.\n");
       do {
         sout("1 - Abrir o bau\n");
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
  //Função responsável pelo dano do segundo ataque
    public static int ataque_2(int danoDec, int fase) {
        int dano;
        if (danoDec == 1) {
            if (fase == 1) {
                dano = (int) (Math.random() * 12) + 1 + 5;
            } else if (fase == 2) {
                dano = (int) (Math.random() * 12) + 1 + 10;
            } else {
                dano = (int) (Math.random() * 8) +(int) (Math.random() * 8) +(int) (Math.random() * 8);
            }
        } else {
            if (fase == 1) {
                dano = (int) (Math.random() * 8) + 4 + 3 + 2 + 1 + 2;
            } else if (fase == 2) {
                dano = (int) (Math.random() * 8) + 8 + 5 + 4 + 1 + 2;
            } else {
                dano = (int) (Math.random() * 12) + 6 + (int) (Math.random() * 12) + 6;
            }
        }
        return dano;
    }


  //Função reponsável pelo dano do terceiro ataque.
    public static int ataque_3(int danoDec, int fase) {
        int dano;
        if (danoDec == 1) {
            if (fase == 1) {
                dano = (int) (Math.random() * 10) + 1 + 5;
            } else if (fase == 2) {
                dano = (int) (Math.random() * 10) + 1 + 10;
            } else {
                dano = (int) (Math.random() * 10) +(int) (Math.random() * 10) +(int) (Math.random() * 10);
            }
        } else {
            if (fase == 1) {
                dano = (int) (Math.random() * 15) + 1;
            } else if (fase == 2) {
                dano = (int) (Math.random() * 15) + 5;
            } else {
                dano = (int) (Math.random() * 10) + (int) (Math.random() * 10) + (int) (Math.random() * 8) + (int) (Math.random() * 8) + 6;
            }
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
public static int comb4(int danoDec, String ataque1, String ataque2, String ataque3, String desc1, String desc2, String desc3, String erro1, String erro2) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int vida_player = 60;
        int i=0, dano, fase = 2;
        int defesa_player = 16;
        int defesa_sombras = 11;
        int acerto, r = -2, tre = -2;
        int[] vidas = {15,15,15,3}; // Vetor usado para controlar a vida e a quantidade de inimigos exitentes no combate
        //Sombra1 = vidas[0], Sombra2 = vidas[1], Sombra3 = vidas[2], inimigos[3]
        String botao;
        sout("Com um gesto dramático, Mordekai ergue a mão e desaparece em uma nuvem de sombras. O ar ao seu redor se torna mais frio, e a escuridão parece se condensar.\n" +
                "De onde ele estava, surgem três figuras envoltas em trevas: os Guerreiros das Sombras.\n" +
                "As figuras sombrias materializam-se, brandindo espadas negras que parecem absorver a pouca luz que resta.\n" +
                "Seus olhos brilham com uma luz malévola enquanto se preparam para atacar, o ar ao redor vibrando com a energia sombria que emanam.\n" +
                "A única coisa que os diferenciava era a cor de seus olhos: \no primeiro guerreiro tinha olhos brilhando em um vermelho sinistro \no segundo guerreiro ostentava olhos com um brilho verde ameaçador \ne o terceiro guerreiro tinha olhos de um azul gélido e penetrante.\n\n");
        do {
            sout("SEU TURNO!\n" +
                    "Sua vida= " + vida_player + "\n");
            String inimigo = escolhaAtaque(vidas); // retorna um valor entre 1 e 3 decidindo qual inimigo vai ser atacado
            botao = escolhaHabilidade(ataque1, ataque2, ataque3, r, tre, danoDec);
            switch (botao) {
                case "1":
                    acerto = acerto(defesa_sombras, fase);
                    if (acerto == 1) {
                        dano = ataque_1(danoDec, fase);
                        sout(desc1);
                        vidas = vidas(vidas, inimigo, dano); // retorna as vidas e a quantidade de inimigos, caso o player derrote um inimigo na rodada o valor de inimigos diminui
                        sout("tirando " + dano + " de dano\n\n");
                    } else if (acerto == 2) {
                        dano = ataque_1(danoDec, fase) + 2;
                        sout(desc1);
                        vidas = vidas(vidas, inimigo, dano);
                        sout("Acertando um crítico que tira " + dano + " de dano\n\n");
                    }
                    else {
                        sout(erro1);
                    }
                    break;
                case "2":
                    if (danoDec == 1) {
                        sout(desc2);
                        dano = ataque_2(danoDec, fase);
                        vidas = vidas(vidas, inimigo, dano);
                        sout("tirando " + dano + " de dano\n\n");
                    }
                    else if (danoDec == 2) {
                        i=10;
                        acerto = acerto(defesa_sombras, fase);
                        if (acerto==1) {
                            dano = ataque_2(danoDec, fase);
                            sout(desc2);
                            vidas = vidas(vidas, inimigo, dano);
                            sout("tirando " + dano + " de dano\n\n");
                        } else if (acerto==2) {
                            dano = ataque_2(danoDec, fase) + 2;
                            sout(desc2);
                            vidas = vidas(vidas, inimigo, dano);
                            sout("Acertando um crítico que tira " + dano + " de dano\n\n");
                        }
                        else {
                            sout(erro2);
                        }
                    }
                    r++; // pelo player ter uma carga maior de habilidades o valor vai aumentando até chegas a 1 e ele ser proibido de usar a habilidade
                    break;
                case "3":
                    sout(desc3);
                    dano = ataque_3(danoDec, fase);
                    vidas = vidas(vidas, inimigo, dano);
                    sout("Tirando " + dano + " de dano\n\n");
                    tre++;
                    break;
                default:
                    sout("Escolha uma opção valida!");
            }
            if (vidas[1]>0  && vida_player>0) {
                sout("O guerreiro vermelho se prepara para atacar\n");
                vida_player = ataqueSombras(i, vida_player, defesa_player);
            }
            if (vidas[0]>0  && vida_player>0){
                sout("O guerreiro verde se prepara para atacar\n");
                vida_player = ataqueSombras(i, vida_player, defesa_player);
            }
            if (vidas[2]>0  && vida_player>0){
                sout("O guerreiro azul se prepara para atacar\n");
                vida_player = ataqueSombras(i, vida_player, defesa_player);
            }
            i = 0; // retirando a pealidade caso a habilidade "Ataque descuidado" tenha sido usada
        } while (vida_player>0 && vidas[3]>0);
        if (vida_player<=0){
            sout("Com um último suspiro, você tomba no chão, suas feridas fatais cobrando seu preço. Seus olhos se fecham lentamente, e o silêncio da solidão envolve seu último momento.\n");
            do {
                sout("Deseja tentar novamente?" +
                        "\n1- Sim" +
                        "\n2- Não\n");
                botao = input.next();
                if(!botao.equals("1") && !botao.equals("2") && !botao.equals("3")) {
                    sout("Selecione uma opção valida!\n");
                }
            }while (!botao.equals("1") && !botao.equals("2"));
            switch (botao) {
                case "1":
                    break;
                case "2":
                    sout("\nObrigado por jogar");
                    System.exit(0);
            }
        }
        return vida_player;
    }
// função que permite com que o jogador decida qual inimigo quer atacar
    public static String escolhaAtaque(int[] vidas) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        String ataque;
        do {
            sout("Escolha qual inimigo atacar\n" +
                    "1) Guerreiro das Sombras (Vermelho)\n" +
                    "Vida: " + vidas[0] +
                    "\n2) Guerreiro das Sombras (Verde)\n" +
                    "Vida: " + vidas[1] +
                    "\n3) Guerreiro das Sombras (Azul)\n" +
                    "Vida: " + vidas[2] + "\n");
            ataque = input.next();
            if (ataque.equals("1")) {
                if (vidas[0] <= 0) {
                    sout("Este inimigo já está derrotado\n" +
                            "Escolha um inimigo com vida\n\n");
                    ataque = "0";
                }
            } else if (ataque.equals("2")) {
                if (vidas[1] <= 0) {
                    sout("Este inimigo já está derrotado\n" +
                            "Escolha um inimigo com vida\n\n");
                    ataque = "0";
                }
            } else if (ataque.equals("3")) {
                if (vidas[3] <= 0) {
                    sout("Este inimigo já está derrotado\n" +
                            "Escolha um inimigo com vida\n\n");
                    ataque = "0";
                }
            } else {
                sout("Escolha novamente");
            }
        } while (!ataque.equals("1") && !ataque.equals("2") && !ataque.equals("3"));
        return ataque;
    }
public static int golpeTrevas(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        if (dado_inimigo >= defesa_player) {
            sout("O golpe poderoso atinge em cheio, a escuridão da espada amplificando a dor do corte.\n");
            dano = (int) ((Math.random() * 6) + 3) ;
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("O golpe poderoso passa ao lado, a lâmina sombria errando seu alvo por um triz.\n\n");
        }
        return dano;
    }
public static int assaltoFantasmagorico(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        if (dado_inimigo >= defesa_player) {
            sout("Os ataques rápidos e precisos encontram seu alvo, cada golpe cortando com uma precisão fantasmagórica.\n");
            dano = (int) ((Math.random() * 4) + 1) +3;
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("Os golpes rápidos passam ao largo, você consegue evitar a série de ataques fantasmagóricos.\n\n");
        }
        return dano;
    }
public static int espadaArcana(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        if (dado_inimigo >= defesa_player) {
            sout("Mordekai balança sua espada mágica, e a lâmina brilhante corta profundamente, você sente tanto o golpe cortante quanto uma queimadura arcana enquanto a energia mágica percorre sua ferida.\n");
            dano = (int) ((Math.random() * 10) + 1) + 4 + (int) ((Math.random() * 6) + 1);
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("Mordekai balança sua espada mágica, mas você se desvia agilmente e a lâmina brilhante corta o ar ao seu lado sem acertar.\n\n");
        }
        return dano;
    }
public static int dardoSombrio(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        if (dado_inimigo >= defesa_player) {
            sout("Mordekai conjura um dardo de sombras e o lança em sua direção. O dardo atinge seu alvo, causando uma dor gelada que se espalha pelo seu corpo, drenando sua energia vital.\n");
            dano = (int) ((Math.random() * 6) + 1) + (int) ((Math.random() * 6) + 1);
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("Mordekai conjura um dardo de sombras e o lança em sua direção, mas você se abaixa rapidamente, e o dardo passa assobiando acima de sua cabeça.\n\n");
        }
        return dano;
    }
public static int golpeFantasmagorico(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        if (dado_inimigo >= defesa_player) {
            sout("Mordekai ataca com um golpe que parece atravessar a realidade. A lâmina parece cortar não apenas sua carne, mas também sua mente, causando uma dor física e psíquica que faz sua visão tremer.\n");
            dano = (int) ((Math.random() * 4) + 1) + (int) ((Math.random() * 4) + 1) + (int) ((Math.random() * 4) + 1) + 3;
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("Mordekai ataca com um golpe que parece atravessar a realidade, mas você percebe a ilusão a tempo e desvia para o lado, escapando da dor que ele poderia ter causado.\n\n");
        }
        return dano;
    }
public static int explosaoEnergia(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        if (dado_inimigo >= defesa_player) {
            sout("Mordekai ergue a mão e dispara uma explosão de energia arcana. A explosão atinge você em cheio, a força do impacto te empurra para trás enquanto a dor atravessa seu corpo.\n");
            dano = (int) ((Math.random() * 8) + 5) + (int) ((Math.random() * 8) + 1);
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("Mordekai ergue a mão e dispara uma explosão de energia arcana, mas você salta para o lado, e a explosão atinge o chão ao seu lado, levantando poeira.\n\n");
        }
        return dano;
    }
public static int garrasCortantes(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        sout("Astaroth levanta uma de suas garras maciças, afiadas como lâminas, e as lança em sua direção com uma precisão mortal.\n");
        if (dado_inimigo >= defesa_player) {
            sout("As garras afiadas de Astaroth rasgam através de sua armadura, deixando cortes profundos e sangrentos.\n");
            dano = (int) ((Math.random() * 6) + 1) + (int) ((Math.random() * 6) + 1) + 6;
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("Você se esquiva no último momento, as garras de Astaroth cortando o ar onde você estava um instante antes.\n\n");
        }
        return dano;
    }
public static int mordidaDevastadora(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        sout("Astaroth abre suas mandíbulas enormes, mostrando fileiras de dentes afiados como navalhas. Com um movimento rápido, ele avança para morder.\n");
        if (dado_inimigo >= defesa_player) {
            sout("Astaroth morde com suas poderosas mandíbulas, esmagando sua armadura e carne com uma força brutal e queimando com fogo.\n");
            dano = (int) ((Math.random() * 6) + 1) + (int) ((Math.random() * 6) + 1) + (int) ((Math.random() * 10) + 1) + (int) ((Math.random() * 10) + 1) + 6;
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("Você se afasta rapidamente, e as mandíbulas de Astaroth se fecham onde você estava, o fogo lambendo o ar em vão.\n\n");
        }
        return dano;
    }
public static int baterAsas(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        sout("Astaroth bate suas asas poderosas, criando uma onda de choque que se propaga pelo ar, tentando derrubar tudo em seu caminho.\n");
        if (dado_inimigo >= defesa_player) {
            sout("As asas poderosas de Astaroth criam uma onda de choque que o lança ao chão, o impacto sacudindo seus ossos.\n");
            dano = (int) ((Math.random() * 6) + 1) + (int) ((Math.random() * 6) + 1) + (int) ((Math.random() * 6) + 1);
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("Você se mantém firme enquanto a onda de choque passa, conseguindo evitar ser derrubado pelo impacto.\n\n");
        }
        return dano;
    }
public static int chuvaLava(int dado_inimigo, int defesa_player) throws InterruptedException {
        int dano = 0;
        sout("Astaroth ergue-se nas patas traseiras e invoca uma tempestade de lava, que começa a cair do céu em gotas incandescentes.\n");
        if (dado_inimigo >= defesa_player) {
            sout("A lava conjurada por Astaroth chove sobre você, queimando sua pele e armadura com calor intenso.\n");
            dano = (int) ((Math.random() * 6) + 1) + (int) ((Math.random() * 6) + 1)+ (int) ((Math.random() * 6) + 1)+ (int) ((Math.random() * 6) + 1)+ (int) ((Math.random() * 6) + 1)+ (int) ((Math.random() * 6) + 1);
            sout("Tirando " + dano + " de dano\n\n");
        } else {
            sout("Você salta para longe, escapando das gotas de lava que caem ao seu redor, sentindo o calor mas evitando as queimaduras.\n\n");
        }
        return dano;
    }




    
//Desafios Floresta.
  public static boolean desafio1(Scanner input) throws InterruptedException {

    sout("\n                GROM: Para provar que eis digno, terá que resolver os seguintes desafios de lógica: :             ");
    sout("\nEm um programa que o usuário insere dois números e então exiba a soma desses números. Qual seria a resposta correta: ");
    sout("\n**************************************************************************************");
    sout("\n                      Alternativas                             ");
    sout("\n1- Para imprimir a soma o usuário precisará colocar o comando 'System.out.println(variavel da soma );'.");
    sout("\n2- Para imprimir a soma o usuário precisará colocar o comando 'System.out.println(variavel do primeiro número);");
    sout("\n**************************************************************************************");
    sout("\nDigite a alternativa desejada. Caso queira que repita o enunciado do desafio, digite (3)");

    int escolha = 0;

    while (true) {
      escolha = input.nextInt();
      switch (escolha) {
        case 1:
          sout("\nParabéns, você acertou e pode seguir para o próximo desafio!! ");
          return true;
        case 2:
          sout("\nDe onde vens com tanta ignorância?! Resposta Incorreta");
          sout("\nRetornando...");
          sout("\nEm um programa (JAVA) que o usuário insere dois números e então exiba a soma desses números. Qual seria a resposta correta: ");
          sout("\n**************************************************************************************");
          sout("\n                      Alternativas                             ");
          sout("\n1- Para imprimir a soma o usuário precisará colocar o comando 'System.out.println(variavel da soma );'.");
          sout("\n2- Para imprimir a soma o usuário precisará colocar o comando 'System.out.println(variavel do primeiro número);");
          sout("\n**************************************************************************************");
          sout("\nDigite a alternativa desejada. Caso queira que repita o enunciado do desafio, digite (3)");
          break;
        case 3:
          sout("\nEm um programa (JAVA) que o usuário insere dois números e então exiba a soma desses números. Qual seria a resposta correta: ");
          sout("\n**************************************************************************************");
          sout("\n                      Alternativas                             ");
          sout("\n1- Para imprimir a soma o usuário precisará colocar o comando 'System.out.println(variavel da soma );'.");
          sout("\n2- Para imprimir a soma o usuário precisará colocar o comando 'System.out.println(variavel do primeiro número);");
          sout("\n**************************************************************************************");
          sout("\nDigite a alternativa desejada. Caso queira que repita o enunciado do desafio, digite (3)");
          break;
        default:
          sout("\nResposta Inválida, tente novamente");
          break;
      }
    }
  }

  //Função respponsável pelo segundo desafio(Segundo desafio da Floresta).
public static boolean desafio2(Scanner input) throws InterruptedException {
 sout("\n                               GROM:  Criatura insolente, passou pelo primeiro, mas não passará pelo próximo.         ");
 sout("\nEm um programa (JAVA) que o usuário insere um número e volta dizendo se ele é par ou impar. Qual seria a resposta correta: ");
 sout("\n******************************");
 sout("\n                      Alternativas                             ");
 sout("\n1- Para que ele descubra se o número é par ele precisa criar um if e dizer que o número inserido pelo usuário dividido por dois é igual a 0.");
 sout("\n2- Para que ele descubra se o número é par ele precisa criar um if e dizer que o número inserido pelo usuário dividido por dois é igual a 1.");
 sout("\n******************************");
 sout("\nDigite a alternativa desejada. Caso queira que repita o enunciado do desafio, digite (3)");

 String escolha = "0";

 while (true) {
   escolha = input.next();
   switch (escolha) {
     case "1":
       sout("\nParabéns, você acertou e pode seguir para o próximo desafio!! ");
       return true;
     case "2":
       sout("\nDe onde vens com tanta ignorância?! Resposta Incorreta");
       sout("\nRetornando para o primeiro desafio...");
       return false;
     case "3":
       sout("\n                                Segundo Desafio         ");
       sout("\nEm um programa (JAVA) que o usuário insere um número e volta dizendo se ele é par ou impar. Qual seria a resposta correta: ");
       sout("\n******************************");
       sout("\n                      Alternativas                             ");
       sout("\n1- Para que ele descubra se o número é par ele precisa criar um if e dizer que o número inserido pelo usuário dividido por dois é igual a 0.");
       sout("\n2- Para que ele descubra se o número é par ele precisa criar um if e dizer que o número inserido pelo usuário dividido por dois é igual a 1.");
       sout("\n******************************");
       sout("\nDigite a alternativa desejada. Caso queira que repita o enunciado do desafio, digite (3)");
       break;
     default:
       sout("\nResposta Inválida, tente novamente");
       break;
   }
 }
}

   //Função respponsável pelo terceiro desafio(Primeiro desafio do pântano).
  public static boolean desafio3(Scanner input) throws InterruptedException {
    sout("\n                                Terceiro Desafio         ");
    sout("\nEm um programa (JAVA) que o usuário insere um número inteiro positivo e calcule o fatorial desse número. Qual seria a resposta correta: ");
    sout("\n**************************************************************************************");
    sout("\n                      Alternativas                             ");
    sout("\n1- Para que ele descubra o fatorial do número inserido pelo usuário ele precisará criar um laço de repetição para multiplicar todos os números antes do inserido! ");
    sout("\n2- Para que ele descubra o fatorial do número inserido pelo usuário ele precisará criar um laço de repetição para somar todos os números antes do inserido! ");
    sout("\n**************************************************************************************");
    sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");

    String escolha = "0";

    while (true) {
      escolha = input.next();
      switch (escolha) {
        case "1":
          sout("\nParabéns, você acertou e pode seguir para o próximo desafio!! ");
          return true;
        case "2":
          sout("\nResposta errada, retornando...");
          sout("Retornando...");
          sout("\n                                Terceiro Desafio         ");
          sout("\nEm um programa (JAVA) que o usuário insere um número inteiro positivo e calcule o fatorial desse número. Qual seria a resposta correta: ");
          sout("\n**************************************************************************************");
          sout("\n                      Alternativas                             ");
          sout("\n1- Para que ele descubra o fatorial do número inserido pelo usuário ele precisará criar um laço de repetição para multiplicar todos os números antes do inserido! ");
          sout("\n2- Para que ele descubra o fatorial do número inserido pelo usuário ele precisará criar um laço de repetição para somar todos os números antes do inserido! ");
          sout("\n**************************************************************************************");
          sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");
          return false;
        case "3":
          sout("\n                                Terceiro Desafio         ");
          sout("\nEm um programa (JAVA) que o usuário insere um número inteiro positivo e calcule o fatorial desse número. Qual seria a resposta correta: ");
          sout("\n**************************************************************************************");
          sout("\n                      Alternativas                             ");
          sout("\n1- Para que ele descubra o fatorial do número inserido pelo usuário ele precisará criar um laço de repetição para multiplicar todos os números antes do inserido! ");
          sout("\n2- Para que ele descubra o fatorial do número inserido pelo usuário ele precisará criar um laço de repetição para somar todos os números antes do inserido! ");
          sout("\n**************************************************************************************");
          sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");
          break;
        default:
          sout("\nResposta Inválida, tente novamente");
          break;
      }
    }
  }
  //Desafios Pantâno
  public static boolean desafio4(Scanner input) throws InterruptedException {

    sout("\n                                           Quarto Desafio:");
    sout("\nEm um programa (JAVA) que o usuário insere um número inteiro e verifica se é positivo, negativo ou zero. Qual seria a resposta correta:");
    sout("\n**************************************************************************************");
    sout("\n                                            Alternativas:");
    sout("\n1- Para verificar se um número é positivo, negativo ou zero, o usuário deve usar uma estrutura if-else para comparar o número com 0.");
    sout("\n2- Para verificar se um número é positivo, negativo ou zero, o usuário deve usar uma estrutura de repetição.");
    sout("\n**************************************************************************************");
    sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");

    int escolha = 0;

    while (true) {
      escolha = input.nextInt();
      switch (escolha) {
        case 1:
          sout("\nResposta errada, retornando...");
          desafio3(input);
          return false;
        case 2:
          sout("\nParabéns, você acertou e completou todos os desafios!!");
          return true;
        case 3:
          sout("\nQuarto Desafio:");
          sout("\nEm um programa (JAVA) que o usuário insere um número inteiro e verifica se é positivo, negativo ou zero. Qual seria a resposta correta:");
          sout("\n**************************************************************************************");
          sout("\nAlternativas:");
          sout("\n1- Para verificar se um número é positivo, negativo ou zero, o usuário deve usar uma estrutura if-else para comparar o número com 0.");
          sout("\n2- Para verificar se um número é positivo, negativo ou zero, o usuário deve usar uma estrutura de repetição.");
          sout("\n**************************************************************************************");
          sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");
          break;
        default:
          sout("\nResposta Inválida, tente novamente");
          break;
      }
    }

  }
  public static boolean desafio5(Scanner input) throws InterruptedException {

    sout("\n                                           Quinto Desafio:");
    sout("\nEm um programa (JAVA) para que serve as  seguintes variáveis: Boolean, int e String ");
    sout("\n**************************************************************************************");
    sout("\n                                            Alternativas:");
    sout("\n1- Armazenar sequências de caracteres, Armazenar valores com ponto flutuante(1.01, 1.02, 1.03)..., Aramazenar valores('true', 'false')");
    sout("\n2- Aramazenar valores('true', 'false'), Armazenar valores inteiros('0,1,2,3...), Armazenar sequências de caracteres.");
    sout("\n**************************************************************************************");
    sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");

    int escolha = 0;

    while (true) {
      escolha = input.nextInt();
      switch (escolha) {
        case 1:
          sout("\nResposta errada, retornando...");
          desafio3(input);
          return false;
        case 2:
          sout("\nParabéns, você acertou e completou todos os desafios!!");
          return true;
        case 3:
          sout("\n                                           Quinto Desafio:");
          sout("\nEm um programa (JAVA) para que serve as  seguintes variáveis: Boolean, int e String ");
          sout("\n**************************************************************************************");
          sout("\n                                            Alternativas:");
          sout("\n1- Armazenar sequências de caracteres, Armazenar valores com ponto flutuante(1.01, 1.02, 1.03)..., Aramazenar valores('true', 'false')");
          sout("\n2- Aramazenar valores('true', 'false'), Armazenar valores inteiros('0,1,2,3...), Armazenar sequências de caracteres.");
          sout("\n**************************************************************************************");
          sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");

          break;
        default:
          sout("\nResposta Inválida, tente novamente");
          break;
      }
    }
  }

  public static void iniciarDesafios() throws InterruptedException {
    Scanner input = new Scanner(System.in);
    boolean concluido = false;

    while (!concluido) {
      if (desafio3(input)) {
        if (desafio4(input)) {
          if (desafio5(input)) {
            concluido = true;
          }
        }

      }
    }
  }
//Função respponsável pelo sexto desafio(Primeiro desafio da caevrna).
    public static boolean desafio6(Scanner input) throws InterruptedException {
        sout("\n                               Sexto Desafio         ");
        sout("\nEm um programa (JAVA) quando o usúario tem diversas funções em seu código, qual seria o nome dado a função principal onde ele terá que adicionar todas as outras funções?");
        sout("\n**************************************************************************************");
        sout("\n                      Alternativas                             ");
        sout("\n1- O nome da função é 'main' ");
        sout("\n2- O nome da função é 'String ' ");
        sout("\n**************************************************************************************");
        sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");

        String escolha = "0";

        while (true) {
            escolha = input.next();
            switch (escolha) {
                case "1":
                    sout("\nParabéns, você acertou e pode seguir para o próximo desafio!! ");
                    return true;
                case "2":
                    sout("\nDe onde vens com tanta ignorância?! Resposta Incorreta");
                    sout("\nRetornando...");
                    sout("\nEm um programa (JAVA) quando o usúario tem diversas funções em seu código, qual seria o nome dado a função principal onde ele terá que adicionar todas as outras funções?");
                    sout("\n**************************************************************************************");
                    sout("\n                      Alternativas                             ");
                    sout("\n1- O nome da função é 'main' ");
                    sout("\n2- O nome da função é 'String ' ");
                    sout("\n**************************************************************************************");
                    sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");
                case "3":
                    sout("\n                               Sexto Desafio         ");
                    sout("\nEm um programa (JAVA) quando o usúario tem diversas funções em seu código, qual seria o nome dado a função principal onde ele terá que adicionar todas as outras funções?");
                    sout("\n**************************************************************************************");
                    sout("\n                      Alternativas                             ");
                    sout("\n1- O nome da função é 'main' ");
                    sout("\n2- O nome da função é 'String ' ");
                    sout("\n**************************************************************************************");
                    sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");
                    break;
                default:
                    sout("\nResposta Inválida, tente novamente");
                    break;
            }
        }
    }
    //Função respponsável pelo sétimo desafio(segundo desafio da caverna).
    public static boolean desafio7(Scanner input) throws InterruptedException {
        sout("\n                               Sétimo Desafio         ");
        sout("\nEm um programa (JAVA) Levando em consideração VETOR, seria correto afirmar qual alternativa abaixo estaria correta?");
        sout("\n**************************************************************************************");
        sout("\n                      Alternativas                             ");
        sout("\n1- int[] ");
        sout("\n2- int{} ");
        sout("\n**************************************************************************************");
        sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");

        String escolha = "0";

        while (true) {
            escolha = input.next();
            switch (escolha) {
                case "1":
                    sout("\nParabéns, você acertou e pode seguir para o próximo desafio!! ");
                    return true;
                case "2":
                    sout("\nEm um programa (JAVA) Levando em consideração VETOR, seria correto afirmar qual alternativa abaixo estaria correta?");
                    sout("\n**************************************************************************************");
                    sout("\n                      Alternativas                             ");
                    sout("\n1- int[] ");
                    sout("\n2- int{} ");
                    sout("\n**************************************************************************************");
                    sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");

                case "3":
                    sout("\nEm um programa (JAVA) Levando em consideração VETOR, seria correto afirmar qual alternativa abaixo estaria correta?");
                    sout("\n**************************************************************************************");
                    sout("\n                      Alternativas                             ");
                    sout("\n1- int[] ");
                    sout("\n2- int{} ");
                    sout("\n**************************************************************************************");
                    sout("\nSe você deseja ir para o caminho da direita digite (1). Caso contrário digite (2). Caso queira que repita o enunciado do desafio, digite (3)");
                    break;
                default:
                    sout("\nResposta Inválida, tente novamente");
                    break;
            }
        }
    }}


