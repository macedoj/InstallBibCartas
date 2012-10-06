/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package installbibcartas;

import java.util.Scanner;

/**
 *
 * @author Juliano R. Macedo
 * @version 0.1
 * @since 01/10/2012
 */
public class Jogador {

  
    /**
     * Variáveis que definem as caracteristicas do baralho a ser criado.
     */
    public static int numCartas = 52;
    public static String[] naipes = new String[4];

    /**
     * Main do jogo, responsável por chamar os métodos e definições relevantes
     * como, número de cartas, naipes e chamadas de métodos.
     *
     * @param String[] args
     */
    public static void main(String[] args) {

        /**
         * Criando os 4 naipes do baralho padrão.
         */
        naipes[0] = "Ouros";
        naipes[1] = "Paus";
        naipes[2] = "Copas";
        naipes[3] = "Espadas";

        /**
         * Objeto do tipo Scanner, para a manipulação da entrada do usuário.
         */
        Scanner entradaTeclado = new Scanner(System.in);

        /**
         * Cria uma instância(Objeto) da classe Baralho_Cartas.java, a qual,
         * jutamente com a classe Carta.java, são as bibliotecas.
         */
        Baralho_Cartas baralho = new Baralho_Cartas();

        /**
         * Variaveis locais.
         */
        int opcaoMenu;
        boolean continua = true;

        /**
         * Try contra erros de String
         */
        try {

            System.out.println(""
                    + " Card_Manager Copyright (C) 2012 Juliano Rodovalho & Lucas Capanelli \n"
                    + " This program comes with ABSOLUTELY NO WARRANTY. \n"
                    + " This is free software, and you are welcome to redistribute it \n"
                    + " under certain conditions; see COPYING.txt for details. \n"
                    + "------------------------------------------------------------------------- \n"
                    + "Bem Vindo ao Card_Manager! \n "
                    + "Aqui você podera Criar e Manipular um baralho simples de cartas! \n "
                    + "Informe a baixo suas preferências:");

            /**
             * Chamada do construtor da biblioteca Baralho_Cartas, enviando as
             * informações básicas para a criação do baralho.
             *
             */
            baralho.Baralho_Cartas(numCartas, naipes);


            /**
             * Exibe o Menu e suas opções para cada ação do usuário.
             *
             */
            while (continua) {

                System.out.println("--------------------------------\nMenu - Opções: \n 1 - Mostra número de Cartas n Baralho. || 2 - Embaralhar. \n "
                        + "3 - Cortar Baralho(2 partes iguais). || 4 - Retirar Carta do Início. \n "
                        + "5 - Retirar Carta do Final. || 6 - Mover Carta do Fim para o início. \n"
                        + " 7 - Mover Carta do início para o Fim. \n"
                        + " 8 - Mostar Baralho. || 9 - Sair do Jogo. \n--------------------------------");
                System.out.print("Escolha uma opção do Menu: ");
                opcaoMenu = entradaTeclado.nextInt();

                /**
                 * Switch para a seleção correta da opção escolhida.
                 */
                switch (opcaoMenu) {

                    case 1:
                        System.out.println("\n -- Número de Cartas no Baralho: " + baralho.getNumCartas());
                        break;

                    case 2:
                        baralho.embaralha();
                        System.out.println("\n -- Embaralhado! ");
                        break;

                    case 3:
                        baralho.cortarBaralho();
                        System.out.println("\n -- Corte realizado! ");
                        break;

                    case 4:
                        System.out.println("\n -- Carta do início: " + baralho.retirarCartaInicio());
                        break;

                    case 5:
                        System.out.println("\n -- Carta do Final: " + baralho.retirarCartaFim());
                        break;

                    case 6:
                        baralho.moveCartaFimIni();
                        System.out.println("\n -- Carta movida do Fim para o início! ");
                        break;

                    case 7:
                        baralho.moveCartaIniFim();
                        System.out.println("\n -- Carta movida do Início para o Fim! ");
                        break;

                    case 8:
                        baralho.getBaralho();
                        break;

                    case 9:
                        System.out.println("\n ===== FIM DO JOGO! =====");
                        continua = false;
                        break;

                    default:
                        System.out.println(">>> ERRO: Esta não é uma Opção Válida! <<< \n --> Tente novamente, seguindo as opções do MENU!");

                }
            }
        } catch (Exception error) {

            System.out.println(" Erro: \n" + error);
            
        }
    }
}
