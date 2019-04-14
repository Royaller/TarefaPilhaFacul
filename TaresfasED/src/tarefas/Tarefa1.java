package tarefas;
import java.util.Scanner;

public class Tarefa1{

private float lista[];
private int topo, capacidade;


public Tarefa1() {

	topo = -1;
	capacidade = 0;
}

public void criarpilha() {
	
	Scanner leia = new Scanner(System.in);

	System.out.print("Digite a quantidade de elementos da pilha:") ;
	int numerodesejado = leia.nextInt();	
	
	lista = new float[numerodesejado];	
	capacidade = numerodesejado;
	
}

//Adiciona um elemento ao topo da pilha
public void push() {
	
	if(cheia()) {
		System.out.print("\n  Lista cheia, impossivel realizar opera��o");
		return;
	}
	
	Scanner leia = new Scanner(System.in);
	System.out.print("Digite o numero que deseja inserir na pilha:") ;	
	float novoelemento = leia.nextFloat();
	
	topo++;
	
	lista[topo] = novoelemento;
    System.out.println("\n Elemento adicionado ao topo da pilha");
	
}

//Remove o numero do topo da pilha
public void pop() {
	
	if(vazio()) {
		System.out.println("\n Lista vazia, impossivel realizar opera��o");
		return;
	}
	
topo--;
System.out.println("\n Elemento removido do topo");

}

//Opera��o de subtrair 2 do topo
public void DEC2() {
	
	if(vazio()) {
		System.out.print("\n Lista vazia, impossivel subtrair 2 do topo");
		return;
	}
	
lista[topo] = lista[topo] - 2;	
System.out.println("\n Valor do elemento ap�s opera��o: "+lista[topo]);


}

//Opera��o de adicionar 3 do topo
public void ADD3() {
	
	if(vazio()) {
		System.out.print("\n Lista vazia , impossivel somar 3 ao topo");
		return;
	}
	
lista[topo] = lista[topo] + 3;	

System.out.println("\n Valor do elemento ap�s opera��o: "+lista[topo]);
	
}

//Somar o valor do topo e o seu anterior e coloca o resultado da opera��o no topo da pilha.
public void ADD() {
	
	if(doiselementos()) {
		System.out.print("\n Lista com apenas um ou nenhum elemento , impossivel fazer opera��o");
		return;
	}

	lista[topo] += lista[topo-1];	
	System.out.println("\n Valor do topo ap�s opera��o:" +lista[topo]);
	
}

//Subtrair o valor do topo e seu anterior e coloca o resultado da opera��o no topo da pilha.
public void SUB() {
	
	if(doiselementos()) {
		System.out.print("\n Lista com apenas um ou nenhum elemento , impossivel fazer opera��o");
		return;
	}

	lista[topo] = (lista[topo-1] - lista[topo]);
	System.out.println("\n Valor do topo ap�s opera��o:" +lista[topo]);
	
}

//Multiplicar o valor do topo e seu anterior e coloca o resultado da opera��o no topo da pilha.
public void MPY() {
	
	if(doiselementos()) {
		System.out.print("\n Lista com apenas um ou nenhum elemento , impossivel fazer opera��o");
		return;
	}

	lista[topo] *= lista[topo-1];
	System.out.println("\n Valor do topo ap�s opera��o:" +lista[topo]);
}

//Dividir o valor do topo e seu anterior e coloca o resultado da opera��o no topo da pilha.
public void DIV() {
	
	if(doiselementos()) {
		System.out.print("\n Lista com apenas um ou nenhum elemento , impossivel fazer opera��o");
		return;
	}
	
	lista[topo] = (lista[topo-1] / lista[topo]);
	System.out.println("\n Valor do topo ap�s opera��o:" +lista[topo]);
}


//Verifica se a pilha est� vazia
public boolean vazio() {
	return topo==-1;
}

//Verifica se h� pelo menos 2 elementos na pilha
public boolean doiselementos() {
	return topo<1;
}

//Verifica se a pilha est� cheia
public boolean cheia() {
	return topo==capacidade-1;
}


public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);

Tarefa1 pilha = new Tarefa1();


//Cria��o da pilha
pilha.criarpilha();


//Menu
int rodar = 1;
int opt = 0;
while(rodar == 1) { 	
			
	System.out.print("\n Menu: \n (1) Adicionar um elemento a pilha \n (2) Remover um elemento da pilha \n (3) Opera��o DEC2 \n (4) Opera��o ADD3 \n (5) Opera��o ADD \n (6) Opera��o SUB \n (7) Opera��o MPY \n (8) Opera��o DIV \n (9) Encerrar \n Digite uma op��o do menu: ") ;
	opt = leia.nextInt();	

	
//Adiciona um elemento ao topo	
if(opt == 1) {
	
     pilha.push();	


//Remove um elemento do topo
}else if(opt == 2) {
	
     pilha.pop();	

	

//Chama a opera��o de subtrair 2 do elemento do topo
}else if(opt == 3) {
	
     pilha.DEC2();

//Chama a opera��o de adicionar 3 ao elemento do topo
}else if(opt == 4) {
	
    pilha.ADD3();
	

//ADD (adi��o, X+Y), onde Y � o elemento no topo da pilha e X o elemento abaixo de Y.
}else if(opt == 5) {
	
    pilha.ADD();

//SUB (subtra��o, X-Y), onde Y � o elemento no topo da pilha e X o elemento abaixo de Y.
}else if(opt == 6) {
	
    pilha.SUB();

//MPY (multiplica��o, X*Y), onde Y � o elemento no topo da pilha e X o elemento abaixo de Y.
}else if(opt == 7) {
	
	pilha.MPY();


//DIV (divis�o, X/Y), onde Y � o elemento no topo da pilha e X o elemento abaixo de Y.
}else if(opt == 8) {
   
	pilha.DIV();


//Encerrar.
}else if(opt == 9) {
   rodar = 0;
   System.out.println("Programa encerrado.");

}


       }
		
	 }

  }
