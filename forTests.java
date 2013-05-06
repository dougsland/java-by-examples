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

public class forTests {
    public static void main(String args[]) {
        String iso1 = "new-software.iso";
        String iso2 = "old-software.iso";

        String tempPrefix[] = getIsoPrefix().split(":");
        for (int i=0; i < tempPrefix.length; i++) {
            if (iso1.toLowerCase().contains(tempPrefix[i])) {
                System.out.println(iso1 + " contain prefix " + tempPrefix[i]);
            }
            if (iso2.toLowerCase().contains(tempPrefix[i])) {
                System.out.println(iso2 + " contain prefix " + tempPrefix[i]);
            }
        }
    }

    public static String getIsoPrefix() {
        return "new:old";
    }
}
