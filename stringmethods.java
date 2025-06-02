package hello1;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class stringmethods {
  public static void main(String[] args) {
	String a = "java";   
	System.out.println(a.length());         //length
	
	String b =   "selenium";
    String b2 ="selenium";
	System.out.println(b.equals(b2));     // equals
	
	String c = "java";
	String c2 ="java";
	System.out.println(c.equalsIgnoreCase(c2));     // equalignoreclass
	
	String d ="hello java";
	System.out.println(d.toUpperCase());          //uppercase
	
	String e ="HELLO JAVA";
	System.out.println(e.toLowerCase());         //lowercase
	
	String f ="d";
	System.out.println(f.startsWith("d"));      //startswith
	
	String g ="devi";
	System.out.println(g.endsWith("i"));         //ends with
	
	String h = "advance testing";
	System.out.println(h.contains("advance"));        //contains
	
	String i ="java code";
	System.out.println(i.indexOf("j"));              // indexof
	
	String i1 = "java code";
	System.out.println(i1.lastIndexOf("a"));        // lastindexof
	
	String i2 ="iam devi from technologies";
	System.out.println(i2.replace("devi","priya"));      // replace
	
	String i3 ="hello java batch";
	System.out.println(i3.substring(0,10));             // substring
	
	String i4 ="";
	System.out.println(i4.isEmpty());                     // isempty
	
	String i5 ="     hello    ";
	System.out.println(i5.trim());                    // trim
	
	String a2 ="hello java";
	System.out.println(a2.charAt(5));
	
	
	String i6 ="im devi";
	System.out.println(i6.concat(" priya"));            //concat
	
	String i7="hello java";                            //split
	String[] word=i7.split(" ");
	for (String y : word) {
		System.out.println(y); 
		
    String  i8 ="100";                                //parse int
    System.out.println(Integer.parseInt(i8));
		
    int i9 = 10;                                      //valueof
    System.out.println(String.valueOf(i9));
	
		
	}
	
	
  }
}
