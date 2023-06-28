import Entidades.Reserva;
import Excecoes.ExcecaoDominio;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

public class Main {
/*
Faça uma aplicação para ler os dados de uma reserva de hotel (número do quarto, data de entrada e data de saída)
e mostrar os dados da reserva, inclusive sua duração em dias. Em seguida, ler novas datas de entrada e saída,
atualizar a reserva, e mostrar novamente a reserva com os dados atualizados. O programa não deve aceitar
dados inválidos para a reserva, conforme as seguintes regras:
    - Alterações de reserva só podem ocorrer para datas futuras
    - A data de saída deve ser maior que a data de entrada.

ps: Utilize os conceitos de tratamento de exceção.
 */

/*
   Ex 1 - Crie um novo projeto no intelliJ para uma aplicação java.
   Ex 2 - Crie um Package (pasta / pacote) com nome entidades.
   Ex 3 - Crie classe com o nome Reserva
   Ex 4 - Crie um pacote com nome Excecoes.
   Ex 5 - Crie uma classe com nome ExcecaoDominio.
   Ex 6 - Crie um novo arquivo (se não houver no projeto inicial) contendo um método main().
   Ex 7 - No método main() entre com o número do quarto, data de entrada e data de saída.
   Ex 8 - O Programa não deve aceitar dados inválidos para a reserva, conforme as seguintes regras:
                - Alterações de reserva só podem ocorrer para datas futuras
                - A data de saída deve ser maior que a data de entrada
   Ex 9 - o programa deve ter saída desse modo.
*/
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Reserva reserva01 = new Reserva();

        System.out.println("Digite CONFIRMAR para Reservar ou FIM para finalizar: ");
        String confirmar = entrada.next();

        while (!confirmar.equalsIgnoreCase("fim")) {
            try {
// INGRESANDO NRO DO QUARTO
                System.out.println("Confirme o número do quarto: ");
                reserva01.setNumeroQuarto(entrada.nextInt());

// INGRESANDO DATA DE ENTRADA
                System.out.println("Confirme a data de entrada de sua Reserva: ");
                System.out.println("Digite o dia de entrada: ");
                int d1 = entrada.nextInt();
                reserva01.setDiaEntrada(d1);
        	        if (d1 <= 00 || d1 >= 32) {
                        throw new ExcecaoDominio("Erro na Reserva: Valores fora do limite do calendário.");
                    }

                System.out.println("Digite o mês de entrada: ");
                int m1 = entrada.nextInt();
                reserva01.setMesEntrada(m1);
    	            if (m1 <= 00 || m1 >= 13) {
                        throw new ExcecaoDominio("Erro na Reserva: Valores fora do limite do calendário.");
                    }

                System.out.println("Digite o ano de entrada: ");
                int a1 = entrada.nextInt();
                reserva01.setAnoEntrada(a1);
                    if (a1 == 0000 || a1 <= 2022 || a1 >= 2025) {
                        throw new ExcecaoDominio("Erro na Reserva: Valores fora do limite do calendário.");
                    }

                System.out.println("-------------------------");

// INGRESANDO DATA DE SAIDA
                System.out.println("Confirme a data de saida de sua Reserva: ");
                System.out.println("Digite o dia de saida: ");
                int d2 = entrada.nextInt();
                reserva01.setDiaSaida(d2);
                    if (d2 <= 00 || d2 >= 32) {
                        throw new ExcecaoDominio("Erro na Reserva: Valores fora do limite do calendário.");
                }

                System.out.println("Digite o mês de saida: ");
                int m2 = entrada.nextInt();
                reserva01.setMesSaida(m2);
                    if (m2 <= 00 || m2 >= 13) {
                        throw new ExcecaoDominio("Erro na Reserva: Valores fora do limite do calendário.");
                }

                System.out.println("Digite o ano de saida: ");
                int a2 = entrada.nextInt();
                reserva01.setAnoSaida(a2);
                    if (a2 == 0000 || a2 <= 2022 || a2 >= 2025) {
                        throw new ExcecaoDominio("Erro na Reserva: Valores fora do limite do calendário.");
                }

// _____________________________________________________

// DADOS INVÁLIDOS TRATADOS COM CONDICIONAL E THROW

        	    if (d2 < d1 || m2 < m1 || a2 < a1 ) {
                    throw new ExcecaoDominio("Erro na Reserva: Data de saída deve ser maior que data de Entrada");
        }
// _____________________________________________________

// DADOS DA RESERVA FEITOS COM SUCESSO
                System.out.println(reserva01.infoQuarto());
                System.out.println(reserva01.dataEntrada());
                System.out.println(reserva01.dataSaida());
                System.out.println(reserva01.toString());


            } catch (InputMismatchException e) {
                System.out.println("O erro foi: " + e);
                e.printStackTrace();
                break;

            } catch (IllegalStateException e) {
                System.out.println("O erro foi: " + e);
                e.printStackTrace();
                break;

            } catch (ExcecaoDominio e) {
                e.printStackTrace();

            } catch (Exception e) {
                System.out.println("O erro foi: " + e);
                e.printStackTrace();
            }

            System.out.println("Digite ATUALIZAR para mudar a Reserva ou FIM para finalizar: ");
            confirmar = entrada.next();

        }

/* Fim do scanner */
        System.out.println("_______F_I_M_______");

/* Fim do metodo main */
    }
/* FIM DA CLASS MAIN */
}