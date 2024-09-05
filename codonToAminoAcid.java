import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codonToAminoAcid {

    public static void main(String[] args) {
        // Map of codons to amino acids
        Map<String, String[]> codonMap = new HashMap<>();
        codonMap.put("UUU", new String[]{"Phenylalanine", "Phe", "F"});
        codonMap.put("UUC", new String[]{"Phenylalanine", "Phe", "F"});
        codonMap.put("UUA", new String[]{"Leucine", "Leu", "L"});
        codonMap.put("UUG", new String[]{"Leucine", "Leu", "L"});
        codonMap.put("CUU", new String[]{"Leucine", "Leu", "L"});
        codonMap.put("CUC", new String[]{"Leucine", "Leu", "L"});
        codonMap.put("CUA", new String[]{"Leucine", "Leu", "L"});
        codonMap.put("CUG", new String[]{"Leucine", "Leu", "L"});
        codonMap.put("AUU", new String[]{"Isoleucine", "Ile", "I"});
        codonMap.put("AUC", new String[]{"Isoleucine", "Ile", "I"});
        codonMap.put("AUA", new String[]{"Isoleucine", "Ile", "I"});
        codonMap.put("AUG", new String[]{"Methionine", "Met", "M"});  // Start codon
        codonMap.put("GUU", new String[]{"Valine", "Val", "V"});
        codonMap.put("GUC", new String[]{"Valine", "Val", "V"});
        codonMap.put("GUA", new String[]{"Valine", "Val", "V"});
        codonMap.put("GUG", new String[]{"Valine", "Val", "V"});
        codonMap.put("UCU", new String[]{"Serine", "Ser", "S"});
        codonMap.put("UCC", new String[]{"Serine", "Ser", "S"});
        codonMap.put("UCA", new String[]{"Serine", "Ser", "S"});
        codonMap.put("UCG", new String[]{"Serine", "Ser", "S"});
        codonMap.put("CCU", new String[]{"Proline", "Pro", "P"});
        codonMap.put("CCC", new String[]{"Proline", "Pro", "P"});
        codonMap.put("CCA", new String[]{"Proline", "Pro", "P"});
        codonMap.put("CCG", new String[]{"Proline", "Pro", "P"});
        codonMap.put("ACU", new String[]{"Threonine", "Thr", "T"});
        codonMap.put("ACC", new String[]{"Threonine", "Thr", "T"});
        codonMap.put("ACA", new String[]{"Threonine", "Thr", "T"});
        codonMap.put("ACG", new String[]{"Threonine", "Thr", "T"});
        codonMap.put("GCU", new String[]{"Alanine", "Ala", "A"});
        codonMap.put("GCC", new String[]{"Alanine", "Ala", "A"});
        codonMap.put("GCA", new String[]{"Alanine", "Ala", "A"});
        codonMap.put("GCG", new String[]{"Alanine", "Ala", "A"});
        codonMap.put("UAU", new String[]{"Tyrosine", "Tyr", "Y"});
        codonMap.put("UAC", new String[]{"Tyrosine", "Tyr", "Y"});
        codonMap.put("UAA", new String[]{"STOP", "STOP", "STOP"});
        codonMap.put("UAG", new String[]{"STOP", "STOP", "STOP"});
        codonMap.put("UGA", new String[]{"STOP", "STOP", "STOP"});
        codonMap.put("CAU", new String[]{"Histidine", "His", "H"});
        codonMap.put("CAC", new String[]{"Histidine", "His", "H"});
        codonMap.put("CAA", new String[]{"Glutamine", "Gln", "Q"});
        codonMap.put("CAG", new String[]{"Glutamine", "Gln", "Q"});
        codonMap.put("AAU", new String[]{"Asparagine", "Asn", "N"});
        codonMap.put("AAC", new String[]{"Asparagine", "Asn", "N"});
        codonMap.put("AAA", new String[]{"Lysine", "Lys", "K"});
        codonMap.put("AAG", new String[]{"Lysine", "Lys", "K"});
        codonMap.put("GAU", new String[]{"Aspartic acid", "Asp", "D"});
        codonMap.put("GAC", new String[]{"Aspartic acid", "Asp", "D"});
        codonMap.put("GAA", new String[]{"Glutamic acid", "Glu", "E"});
        codonMap.put("GAG", new String[]{"Glutamic acid", "Glu", "E"});
        codonMap.put("UGU", new String[]{"Cysteine", "Cys", "C"});
        codonMap.put("UGC", new String[]{"Cysteine", "Cys", "C"});
        codonMap.put("UGG", new String[]{"Tryptophan", "Trp", "W"});
        codonMap.put("CGU", new String[]{"Arginine", "Arg", "R"});
        codonMap.put("CGC", new String[]{"Arginine", "Arg", "R"});
        codonMap.put("CGA", new String[]{"Arginine", "Arg", "R"});
        codonMap.put("CGG", new String[]{"Arginine", "Arg", "R"});
        codonMap.put("AGU", new String[]{"Serine", "Ser", "S"});
        codonMap.put("AGC", new String[]{"Serine", "Ser", "S"});
        codonMap.put("AGA", new String[]{"Arginine", "Arg", "R"});
        codonMap.put("AGG", new String[]{"Arginine", "Arg", "R"});
        codonMap.put("GGU", new String[]{"Glycine", "Gly", "G"});
        codonMap.put("GGC", new String[]{"Glycine", "Gly", "G"});
        codonMap.put("GGA", new String[]{"Glycine", "Gly", "G"});
        codonMap.put("GGG", new String[]{"Glycine", "Gly", "G"});

        // Take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a codon (3 RNA bases): ");
        String codon = scanner.next().toUpperCase();

        // Validate the codon input
        if (codon.length() != 3 || !codonMap.containsKey(codon)) {
            System.out.println("Invalid codon.");
        } else {
            String[] aminoAcid = codonMap.get(codon);
            System.out.println("Amino Acid: " + aminoAcid[0]);
            System.out.println("Three-letter Abbreviation: " + aminoAcid[1]);
            System.out.println("Single-letter Abbreviation: " + aminoAcid[2]);
        }

        scanner.close();
    }
}

