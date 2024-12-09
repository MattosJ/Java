package exercicio3;
// para ser concertado : no método amountConsonant modificar a cchamada da funçã de uma váriavel para dentro do próprio if para afim de economizar mémoria e ter uma menor pretição de nomes de variáveis.
public class Stringer {
  private String phrase;

  public Stringer(String phrase) {
    this.phrase = phrase;
    
  }

  public String lowCasePhase(){
    String yourString = phrase;
    yourString = yourString.toLowerCase();
    return yourString;
  }

  public boolean isVowel(char i) {
    i = Character.toLowerCase(i);
    return i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' ||
           i == 'á' || i == 'à' || i == 'ã' || i == 'â' || i == 'é' || i == 'ê' ||
           i == 'í' || i == 'ó' || i == 'ô' || i == 'õ' || i == 'ú';
}
public void amountVowel() {
  String youString = lowCasePhase();
  int vowels = 0;
  for (int i = 0; i < youString.length(); i++) {
      char yourStringChar = youString.charAt(i);
      boolean isVowel = isVowel(yourStringChar);
      if (isVowel) {
          vowels++;
      }
  }
  System.out.println("The amount of vowels is: "+vowels);
}

  public void amountConsonant(){
    String youString = lowCasePhase();
    int consonant = 0;
    for(int i = 0; i < youString.length(); i++){
      char yourStringChar =  youString.charAt(i);
      boolean isVowel = isVowel(yourStringChar);
      boolean isWhiteSpace = isWhiteSpace(yourStringChar);
      boolean isNumber = isNumber(yourStringChar);
      boolean isSimbol = isSimbol(yourStringChar);
      if(isVowel == false && isWhiteSpace == false && isNumber == false && isSimbol == false){
        consonant ++;
      }
    }
    System.out.println("The amount of consonant is: " +consonant);
  }

  public void amountTotalSpaces(){
    String youString = lowCasePhase();
    System.out.println("The length total is: "+ youString.length());
  }

  public boolean isWhiteSpace(char i){
    i =  Character.toLowerCase(i);
    return i == ' ';
  }

  public void amountWhhiteSpace(){
    String youString = lowCasePhase();
    int whiteSpace = 0;

    for(int i = 0; i < youString.length(); i++){
      char yourStringChar = youString.charAt(i);
      boolean isWhiteSpace = isWhiteSpace(yourStringChar);
      if(isWhiteSpace == true){
        whiteSpace++;
      }
      
    }
    System.out.println("The white space is: " + whiteSpace);
  }
  public boolean isNumber(char e){
    e = Character.toLowerCase(e);
    char numbers[] = {'0','1','2','3','4','5','6','7','8','9'};
    for(int i = 0 ; i < 10; i++){
      if(e == numbers[i]){
        return true;
      }
    }
    return false;
  }
  public boolean isSimbol(char e){
    e = Character.toLowerCase(e);
    char simbol[] = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '=', '+', 
    '[', ']', '{', '}', '|', ';', ':','"', ',', '.', '<', '>', 
    '/', '?', '`', '~'};
    for(int i= 0; i< simbol.length ; i++){
      if(e == simbol[i]){
        return true;
      }
    }
    return false;
  }
}


  



