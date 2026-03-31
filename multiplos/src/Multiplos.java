public class Multiplos {
    public static void main(String[] args) {
        int contador = 0;
        
        for (int i = 1; i <= 1000; i++) {
            // Verifica se o resto da divisão por 2, 3 OU 5 é zero
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                contador++;
            }
        }
        
        System.out.println("A quantidade de múltiplos de 2, 3 ou 5 entre 1 e 1000 é: " + contador);
    }
}