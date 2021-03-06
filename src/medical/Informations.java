/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hansi
 */
public class Informations extends AbstractTableModel{

   private static final String[] COLUMN_NAMES={"Date","Baby's Name","Mother's Name","Date of birth","Age","Sex"};
    private static ArrayList<Details> list;
    
    Informations(ArrayList<Details> stList){
    list=stList;
    
    }
    
    
   
    
    
    
    
    @Override
    public int getRowCount() {
        return list.size(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
     }
     

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            
            case 0:
                return list.get(rowIndex).getDate();
            
            case 1:
                return list.get(rowIndex).getBabyname();
            case 2:
                return list.get(rowIndex).getMothername();    
            case 3:
                return list.get(rowIndex).getDateofbirth();
             case 4:
                return list.get(rowIndex).getAge();
             case 5:
                return list.get(rowIndex).getSex();           
            
            
            
            
            default:
                return "Error";
        }//To change body of generated methods, choose Tools | Templates.
    }
    
}
