import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("Registro de Usuario");
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Ingrese su nombre: ");
        customer.setName(scan.nextLine());
        System.out.println("2. Ingrese su Apellido: ");
        customer.setLastname(scan.nextLine());
        System.out.println("3. Ingrese su telefono: ");
        customer.setPhone(scan.nextLine());
        System.out.println("4. Ingrese su dirección ");
        customer.setAddress(scan.nextLine());
        System.out.println("5. Ingrese su email: ");
        customer.setEmail(scan.nextLine());
        System.out.println("Sus Datos son: Nombre: "+customer.getName()+", Apellido: "+customer.getLastname()+", telefono: "+
                customer.getPhone()+", Dirección: "+customer.getAddress()+", correo electronico: "+customer.getEmail());
        System.out.println("Son correctos? Y or n");
        String answer = scan.nextLine();
        if(answer.equals("Y")) {
            System.out.println("Usuario Registrado Exitosamente: " + customer.getName() + " " + customer.getLastname());
        } else {
            System.out.println("Usuario no Registrado");
        }
    }
}
