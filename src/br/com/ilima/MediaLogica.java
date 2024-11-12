package br.com.ilima;

import java.util.Scanner;

public class MediaLogica {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		int nota2 = sc.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		int nota3 = sc.nextInt();
		
		System.out.println("Digite a quarta nota: ");
		int nota4 = sc.nextInt();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		
		String mediaRs = getMedia(media);
		
		System.out.println("Sua média foi: " + media);
		System.out.println("Você está: " + mediaRs);
	}
	
	public static String getMedia(float media) {
		
		String result;
	
		if (media >= 7) {
			result = "Aprovado";
		} else if(media >= 5 && media < 7) {
			result = "Recuperação";
		} else {
			result = "Reprovado";
		}
		
		return result;
		
	}
	
}
