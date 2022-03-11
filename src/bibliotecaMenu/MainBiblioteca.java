package bibliotecaMenu;

import java.util.Scanner;
import java.util.ArrayList;

public class MainBiblioteca {
	public static void main(String[] args) {
		FormaBiblioteca nota  = new FormaBiblioteca();
		
		//CRIANDO O OBJETO ROMANCE
		Romance romance = new Romance();
		Terror terror = new Terror();
		Scanner leia = new Scanner(System.in);
		//ARRAY LIST
		ArrayList<String> gensDisponiveis = new ArrayList<String>();
		//INSERINDO OS G�NEROS MANUALMENTE NO ARRAY
		gensDisponiveis.add("Terror");
		gensDisponiveis.add("terror");
		gensDisponiveis.add("Romance");
		gensDisponiveis.add("romance");
//		IGNORADO: System.out.println(gensDisponiveis);
		
		
		System.out.print("Digite o g�nero que deseja: ");
		String verificar = leia.next();
		//VERIFICAR SE O NOME DE GENERO QUE O USUARIO DIGITOU DA DISPONIVEL
		gensDisponiveis.contains(verificar);

		//CASO O GENERO ESTEJA DISPONIVEL
		if (gensDisponiveis.contains(verificar) == true) {
			System.out.println("O g�nero " + verificar + " est� dispon�vel.");
		}
		
		//CASO O GENERO N�O ESTEJA DISPONIVEL
		else{
			System.out.println("O g�nero " + verificar + " n�o est� dispon�vel.");
			//FECHANDO O PROGRAMA
			System.exit(0);
		}
		
		//VERIFICAR A POSI��O DO GENERO
		int posicao = gensDisponiveis.indexOf(verificar);

		//LOGICA: O GENERO  "ROMANCE" EST� NA POSI��O 1. 
		//ASSIM, QUANDO O USUARIO DIGITAR UM TERMO QUE ESTEJA NA POSI��O 1 (OU SEJA, ROMANCE), ESSA INSTRU��O SERA "ATIVADA" 
		//POR EXEMPLO, TER� QUE SER FEITO UMA INSTRU��O PRA CASO A POSI��O FOR IGUAL A 0 (OU SEJA, TERROR) E ASSIM POR DIANTE
		try {
		if (posicao == 2 || posicao == 3) {
			System.out.println("Escolha uma categoria: ");
			romance.mostrarCategoria();
			int catR = leia.nextInt();
			//MOSTRANDO TUDO :)
			if (catR == 1) {
				Lgbtqia l = new Lgbtqia();
				System.out.println("Temos essas op��es: \n");
				l.mostrarNome();
				l.mostrarEditora();
				l.mostrarAutor();
				l.mostrarSinopse();
				l.mostrarAnoPubli();
				l.mostrarClasseInd();
				l.mostrarTW();
				l.mostrarQtdPag();
				//Sobrecarga
				nota.mostrarNota(4.48);
			}
			
			else if (catR==2) {
				RomanceDeEpoca r = new RomanceDeEpoca();
				System.out.println("Temos essas op��es: \n");
				r.mostrarNome();
				r.mostrarEditora();
				r.mostrarAutor();
				r.mostrarSinopse();
				r.mostrarAnoPubli();
				r.mostrarClasseInd();
				r.mostrarTW();
				r.mostrarQtdPag();
				//Sobrecarga
				nota.mostrarNota(4.48, 4.88);
			}
		leia.close();
		}
	}
		//----------------------TERROR-----------------------
		catch(Exception erro)	{
			System.out.println("Voc� cometeu um erro: "+erro);
		}
		try {
			if(posicao == 0 || posicao == 1) {
					System.out.println("Escolha uma categoria: ");
					terror.mostrarCategoria();
					int catT = leia.nextInt();
					if(catT==1) {
						System.out.println("Temos essas op��es: \n");
						SerialKiller l = new SerialKiller();
						l.mostrarNome();
						l.mostrarEditora();
						l.mostrarAutor();
						l.mostrarSinopse();
						l.mostrarAnoPubli();
						l.mostrarClasseInd();
						l.mostrarTW();
						l.mostrarQtdPag();
						//Sobrecarga
						nota.mostrarNota(3.61);
					}else if (catT==2) {
						 TerrorPsicologico r = new TerrorPsicologico();
						 System.out.println("Temos essas op��es: \n");
							r.mostrarNome();
							r.mostrarEditora();
							r.mostrarAutor();
							r.mostrarSinopse();
							r.mostrarAnoPubli();
							r.mostrarClasseInd();
							r.mostrarTW();
							r.mostrarQtdPag();
							//Sobrecarga
							nota.mostrarNota(3.61, 3.48);
			}
			
				}
			leia.close();
		
		}
			catch(Exception erro)	{
				System.out.println("Voc� cometeu um erro: "+erro);
			}
	}
}