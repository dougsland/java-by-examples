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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public class stringTodate {
    public static void main(String args[]){

        try {
            String dateString1 = "20130315";
            String dateString2 = "20130212";
            DateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date1 = format.parse(dateString1);
            Date date2 = format.parse(dateString2);

            if (date1.compareTo(date2)>0) {
                System.out.println(dateString1 + " is higher date then " + dateString2); 
            }
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }
}
