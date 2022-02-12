class RnaTranscription {

    String transcribe(String dnaStrand) {
        if(dnaStrand.compareTo("G")==0)
        {
            return "C";
        }
        else if(dnaStrand.compareTo("C")==0)
        {
            return "G";
        }
        else if(dnaStrand.compareTo("T")==0)
        {
            return "A";
        }
        else if(dnaStrand.compareTo("A")==0)
        {
            return "U";
        }
        else
        {
            String str=new String();
            for(int i=0;i<dnaStrand.length();i++)
            {
                if(dnaStrand.charAt(i)=='A')
                {
                    str+='U';
                }
                else if(dnaStrand.charAt(i)=='T')
                {
                    str+='A';
                }
                else if(dnaStrand.charAt(i)=='C')
                {
                    str+='G';
                }
                else if(dnaStrand.charAt(i)=='G')
                {
                    str+='C';
                }
            }
            return str;
        }
       
    }

}
