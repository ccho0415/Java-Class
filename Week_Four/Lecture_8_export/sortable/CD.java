//********************************************************************
//  SortableCD.java       Author: Lewis and Loftus
//
//  Solution for Programming Project 9.5 (5E, p. 530)
//********************************************************************

import java.text.NumberFormat;

public class CD implements Comparable<CD>
{
   private String title, artist;
   private double value;
   private int tracks;

   //-----------------------------------------------------------------
   //  Creates a new SortableCD with the specified information.
   //-----------------------------------------------------------------
   public CD (String theTitle, String theArtist,
                      double theValue, int theTracks)
   {
      title = theTitle;
      artist = theArtist;
      value = theValue;
      tracks = theTracks;
   }

   //-----------------------------------------------------------------
   //  Returns a description of this SortableCD.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String description;

      description = fmt.format(value) + "\t" + tracks + "\t";
      description += artist + "\t" + title;

      return description;
   }

   //-----------------------------------------------------------------
   //  Determines the relationship to another SortableCD, satisfying
   //  the Comparable interface. Sorts first by artist name, then
   //  by title.
   //-----------------------------------------------------------------
   public int compareTo (CD other)
   {
      return artist.compareTo(other.artist);
     
   }

}  
