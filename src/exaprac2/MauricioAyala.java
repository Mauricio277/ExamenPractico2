
package exaprac2;

import javax.swing.JOptionPane;

/**
 * Nombre de la clase: MauricioAyala
 * Fecha:16-04-2018
 * Version:1.0
 * CopyRight:Mauricio Ayala
 * @author Mauricio Ayala
 */
public class MauricioAyala {

    public static void main(String[] args) {
        
        int opcion;
        int cantidadEmpleados=0;
        String acumuladorNombres="";
        String acumuladorPagos="";
        
        do
        {
            
         opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el la opcion a ejecutar\n"
                 + "                                          1.Agregar Empleado.\n"
                 + "                                          2.Calcular Planilla "
                 + "                                          3.Salir"));
         
          switch(opcion)
          {
              
              case 1:
              cantidadEmpleados=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados:"));
              String nombres[]=new String[cantidadEmpleados];
              double pagos[]=new double[cantidadEmpleados];
              double salarios[]=new double[cantidadEmpleados];
              int horasTrabajadas[]= new int [cantidadEmpleados];
              
                  for (int i = 0; i < cantidadEmpleados; i++)
                  {
                    nombres[i]=JOptionPane.showInputDialog("Ingrese el nombre del trabajador" + i + ":");
                    pagos[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el pago por hora:"));
                    horasTrabajadas[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas:"));
                    
                  }
                  
                  for (int i = 0; i < cantidadEmpleados; i++) 
                  {
                     salarios[i]=(pagos[i]*horasTrabajadas[i])*0.10;
                  }
                  
                  for(int i=0; i<cantidadEmpleados; i++)
                  {
                    
                      acumuladorNombres+="\n" + nombres[i];
                      acumuladorPagos+="\n" + salarios[i];
                  }
              break;
              case 2:
                  JOptionPane.showMessageDialog(null,"Nombres Empleados\n" + acumuladorNombres);
              break;
                  
          }
          
           opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el la opcion a ejecutar\n"
                 + "                                          1.Agregar Empleado.\n"
                 + "                                          2.Calcular Planilla "
                 + "                                          3.Salir"));
          
        }while(opcion!=3 || opcion<3);

        
        
        
        
        
    }
    
}
