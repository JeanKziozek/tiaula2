class exemplo{
    public static void main(String[]arg){
        int a = 5;
        int b = 5;

        int soma = a + b;
        int sub = a - b;
          System.out.println("Soma:\n" + soma + 
        "\nSubtrassao: \n" + sub);
        if (a == b)
          System.out.println("saum iguais");
        else if (a>b)
          System.out.println("a eh maior" + " que b");
        else 
          System.out.println("b eh maior" + " que a");
        for (int i = 1; i <= 10; i++)
          System.out.println(i);
          int i = 10;
          while (i < 20) {
              System.out.println("[" +  i + "] ");
              i = i + 2;
          }
          do {
              System.out.print("(" + i + ") ");
              i += 3;
          } while (i < 40);
    }
}