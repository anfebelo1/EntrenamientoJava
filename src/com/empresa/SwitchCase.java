package com.empresa;

public class SwitchCase {

	public static void main(String[] args) {
		int dia=1;
		String modulo="contabilidad";
		
		switch(modulo)
		{case "contabilidad": System.out.println("Dia de contabilidad");
		break;
		default :
			System.out.println("Dia no valido");
			}
		
		switch(dia)
		{case 1: System.out.println("Este es el dia 1");
		break;
		case 2: System.out.println("Este es el dia 2");
		break;
		case 3: System.out.println("Este es el dia 3");
		break;
		case 4: System.out.println("Este es el dia 4");
		break;
		case 5:  System.out.println("Este es el dia 5");
		break;
		case 6:  System.out.println("Este es el dia 6");
		break;
		case 7:  System.out.println("Este es el dia 7");
		break;
		default :
		System.out.println("Dia no valido");
		}
	
	}

}
