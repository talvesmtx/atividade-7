import java.util.ArrayList;
public class BlocoDeNota
{
   private ArrayList<Nota>notas;
   
   public BlocoDeNota()
   {
      notas = new ArrayList<Nota>();
   }
   public void addNota(Nota nota) //m�todo inserir notas
   {
      notas.add(nota);
   }
   
   public boolean removeNota(String nota) //m�todo remover notas 
   {
      int posicao = buscar(nota);
      
      if(posicao >=0)
      {
         notas.remove(posicao);
         return true;
      }else
         {
            return false;
         }
   }
   public int buscarNota(String nota) // m�todo buscar notas
   {
      return buscar(nota);   
   }
   
   
   private int buscar(String n)
   {
      for(int i = 0; i<notas.size();i++)
      {
         Nota nota = notas.get(i);
         String nNota = nota.getnota();
         if(n.equals(nNota))
         {
            return i;
         } 
      }
      return -1;//n�o achou
    }
    
    
    public void addNota(String n)
    {
      Nota nota = new Nota();
      nota.setnota(n); 
      notas.add(nota);
    }
    
    
    public void listarNota()
    {
      for(Nota nota:notas)
      {
         System.out.println(nota);
      }
    }
    
    public boolean UpdateNota(String novaNota,String nota) //m�todo alterar notas 
   {
      int posicao = buscar(nota);
      
      if(posicao >=0)
      {
        Nota valor = notas.get(posicao);
        valor.setnota(novaNota);
         return true;
      }else
         {
            return false;
         }
   }
    
         
}