import scala.io.StdIn.readInt

object caesarCipher{
  def main(args:Array[String]){

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    println(alphabet.size);
    val Encryption = (c:Char, key:Int, alphabet:String) => alphabet((alphabet.indexOf(c.toUpper)+key) % alphabet.size);

    val Decryption = (c:Char, key:Int, alphabet:String) => alphabet((alphabet.indexOf(c.toUpper)-key+alphabet.size) % alphabet.size);

    val Cipher = (Algorithm:(Char,Int,String) => Char, s:String, key:Int, alphabet:String) => s.map(Algorithm(_, key, alphabet));

    println("--Enter the string to encrypt--");
    val str = readLine();

    val encryptedString = Cipher(Encryption, str, 3, alphabet);
    val decryptedString = Cipher(Decryption, encryptedString, 3, alphabet);
    println("Encrypted String : " + encryptedString);
    println("Decrypted String : " + decryptedString);

  }

}
