//Se o número é par, divida-o por dois; senão, triplique-o e adicione um.
public class Collatz {
    public static long func (long n){
        if (n % 2 == 1)
            return n * 3 +1;
        return n / 2;
    }

    public static void CollatzSequencia(long n){
        for (; n != 1; n = func(n))
            System.out.printf("%d ", n);

        System.out.printf("%d\n", n);
    }

    public static void main(String[] args){
        if (args.length != 1){
            System.out.printf("Este programa precisa%sum argumento.\n", (args.length > 1) ? " apenas " : " ");
            return;
        }

        try {
            CollatzSequencia(Long.valueOf(args[0]));
        }catch (NumberFormatException excecao){
            System.out.printf("%s não é um valor numérico.\n", args[0]);
        }
    }
}
