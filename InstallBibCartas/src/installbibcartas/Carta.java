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

public class Carta {

    private int numCarta;
    private String naipeCarta;

    /**
     * Construtor da classe Carta
     *
     * @param int numeroCarta
     * @param String naipes
     */
    public Carta(int numeroCarta, String naipes) {

        this.numCarta = numeroCarta;
        this.naipeCarta = naipes;

    }

    /**
     * Responsável por buscar o valor da variável numCarta.
     *
     * @return int numCarta
     */
    public int getNumCarta() {

        return numCarta;
    }

    /**
     * Responsável por setar o valor da variável numeCarta, 
     * a partir da informação recebida por parâmetro(numeroCarta).
     *
     * @param int numeroCarta
     */
    public void setNumCarta(int numeroCarta) {

        this.numCarta = numeroCarta;
    }

    /**
     *Responsável por buscar o valor da variável naipeCarta.
     * 
     * @return String naipeCarta
     */
    public String getNaipeCarta() {

        return naipeCarta;
    }

    /**
     * Responsável por setar o valor da variável naipeCarta, 
     * a partir da informação recebida por parâmetro(naipes).
     * 
     * @param String naipes
     */
    public void setNaipeCarta(String naipes) {

        this.naipeCarta = naipes;
    }
}