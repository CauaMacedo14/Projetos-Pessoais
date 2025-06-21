import java.util.Scanner;

public class Usuario {
    private String nome;
    private double gastos;

    public Usuario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    
    public void escolhaInfo(Usuario usuario1){
        Mes mes = new Mes();
        Scanner sc = new Scanner(System.in);
        boolean repetir = true;

        mes.limite();
        while (repetir) {
            System.out.println("1-Registrar Gasto");
            System.out.println("2-Listar Gastos");
            System.out.println("3-Sair");
            System.out.println("Escolha uma das opcoes acima: ");
            
            int escolha = sc.nextInt();
            switch (escolha){
                case 1: mes.valorGasto(usuario1);
                    break;
                case 2: mes.listar(usuario1);
                    break;
                case 3: repetir = false;
                    break;
                default: System.out.println("Opcao invalida");
            }
        }
    }
}