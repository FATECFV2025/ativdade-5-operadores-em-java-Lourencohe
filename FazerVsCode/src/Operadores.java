public class Operadores{
    public float adicao (float v1, float v2){
    return v1+v2;
    }
 
    public float subtracao(float v1, float v2){
        return v1-v2;
    }
 
    public float multiplicacao(float v1, float v2){
        return v1*v2;
    }
 
    //Aplicando condição e lógica
    public float divisao(float v1, float v2){
        if (v2 != 0 && v2 > -1){
            return v1/v2;
        }
        else
            System.out.println("Operação não divisível");
            return 0;
    }
 
    //Aplicando operadores de comparação
    public String comparacao(int a, int b){
        if (a > b){
            return "Primeira maior";
        }
        else if (a < b){
            return "O segundo é maior";
        }
        else{
            return "Igual";
        }
    }
}