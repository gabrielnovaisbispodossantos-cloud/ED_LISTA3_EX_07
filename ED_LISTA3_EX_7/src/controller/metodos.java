package controller;
 
public class metodos {
 public metodos() {
	 super();
 }
   public int somar(String s){
  // Condição de parada:
  // Quando string tiver tamanho 1
    if(s.length() == 1) {
   return Integer.parseInt(s);
  }

  // Relação de chamada:
  // primeiro caractere + soma do restante
  return Integer.parseInt(s.substring(0,1))
         + somar(s.substring(1));
}
}
