import java.util.ArrayList;
import java.util.Scanner;

public class Mes {
    ArrayList<Double> valorDoGasto = new ArrayList<Double>();
    ArrayList<String> causaDoGasto = new ArrayList<String>();
    private int limite = 0;
    private double valorDaCompra;

    public Mes(){

    }

    public void limite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adicione abaixo um limite de gasto que desejar: ");
        this.limite = sc.nextInt();
    }

    public void valorGasto(Usuario usuario){
        Scanner sc = new Scanner(System.in);
        int resposta;
        System.out.println("Digite o valor de gasto: ");
        this.valorDaCompra = sc.nextDouble();
        if (this.valorDaCompra + usuario.getGastos() > this.limite) {
            System.out.println("-----COM ESSE GASTO SEU LIMITE SERA ESTOURADO-----");
            System.out.println("Deseja continuar? 1-sim 2-não");
            resposta = sc.nextInt();
            if (resposta == 1) {
                
                usuario.setGastos( usuario.getGastos() + this.valorDaCompra);
                valorDoGasto.add(this.valorDaCompra); 
                System.out.println("Digite o motivo do gasto: ");
                String causa = sc.next();
                causaDoGasto.add(causa);
            }else if(resposta == 2){

            }else{
                System.out.println("Resposta invalida!!!!");
            }
        }else{
            usuario.setGastos( usuario.getGastos() + this.valorDaCompra);
            valorDoGasto.add(this.valorDaCompra); 
            System.out.println("Digite o motivo do gasto: ");
            String causa = sc.next();
            causaDoGasto.add(causa);
        }
    }

    public void listar(Usuario usuario){
        if (this.valorDaCompra + usuario.getGastos() > this.limite) {
        System.out.println("---LISTANDO GASTOS E CAUSAS---");
        for(int i = 0; i < valorDoGasto.size(); i++){
            System.out.println("R$" + valorDoGasto.get(i) + ", Causa do gasto: " + causaDoGasto.get(i));
        }
        System.out.println("OBS: VALOR ESTOURADO!!!!!");
        System.out.println("Total gasto: " + usuario.getGastos());
        System.out.println();
    }else{
        System.out.println("---LISTANDO GASTOS E CAUSAS---");
        for(int i = 0; i < valorDoGasto.size(); i++){
            System.out.println("R$" + valorDoGasto.get(i) + ", Causa do gasto: " + causaDoGasto.get(i));
        }
        System.out.println("Total gasto: " + usuario.getGastos());
        System.out.println();
        }
    }
}