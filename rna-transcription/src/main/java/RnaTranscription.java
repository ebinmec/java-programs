class RnaTranscription {

    String transcribe(String dnaStrand) {
        String[] dna=dnaStrand.split("");
        String rna="";
       for(String c: dna){
           switch(c){
               case "A": rna+="U";
                         break;
               case "G": rna+="C";
                         break;
               case "C": rna+="G";
                         break;
               case "T": rna+="A";
                         break;
           }
       }
       return rna;
    }

}
