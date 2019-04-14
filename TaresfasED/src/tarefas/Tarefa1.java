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
		System.out.print("\n  Lista cheia, impossivel realizar operação");
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
		System.out.println("\n Lista vazia, impossivel realizar operação");
		return;
	}
	
topo--;
System.out.println("\n Elemento removido do topo");

}

//Operação de subtrair 2 do topo
public void DEC2() {
	
	if(vazio()) {
		System.out.print("\n Lista vazia, impossivel subtrair 2 do topo");
		return;
	}
	
lista[topo] = lista[topo] - 2;	
System.out.println("\n Valor do elemento após operação: "+lista[topo]);


}

//Operação de adicionar 3 do topo
public void ADD3() {
	
	if(vazio()) {
		System.out.print("\n Lista vazia , impossivel somar 3 ao topo");
		return;
	}
	
lista[topo] = lista[topo] + 3;	

System.out.println("\n Valor do elemento após operação: "+lista[topo]);
	
}

//Somar o valor do topo e o seu anterior e coloca o resultado da operação no topo da pilha.
public void ADD() {
	
	if(doiselementos()) {
		System.out.print("\n Lista com apenas um ou nenhum elemento , impossivel fazer operação");
		return;
	}

	lista[topo] += lista[topo-1];	
	System.out.println("\n Valor do topo após operação:" +lista[topo]);
	
}

//Subtrair o valor do topo e seu anterior e coloca o resultado da operação no topo da pilha.
public void SUB() {
	
	if(doiselementos()) {
		System.out.print("\n Lista com apenas um ou nenhum elemento , impossivel fazer operação");
		return;
	}

	lista[topo] = (lista[topo-1] - lista[topo]);
	System.out.println("\n Valor do topo após operação:" +lista[topo]);
	
}

//Multiplicar o valor do topo e seu anterior e coloca o resultado da operação no topo da pilha.
public void MPY() {
	
	if(doiselementos()) {
		System.out.print("\n Lista com apenas um ou nenhum elemento , impossivel fazer operação");
		return;
	}

	lista[topo] *= lista[topo-1];
	System.out.println("\n Valor do topo após operação:" +lista[topo]);
}

//Dividir o valor do topo e seu anterior e coloca o resultado da operação no topo da pilha.
public void DIV() {
	
	if(doiselementos()) {
		System.out.print("\n Lista com apenas um ou nenhum elemento , impossivel fazer operação");
		return;
	}
	
	lista[topo] = (lista[topo-1] / lista[topo]);
	System.out.println("\n Valor do topo após operação:" +lista[topo]);
}


//Verifica se a pilha está vazia
public boolean vazio() {
	return topo==-1;
}

//Verifica se há pelo menos 2 elementos na pilha
public boolean doiselementos() {
	return topo<1;
}

//Verifica se a pilha está cheia
public boolean cheia() {
	return topo==capacidade-1;
}


public static void main(String[] args) {
	
Scanner leia = new Scanner(System.in);

Tarefa1 pilha = new Tarefa1();


//Criação da pilha
pilha.criarpilha();


//Menu
int rodar = 1;
int opt = 0;
while(rodar == 1) { 	
			
	System.out.print("\n Menu: \n (1) Adicionar um elemento a pilha \n (2) Remover um elemento da pilha \n (3) Operação DEC2 \n (4) Operação ADD3 \n (5) Operação ADD \n (6) Operação SUB \n (7) Operação MPY \n (8) Operação DIV \n (9) Encerrar \n Digite uma opção do menu: ") ;
	opt = leia.nextInt();	

	
//Adiciona um elemento ao topo	
if(opt == 1) {
	
     pilha.push();	


//Remove um elemento do topo
}else if(opt == 2) {
	
     pilha.pop();	

	

//Chama a operação de subtrair 2 do elemento do topo
}else if(opt == 3) {
	
     pilha.DEC2();

//Chama a operação de adicionar 3 ao elemento do topo
}else if(opt == 4) {
	
    pilha.ADD3();
	

//ADD (adição, X+Y), onde Y é o elemento no topo da pilha e X o elemento abaixo de Y.
}else if(opt == 5) {
	
    pilha.ADD();

//SUB (subtração, X-Y), onde Y é o elemento no topo da pilha e X o elemento abaixo de Y.
}else if(opt == 6) {
	
    pilha.SUB();

//MPY (multiplicação, X*Y), onde Y é o elemento no topo da pilha e X o elemento abaixo de Y.
}else if(opt == 7) {
	
	pilha.MPY();


//DIV (divisão, X/Y), onde Y é o elemento no topo da pilha e X o elemento abaixo de Y.
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
