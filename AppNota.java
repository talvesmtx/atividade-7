import javax.swing.JOptionPane;
public class AppNota
{
   public static void main(String args[])
   {
      BlocoDeNota nota = new BlocoDeNota ();
      
      int menu;
      String notaInformada = null;
      String notaNova = null;
      
      do{
         menu = Integer.parseInt(JOptionPane.showInputDialog(
         "1 add Nota\n2 remover Nota \n3 Update Nota \n4 Listar Nota \n5 Sair do Sistema "));
         if(menu == 1)
         {
            notaInformada = JOptionPane.showInputDialog("Informe a Nota");
            nota.addNota(notaInformada);
         }else if(menu == 2)
            {
               notaInformada = JOptionPane.showInputDialog("Nota para remover");
               if(nota.removeNota(notaInformada))
               {
                  JOptionPane.showMessageDialog(null,"Nota Removida");
               }else
                  {
                     JOptionPane.showMessageDialog(null,"Não encontrado");
                  }
             }     
           else if(menu == 3)
                   {
                      notaInformada = JOptionPane.showInputDialog("Informa a nota que deseja alterar");
                      int posicao = nota.buscarNota(notaInformada);
                      if(posicao >= 0)
                         {
                            notaNova = JOptionPane.showInputDialog("Informe a nota nova que sera adciona por: " + notaInformada);
                            
                            if(nota.UpdateNota(notaNova,notaInformada))
                            {
                              JOptionPane.showMessageDialog(null,"Nota atualizada");
                            }
                              else
                                 {
                                    JOptionPane.showMessageDialog(null,"nota não atualizada, retorne novamente"); 
                                 }  
                            
                         }
                         else
                            {
                               JOptionPane.showMessageDialog(null,"nota não encontrado");   
                            }
                     }       
            else if(menu == 4)
               {
                 nota.listarNota();  
               }
            else if(menu == 5)
               {
                  
               }

                                
                else
                   {
                     JOptionPane.showMessageDialog(null,"Opcao invalida");
                   }
                   
                    
            }while(menu!= 5);
    }
   
}