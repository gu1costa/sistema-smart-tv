public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV smartTv = new SmartTV();

        /* 
        System.out.println("TV ligada?: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        */

        //smartTv.desligar();

        //smartTv.ligar();

        smartTv.ligar();  //ligou a tv

        System.out.println("TV ligada?: " + smartTv.ligada);

        //smartTv.aumentarVolume();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();    //diminuiu o volume (de 1 em 1)
        smartTv.diminuirVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.selecionarCanal(13);

        System.out.println("Canal atual: " + smartTv.canal);
    }
}
