public class Musica {
    String nom_can;
    String nom_artis;
    int anio;
    Musica(){
        nom_can = "Que tengo que hacer";
        nom_artis = "Daddy Yankee";
        anio = 2010;
    }

    public String getNom_can() {
        return nom_can;
    }

    public void setNom_can(String nom_can) {
        this.nom_can = nom_can;
    }

    public String getNom_artis() {
        return nom_artis;
    }

    public void setNom_artis(String nom_artis) {
        this.nom_artis = nom_artis;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
