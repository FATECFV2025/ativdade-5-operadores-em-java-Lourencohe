public class App {
    public static void main(String[] args) throws Exception {
        Operadores op = new Operadores();
 
        System.out.println("Resultado:" + op.adicao(10, 8));
 
        System.out.println("Resultado" + op.subtracao(19, 7));
 
        System.out.println("Resultado" + op.multiplicacao(4, 3));
 
        System.out.println("Resultado" + op.divisao(10, 0));
 
        System.out.println("Resultado" + op.comparacao(10, 0));
    }
}