========== Instalador_Card_Manager  ==========

------------------------
--- Card_Manager_API ---
------------------------

Card_Manager é uma biblioteca para manipulações básicas
sobre um baralho de cartas comum.
O seu deck é composto por 52 cartas.

Operações básicas são:
 - Ver baralho, consultar quantidade, embaralhar, 
 - Criar monte de descarte, mover cartas do início ao fim,
 - do fim ao início e cortar deck ao meio.

-----------------------------
--- Requisitos de Sistema ---
-----------------------------

Java 1.5 ou versão superior => [http://www.java.com/pt_BR/download/]
IzPack 4.3.5 ou versão superior => [http://izpack.org/downloads/]
  Certifique-se que o diretório 'bin' do IzPack está no 'path' 
  de execução de seu sistema, por exemplo: 

	;C:\Program Files\IzPack\bin
 
 Reinicie seu sistema operacional apos a inclusão do caminho no 'path'.

Memória:
  Não há um mínimo estipulado.
Disco:
  Não há um mínimo estipulado.
Sistema Operacional:
  Multplataformas, 
Internet:
  Não é necessário uma conexão com a Internet.
  
--------------------------------
--- Composição da Biblioteca ---
--------------------------------

  A biblioteca é composta dos seguintes arquivos .java:
  - Baralho_Cartas.java
  - Carta.java

  O arquivo 'Jogador.java' é uma classe-java que faz uso das funcionalidades da biblioteca.

-------------------------------
--- Instalando a Biblioteca ---
-------------------------------
 
1) Abra uma janela DOS-cmd(Windows) ou Terminal(Unix),

2) Navegue até o diretório raiz do projeto e digite:
 
	compile install.xml -b . -o install.jar -k standard
	
3) Aguarde alguns segundos, apos a geração do arquivo 'install.jar', 
de um clique duplo sobre ele e execute a instalação seguindo os passos da GUI.

========== Instalador_Card_Manager  ==========