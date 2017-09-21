package fr.univ_amu.iut;

/**
 * Created by f16007622 on 21/09/17.
 */
public class Module {
    String code;
    String Libelle;
    int hCoursPrev;
    int hCoursRea;
    int hTpPrev;
    int hTpRea;
    String discipline;
    int CoefTest;
    int CoefCc;

    public int gethCoursRea() {
        return hCoursRea;
    }

    public void sethCoursRea(int hCoursRea) {
        this.hCoursRea = hCoursRea;
    }

    public int gethTpPrev() {
        return hTpPrev;
    }

    public void sethTpPrev(int hTpPrev) {
        this.hTpPrev = hTpPrev;
    }

    public int gethTpRea() {
        return hTpRea;
    }

    public void sethTpRea(int hTpRea) {
        this.hTpRea = hTpRea;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getCoefTest() {
        return CoefTest;
    }

    public void setCoefTest(int coefTest) {
        CoefTest = coefTest;
    }

    public int getCoefCc() {
        return CoefCc;
    }

    public void setCoefCc(int coefCc) {
        CoefCc = coefCc;
    }


    public int gethCoursPrev() {
        return hCoursPrev;
    }

    public void sethCoursPrev(int hCoursPrev) {
        this.hCoursPrev = hCoursPrev;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }
}
