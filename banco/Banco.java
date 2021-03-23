package banco;

import java.util.ArrayList;

public class Banco {
		private ArrayList<Cuenta> listaCuenta = new ArrayList<Cuenta>();
		private int clienteActivo = -1;
		
		public void registrarCliente() {
			Cuenta cliente = new Cuenta();
			cliente.setNombre(CapturaEntrada.capturarString("Ingresa tu nombre: "));
			cliente.setSaldo(CapturaEntrada.capturarFloat("Ingresa tu saldo: "));
			cliente.setPin(CapturaEntrada.capturarEntero("Ingresa un Pin: "));
			
			listaCuenta.add(cliente);
		}
		
		public boolean retirarDinero(float retiro) {
			
			if(listaCuenta.get(clienteActivo).getSaldo() < retiro) {
				System.out.println("EL saldo que desea retirar es mayor al que se tiene");
				return false;
			}
			float nuevoSaldo = listaCuenta.get(clienteActivo).getSaldo() - retiro;
			
			listaCuenta.get(clienteActivo).setSaldo(nuevoSaldo);
			return true;
			
		}
		
		public void depositarDinero(float deposito) {
			float nuevoSaldo = listaCuenta.get(clienteActivo).getSaldo() + deposito;
			listaCuenta.get(clienteActivo).setSaldo(nuevoSaldo);
			
		}
		
		public void mostrarInformacion(){      
	        for(int i = 0; i< listaCuenta.size(); i++) {
	        	System.out.println("\n\tInformacion del Cliente");
	        	System.out.println("Nombre: " + listaCuenta.get(i).getNombre());
	        	System.out.println("Saldo: " + listaCuenta.get(i).getSaldo()); 
	        }
	    }
		
		public boolean activarCliente(int pin) {
			clienteActivo = -1;
			for(int i = 0; i < listaCuenta.size(); i++) {
				if(pin == listaCuenta.get(i).getPin()) {
					clienteActivo = i;
					return true;
				}
			}
			return false;
		}
		
		public float consultarSaldo(int pin) {
			for(int i=0; i < listaCuenta.size(); i++) {
				if(pin == listaCuenta.get(i).getPin()) {
					return listaCuenta.get(i).getSaldo();
				}
			}
			return 0;
		}
}
