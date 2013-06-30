/*
 * Copyright (C) 2013
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details
 */

import java.io.File;

public class FilegetAbsolutePath {

   public static void main(String[] args) {

      try {
         File f = new File("myFile.txt");
         f.createNewFile();
         
         if(f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
         }
      } catch(Exception e){
         e.printStackTrace();
      }

   }
}
