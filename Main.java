/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication15;

import java.util.*;

/**
 *
 * @author arashzahoory
 */
public class Main
{
    public static void main (String [] args)
    {
        ArrayList<Process> processArrayList = new ArrayList<Process>();
        ProcessGenerator newProcesses = new ProcessGenerator(10);
        processArrayList = newProcesses.generateProcesses();





    }
}
