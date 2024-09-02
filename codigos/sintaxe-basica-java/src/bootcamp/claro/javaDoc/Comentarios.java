package bootcamp.claro.javaDoc;

// O comentário não deve explicar variavel, se tem variavel r que significa resultado, logo
// devo escrever resultado

public class Comentarios {

    public static void main(String[] args) {
        
    }
    // Má prática
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r de resultado
        if (m == "M"){ // M de multiplicação
            r=n;
        }else{
            // se não soma mesmo
            r = n + x;
        } return r;

    } 

}
