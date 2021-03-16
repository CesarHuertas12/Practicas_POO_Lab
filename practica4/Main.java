package practica4;

public class Main {

	public static void main(String[] args) {
		
		PajaroBomba pajaro1 = new PajaroBomba("Negro","Circular",70,30);
		PajaroBumeran pajaro2 = new PajaroBumeran("Amarillo","Triangular",30,10);
		PajaroHuevo pajaro3 = new PajaroHuevo("Blanco","Ovalado",45,20);
		Pajaro pajaro[] = {pajaro1,pajaro2,pajaro3};
		
		for(int i=0; i < pajaro.length; i++) {
			pajaro[i].imprimirAtributos();
		}
		
		System.out.println("\n\tHabilidades de los Angry Birds");
		pajaro1.fuerzaDisparo();
		pajaro1.explosion();
		
		pajaro2.fuerzaDisparo();
		pajaro2.regreso();
		
		pajaro3.fuerzaDisparo();
		pajaro3.lanzarHuevo();
	}

}
