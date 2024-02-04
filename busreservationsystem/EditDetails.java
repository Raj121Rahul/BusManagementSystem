/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busreservationsystem;

import javax.swing.JFrame;

public class EditDetails extends JFrame{
    EditDetails(String id){
        EditDetails_p au=new EditDetails_p(id);
        this.add(au);
    }
}
