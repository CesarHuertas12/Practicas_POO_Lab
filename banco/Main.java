package banco;

public class Main {

	public static void main(String[] args) {
		Menu.Opciones opt = Menu.Opciones.INICIO;
		Banco banco = new Banco();
		
		while(opt != Menu.Opciones.SALIR) {
			Menu.imprimirMenu();
			opt = Menu.capturarOpt("Ingrese la opcion a realizar: ");
			switch(opt) {
			case REGISTRAR:
				banco.registrarCliente();
				break;
			case ACCESO:
				int pin = CapturaEntrada.capturarEntero("Ingrese su PIN: ");
				if(banco.activarCliente(pin)) {
					int opt1 = 0;
					do{
						Menu.imprimirSubMenu();
						opt1 = CapturaEntrada.capturarEntero("Ingresa la opcion a realizar: ");
						switch(opt1) {
						case 1:
							if(banco.retirarDinero(0) == false){
								System.out.println("No tiene suficiente saldo para retirar esa cantidad de dinero");
							}
							else {
								banco.retirarDinero(CapturaEntrada.capturarFloat("Ingrese la cantidad de dinero a retirar: "));
							}
							break;
						case 2:
							banco.depositarDinero(CapturaEntrada.capturarFloat("Ingrese la cantidad de dinero a depositar: "));
							break;
						case 3:
							if(banco.consultarSaldo(pin) == 0) {
								System.out.println("No existe una cuenta asociada a ese ping");
							}
							else {
								System.out.println("Su saldo actual es de: " + banco.consultarSaldo(pin));
							}
							break;
						default: System.out.println("Ingrese una opcion Correcta"); break;
						}
					}while(opt1  != 4);
				}
				else {
					System.out.println("No existe una cuenta enlazada con ese Pin, crear una cuenta o verificarlo");
				}
				break;
				}
			}
				
		}
}
