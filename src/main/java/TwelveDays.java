class TwelveDays {
    String verse(int verseNumber) {
        String[] day={"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
        String s="On the "+day[verseNumber-1]+" day of Christmas my true love gave to me: ";
        switch (verseNumber){
            case 12:
            {
               s=s+"twelve Drummers Drumming, "; 
            }
            case 11:
            {
                s=s+"eleven Pipers Piping, "; 
            }
            case 10:
            {
              s=s+"ten Lords-a-Leaping, ";   
            }
            case 9:
            {
              s=s+"nine Ladies Dancing, ";
            }
            case 8:
            {
               s=s+"eight Maids-a-Milking, "; 
            }
            case 7:
            {
               s=s+"seven Swans-a-Swimming, ";
            }
            case 6:
            {
              s=s+"six Geese-a-Laying, ";   
            }
            case 5:
            {
               s=s+"five Gold Rings, "; 
            }
            case 4:
            {
               s=s+"four Calling Birds, ";  
            }
            case 3:
            {
                s=s+"three French Hens, ";
            }
            case 2:
            {
                s=s+"two Turtle Doves, ";    
            }
            case 1:
            {
                if (verseNumber!=1)
                {
                s=s+"and ";
                }
                s=s+"a Partridge in a Pear Tree.";
            } 
        }
        s=s+"\n";
        return s;
    }

    String verses(int startVerse, int endVerse) {
        String s1=new String();
        for(int i=startVerse;i<=endVerse;i++)
        {
            s1=s1+verse(i);
            if(i<endVerse)
            {
                s1=s1+"\n";
            }
        }
        return s1;
    }
    
    String sing() {
        String s2=new String();
        s2=verses(1,12);
        return s2;
    }
}