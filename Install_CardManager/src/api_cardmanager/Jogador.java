/**
 * ----------    Install CardManager API     ----------
 * Universidade Federal do Pampa; 
 * Graduação: Engenharia de Software; 
 * Disciplina: Práticas de Desenvolvimento de Software; 
 * Professor: Wagner de Melo Reck;
 * Semestre: 5° - 2012/01
 * @author Juliano Rodovalho
 * @version 0.2
 * 
 * Copyright (c) 2012 Juliano Rodovalho
 * 
 *  Este arquivo faz parte da biblioteca Card_Manager
 * 
 *  Card_Manager é um software livre; você pode redistribui-lo e/ou 
 *  modifica-lo dentro dos termos da Licença Pública Geral GNU como 
 *  publicada pela Fundação do Software Livre (FSF); na versão 2 da 
 *  Licença, ou (na sua opnião) qualquer versão.
 * 
 *  Este programa é distribuido na esperança que possa ser  util, 
 *  mas SEM NENHUMA GARANTIA; sem uma garantia implicita de ADEQUAÇÂO a qualquer
 *  MERCADO ou APLICAÇÃO EM PARTICULAR. Veja a
 *  Licença Pública Geral GNU para maiores detalhes.
 * 
 *  Você deve ter recebido uma cópia da Licença Pública Geral GNU
 *  junto com este programa, se não, escreva para a Fundação do Software
 *  Livre(FSF) Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * 
 */
package api_cardmanager;

import java.util.Scanner;
import lib.*;

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
        Baralho_Cartas baralho;
        baralho = new Baralho_Cartas();

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
                    + " Card_Manager Copyright (C) 2012 Juliano Rodovalho \n"
                    + " This program comes with ABSOLUTELY NO WARRANTY. \n"
                    + " This is free software, and you are welcome to redistribute it \n"
                    + " under certain conditions; see COPYING.txt for details. \n"
                    + "------------------------------------------------------------------------- \n"
                    + "Bem Vindo ao Card_Manager! \n "
                    + "Aqui voce podera Criar e Manipular um baralho simples de cartas! \n "
                    + "Informe a baixo suas preferencias:");

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

                System.out.println("--------------------------------\nMenu - Opcoes: \n 1 - Mostra numero de Cartas no Baralho. || 2 - Embaralhar. \n "
                        + "3 - Cortar Baralho(2 partes iguais). || 4 - Retirar Carta do Inicio. \n "
                        + "5 - Retirar Carta do Final. || 6 - Mover Carta do Fim para o inicio. \n"
                        + " 7 - Mover Carta do inicio para o Fim. \n"
                        + " 8 - Mostar Baralho. || 9 - Sair do Jogo. \n--------------------------------");
                System.out.print("Escolha uma opcao do Menu: ");
                opcaoMenu = entradaTeclado.nextInt();

                /**
                 * Switch para a seleção correta da opção escolhida.
                 */
                switch (opcaoMenu) {

                    case 1:
                        System.out.println("\n -- Numero de Cartas no Baralho: " + baralho.getNumCartas());
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
                        System.out.println("\n -- Carta do inicio: " + baralho.retirarCartaInicio());
                        break;

                    case 5:
                        System.out.println("\n -- Carta do Final: " + baralho.retirarCartaFim());
                        break;

                    case 6:
                        baralho.moveCartaFimIni();
                        System.out.println("\n -- Carta movida do Fim para o inicio! ");
                        break;

                    case 7:
                        baralho.moveCartaIniFim();
                        System.out.println("\n -- Carta movida do Inicio para o Fim! ");
                        break;

                    case 8:
                        baralho.getBaralho();
                        break;

                    case 9:
                        System.out.println("\n ===== FIM DO JOGO! =====");
                        continua = false;
                        break;

                    default:
                        System.out.println(">>> ERRO: Esta nao eh uma Opção Valida! <<< \n --> Tente novamente, seguindo as opcoes do MENU!");

                }
            }
        } catch (Exception error) {

            System.out.println(" Error: \n" + error);

        }
    }
}
