public class Nota
{
   private String nota, mensagem;
   
  
   // metodo get e set
   public String getnota() 
   {
   return nota;
   }
      
   public void setnota(String nota)
   {
   this.nota = nota;
   }
   
   
   public String getMensagem()
   {
      return mensagem;
   }

      public String toString()
   {
      return "[Nota:" + nota + "]";
   }
   
}