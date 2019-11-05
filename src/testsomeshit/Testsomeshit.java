/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsomeshit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ong
 */
public class Testsomeshit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        

             JFileChooser chooser = new JFileChooser();
             
                 FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file","txt");
                         chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);   
        File file = chooser.getSelectedFile();
            BufferedReader in1 = new BufferedReader(new FileReader(file));  //Read the selected file content
            String line1;
            while ((line1 = in1.readLine()) != null) {
                System.out.println(line1);
           
            }
         
        
        
        
    }
    
}
