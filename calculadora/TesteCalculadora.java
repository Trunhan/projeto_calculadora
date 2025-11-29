/**
 * <p><strong>Classe de Teste para a Calculadora</strong></p>
 * * <p>Esta classe contém o método principal ({@code main}) para demonstrar o uso
 * e testar as funcionalidades da classe {@code Calculadora}.</p>
 * * <p>O código realiza as seguintes ações:</p>
 * <ul>
        * <li>Cria uma instância da {@code Calculadora}.</li>
        * <li>Executa as operações básicas (soma, subtração, multiplicação e divisão)
        * utilizando o método {@code calcular} e imprime os resultados.</li>
        * <li>Demonstra o tratamento de exceções ({@code try-catch}) para casos de
        * <strong>divisão por zero</strong> e <strong>operador inválido</strong>,
        * ambos lançando uma {@code IllegalArgumentException}.</li>
 * </ul>
 * * @author Victor Freitas
 * @version 1.0
 * @see Calculadora
 */
package calculadora;

public class TesteCalculadora {

    /**
     * Ponto de entrada principal da aplicação.
     * * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+")); // Esperado: 5
        System.out.println(calc.calcular(10, 4, "-")); // Esperado: 6
        System.out.println(calc.calcular(3, 5, "*")); // Esperado: 15
        System.out.println(calc.calcular(8, 2, "/")); // Esperado: 4

        // Teste de Divisão por Zero
        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de Operador Inválido
        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
