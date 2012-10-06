/**
 * ----------     CardManager API     ----------
 * Universidade Federal do Pampa; 
 * Graduação: Engenharia de Software; 
 * Disciplina: Práticas de Desenvolvimento de Software; 
 * Professor: Wagner de Melo Reck;
 * Semestre: 5° - 2012/01
 * @author Juliano Rodovalho & Lucas Capanelli
 * @version 0.2
 * 
 * Copyright (c) 2012 Juliano Rodovalho & Lucas Capanelli
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

package installbibcartas;

import java.util.ArrayList;
import java.util.Collections;

public class Baralho_Cartas {

    private ArrayList<Carta> cartas;
    private ArrayList<Carta> ladoA;
    private ArrayList<Carta> ladoB;
    private ArrayList<Carta> monte;
    private String cartaFim;
    private String cartaInicio;

    /**
     * Construtor da classe Baralho_Cartas, responsável por criar as listas que
     * armazenaram as informações do baralho, e por realizar a chamada do método
     * que criará o baralho(newBaralho), respectivamente, baseado nas
     * informações recebidas por parêmetro.
     *
     * @param int numCartas
     * @param String[] naipes
     */
    public void Baralho_Cartas(int numCartas, String[] naipes) {

        this.cartas = new ArrayList<Carta>();
        this.ladoA = new ArrayList<Carta>();
        this.ladoB = new ArrayList<Carta>();
        this.newBaralho(numCartas, naipes);

    }

    /**
     * Método responsável por criar o baralho, baseado nas informações recebidas
     * por parêmetro.
     *
     * @param numCartas
     * @param naipes
     */
    public void newBaralho(int numCartas, String[] naipes) {


        for (int i = 0; i < naipes.length; i++) {
            for (int j = 0; j < (numCartas / (naipes.length)); j++) {
                cartas.add(new Carta(j, naipes[i]));
            }
        }
    }

    /**
     * Método que retorna o número de cartas existentes no baralho.
     *
     * @return número de cartas no baralho
     */
    int getNumCartas() {

        return this.cartas.size();

    }

    /**
     * Método responsável por embaralhar o montante de cartas.
     */
    public void embaralha() {

        Collections.shuffle(cartas);

    }

    /**
     * Método responsável por cortar o baralho em duas partes iguais.
     */
    public void cortarBaralho() {
        int tamLista = getNumCartas();
        int i = 0;
        int meioLista = (tamLista / 2);


        for (int j = 0; j < tamLista; j++) {
            if (i <= meioLista) {
                // cartas.add(new Carta(j, naipes[i]));
                ladoA.add(cartas.get(j));
                i++;

            } else if (i > meioLista) {
                ladoB.add(cartas.get(j));
                i++;

            }
        }

    }

    /**
     * Método responsável por retirar uma carta do início do baralho.
     */
    public String retirarCartaInicio() {

        int j = 0;

        for (Carta carta : cartas) {
            for (; j < 1; j++) {

                cartaInicio = ((carta.getNumCarta() + 1) + " - " + carta.getNaipeCarta()).toString();

            }

        }

        return cartaInicio;

    }

    /**
     * Método responsável por retirar uma carta do final do baralho.
     */
    public String retirarCartaFim() {

        int numCartas = getNumCartas();
        int j;

        for (Carta carta : cartas) {
            for (j = numCartas; j >= numCartas; j--) {


                this.cartaFim = ((carta.getNumCarta() + 1) + " - " + carta.getNaipeCarta()).toString();

            }

        }

        return this.cartaFim;

    }

    /*
     * Método responsável por mover uma carta do fim para o início do baralho.
     */
    public void moveCartaFimIni() {

        cartas.add(0, getUltimaCarta());

    }

    /*
     * Método responsável por mover uma carta do início para o fim do baralho.
     */
    public void moveCartaIniFim() {

        int numCartas = getNumCartas();
        cartas.add(numCartas - 1, getPrimeiraCarta());

    }

    /*
     * Método que pega um objeto do último elemento do Array
     */
    public Carta getUltimaCarta() {

        int numCartas = getNumCartas();
        return cartas.remove(numCartas - 1);

    }

    /*
     * Método que pega um objeto do primeiro elemento do Array
     */
    public Carta getPrimeiraCarta() {

        return cartas.remove(0);

    }

    /**
     *
     * Método responsável por criar o monte de descarte para o jogo.
     *
     */
    public void criaMonteDescarte(int nCartas) {

        this.monte = new ArrayList<Carta>(nCartas);

    }

    /*
     * Neste método é possivel visualizar as cartas sem move-las.
     */
    public void getMonteDesc() {

        for (Carta carta : monte) {
            System.out.println((carta.getNumCarta() + 1) + " " + carta.getNaipeCarta());

        }

    }

    /**
     * Imprime todo o array de cartas do baralho, mostrando seus números e
     * naipes.
     *
     */
    public void getBaralho() {

        for (Carta carta : cartas) {
            System.out.println((carta.getNumCarta() + 1) + " " + carta.getNaipeCarta());
        }

//        for (Carta lado : ladoA) {
//            System.out.println("Lado A: " + (lado.getNumCarta() + 1) + " - " + lado.getNaipeCarta());
//        }
//
//        for (Carta lado : ladoB) {
//            System.out.println("Lado B: " + (lado.getNumCarta() + 1) + " - " + lado.getNaipeCarta());
//        }


    }
}