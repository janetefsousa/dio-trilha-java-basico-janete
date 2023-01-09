public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.diminuirVolume();
       smartTv.aumentarVolume();

       System.out.println("Canal Atual:" +smartTv.canal);
       smartTv.mudarCanal(13);
       System.out.println("Novo Canal:" +smartTv.canal);


      System.out.println("Tv Ligada ?" + smartTv.ligada);
      System.out.println("Qual canal ?" + smartTv.canal);
      System.out.println("Qual volume ?" +smartTv.volume);

       smartTv.ligar();
       System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);
       
       smartTv.desligar();
       System.out.println("Novo Stuatus -> Tv Ligada ? " + smartTv.ligada);



    }
}
