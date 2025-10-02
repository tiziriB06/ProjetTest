public class Gaulois { 
 private String nom; 
 private int force; 
 
 public Gaulois(String nom, int force) { 
  this.nom = nom; 
  this.force = force; 
 } 
 
 public String getNom() { 
  return nom; 
 } 
 
 public void parler(String texte) { 
  System.out.println(prendreParole() + "\"" + texte + "\""); 
 } 
 
 private String prendreParole() { 
  return "Le gaulois " + nom + " : "; 
 } 
} 
 
 class Romain { 
 private String nom; 
 private int force; 
  
 public Romain(String nom, int force) { 
  this.nom = nom; 
  this.force = force; 
 } 
  
 public String getNom() { 
  return nom; 
 } 
  
 public void parler(String texte) { 
  System.out.println(prendreParole() + "\"" + texte + "\""); 
 } 
 
 private String prendreParole() { 
  return "Le romain " + nom + " : "; 
 } 
} 
