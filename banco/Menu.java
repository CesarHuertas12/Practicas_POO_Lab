package banco;
import java.util.Scanner;

public class Menu {
	
	enum Opciones{
		INICIO,
		REGISTRAR,
		ACCESO,
		SALIR;
	}
	
	static String menu[] = {"\n1)Registrar Cuenta",
							"2)Ingresar a una cuenta",
							"3)Salir"};
	
	static String subMenu[] = {"\n1)Retirar",
								"2)Depositar",
								"3)Consultar Saldo",
								"4)Salir"};
	
	public static void imprimirMenu() {
		for(int i=0; i < menu.length; i++){
            System.out.print(menu[i] + "\n");
        }
	}
	
	public static void imprimirSubMenu() {
		for(int i=0; i < subMenu.length; i++){
            System.out.print(subMenu[i] + "\n");
        }
	}
	
	public static Menu.Opciones capturarOpt(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+ msg + ": ");
        return (Opciones.values()[sc.nextInt()]);
    }

}
