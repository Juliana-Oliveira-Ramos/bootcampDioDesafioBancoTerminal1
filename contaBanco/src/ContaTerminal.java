import java.util.Scanner;
public class ContaTerminal{
   
    public static void main(String[] args) throws Exception {
        
            //TODO:Conhecer e importar a classe scanner
            
            //TODO:Exibir as mensagens para o nosso usuario;

            //obter pela classe scanner os valores digitados no terminal
            //exibir a mensagem final, a conta criada 

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem Vindo Ao Banco Santander Dio");
            System.out.println("*********************************");

        

            System.out.println("Informe seu Numero da Agencia:");
            String numeroAgencia = scanner.nextLine();


            System.out.println("Informe seu Numero da Conta:");
            int numeroConta = scanner.nextInt();

            System.out.println("Informe seu Nome:");
            String nome = scanner.next();


            System.out.println("Informe seu Saldo:");
            float saldo = scanner.nextFloat();


            System.out.println("Extrato Bancorio");
            System.out.println("*********************************");
            System.out.println("Olá," +nome+ "obrigado por criar uma conta em nosso banco, sua agência é :"+numeroAgencia+"Conta:"+ numeroConta+"e seu saldo:"+saldo+ "já está disponível para saque");
            
            scanner.close();




    }



}
