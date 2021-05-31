import java.util.Scanner;

public class Main {
    private static String name;
    private static String lastname;
    private static String phone;
    private static String address;
    private static String email;
    private static String gender;

    public static void main(String[] args) {
        System.out.println("Registro de Usuario");
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Ingrese su nombre: ");
        name = scan.nextLine();
        System.out.println("2. Ingrese su Apellido: ");
        lastname = scan.nextLine();
        System.out.println("3. Ingrese su telefono: ");
        phone = scan.nextLine();
        System.out.println("4. Ingrese su dirección ");
        address = scan.nextLine();
        System.out.println("5. Ingrese su email: ");
        email = scan.nextLine();
        System.out.println("6. Ingrese su genero (F, M, O): ");
        gender = scan.nextLine();
        System.out.println("Sus Datos son: Nombre: "+name+", Apellido: "+lastname+", telefono: "+phone+", Dirección: "+address+", correo electronico: "+email);
        System.out.println("Son correctos? Y or n");
        String answer = scan.nextLine();
        if(answer.equals("Y")) {
            System.out.println("Usuario Registrado Exitosamente: " + name + " " + lastname);
        } else {
            System.out.println("Usuario no Registrado");
        }
    }
}
