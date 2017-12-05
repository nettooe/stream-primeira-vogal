# stream-primeira-vogal

Dada uma stream, esta aplicação retorna o primeiro caractere Vogal, após uma consoante, onde a mesma é antecessora a uma vogal e que não se repita no resto da stream. O termino da leitura da stream é garantido através do método hasNext(), ou seja, retorna falso para o termino da leitura da stream.

## Começando
Essas instruções irão demostrar como obter uma cópia do projeto e colocá-la em execução em uma máquina Linux para fins de desenvolvimento e teste.

### Pré requisitos
Você precisará somente ter o [Java 8 JDK](http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html) instalado  para o desenvolvimento.

### Instalando e executando
Para instalar e executar o projeto localmente, basta [clonar o projeto](https://help.github.com/articles/cloning-a-repository/) e executar. Para isto, abra o terminal no seu Linux e execute os comandos:
```
$ git clone git@github.com:nettooe/stream-primeira-vogal.git
$ cd stream-primeira-vogal
$ javac *.java
$ jar cfm Main.jar manifest.txt *.class
$ java -jar Main.jar aAbBABacafe
```

Ao final desta execução, ser apresentado o seguinte resultado:
```
input= "aAbBABacafe" == e
```
Para experimentar com outros streams de caracteres, utilize:
```
$ java -jar Main.jar <MinhaSequênciaDeCaracteres>
```

Divirta-se!
